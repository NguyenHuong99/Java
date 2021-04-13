package HomeWork5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Management {
    private List<Person> personList;

    public Double checkInputMoney(String money) throws Exception {
        double dMoney = 0;
        try {
            dMoney = Double.parseDouble(money);
            if (dMoney < 0) {
                throw new Exception("Money is greater than equal zero");
            }
        } catch (NumberFormatException e) {
            throw new Exception("Money is digit");
        } catch (NullPointerException e) {
            throw new Exception("Please input Money");
        }
        return dMoney;
    }
    public Management(){
        personList = new ArrayList<>();

    }
    public List<Person> getPersonList(){
        Collections.sort(personList, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getMoney(), o2.getMoney());
            }

        });
        return personList;
    }
    public void addPerson(Person person){
        personList.add(person);
    }
    public void saveToFile(){
        if (personList != null){
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))){
                oos.writeObject(personList);
                System.out.println("Successfully");
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void readFile() throws Exception{
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))){
            personList = (List<Person>) ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            throw e;
        }

    }
    public List<Person> getPerson(String path, double money) throws Exception {
        if (path == null)
            throw new Exception("Input path");
        File f = new File(path);
        if (!f.isFile()) {
            throw new Exception("Path doesn't exist");
        }
        List<Person> persons = new ArrayList<Person>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                String val[] = sCurrentLine.split(";");
                if (val == null || val != null && val.length == 0)
                    continue;
                Person person = new Person();
                if (val.length >= 3) {
                    person.setName(val[0]);
                    person.setAddress(val[1]);
                    double dmoney = 0d;
                    try {
                        dmoney = Double.parseDouble(val[2].trim());
                    } catch (NumberFormatException e) {
                        dmoney = 0d;
                    }
                    person.setMoney(dmoney);

                } else {
                    if (val.length == 2) {
                        person.setName(val[0].trim());
                        person.setAddress(val[1].trim());
                    }
                    if (val.length == 1) {
                        person.setName(val[0].trim());
                        person.setAddress("");
                    }

                }
                if (person.getMoney() >= money)
                    persons.add(person);
            }
        } catch (IOException e) {
            throw new Exception("Can't read file");
        }
        Collections.sort(persons, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getMoney(), o2.getMoney());
            }

        });
        return persons;
    }

    public boolean copyWordOneTimes(String fileSource, String fileName)
            throws Exception {
        if (fileSource == null)
            throw new Exception("Input path");
        File f = new File(fileSource);
        if (!f.isFile()) {
            throw new Exception("Path doesn't exist");
        }
        String newFile = fileSource.substring(0,
                fileSource.lastIndexOf("\\") + 1) + fileName;
        String content = null;
        try (InputStream in = new FileInputStream(fileSource)) {

            int availableLength = in.available();

            byte[] totalBytes = new byte[availableLength];

            in.read(totalBytes);
            content = new String(totalBytes);
        } catch (IOException e) {
            throw new Exception("Can't read file");
        }
        try (OutputStream out = new FileOutputStream(newFile)) {
            String[] build = content.split(" ");
            StringBuilder contentWrite = new StringBuilder();
            List<String> addNow = new ArrayList<String>();
            for (String item : build) {
                if (!addNow.contains(item)) {
                    addNow.add(item);
                    contentWrite.append(item);
                    contentWrite.append(" ");
                }
            }
            out.write(contentWrite.toString().getBytes());
        } catch (IOException e) {
            throw new Exception("Can't write file");
        }

        return true;
    }
}
