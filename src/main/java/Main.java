import java.math.BigDecimal;
import java.util.Arrays;

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
        boolean isAdult = (age >= 16 || age >=18) && ();

        char letter = 'A';

        //Day2
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

//        Point a = new Point(10,10);
//        Point b = a;
//        b.x = 20;
//        System.out.println(b);
//        System.out.println(c);

        BigDecimal tenner = new BigDecimal();
        BigDecimal tenner2 = new BigDecimal();

       int number = 1;

        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[2] = 2;
        System.out.println(numbers.length);

        int[] numbers2 = {1, 2};
        int numbers = {1,2,3,4,5};
        for(int i=0; i < numbers.length; i++) {
            if(i == 3){
               continue;
            }
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        int x =0;
        System.out.println(x++); //returns x then increments as ++ is on the right
        System.out.println(x);

        //If statement
        if(1>2){ //Boolean expression goes inside
            System.out.println("true");
        } else if (1==2){
            System.out.println("false");
        } else if (1==3){
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        //Switch statement
        String gender = "FEMALE";
        switch (gender) {
            case "FEMALE":
                System.out.println("female...");
                break;
            case "MALE":
                System.out.println("male...");
                break;
            default:
                System.out.println("dunno...");

        }



    }

}
