package Collection.UrunYonetimSistemi;

public class Notebook extends Product{
    private int ram;
    private int storage;
    private double screen;

    public Notebook(int id, String name, double price, double discount, int stock, Brand brand, int ram, int storage, double screen) {
        super(id, name, price, discount, stock, brand);
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public double getScreen() {
        return screen;
    }
}
