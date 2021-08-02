import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Figure> listOfFigures = new ArrayList<>();

        Circle circleOne = new Circle(3);
        Circle circleFive = new Circle(5.78);
        Rectangle rectangleTwo = new Rectangle(2.5, 4.6);
        Rectangle rectangleSeven = new Rectangle(3.3, 6.6);
        Rectangle rectangleNine = new Rectangle(5.5, 7.6);

        listOfFigures.add(circleOne);
        listOfFigures.add(rectangleSeven);
        listOfFigures.add(rectangleTwo);
        listOfFigures.add(circleFive);
        listOfFigures.add(rectangleNine);
        

        listOfFigures.forEach(fig -> System.out.printf("The area of figure is: %.2f%n", fig.area()));

   //     System.out.println(listOfFigures.stream().max(Comparator.comparing(el -> el.area())).get().area());

        System.out.println("Ordered:");

        Collections.sort(listOfFigures);

        listOfFigures.forEach(fig -> System.out.printf("The area of figure is: %.2f%n", fig.area()));

        double maxArea = listOfFigures.get(listOfFigures.size()-1).area();

        System.out.printf("Tha max area is: %.2f%n", maxArea);
    }
}
