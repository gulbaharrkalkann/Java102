package Collection.SigortaYonetimSistemi;

import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(double price, Date start,Date end) {
        super("Residence Insurance", price, start, end);
    }

    @Override
    public double calculate() {
        return price*1.2;
    }
}
