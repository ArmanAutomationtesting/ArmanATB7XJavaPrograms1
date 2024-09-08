package JavaPractice.Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {

        Student student = new Student("Arman",22);
        Student student1 = new Student("Shakib", 22);
        Student student2 = new Student("zafeer",24);


        //        student.setName("Arman");
//        System.out.println(student.getName());
//        student.toString();
//        student.setId(22);
////        System.out.println(details.toString());

        List arr = new ArrayList();
        arr.add(student1);
        arr.add(student2);
        arr.add(student);
        System.out.println(arr);

    }

     }
class Student implements Comparable {
    private String Name;
    private Integer id;

    @Override
    public String toString() {
        return "{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                '}';
    }

    public Student(String name, Integer id) {
        Name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

