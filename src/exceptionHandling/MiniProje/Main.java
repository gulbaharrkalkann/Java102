package exceptionHandling.MiniProje;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sbaiha gökçen Havalimanına Hoşgeldiniz");
        String sartlar="Yurtdışı Çıkış Kuralları\n" +
                "Herhangi bir siyasi yasağınız bulunuyor mu\n" +
                "15 tl harç bedelini yatırmanız gerekiyor\n" +
                "Gideceğiniz ülkeye vizeniz bulunması gerekiyor\n";
        String message="Yurtdışı şartlarından hepsini sağlamanız gerekmektedir";
        while (true){
            System.out.println("******************");
            System.out.println(message);
            System.out.println("*******************");
            System.out.println(sartlar);

            Yolcu yolcu=new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor");
            Thread.sleep(3000);
            try {
                yolcu.yurtdisiHarciKontrol();
            }catch (YurtdisiHarcException e){
                e.printStackTrace();
              continue;

            }

            System.out.println("Siyasi yasak kontrol ediliyor");
            Thread.sleep(3000);
            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiErisimException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor");
            Thread.sleep(3000);
            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("İşlemleriniz tamam.Yurtdışına çıkabilirsiniz");
            break;
        }
    }
}
