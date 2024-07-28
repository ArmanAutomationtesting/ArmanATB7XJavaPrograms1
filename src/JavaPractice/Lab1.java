package JavaPractice;

public class Lab1 {
    String name;
    String father_Name;
    int age;
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        Lab1 Profile = new Lab1();
        Profile.name = "Arman";
        Profile.father_Name = "Tauheed Ahmad";
        Profile.age= 25;
        System.out.println(Profile.age);
        System.out.println("Father Name is = " + Profile.father_Name);


    }
}
