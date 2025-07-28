package Collection.SigortaYonetimSistemi;

import java.util.Date;

public class HealthInsurance extends Insurance {
    public HealthInsurance(double price, Date start, Date end) {
        super("Health Insurance", price, start, end);
    }

    @Override
    public double calculate() {
        return price*1.1;
    }
}
