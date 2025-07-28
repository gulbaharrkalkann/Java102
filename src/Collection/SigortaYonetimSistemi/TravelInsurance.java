package Collection.SigortaYonetimSistemi;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(double price, Date start,Date end) {
        super("Travel Insurance",price,start,end);
    }

    @Override
    public double calculate() {
        return price*1.05;
    }
}
