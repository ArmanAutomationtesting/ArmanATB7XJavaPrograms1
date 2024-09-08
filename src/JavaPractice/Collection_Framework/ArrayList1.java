package JavaPractice.Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        Student1 S1 = new Student1(1,"Arman");
        Student1 S2 = new Student1(2,"Shifa");
        Student1 S3 = new Student1(3,"Altamsh");
        Student1 S4 = new Student1(4,"Iqra");

        List list = new ArrayList();
        list.add(S1);
        list.add(S2);
        list.add(S3);
        list.add(S4);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,new Sortbyid());
        System.out.println(list);
        Collections.sort(list,new Sortbyname());
        System.out.println(list);

    }
}
class Student1 implements Comparable<Student1>{
          Integer id ;
          String Name;

    public Student1(Integer id, String name) {
        this.id = id;
        Name = name;
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
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
//    public int compareTo(Student1 o) {
//        return Integer.compare(this.id,o.id);
//    }
    public int compareTo(Student1 o) {
        return CharSequence.compare(this.Name,o.Name);
    }

}

class Sortbyname implements Comparator<Student1> {


    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class Sortbyid implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
