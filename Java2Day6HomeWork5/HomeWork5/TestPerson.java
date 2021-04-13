package HomeWork5;

import java.util.*;

public class TestPerson {
    public static void main(String[] args) {
        Management management = new Management();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("========== File Processing ==========");

        while (true){
            System.out.println("1. Add and save new student");
            System.out.println("2. Find person info");
            System.out.println("3. Copy Text to new file");
            System.out.println("4. Exit");

            System.out.print("Enter number: ");
            int num = Integer.parseInt(sc.nextLine());

            switch (num){
                case 1:
                    System.out.println("Path");
                    String path = sc.nextLine();
                    System.out.println("---------------- Content --------------");
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("Name");
                        String name = sc.nextLine();
                        System.out.println("Address");
                        String address = sc.nextLine();
                        System.out.println("Money");
                        int money = Integer.parseInt(sc.nextLine());
                        management.addPerson(new Person(path, name, address, money));
                        arrayList.add(money);
                        arrayList1.add(name);
                    }
                        management.saveToFile();
                        break;
                case 2:
                    System.out.println("------ Person info ------");
                    try {
                        System.out.print("Enter Path: ");
                        String path1 = sc.nextLine();
                        System.out.print("Enter Money: ");
                        int mone = Integer.parseInt(sc.nextLine());
                        if (mone < 0) {
                            String mone2 = String.valueOf(mone);
                            management.checkInputMoney(mone2);
                        } else if (mone > 0) {
                            System.out.println("        ------ Result ------");
                            System.out.println("Name" + "         " + "Address" + "         " + "Money");
                            management.readFile();
                            var person1 = management.getPersonList();
                            for (var person : person1) {
                                System.out.println(person.toString());
                            }
                            String name = arrayList1.get(0);
                            String name2 = arrayList1.get(0);
                            int max = arrayList.get(0);
                            int min = arrayList.get(0);
                            for (int i = 1; i < arrayList.size(); i++) {
                                if (arrayList.get(i) > max) {
                                    max = arrayList.get(i);
                                    name = arrayList1.get(i);
                                }
                                if (arrayList.get(i) < min) {
                                    min = arrayList.get(i);
                                    name2 = arrayList1.get(i);
                                }
                            }
                            System.out.println("Max: " + name);
                            System.out.println("Min: " + name2);
                        }
                    }  catch(Exception e){
                        System.out.println(e.getMessage());

                    }
                    break;
                case 3:
                    System.out.println("---------- Copy text ----------  ");
                    try {
                        System.out.print("Enter Source: ");
                        String source = sc.nextLine();
                        System.out.println("Enter new file name: ");
                        String newFile = sc.nextLine();
                        management.copyWordOneTimes(source, newFile);
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                case 4:
                    System.exit(4);
                    break;
            }
        }
    }
}
