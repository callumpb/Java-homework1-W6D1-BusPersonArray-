// Create your own class with an internal
// collection of a different class.
// It should have methods for count, add, isFull etc.
// Remember to write tests for your classes!

class Bus {

  private int busNumber;
  private Person[] passengers;

  public Bus(int busNumber) {
    this.busNumber = busNumber;
    this.passengers = new Person[10];
  }

  public int getBusNumber() {
    return this.busNumber;
  }

  public int passengerCount() {
    int count = 0;
    for(Person person : passengers) {
      if(person != null) {
        count++;
      }
    }
    return count;
  }

  public void add(Person person) {
    if(isPassengersMax()) {
      return;
    }
    int passengerCount = this.passengerCount();
    this.passengers[passengerCount] = person;
  }

  public boolean isPassengersMax() {
    return this.passengerCount() == this.passengers.length;
  }

}
