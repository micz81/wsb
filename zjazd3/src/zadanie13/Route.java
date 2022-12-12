package zadanie13;

import java.util.Objects;

public class Route {
    private final Airport departure;
    private final Airport arrival;

    public Route(Airport departure, Airport arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return Objects.equals(departure, route.departure) && Objects.equals(arrival, route.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "{" +
                "departure=" + departure +
                ", arrival=" + arrival +
                '}';
    }
}
