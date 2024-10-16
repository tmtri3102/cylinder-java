public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(double radius) {
        return radius * radius * Math.PI;
    }


    public String toString() {
        return "Color is " + color + ", Radius is " + radius + ", Area is " + area(radius);
    }
}
