package HomeWork;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterProgram {
    private List<WriterPro> writerPros;

    public WriterProgram(){
        writerPros = new ArrayList<>();
    }
    public List<WriterPro> getWriterPros(){
        return writerPros;
    }
    public void addFile(WriterPro writerPro){
        writerPros.add(writerPro);
    }
    public void saveToFile(){
        if (writerPros != null){
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.dat"))){
                oos.writeObject(writerPros);
                System.out.println("Save File is successed");
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    public void readFile() throws Exception{
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.dat"))){
            writerPros = (List<WriterPro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            throw e;
        }
    }
}
