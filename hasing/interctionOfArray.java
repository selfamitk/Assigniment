// You are required to find the intersection of a1 and a2. To get an idea check the example below:
//
//if a1 -> 1 1 2 2 2 3 5
//and a2 -> 1 1 1 2 2 4 5
//intersection is -> 1 1 2 2 5
package hasing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class interctionOfArray {
    public static void main(String[] args) {
        List<Integer>lst1=new ArrayList<>();
        List<Integer>lst2=new ArrayList<>();
        for(int i=0;i<10;i++){
            int temp=(int)(Math.random()*10)+1;
            lst1.add(temp);
        }
        System.out.println("first list is "+lst1);
        for(int i=0;i<10;i++){
            int temp=(int)(Math.random()*10)+1;
            lst2.add(temp);
        }
        System.out.println("second list is "+lst2);
        HashMap<Integer,Integer>table=new HashMap<>();
        for (Integer integer : lst1) {
            if (table.containsKey(integer)) {
                int temp = table.get(integer);
                table.put(integer, ++temp);
            } else {
                table.put(integer, 1);
            }
        }
        System.out.println("hashtable is by list1 element"+table);
        HashMap<Integer,Integer>table2=new HashMap<>();
        for (Integer integer : lst2)
            if (table2.containsKey(integer)) {
                int temp = table2.get(integer);
                table2.put(integer, ++temp);
            } else {
                table2.put(integer, 1);
            }
        System.out.println("hashtable is by list1 element"+table2);
        System.out.println("intersection of element is ");
        for (Integer integer : lst2) {
            if (table.containsKey(integer)) {
                if (table.get(integer) > 0) {
                    System.out.print(integer + " ");
                    int temp = table.get(integer);
                    temp -= 1;
                    table.put(integer, temp);
                }
            }
        }
    }
}
