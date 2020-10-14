/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2_kata1;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;
    
    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    Map<T, Integer> getHistogram() {
        Map<T, Integer> histogram = new HashMap<>();
        
        for(int i = 0; i < data.length; i++){
            histogram.put(data[i], histogram.containsKey(data[i])? histogram.get(data[i]) +1 :1);
        }
        return histogram;
    }
    
    
    
}
