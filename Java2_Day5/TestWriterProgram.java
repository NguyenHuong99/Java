package HomeWork;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestWriterProgram {
    public static void main(String[] args) {
        WriterProgram writerProgram = new WriterProgram();
        Scanner sc = new Scanner(System.in);

        System.out.println("================ Writer Program ================");
        System.out.print("Do you want write file?(Y/N): ");
        String YN = sc.nextLine();

        if (YN.equals("Y")) {
            System.out.print("Please input path file: ");
            String pathFile = sc.nextLine();
            System.out.print("Please input content file: ");
            String contentFile = sc.nextLine();
            writerProgram.addFile(new WriterPro(pathFile, contentFile));

            System.out.print("Save file with content <save>: ");
            String save = sc.nextLine();
            if (save.equals("save")) {
                writerProgram.saveToFile();
                System.out.print("Do you want read file?(Y/N): ");
                String YNRead = sc.nextLine();
                if (YNRead.equals("Y")) {
                    try {
                        System.out.println("Please input path file: ");
                        String seachFile = sc.nextLine();
                        if (seachFile.contains(seachFile)) {
                            writerProgram.readFile();
                            var writers1 = writerProgram.getWriterPros();
                            for (var writer : writers1) {
                                System.out.println(writer.toString());
                            }
                        }
                    } catch (Exception e) {
                        //System.out.println(contentFile);
                    }
                } else if (YNRead.equals("N")) {
                    sc.close();
                }
            } else if (YN.equals("N")) {
                sc.close();
            }
        }
    }
}