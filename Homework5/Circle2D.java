public class Circle2D{
    double x;
    double y;
    double radius;

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return radius;
    }

    public Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x1, double y1){
        return (Math.sqrt((Math.pow((x1 - x), 2)) + (Math.pow(y1 - y, 2))) <= radius);
    }

    public boolean contains(Circle2D circle) {
        double dx = circle.x - this.x;
        double dy = circle.y - this.y;
        double centerDistance = Math.sqrt(dx * dx + dy * dy);
        return centerDistance + circle.radius <= this.radius;
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area of c1 is: " + c1.getArea());
        System.out.println("Perimeter of c1 is : " + c1.getPerimeter());
        System.out.println("c1 contains point (3, 3): " + c1.contains(3, 3));
        System.out.println("c1 contains circle c2 (center (4,5), radius 10.5): " + c1.contains(new Circle2D(4, 5, 10.5)));
        
    }
}
