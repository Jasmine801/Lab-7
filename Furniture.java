package Lab7;
import java.util.Scanner;
public abstract class Furniture {

    int price, amount;
    String material, name;

    public void getInfo() {
        System.out.println("Название: "+ name+"\nMатериал: "+material+"\nЦена: "+price+"\n\n");
    }
    public String  getCount() {
        return "Название: "+name+"\nКол-во: "+amount+"\n";
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price * amount;
    }
}
