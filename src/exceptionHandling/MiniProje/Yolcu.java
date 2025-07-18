package exceptionHandling.MiniProje;

import java.util.Scanner;

class SiyasiErisimException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunuyor.Yurtdışına çıkamazsınız");
    }
}
    class VizeException extends Exception {
        @Override
        public void printStackTrace() {
            System.out.println(" Gideceğiniz Ülkeye Vizeniz bulunmamaktadır");
        }
    }
class YurtdisiHarcException extends Exception {
        @Override
        public void printStackTrace() {
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın");
        }
    }

public class Yolcu {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yatırdığınız harç bedeli kaçtır :");
        this.harc=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Siyasi yasağınız bulunuyor mu ?");
        String cevap=scanner.nextLine();
        if (cevap.equals("Evet")){
            this.siyasiYasak=true;
        }else {
            this.siyasiYasak=false;
        }
        System.out.println("Vizeniz bulunuyor mu ?");
        String cevap2=scanner.nextLine();
        if (cevap2.equals("Evet")){
            this.vizeDurumu=true;
        }else {
            this.vizeDurumu=false;
        }
    }






    public void yurtdisiHarciKontrol() throws YurtdisiHarcException {
        if (this.harc<15){
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın");
throw new YurtdisiHarcException();
        }else {
            System.out.println("Yurtdışı harcı işlemi tamam");

        }
    }


    public void siyasiYasakKontrol() throws SiyasiErisimException {
        if ( this.siyasiYasak==true){
            System.out.println("Siyasi yasağınız bulunuyor.Yurtdışına çıkamazsınız");
throw new SiyasiErisimException();
        }else {
            System.out.println("Siyasi yasağınız bulunmuyor");

        }

    }

    public void vizeDurumuKontrol() throws VizeException {
        if (this.vizeDurumu==true){
            System.out.println("Vize işlemleri tamam");

        }else {
           throw new VizeException();

        }
    }
}


