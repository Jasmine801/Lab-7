package Lab7;

import java.util.ArrayList;

public class FurnitureShop extends Furniture {
    ArrayList<Furniture> storage = new ArrayList<>();
    public FurnitureShop() {
        storage.add(table);
        storage.add(bed);
        storage.add(sofa);
    }
    Bed bed = new Bed();
    Table table = new Table();
    Sofa sofa = new Sofa();

    public void get_info() {
        bed.getInfo();
        table.getInfo();
        sofa.getInfo();
    }
}
