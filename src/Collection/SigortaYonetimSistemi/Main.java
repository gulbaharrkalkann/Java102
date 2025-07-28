package Collection.SigortaYonetimSistemi;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AccountManager manager = new AccountManager();

        User user1 = new User("Gül", "Kalkan", "gul@123.com", "gul123", "Mühendis", 30);
        Account acc1 = new Individual(user1);
        manager.addAccount(acc1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Email : ");
        String email = scanner.nextLine();
        System.out.println("Password : ");
        String password = scanner.nextLine();

        Account loginAccount = manager.login(email, password);
        if (loginAccount != null) {
            System.out.println("Login successful for: " + loginAccount.getUser().getName());
            loginAccount.showUserInfo();
            while (true) {
                System.out.println("1- Adres ekle\n2- Sigorta ekle\n3- Çıkış\n4-Adresleri göster\n5-Sigortaları göster");
                int secim = scanner.nextInt();
                scanner.nextLine(); // dummy

                if (secim == 1) {
                    System.out.print("Adres girin: ");
                    String adres = scanner.nextLine();
                    loginAccount.addAddress(new HomeAddress(adres));
                    System.out.println("Adres eklendi.");
                } else if (secim == 2) {
                    System.out.println("Sigorta türü seçin: 1-Sağlık 2-Araba 3-Konut");
                    int sigortaSecim = scanner.nextInt();
                    scanner.nextLine();
                    Insurance insurance = null;
                    if (sigortaSecim == 1) {
                        insurance = new HealthInsurance(1000, new Date(), new Date());
                    } else if (sigortaSecim == 2) {
                        insurance = new CarInsurance(2000, new Date(), new Date());
                    } else if (sigortaSecim == 3) {
                        insurance = new ResidenceInsurance(1500, new Date(), new Date());
                    }
                    if (insurance != null) {
                        loginAccount.addInsurance(insurance);
                        System.out.println("Sigorta eklendi: " + insurance.getName());
                    }
                } else if (secim == 3) {
                    System.out.println("Çıkış yapılıyor...");
                    break;
                } else if (secim ==4) {
                    System.out.println("Adresler :  ");
                    for (Address address: loginAccount.getUser().getAddressList()) {
                        System.out.println(address.getAddress());
                    }
                } else if (secim == 5) {
                    System.out.println("Sigortalar : ");
                    for (Insurance insurance : loginAccount.insurances) {
                        System.out.println("Ad: " + insurance.getName());
                        System.out.println("Başlangıç: " + insurance.getStartDate());
                        System.out.println("Bitiş: " + insurance.getEndDate());
                        System.out.println("Fiyat: " + insurance.getPrice());
                        System.out.println("-----");
                    }
                } else {
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
                }
            }
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }
}
            // Basit menü
