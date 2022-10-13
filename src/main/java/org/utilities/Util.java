package org.utilities;

import java.util.List;
import java.util.Objects;

public class Util {
    public boolean IsInclude(List<String> l,String s){
        try {
            int i=0;
            for (String a: l){
                if (a==s){
                    i++;
                }
            }
            if(i>0){
                return true;
                //  System.out.println("This course already existed");
            }else {
                return false;
            }
        }catch (Exception e){
          //  l.add("");
            int i=0;

            for (String a: l){
                if (a==s){
                    i++;
                }
            }
            if(i>0){
                return true;
                //  System.out.println("This course already existed");
            }else {
                return false;
            }
        }
        }

}
