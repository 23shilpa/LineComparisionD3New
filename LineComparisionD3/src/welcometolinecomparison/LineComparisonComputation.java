package welcometolinecomparison;

public class LineComparisonComputation {
    public static void main(String[] args) {

        double x1 = 8;
        double x2 = 9;
        double y1 = 8;
        double y2 = 9;
        double p1 = 6;
        double p2 = 7;
        double q1 = 6;
        double q2 = 7;

        System.out.println("Enter the x coordinate of the first point:");
        System.out.println("Enter the x-coordinate of the first point: ");
        System.out.println("Enter the x-coordinate of the Second point: ");
        System.out.println("Enter the x-coordinate of the second point: ");

        double length_of_line_1 = Math.sqrt((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
        double length_of_line_2 = Math.sqrt((Math.pow(p2 - p1, 2) + (Math.pow(q2 - q1, 2))));

        String check_equal_or_not =null;

        if (length_of_line_1 == length_of_line_2) {
            check_equal_or_not = "Equal";
        } else if (length_of_line_1 < length_of_line_2) {
            check_equal_or_not = "Less";
        } else {
            check_equal_or_not = "Greater";
        }
        System.out.printf("The length of the 1st line is " + check_equal_or_not + " to Second Line.");
    }
}
