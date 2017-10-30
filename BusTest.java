import org.junit.*;
import static org.junit.Assert.assertEquals;

public class BusTest {

  Bus bus;
  Person person;

  @Before
  public void before() {
    this.bus = new Bus(23);
    this.person = new Person();
  }

  @Test
  public void hasBusNumber() {
    int busNumber = bus.getBusNumber();
    assertEquals(23, busNumber);
  }

  @Test
  public void passengersStartsEmpty() {
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canAddPerson() {
    bus.add(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void cannotAddPersonWhenPassengersMax() {
    for(int i = 0; i < 10; i++) {
      bus.add(person);
    }
    assertEquals(10, bus.passengerCount());
  }

  @Test
  public void passengersMax() {
    for(int i = 0; i < 10; i++) {
      bus.add(person);
    }
    assertEquals(true, bus.isPassengersMax());
  }


}
