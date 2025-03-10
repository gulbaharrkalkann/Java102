package InnerSiniflar.Pratik2;

public class Outer {
    private int number =10;

    public void run(){
        System.out.println(number);

        Inner inner=new Inner();
        inner.run();
    }
    class Inner{
        public void run(){
            number++;
        }
    }
}
