package Collection.Queue.PriorityQueueP2;
//Bu projede PriorityQueue kullanarak öğrencileri CGPA, isim ve ID'ye göre sıralayacağız.
//Öğrenciler "ENTER" komutu ile eklenir ve "SERVED" komutu ile en yüksek öncelikli öğrenci çıkarılır.
//Öğrenciler CGPA'ya göre azalan, isimlerine göre alfabetik ve ID'ye göre artan olarak sıralanır.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEvents = Integer.parseInt(scanner.nextLine());
        List<String> events = new ArrayList<>();
        while (totalEvents-- > 0) {

            events.add(scanner.nextLine());
        }
        Priorities priorities = new Priorities();
        List<Student> students = priorities.getStudents(events);
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        }else
        {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }
}
