public class Rectangle extends Figure {
    int height;
    int width;
    int perimeter;

    Rectangle(int height, int width) {
        this.width = width;
        this.height = height;

    }

    @Override
    public void getPerimeter() {
        perimeter = 2 * height + 2 * width;
        System.out.printf("Rectangle perimeter is %d \n", perimeter);
    }

    public boolean isValid() {
        return height > 0 && width > 0;
    }

    @Override
    public void getArea() {
        if (isValid()) {
            area = height * width;
            System.out.printf("Rectangle area is %f \n", area);
        } else {
            System.out.println("Rectangle with entered sides doesn't exist");
        }
    }
}
