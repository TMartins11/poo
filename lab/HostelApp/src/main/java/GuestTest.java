import apphostel.model.Guest;

public class GuestTest {
    public static void main(String[] args) {
        Guest abel = new Guest();
        Guest fermina = new Guest("Firmina");
        Guest gregor = new Guest("Gregor", "Samsa");

        System.out.println("Dados do hóspede..." + abel.getName() + " " + abel.getLastName());

        System.out.println("Dados do hóspede..." + fermina.getName() + " " + fermina.getLastName());

        System.out.println("Dados do hóspede..." + gregor.getName() + " " + gregor.getLastName());
    }
}
