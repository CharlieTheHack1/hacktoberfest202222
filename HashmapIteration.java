
/**
 * This program is to demonstrate the iteration through hashmap by many different ways
 *Iterator class.
 * And the methods of Iterator class.
 * If we have a HashMap called hm,The methods of iterator class are as follows :-
 * hm.entrySet()-it retrieves the element of the HashMap and stores it into a set.
 * MapElement<Integer,Integer> Stores a key,Value pair.
 * hm.keySet()-It is used to iterate over a Key set .
 * hm.values()-It is used to iterate over the Value set.
 * hm.entrySet().iterator()-it returns an Iterator that acts as a cursor and points at the first element of the entry set.
 * Map.Entry represents the elements of the entry set(key value pairs);
 * GETTING AN Iterator
 * Iterator hmIterator= hm.entrySet().iterator();
 * INITIALIZING THE MAP ENTRY WITH THE VALUE OF THE ENTRY SET
 * MAp.Entry mapEntry=(Map.Entry)hmIterator.next();
 * mapEntry.getKey();
 * mapEntry.getValue();
 */


import java.util.*;

public class hashmap {
    public static void main(String args[])
    {
  //
        //  Scanner sc=new Scanner(System.in);
    HashMap<String, Integer> h =new HashMap<>();
    Integer i=45;
    h.put("hello",i);
    h.put("GeeksforGeeks", 54);
    h.put("A computer portal", 80);
    h.put("For geeks", 82);
    System.out.println(h);
    //Iteration
        for(Map.Entry<String,Integer> mapElement:h.entrySet())
        {
            System.out.println(mapElement);}
        //Iteration through keySet
        System.out.println("####Printing keys");
        for(String st:h.keySet())
        {
            System.out.println(st);
        }
        System.out.println("####Printing values");
        //Iteration through value()
        for(int n:h.values())
        {
            System.out.println(n);
        }

   //using iterator
   Iterator hIterator=h.entrySet().iterator();
        while(hIterator.hasNext())
        {System.out.println(hIterator.next());}

        Iterator hIterator2=h.entrySet().iterator();
        while(hIterator2.hasNext())
        {System.out.println(hIterator2 .next());
           Map.Entry mape=(Map.Entry)hIterator2.next();
           System.out.println(mape.getKey());
            Map.Entry mape2=(Map.Entry)hIterator2.next();
           System.out.println(mape2.getValue());

        }

}}
