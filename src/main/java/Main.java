import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String name = "Munisha";
        int age = 20;
        long age2 = 20L;

        BigDecimal decimal = new BigDecimal("10.00");

        byte n = 127;

        double pi = 3.14;
        float pi2 = 3.14F;

        boolean isAdult = false;

        char letter = 'A';

        //
        System.out.println(1 + 1);
        System.out.println(1 * 2);
        System.out.println(1 / 2);
        System.out.println(3 - 2);
        System.out.println(10 % 3 == 0);
        System.out.println(10 == 10);
        System.out.println(10 != 10);

        String name2 = "Helena";
        String name3 = "Helena";
        System.out.println(name2 == name3);
        System.out.println(name == name3); //false

        //To compare strings:
        System.out.println(name.compareTo(name2));
        System.out.println(name.equals(name2));



    }

}
