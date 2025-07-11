package Generic.Pratik3;

public class Main {
    public static void main(String[] args) {

        Integer a=10;
        String b="patika";
        Double d=3.14;

        Test<Integer,String,Double> t =new Test<>(a,b,d);
        t.showInfo();

    }
}
