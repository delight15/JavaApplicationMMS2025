public class Complex {

    private double real;
    private double imaginary;

    public Complex() {
        real = 0;
        imaginary = 0;
    }

    public Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    public Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    public Complex subtract(Complex c) {
        return new Complex(real - c.real, imaginary - c.imaginary);
    }

    public void print() {
        System.out.println("(" + real + ", " + imaginary + ")");
    }
}