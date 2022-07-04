// problem :-You are given 2 arrays a1 and a2 of size n1 and n2 respectively.
//You are required to print all the elements of a2 which are also present in a1
package hasing;

import java.util.HashMap;

public class common_element {
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,2,4,3,5,4,6,4,23,42,3,4,5};
        int arr2[]={1,3,4,2,4,3,5,4,5,2,3,6,4,23,5,2};
        System.out.println("arr1 haselement");
        // printing arr1 element
        for (Integer i:arr1
             ) {
            System.out.print(" "+i);

        }
        System.out.println();
        //printing element of arr2
        System.out.println("arr2 haselement");
        for (Integer i:arr2
        ) {
            System.out.print(" "+i);

        }
        System.out.println();
        //creating a empty hashmap
        HashMap<Integer,Integer>table=new HashMap<>();
        // creating hashtable by arr1
        for(int i=0;i<arr1.length;i++){
            if(table.containsKey(arr1[i])){
                int temp=table.get(arr1[i]);
                temp+=1;
                table.put(arr1[i],temp);
            }else{
                table.put(arr1[i],1 );
            }
        }
        //System.out.println(table);
        //logic to get common element
        // if same element present then printkey and remove key frome map
        System.out.println("common element is ");
        for(int i=0;i<arr2.length;i++){
            if(table.containsKey(arr2[i])){
                System.out.print(" "+arr2[i]);
                table.remove(arr2[i]);
            }
        }
    }
}
