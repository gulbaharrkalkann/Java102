package Collection.SigortaYonetimSistemi;

import java.util.ArrayList;

public class Individual extends Account{
    public Individual(User user){
        super(user);
        this.insurances=new ArrayList<>();
    }

    @Override
    public void addInsurance(Insurance insurance) {
        //Bireysel hesaplarda sigorta ekleme işlemi
        insurance.price= insurance.calculate() * 1.05;
        insurances.add(insurance);
        System.out.println("Sigorta eklendi: " + insurance.name);
    }
}
