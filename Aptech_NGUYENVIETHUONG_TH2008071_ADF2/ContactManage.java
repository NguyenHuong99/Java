package Aptech_NGUYENVIETHUONG_TH2008071_ADF2;

import java.util.*;

public class ContactManage {
    public void show(Map<String, Contact> map){
            Set<String> keySet = map.keySet();
            for (String key : keySet){
                System.out.println(" " + map.get(key));
        }
    }
}
