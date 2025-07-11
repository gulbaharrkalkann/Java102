package Generic.Pratik1;

public class NullableInteger {
    private final Integer value;
    public NullableInteger(Integer value){
        this.value=value;
    }

    public Integer getValue() {
        return value;
    }
    public boolean isNull(){
        return this.value==null;

    }
    public void run(){
        if (isNull()){
            System.out.println("Bu değişkene değer atanmamıştır(null");

        }else {
            System.out.println(this.getValue());
        }
    }
}
