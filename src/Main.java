import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select figure type: Circle (c), Triangle (t), Rectangle (r):");
        String figure = scanner.next();
        switch (figure) {
            case "c" -> {
                System.out.println("Enter radius");
                int radius = scanner.nextInt();
                Figure circle = new Circle(radius);
                if (!circle.isValid()){
                    System.out.println("Circle with entered radius doesn't exist");
                    break;
                }
                circle.getArea();
                circle.getPerimeter();
            }
            case "t" -> {
                System.out.println("Enter first side");
                int a = scanner.nextInt();
                System.out.println("Enter second side");
                int b = scanner.nextInt();
                System.out.println("Enter third side");
                int c = scanner.nextInt();
                Figure triangle = new Triangle(a, b, c);
                if (!triangle.isValid()){
                    System.out.println("Triangle with entered sides doesn't exist");
                    break;
                }
                triangle.getArea();
                triangle.getPerimeter();
            }
            case "r" -> {
                System.out.println("Enter first side");
                int height = scanner.nextInt();
                System.out.println("Enter second side");
                int width = scanner.nextInt();
                Figure rectangle = new Rectangle(height, width);
                if (!rectangle.isValid()){
                    System.out.println("Rectangle with entered sides doesn't exist");
                    break;
                }
                rectangle.getArea();
                rectangle.getPerimeter();
            }
            default -> System.out.println("Incorrect figure type was selected");
        }
    }
}
