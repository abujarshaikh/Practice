
// 1.	Write a program to find the Square of given number using function interface.

interface Square {
    void square(int n);
}

class FSquare implements Square {
    public void square(int n) {
        System.out.println("\n The Square of a Given Number  " + n + "  is " + n * n);
    }

}

public class Square_Interface {
    public static void main(String[] args) {
        FSquare sq = new FSquare();
        sq.square(5);
    }
}