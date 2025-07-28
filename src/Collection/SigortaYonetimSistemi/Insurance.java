package Collection.SigortaYonetimSistemi;

import java.util.Date;

public abstract class Insurance {
    protected String name;
    protected double price;
    protected Date startDate, endDate;

    public Insurance(String name, double price, Date startDate, Date endDate) {
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public abstract double calculate();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
