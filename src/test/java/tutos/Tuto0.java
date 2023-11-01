package tutos;

import beans.Car;
import beans.Person;
import mockdata.MockDAta;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Tuto0 {

    @Test
    public void printPersonsFromJson() throws IOException {
        List<Person> people = MockDAta.getPeople();
        for(Person person : people) {
            System.out.println(person);
        }
    }

    @Test
    public void printCarsFromJson() throws IOException {
        List<Car> cars = MockDAta.getCars();
        for(Car car : cars) {
            System.out.println(car);
        }
    }
}
