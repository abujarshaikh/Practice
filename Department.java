
// 7.	Write a program to create parent class College(cno, cname, caddr) and derived class Department(dno, dname) from College. Write a necessary methods to display College details.

class College {
    int cno;
    String cname;
    String caddr;

    College(int cno, String cname, String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }

    void Display() {
        System.out.println("College No: " + cno);
        System.out.println("Name of the college is :" + cname);
        System.out.println("Address of the college:" + caddr);
    }
}

class department1 extends College {
    int dno;
    String dname;

    department1(int cno, String cname, String caddr, int dno, String dname) {
        super(cno, cname, caddr);
        this.dno = dno;
        this.dname = dname;
    }

    void displaydept() {
        Display();
        System.out.println("Department No: " + dno);
        System.out.println("Name of the Department is :" + dname);
    }

}

public class Department {
    public static void main(String[] args) {
        department1 dp = new department1(1, "DPMK", "Karjat", 10, "BCS");
        dp.displaydept();
    }
}
