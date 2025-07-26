package Collection.UrunYonetimSistemi;

public class Phone extends Product{
    private int memory;
    private double screen;
    private int battery;
    private int ram;
    private String color;
    private int camera;

    public Phone(int id, String name, double price, double discount, int stock, Brand brand, int memory, double screen, int battery, int ram, String color, int camera) {
        super(id, name, price, discount, stock, brand);
        this.memory = memory;
        this.screen = screen;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
        this.camera = camera;
    }

    public int getMemory() {
        return memory;
    }

    public double getScreen() {
        return screen;
    }

    public int getBattery() {
        return battery;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public int getCamera() {
        return camera;
    }
}
