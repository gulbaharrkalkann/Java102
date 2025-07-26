package Collection.Queue.PriorityQueueP2;

public class Student  implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
    @Override
    public int compareTo(Student other) {
        if (Double.compare(other.cgpa,this.cgpa) != 0) {
            return Double.compare(other.cgpa,this.cgpa);
        } else if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name);
        }else
            return Integer.compare(this.id, other.id);
    }
}
