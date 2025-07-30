package io.Serialization;
// Serialization nedir? Neden kullanılır?
// Serialization, Java nesnelerini baytlara dönüştürerek dosyaya yazma veya ağ üzerinden gönderme işlemi için kullanılır.
// Bu işlem, nesnelerin kalıcı hale getirilmesi ve daha sonra geri yüklenmesi için gereklidir.
import java.io.*;

public class Main {
    public static void main(String[] args) {
//Output Stream ile nesne yazma
        Car c1=new Car("Mercedes ","CLA");
        try {
            FileOutputStream outputFile=new FileOutputStream("araba.txt");
            ObjectOutputStream output=new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("****************************************");
//InputStream ile nesne okuma
        Car c2=new Car("BMW","X5");
        try {
            FileInputStream inputFile=new FileInputStream("araba.txt");
            ObjectInputStream inputStream= new ObjectInputStream(inputFile);
            Car newCar= (Car) inputStream.readObject();
            System.out.println("Marka: " + newCar.getBrand());
            System.out.println("Model: " + newCar.getModel());
            inputStream.close();
            inputFile.close();
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


    }
}
