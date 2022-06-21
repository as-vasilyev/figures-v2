import java.util.Scanner;

public class Rectangle extends Figure {
    int height;
    int width;

    @Override
    public void getPerimeter() {
        perimeter = 2 * height + 2 * width;
        System.out.printf("Rectangle perimeter is %f \n", perimeter);
    }

    @Override
    public void getParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        int a = scanner.nextInt();
        System.out.println("Enter second side");
        int b = scanner.nextInt();

        this.width = a;
        this.height = b;
    }

    public boolean isValid() {
        return height > 0 && width > 0;
    }

    @Override
    public void getArea() {
        area = height * width;
        System.out.printf("Rectangle area is %f \n", area);
    }
}
