public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(5);

        car1.start();
        car1.stop();

        //System.out.println("Liczba miejsc w samochodzie: " + car1.getNumerOfSeats());

        // ------------------------------- zadanie 3 i 4 ---------------------------------------------------

        Lion lew1 = new Lion();
        lew1.roam();
        lew1.makeNoise();
        lew1.sleep();
    }
}
