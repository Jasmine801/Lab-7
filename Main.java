package Lab7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        int num = -1;

        while (num != 3) {
            System.out.println("Чего бы вам хотелось?\n[1] - Добавить в корзину\n[2] - Показать корзину\n[3] - Выход");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            switch (num) {

                case 1: {
                    person.addMeb();
                    break;
                }

                case 2: {
                    person.getBasket();
                    break;
                }

                case 3: {
                    System.out.println("Приходите еще!");
                }
            }
        }

    }
}