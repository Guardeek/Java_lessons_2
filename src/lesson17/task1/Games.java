package lesson17.task1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Games {
    public static void main(String args[]) {

        Map<String, Double> hm = new HashMap<>();

        hm.put("Кукла Маша ", 34.0);
        hm.put("Кукла Саша ", 23.0);
        hm.put("Кукла Ира ", 37.0);


        newKeys(hm);

        System.out.println();

        double balance = hm.get("Кукла Маша ");
        hm.put("Кукла Маша ", balance + 1000);

        System.out.println("Кукла Маша имеет новый возраст: " +
                hm.get("Кукла Маша"));
    }

    private static void newKeys(Map<String, Double> hm) {
        iterateKeys(hm);
        Collection<Double> collection = hm.values();
        for (Double value: collection) {
            System.out.println(value);
        }
    }

    private static void iterateKeys(Map<String, Double> hm) {
        iterateEntries(hm);
        Set<String> set = hm.keySet();
        for (String key : set) {
            System.out.print(" Ключ " + key + ", ");
            System.out.print("Значение " + hm.get(key));
        }
    }

    private static void iterateEntries(Map<String, Double> hm) {
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(" Ключ " + me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
