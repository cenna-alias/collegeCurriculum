import Graphics.Area;

public class TestPackage {

    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("** COMPUTATION OF AREA OF DIFFERENT FIGURES **");

        System.out.println("\n ---- RECTANGLE ----");
        a.rectangle();

        System.out.println("\n ---- TRIANGLE ----");
        a.triangle();

        System.out.println("\n ---- SQUARE ----");
        a.square();

        System.out.println("\n ---- CIRCLE ----");
        a.circle();
    }
}