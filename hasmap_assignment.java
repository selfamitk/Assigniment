// contain unique key
// valaue may be dublicate
import java.util.HashMap;
import java.util.Map;

public class hasmap_assignment {
    public static void main(String[] args) {
       /* System.out.println("this assignmet about hasmap in java");
        // implimentation of hasmap
        // creating hashmap
        HashMap<String,Integer>hsmap= new HashMap<>();
        // operationon for hashmap
        // to adding elementuse put()
        hsmap.put("amit",10);
        hsmap.put("rohan",20);
        hsmap.put("rohit",30);
        hsmap.put("rajesh",40);
        // to printig hashmap
        System.out.println("created hashmap is "+hsmap+" and it's size is "+hsmap.size());
        // changing value of a existing key use agin put() by key vale name
        hsmap.put("rohit",50);
        System.out.println("hashMap after udating rohit vale"+ hsmap);
       // to remove a element of hashmap
        // use remove(key) if key will present then itwill be removed
        hsmap.remove("rohit");// rohit key will be wipe
        System.out.println("map after removing key rohit"+ hsmap);
        // iteration of hashmap
        for(Map.Entry<String,Integer>lst: hsmap.entrySet()){
            System.out.println("key is -> "+lst.getKey()+" and it's value is "+lst.getValue()+" hascode is "+ lst.hashCode());

        }
        // entrySet() method return set vie os hashmap
        //The method returns a set having same elements as the hash map
        System.out.println("set view of hashmap using enterySet() -> "+hsmap.entrySet());
        // o/p:-[rohan=20, amit=10, rajesh=40]
        // keySet() method return ony key as set
        System.out.println("\"set view of hashmap using keySet()-> "+hsmap.keySet());//o/p:-[rohan, amit, rajesh]
        // some boulian return type method
        //isEmpty().
        if(hsmap.isEmpty()){
            System.out.println("map is empty");
        }else{
            System.out.println(" map f is with some key-value->"+hsmap.values());// values() gives collection of value associted with key
                                              //o/p:-[20, 10, 40]
        }
        //containsKey() return true if key is present
        if(hsmap.containsKey("amit")){
            System.out.println("Amit key is present with value-> "+hsmap.get("amit"));
        }else{
            System.out.println("amit key is absent");
        }
        hsmap.replace("amit",40);
        System.out.println("after replacing amit value"+hsmap);
        hsmap.replace("amit",100,200);
        System.out.println("hasmp is "+hsmap);
        //to clear all key-value
        hsmap.clear();
        System.out.println("size of hashmap is "+hsmap.size());

        */

        // creating a hashmap;
        HashMap<String,Integer>population=new HashMap<>();
        population.put("bihar",32000);
        population.put("assam",22000);
        population.put("kerla",44000);
        population.put("mp",55000);
        population.put("up",100000);
        // iteration over hash map
        // using forEach loo
        //syntax:- <hashmap_name>.forEach((k,v)->System.out.println("key is"+k+"value"+v))
       // population.forEach((k,v)-> System.out.println("key is = "+k+" value is "+v));
        // using some conditon for value
        population.forEach((k,v)->{if(v>50000){
            System.out.println("key is = "+k+" value is "+v);
        }});
        //using keySet method it reurn only key of hashmap
        // syntax:-for (key_type var_name : table_name.keySet())
           for(String statename:population.keySet())
               System.out.println(statename);
        // to get only value
           for(Integer name:population.values())
               System.out.println(name);
        // using entrySet() method it return key with value
        // syntax :-  for (Map.Entry<key_type,value_type> var_name : map_name.entrySet())
        for(Map.Entry<String,Integer>tem:population.entrySet()){
            if(tem.getValue()>25000){
                System.out.println("state name is "+ tem.getKey()+" it's population is "+tem.getValue());
            }else{
                System.out.println(tem.getKey()+" is lower population with "+tem.getValue());
            }
        }

    }
}
