package Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Person extends FurnitureShop{

    ArrayList<Furniture> basket = new ArrayList<Furniture>();
    FurnitureShop shop = new FurnitureShop();

    public void addMeb() {
        shop.get_info();
        String meb;
        int number;
        System.out.println("Какую мебель вы хотите добавить в корзину?\n");
        Scanner input = new Scanner(System.in);
        meb = input.nextLine();
        System.out.println("Количество?");
        number = input.nextInt();

        switch (meb) {
            case "Кровать": {
                bed.setAmount(number);
                basket.add(bed);
                shop.storage.remove(bed);
                break;
            }

            case "Стол": {
                table.setAmount(number);
                basket.add(table);
                shop.storage.remove(table);
                break;
            }

            case "Диван": {
                sofa.setAmount(number);
                basket.add(sofa);
                shop.storage.remove(sofa);
                break;
            }
        }
    }

    public void getBasket() {
        System.out.println("Корзина:");
        int cash = 0;
        for(int i = 0; i < basket.size(); i++) {
            cash += (basket.get(i)).getPrice();
            System.out.println((basket.get(i)).getCount());
        }
        System.out.println("Итоговая сумма: "+ cash +"\n");
    }
}