package Aptech_NGUYENVIETHUONG_TH2008071_ADF2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressManage {
    public static void main(String[] args) {
        Contact contact = new Contact();
        ContactManage contactManage = new ContactManage();
        Scanner sc = new Scanner(System.in);
        System.out.println("=============>>>>Address Book<<<<=============");
        while (true){
            System.out.println("1.Add new contact");
            System.out.println("2.Find a contact by name");
            System.out.println("3.Display contacts");
            System.out.println("4.Exit");

            System.out.println("Enter number");
            int num = Integer.parseInt(sc.nextLine());

            switch (num){
                case 1:
                        Map<String, Contact> hashMap = new HashMap<String, Contact>();
                        System.out.println("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter Phone: ");
                        int phone = Integer.parseInt(sc.nextLine());
                        hashMap.put("1", new Contact(name,phone));
                        contactManage.show(hashMap);
                    break;

                }
            }
       }
    }
