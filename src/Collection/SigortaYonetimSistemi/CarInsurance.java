package Collection.SigortaYonetimSistemi;

import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(double price, Date start, Date end) {
        super("Car Insurance",price,start,end);
    }

    @Override
    public double calculate() {
        return price*1.15;
    }
}
