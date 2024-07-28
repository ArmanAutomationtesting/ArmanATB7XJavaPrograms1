package JavaPractice;

public class Second_highest_salary {
    public static void main(String[] args) {

        int[] salaries = {12,10,1,2,9,13,15,87,23};
        int highest_Salary = Integer.MIN_VALUE;
        int second_Highest_Salary = Integer.MIN_VALUE;
        for (int i = 0; i < salaries.length; i++) {

            if (salaries[i] > highest_Salary) {
                second_Highest_Salary = highest_Salary;
                        highest_Salary = salaries[i];

            } else if (salaries[i] > second_Highest_Salary && salaries[i] < highest_Salary ) {
                second_Highest_Salary = salaries[i];

            }
        }
        System.out.println("The Second highest salary is " + second_Highest_Salary);
    }
}
