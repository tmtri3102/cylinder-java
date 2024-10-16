class Cylinder extends Circle {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, int height) {
        super(radius, color);

        this.height = height;
    }

    @Override
    public String toString() {
        setRadius(8.6);
        setColor("yello");
        return "Cylinder height=" + height + " radius=" + getRadius() + " color=" + getColor();
    }
}
