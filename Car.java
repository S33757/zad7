public class Car extends Vehicle {

    private int numerOfSeats;

    @Override
    public void start() {
        System.out.println("Samochod zostal wlaczony");
    }

    @Override
    public void stop(){
        System.out.println("Samochod zostal zatrzymany");
    }

    public Car(int numerOfSeats) {
        this.numerOfSeats = numerOfSeats;
    }

    public int getNumerOfSeats() {
        return numerOfSeats;
    }
}
