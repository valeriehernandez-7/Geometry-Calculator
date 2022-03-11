package calculator.figures;

public class Triangle extends Figure implements Comparable<Figure> {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int sides() {
        return 3;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public int compareTo(Figure figureToCompare) {
        // figure to compare data
        double figureAreaToCompare = figureToCompare.area();
        int figureSides = figureToCompare.sides();
        // class figure reference data
        double figureAreaReference = this.area();
        int figureSidesReference = this.sides();
        // comparison
        System.out.println("\n--- COMPARISON DATA  ---\n" + getClass().getSimpleName() + " vs " + figureToCompare.getClass().getSimpleName());
        System.out.println(getClass().getSimpleName() + " Area: " + figureAreaReference);
        System.out.println(figureToCompare.getClass().getSimpleName() + " Area: " + figureAreaToCompare);
        if (figureAreaReference == figureAreaToCompare) {
            // comparison data
            if (figureSidesReference != figureSides) {
                System.out.println("*** The figures are not similar (different shape) but have the same area ***");
            }
            return 0;
        } else if (figureAreaReference > figureAreaToCompare) {
            return 1;
        } else {
            return -1;
        }
    }
}