public class DoWhile {
    public static void main(String[] args) {
        int number = 0;

        do {
            System.out.println("Från do-while: " + number);
            number++;
        } while (number > 10);

        while(number > 10) {
            System.out.println("Från while:" + number);
        }

    }
}
