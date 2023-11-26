import java.io.*;

class Student {
    int rollNumber;
    String email;
    String className;
    double percentage;

    Student(int rollNumber, String email, String className, double percentage) {
        this.rollNumber = rollNumber;
        this.email = email;
        this.className = className;
        this.percentage = percentage;
    }

    void displayStudentInfo() {

        System.out.println("The Data Readed From the Console as follow ");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Email: " + email);
        System.out.println("Class: " + className);
        System.out.println("Percentage: " + percentage);
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Roll Number: ");
            int rollNumber = Integer.parseInt(br.readLine());
            System.out.print("Enter Email: ");
            String email = br.readLine();
            System.out.print("Enter Class: ");
            String className = br.readLine();
            System.out.print("Enter Percentage: ");
            double percentage = Double.parseDouble(br.readLine());
            Student student = new Student(rollNumber, email, className, percentage);
            System.out.println("\nStudent Information:");
            student.displayStudentInfo();
            br.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}