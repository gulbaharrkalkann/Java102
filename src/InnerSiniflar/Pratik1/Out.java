package InnerSiniflar.Pratik1;

public class Out {
    public int a=5;


    public class In{
        public int a=10;

        public void run(){
            System.out.println("in sınıfına ait run metodu çalıştı.");
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);
        }
    }
    public void run(){
        System.out.println("Out sınıfına ait run metodu çalıştı");
        In in=new In();
    in.run();
    }
}
