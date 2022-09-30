import model.Animal;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        Animal lion = new Animal("Leo", "Lejon", 34);
        Animal dog = new Animal("Rio", "Hund", 9);
        Animal cat = new Animal("Tod", "Katt", 1);

        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(dog);
        animals.add(cat);

        for (int i = 0; i < animals.size(); i++) {
            if (i == 1) {
                animals.remove(i);
            }
            System.out.println(animals.get(i).getName());
        }

        /*for (int i = 0; i < animals.size(); i++) {
            if ("Hund".equalsIgnoreCase(animals.get(i).getType())) {
                System.out.println("Vi hittade en hund");
                continue;
            }
            System.out.println(animals.get(i).getType());
        }*/

        /*for (int i = 0; i < animals.size(); i++) {
            if ("Hund".equalsIgnoreCase(animals.get(i).getType())) {
                System.out.println("Vi hittade en hund");
                break;
            }
            System.out.println(animals.get(i).getType());
        }*/

        /*for (int i = 0; i < animals.size(); i++) {
            String name = animals.get(i).getName();
            System.out.println(name);
        }*/

        /*for (Animal animal : animals) {
            System.out.println(animal.getName());
        }*/

        /*List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            if(i % 2 != 0) {
                continue;
            }
            evenNumbers.add(i);
        }
        System.out.println(evenNumbers.size());

        int i = find440(evenNumbers);
        System.out.println("i är: " + i);*/
    }

    static int find440(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
            if (number == 440) {
                return number;
            }
        }
        return 1000;
    }
}
