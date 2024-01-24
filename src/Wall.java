public class Wall {

    // Instance variables
    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Getter methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setter methods with validation
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        // Creating an instance of the Wall class
        Wall wall = new Wall(5, 4);

        // Printing the initial area
        System.out.println("area= " + wall.getArea());

        // Setting height to a negative value
        wall.setHeight(-1.5);

        // Printing width, height, and area after setting height to a negative value
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
