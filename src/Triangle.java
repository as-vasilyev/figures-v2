import java.util.Scanner;

public class Triangle extends Figure {
    int a;
    int b;
    int c;

    @Override
    public void getPerimeter() {
        perimeter = a + b + c;
        System.out.printf("Triangle perimeter is %d \n", perimeter);
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
        int s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("Triangle area is %f \n", area);
    }
}
