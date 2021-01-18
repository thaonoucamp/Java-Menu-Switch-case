package myPackage;

public class Circle {
    public static final float PI = 3.14f;

    public static float area( float radius) {
        return radius * radius * PI;
    }

    public static float perimeter(float radius) {
        return 2 * radius * PI;
    }
}
