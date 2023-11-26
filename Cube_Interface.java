// 2.	Write a program to find the cube of given number using functional interface.

interface Cube {
    void cube(int n);
}

class FCube implements Cube {
    public void cube(int n) {
        System.out.println("\n The Cube of a Given Number  " + n + "  is " + n * n * n);
    }

}

public class Cube_Interface {
    public static void main(String[] args) {
        FCube sq = new FCube();
        sq.cube(5);
    }
}
