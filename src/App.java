import calculator.figures.Figure;
import calculator.figures.Circle;
import calculator.figures.Triangle;
import calculator.figures.Rectangle;

import java.util.Random;
import java.util.Arrays;

public class App {

    /**
     * Generates one random number between 1 - 100
     * @return double number
     */
    public static double randomGenerator() {
        Random random = new Random();
        return random.nextDouble(1, 100);
    }

    public static void main(String[] args) {
        // figures array
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(randomGenerator());
        figures[1] = new Triangle(randomGenerator(), randomGenerator());
        figures[2] = new Rectangle(randomGenerator(), randomGenerator());
        figures[3] = new Triangle(11, 4);
        figures[4] = new Rectangle(11, 2);

        // prints the figures sides number and area
        System.out.println("\n--- FIGURES DATA ---");
        for (Figure figure : figures) {
            System.out.println("Figure: " + figure.getClass().getSimpleName() + " | Sides: " + figure.sides() + " | Area: " + figure.area());
        }

        // sorts the rectangles array into ascending order
        Arrays.sort(figures);
        System.out.println("\n--- FIGURES SORTED ---");
        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName() + " Area: " + figure.area());
        }
    }
}