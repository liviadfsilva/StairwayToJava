package stairway.to.java.StudentsGrades;

public class Student {
    String name;
    int age;
    double grade1;
    double grade2;
    static String schoolName = "Ada Tech";

    public Student(String name, int age, double grade1, double grade2) {
        this.name = name;
        this.age = age;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public double calculateAverage() {
        return (grade1 + grade2) / 2.0;
    }

    public String verifySituation(double average){
        if (average >= 7) {
          return "Approved.";                
        }
        else if(average >= 5){
            return "Resit Exam.";
        }
        else{
            return "Failed.";
        }
    }

    public void introduceStudent(){

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + schoolName);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Situation: " + verifySituation(calculateAverage()));

    }
}
