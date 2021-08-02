public class Rectangle  extends Figure{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA*sideB;
    }

    @Override
    public int compareTo(Figure o) {
        if(this.area()>((Figure)o).area()){
            return 1;
        }else {
            return -1;
        }
    }
}
