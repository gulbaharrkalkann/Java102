package Collection.Queue.PriorityQueueP2;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        for (String event : events) {
            if (event.startsWith("ENTER")) {
                String[] parts = event.split(" ");
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                pq.add(new Student(id, name, cgpa));
            } else if (event.equals("SERVED")) {
                pq.poll(); // Remove highest priority
            }
        }

        // Kalan öğrencileri sıraya göre listeye aktar
        List<Student> students = new ArrayList<>();
        while (!pq.isEmpty()) {
            students.add(pq.poll());
        }

        return students;
    }
}
