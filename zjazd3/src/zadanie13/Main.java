package zadanie13;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Route> connections = new HashSet<>();

        connections.add(new Route(new Airport("Wroclaw"), new Airport("Dublin")));
        connections.add(new Route(new Airport("Wroclaw"), new Airport("Krakow")));
        connections.add(new Route(new Airport("Krakow"), new Airport("Wroclaw")));
        connections.add(new Route(new Airport("Krakow"), new Airport("Dublin")));
        connections.add(new Route(new Airport("Warszawa"), new Airport("Krakow")));

        Map<Airport, Set<Airport>> map = new HashMap<>();

        for (Route route : connections) {
            map.putIfAbsent(route.getDeparture(), new HashSet<>());
            map.get(route.getDeparture()).add(route.getArrival());
        }

        for (Map.Entry<Airport, Set<Airport>> e : map.entrySet()) {
            System.out.printf("Departure: %s, Arrivals: %s%n", e.getKey(), e.getValue());
        }
    }
}
