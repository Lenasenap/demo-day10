import java.util.Random;

public class While {
    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt(20);
        int counter = 0;
        int numberOne = 1;
        int numberTwo = 50000;

        while(numberOne != numberTwo) {
            System.out.println("numberOne är " + numberOne + " och numberTwo är = " + numberTwo);
            numberOne++;
        }

        while (i != 15) {
            counter++;
            //System.out.println("Iteration " + counter + ". " + i + " är inte lika med 15......");
            i = random.nextInt(20);
        }

        int number = 0;

        /*while(number < 10) {
            System.out.println(number);
            number++;
        }*/

        //System.out.println("Villkoret är nu false och programmet fortsätter");

    }
}
