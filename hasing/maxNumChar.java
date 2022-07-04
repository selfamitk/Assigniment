// problem to calculate maximum number of character in a string
package hasing;
// initial capasity of hashmap is 16 and its factor is 0.75
import java.util.HashMap;

public class maxNumChar {
    public static void main(String[] args) {
        System.out.println("this is main method");
        String str="abra ka dabra";
        HashMap<Character,Integer>table=new HashMap<>();
        for(int i=0;i<str.length();i++){
            // storing character of string in char varible for key
            char ch=str.charAt(i);
            // checking charcter in i iteration is present as key or not if present
            if(table.containsKey(ch)){
                // get value of that key and store as int in var old_freq
                int old_freq=table.get(ch);//can't do like table.put(ch,++table.get(ch)) why?
                // update old value by incrimant 1 ++old_freq
                table.put(ch,++old_freq);
            }// if key is not present then add key in table
            else{
                //adding char as key with value 1
                table.put(ch ,1);
            }
        }
        System.out.println(table);
        // logic to calculate maximum frequency char
        // let first character with maximum index
        char max_freq=str.charAt(0);
        // iteration of map with k
        for(Character key :table.keySet()){
            if(table.get(key)> table.get(max_freq)){
                max_freq=key;
            }
        }
        System.out.println("character with maximum frequency is-> "+max_freq+" with value->"+table.get(max_freq));
    }
}
