package practica2_kata1;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Practica2_kata1 {

    public static void main(String[] args) {
        Integer[] data = {1, 4, 3, 7, 5, 4, 2, 7, 8, 34, 3, 9, 12, 5, 4};
        String[] data2 = {"Pablo","Pedro","Magdalena","pepe","María","María","María","pepe","pepe"};
                
        Histogram meta_histogram = new Histogram(data2);
        
        Map<Integer, Integer> histogram = meta_histogram.getHistogram();
        
        //Map <Integer, Integer> histogram = new HashMap<>();
        
        /*for(int i = 0; i < data.length; i++){
            histogram.put(data[i], histogram.containsKey(data[i])? histogram.get(data[i]) +1 :1);
        }*/
        
        Iterator <Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }
        
    }
    
}
