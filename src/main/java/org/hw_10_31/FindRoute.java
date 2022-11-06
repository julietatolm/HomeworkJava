package org.hw_10_31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindRoute {
    public static void main(String[] args) {
        //First level: Найти маршрут из заданного списка билетов
        //Учитывая список билетов, найти маршрут по порядку, используя данный список.
        //Вход:
        //«Berlin» -> «London»
        //«Tokyo» -> «Seoul»
        //«Mumbai» -> «Berlin»
        //«Seoul» -> «Mumbai»
        //Выход:
        //Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon

        Map<String, String> map = new HashMap<>();
        map.put("Berlin", "London");
        map.put("Tokyo", "Seoul");
        map.put("Mumbai", "Berlin");
        map.put("Seoul", "Mumbai");
        map.put("Frankfurt", "Mumbai");

        getStart(map);
    }

    private static void getStart(Map<String, String> map) {
        //check for all possible start destinations
        ArrayList<String> possibleStart = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry == null) {
                return;
            }
            if (!map.containsValue(entry.getKey())) {
                possibleStart.add(entry.getKey());
            }

        }
        getRoute(map, possibleStart);
    }

    private static void getRoute(Map<String, String> map, ArrayList<String> possibleStart) {
        //get The Longest Route
        Map<String, Integer> longestRoute = new HashMap<>();
        for (String start : possibleStart) {
            longestRoute.put(start, 1);
            String from = start;
            String to = map.get(from);
            while (map.containsKey(from)) {
                longestRoute.replace(start, longestRoute.get(start) + 1);
                from = to;
                to = map.get(from);
            }
        }

        //get the start city with longest route
        int longerRouteNum = 0;
        String startCity = null;
        for (Map.Entry<String, Integer> entry : longestRoute.entrySet()) {
            if (entry.getValue() > longerRouteNum) {
                longerRouteNum = entry.getValue();
                startCity = entry.getKey();
            }
        }

        //print out the route
        String from = startCity;
        String to = map.get(startCity);
        while (map.containsKey(from)) {
            System.out.print(from + " -> " + to + ", ");
            from = to;
            to = map.get(from);
        }
    }
}
