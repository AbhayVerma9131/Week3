package stacksandqueues.circulartourproblem;
public class Main {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startingPoint = CircularTour.findStartingPoint(petrol, distance);

        if (startingPoint != -1) {
            System.out.println("The starting petrol pump index is: " + startingPoint);
        } else {
            System.out.println("No solution exists.");
        }
    }
}