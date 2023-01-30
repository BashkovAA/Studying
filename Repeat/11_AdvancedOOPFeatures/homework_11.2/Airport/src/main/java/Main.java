import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(findPlanesLeavingInTheNextTwoHours(Airport.getInstance()));

    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        List<Flight> nextTwoHours = new ArrayList<>();
        final int TWO_HOURS = 7_200_000;
        nextTwoHours = airport.getTerminals().stream()
                .map(Terminal::getFlights)
                .flatMap(List::stream)
                .filter(flight -> (flight.getDate().getTime() > System.currentTimeMillis()
                        && flight.getDate().getTime() - System.currentTimeMillis() <= TWO_HOURS
                        && flight.getType() == Flight.Type.DEPARTURE))
                .collect(Collectors.toList());
        return nextTwoHours;
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
    }

}