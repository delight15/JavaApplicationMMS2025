public class Rectangle {

    private double length = 1.0;
    private double width = 1.0;

    // set method for length
    public void setLength(double length) {

        if(length > 0.0 && length < 20.0)
            this.length = length;
        else
            System.out.println("Length must be greater than 0 and less than 20");
    }

    // get method for length
    public double getLength() {
        return length;
    }

    // set method for width
    public void setWidth(double width) {

        if(width > 0.0 && width < 20.0)
            this.width = width;
        else
            System.out.println("Width must be greater than 0 and less than 20");
    }

    // get method for width
    public double getWidth() {
        return width;
    }

    // calculate perimeter
    public double perimeter() {
        return 2 * (length + width);
    }

    // calculate area
    public double area() {
        return length * width;
    }
}