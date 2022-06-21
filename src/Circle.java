import java.util.Scanner;

public class Circle extends Figure {
    int radius;

    @Override
    public void getParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        this.radius = scanner.nextInt();
    }

    @Override
    public boolean isValid() {
        return radius > 0;
    }

    @Override
    public void getArea() {
        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Circle area is %f \n", area);
    }

    @Override
    public void getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        System.out.printf("Circle perimeter is %f \n", perimeter);
    }
}
