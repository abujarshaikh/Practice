// 3.	Define an abstract class Staff with protected members id and name. Define a parameterized constructor. Define one subclass Office Staff with member department. Create n objects of Office Staff and display all details.
abstract class Staff {
    int id;
    String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void Display();
}

public class OfficeStaff extends Staff {
    String Department;

    public OfficeStaff(int id, String name, String Department) {
        super(id, name);
        this.Department = Department;
    }

    public void Display() {
        System.out.println("Staff ID: " + id);
        System.out.println("Staff Name: " + name);
        System.out.println("Department Name: " + Department);
    }

    public static void main(String[] args) {
        OfficeStaff st = new OfficeStaff(1, "Abujar", "Testing");
        st.Display();
    }
}
