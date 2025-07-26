package Collection.UrunYonetimSistemi;

import java.util.*;

public class Main{
    private static Store store = new Store();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: notebookMenu(); break;
                case 2: phoneMenu(); break;
                case 3: listBrands(); break;
                case 0: return;
                default: System.out.println("Geçersiz seçim!");
            }
        }
    }

    private static void listBrands() {
        System.out.println("Markalarımız\n--------------");
        for (Brand b : store.getBrands()) {
            System.out.println("- " + b.getName());
        }
    }

    private static void notebookMenu() {
        System.out.println("1 - Listele\n2 - Ekle\n3 - Sil\n4 - Marka ile Filtrele");
        int c = scanner.nextInt(); scanner.nextLine();
        switch (c) {
            case 1: listNotebooks(store.getNotebooks()); break;
            case 2: addNotebook(); break;
            case 3: removeProduct(); break;
            case 4:
                System.out.print("Marka adı: ");
                String brand = scanner.nextLine();
                listNotebooks(store.filterNotebooksByBrand(brand));
                break;
        }
    }

    private static void phoneMenu() {
        System.out.println("1 - Listele\n2 - Ekle\n3 - Sil\n4 - Marka ile Filtrele");
        int c = scanner.nextInt(); scanner.nextLine();
        switch (c) {
            case 1: listPhones(store.getPhones()); break;
            case 2: addPhone(); break;
            case 3: removeProduct(); break;
            case 4:
                System.out.print("Marka adı: ");
                String brand = scanner.nextLine();
                listPhones(store.filterPhonesByBrand(brand));
                break;
        }
    }

    private static void listNotebooks(List<Notebook> notebooks) {
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-2s | %-30s | %-9s | %-9s | %-9s | %-9s | %-9s |\n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook n : notebooks) {
            System.out.printf("| %-2d | %-30s | %-9.1f TL | %-9s | %-9d | %-9.1f | %-9d |\n",
                    n.getId(), n.getName(), n.getPrice(), n.getBrand().getName(), n.getStorage(), n.getScreen(), n.getRam());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    private static void listPhones(List<Phone> phones) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-2s | %-30s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s | %-9s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Pil", "RAM", "Renk");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        for (Phone p : phones) {
            System.out.printf("| %-2d | %-30s | %-9.1f TL | %-9s | %-9d | %-9.1f | %-9d | %-9d | %-9d | %-9s |\n",
                    p.getId(), p.getName(), p.getPrice(), p.getBrand().getName(), p.getMemory(), p.getScreen(),
                    p.getCamera(), p.getBattery(), p.getRam(), p.getColor());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
    }

    private static void addNotebook() {
        System.out.print("Ürün adı: "); String name = scanner.nextLine();
        System.out.print("Fiyat: "); double price = scanner.nextDouble();
        System.out.print("İndirim: "); double discount = scanner.nextDouble();
        System.out.print("Stok: "); int stock = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Marka: "); String brand = scanner.nextLine();
        System.out.print("RAM: "); int ram = scanner.nextInt();
        System.out.print("Depolama: "); int storage = scanner.nextInt();
        System.out.print("Ekran: "); double screen = scanner.nextDouble();
        scanner.nextLine();
        store.addNotebook(name, price, discount, stock, brand, ram, storage, screen);
    }

    private static void addPhone() {
        System.out.print("Ürün adı: "); String name = scanner.nextLine();
        System.out.print("Fiyat: "); double price = scanner.nextDouble();
        System.out.print("İndirim: "); double discount = scanner.nextDouble();
        System.out.print("Stok: "); int stock = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Marka: "); String brand = scanner.nextLine();
        System.out.print("Depolama: "); int memory = scanner.nextInt();
        System.out.print("Ekran: "); double screen = scanner.nextDouble();
        System.out.print("Pil: "); int battery = scanner.nextInt();
        System.out.print("RAM: "); int ram = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Renk: "); String color = scanner.nextLine();
        System.out.print("Kamera: "); int camera = scanner.nextInt();
        scanner.nextLine();
        store.addPhone(name, price, discount, stock, brand, memory, screen, battery, ram, color, camera);
    }

    private static void removeProduct() {
        System.out.print("Silinecek ürün ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (store.removeProductById(id)) {
            System.out.println("Ürün silindi.");
        } else {
            System.out.println("Ürün bulunamadı.");
        }
    }
}