public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public int compareTo(Figure o) {
        if(this.area()>o.area()){
            return 1;
        }else {
            return -1;
        }
    }
}
