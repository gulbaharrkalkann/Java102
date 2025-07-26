package Collection.UrunYonetimSistemi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
    public class Store {
        private List<Brand> brands = new ArrayList<>();
        private List<Notebook> notebooks = new ArrayList<>();
        private List<Phone> phones = new ArrayList<>();
        private int productId = 0;

        public Store() {
            addBrand();
        }

        private void addBrand() {
            brands.add(new Brand(1, "Samsung"));
            brands.add(new Brand(2, "Lenovo"));
            brands.add(new Brand(3, "Apple"));
            brands.add(new Brand(4, "Huawei"));
            brands.add(new Brand(5, "Casper"));
            brands.add(new Brand(6, "Asus"));
            brands.add(new Brand(7, "HP"));
            brands.add(new Brand(8, "Xiaomi"));
            brands.add(new Brand(9, "Monster"));
            Collections.sort(brands);
        }

        public List<Brand> getBrands() {
            return brands;
        }

        public List<Notebook> getNotebooks() {
            return notebooks;
        }

        public List<Phone> getPhones() {
            return phones;
        }

        public Brand getBrandByName(String name) {
            for (Brand brand : brands) {
                if (brand.getName().equalsIgnoreCase(name)) {
                    return brand;
                }
            }
            return null;     // Return null if no brand found with the given name


        }

        public void addNotebook(String name, double price, double discount, int stock, String brandName, int ram, int storage, double screen) {
            Brand brand = getBrandByName(brandName);
            if (brand != null) {
                notebooks.add(new Notebook(productId, name, price, discount, stock, brand, ram, storage, screen));
            }
        }
        public void addPhone(String name, double price, double discount, int stock, String brandName,
                             int memory, double screen, int battery, int ram, String color, int camera) {
            Brand brand = getBrandByName(brandName);
            if (brand != null) {
                phones.add(new Phone(productId++, name, price, discount, stock, brand, memory, screen, battery, ram, color, camera));
            }
        }



        public boolean removeProductById(int id) {
            return notebooks.removeIf(n -> n.getId() == id) || phones.removeIf(p -> p.getId() == id);
        }

        public List<Notebook> filterNotebooksByBrand(String brandName) {
            List<Notebook> result = new ArrayList<>();
            for (Notebook n : notebooks) {
                if (n.getBrand().getName().equalsIgnoreCase(brandName)) result.add(n);
            }
            return result;
        }

        public List<Phone> filterPhonesByBrand(String brandName) {
            List<Phone> result = new ArrayList<>();
            for (Phone p : phones) {
                if (p.getBrand().getName().equalsIgnoreCase(brandName)) result.add(p);
            }
            return result;
        }
    }





