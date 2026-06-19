import java.util.*;

public class Ch8 {
    public static void main (String [] args){
        Integer[] a1 = {3, 4, 5, 2, 1};
        Integer[] a2 = {2, 3, 7, 8, 9};

        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a1));
        List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(a2));

        Set<Integer> s1 = new LinkedHashSet <Integer> (l1);
        Set<Integer> s2 = new LinkedHashSet <Integer> (l2);

        //the intersection
        Set<Integer> intersect = new LinkedHashSet <Integer> (s1);
        intersect.retainAll(s2);
        System.out.println("s1 intersect s2 = " + intersect);
    }
    public static void main(String[]args){
        Map <String,Integer> map = new HashMap<String,Integer>();
        map.put("Smith",30);map.put("Anderson",31);map.put("Lewis",29);map.put("Cook",29);
        for(String x: map.keySet()){
            System.out.println(map.get(x));
        }
        Map <String,Integer> tree = new TreeMap<String,Integer>(map);
        System.out.println(tree);
        //to be ordered
    }
}
public class Ch8 {
    public static void main(String[]args){
        String txt = "Good morning. Have a good class. "+"Have a good visit. Have fun!";
        Map <String,Integer> map = new TreeMap<String,Integer>();
        String[] words = txt.split("\\W+");
        for(int i = 0; i < words.length;i++){
            String key = words[i].toLowerCase();

            System.out.println(key);

            if(!map.containsKey(key)) {
                map.put(key, 1);
            }else{
                int value =map.get(key);
                value++;
                map.put(key,value);
            }
        }
        //for(String x : map.keySet())
            System.out.println(map);
    }
}
