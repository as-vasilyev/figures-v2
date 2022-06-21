import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select figure type: Circle (c), Triangle (t), Rectangle (r):");
        String figure = scanner.next();
        switch (figure) {
            case "c" -> {
                Figure circle = new Circle();
                circle.getParameters();
                if (!circle.isValid()) {
                    System.out.println("Circle with entered radius doesn't exist");
                    break;
                }
                circle.getArea();
                circle.getPerimeter();
            }
            case "t" -> {
                Figure triangle = new Triangle();
                triangle.getParameters();
                if (!triangle.isValid()) {
                    System.out.println("Triangle with entered sides doesn't exist");
                    break;
                }
                triangle.getArea();
                triangle.getPerimeter();
            }
            case "r" -> {
                Figure rectangle = new Rectangle();
                rectangle.getParameters();
                if (!rectangle.isValid()) {
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
