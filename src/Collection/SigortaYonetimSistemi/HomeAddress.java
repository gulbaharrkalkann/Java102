package Collection.SigortaYonetimSistemi;

public class HomeAddress implements Address{
    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
