package Collection.SigortaYonetimSistemi;

public class Enterprise extends Account{
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        //Kurumsal hesaplarda sigorta ekleme işlemi
        insurance.price = insurance.calculate() * 0.95; // Kurumsal hesaplarda
        insurances.add(insurance);
    }
}
