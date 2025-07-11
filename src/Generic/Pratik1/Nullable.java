package Generic.Pratik1;

public class Nullable {
    private final String value;

    public Nullable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public Boolean isNull(){
        return this.getValue()==null;
    }
    public void run(){
        if (isNull()){
            System.out.printf("Bu değişkene değer atanmamıştır(null)");
        }else {
            System.out.printf(this.getValue());
        }
    }
}
