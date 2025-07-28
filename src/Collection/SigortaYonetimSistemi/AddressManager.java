package Collection.SigortaYonetimSistemi;

public class AddressManager {
    public static void addAdress(User user,Address address){
        user.getAddressList().add(address);

    }
    public static void removeAddress(User user, Address address) {
        user.getAddressList().remove(address);
    }
}
