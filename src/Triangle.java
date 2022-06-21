import java.util.Scanner;

public class Triangle extends Figure {
    double a;
    double b;
    double c;

    @Override
    public void getPerimeter() {
        perimeter = (int)(a + b + c);
        System.out.printf("Triangle perimeter is %f \n", perimeter);
    }

    @Override
    public void getParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = scanner.nextInt();
        System.out.println("Enter second side");
        int b = scanner.nextInt();
        System.out.println("Enter third side");
        int c = scanner.nextInt();

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid() {
        return a > 0 && b > 0 && c > 0 && ((a + b) > c && (a + c) > b && (b + c) > a);
    }

    @Override
    public void getArea() {
        double s = (a + b + c) / 2;
        area = (int)(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
        System.out.printf("Triangle area is %f \n", area);
    }
}
