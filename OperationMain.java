// 6.	Define an interface “Operation” which has method volume( ).Define a constant PI having a value 3.142 Create a class cylinder which implements this interface (members – radius,height). Create one object and calculate the volume.

interface Operation {
    double volume();
}

class Cylinder implements Operation {
    double radius, height;

    static final double PI = 3.142;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double volume() {
        double volume = PI * radius * radius * height;
        return volume;
    }
}

public class OperationMain {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(5.0, 10.0);

        System.out.println("Volume of A Cylinder is: " + cylinder.volume());

    }
}
