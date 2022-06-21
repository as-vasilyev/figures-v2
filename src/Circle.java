public class Circle extends Figure{
    int radius;
    double perimeter;
    public Circle (int radius)
    {
        this.radius = radius;
    }

    @Override
    public boolean isValid() {
        return radius > 0;
    }
    @Override
    public void getArea() {
        if (isValid()) {
            area = Math.PI * Math.pow(radius, 2);
            System.out.printf("Circle area is %f \n", area);
        } else {
            System.out.println("Circle with entered radius doesn't exist");
        }
    }

    @Override
    public void getPerimeter() {
        perimeter = 2* Math.PI * radius;
        System.out.printf("Circle perimeter is %f \n", perimeter);
    }
}
