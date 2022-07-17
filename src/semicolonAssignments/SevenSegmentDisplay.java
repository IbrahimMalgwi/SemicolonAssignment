package semicolonAssignments;

public class SevenSegmentDisplay {
    static void row1(int display) {

        switch (display) {
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println(" __");
                break;
            case 3:
                System.out.println(" __");
                break;
            case 4:
                System.out.println("");
                break;
            case 5:
                System.out.println(" __");
                break;
            case 6:
                System.out.println(" __");
                break;
            case 7:
                System.out.println("__");
                break;
            case 8:
                System.out.println(" __ ");
                break;
            case 9:
                System.out.println(" __ ");
                break;
            case 0:
                System.out.println(" __ ");
                break;

        }
    }

    static void row2(int display) {
        switch (display) {
            case 1:
                System.out.println("|");
                break;
            case 2:
                System.out.println("   |");
                break;
            case 3:
                System.out.println("   |");
                break;
            case 4:
                System.out.println("|  |");
                break;
            case 5:
                System.out.println("|");
                break;
            case 6:
                System.out.println("|");
                break;
            case 7:
                System.out.println("  |");
                break;
            case 8:
                System.out.println("|  |");
                break;
            case 9:
                System.out.println("|  |");
                break;
            case 0:
                System.out.println("|  |");
                break;
        }
    }

    static void row3(int display) {
        switch (display) {
            case 1:
                System.out.println("|");
                break;
            case 2:
                System.out.println(" __|");
                break;
            case 3:
                System.out.println(" __|");
                break;
            case 4:
                System.out.println("|__|");
                break;
            case 5:
                System.out.println("|__");
                break;
            case 6:
                System.out.println("|__");
                break;
            case 7:
                System.out.println("  |");
                break;
            case 8:
                System.out.println("|__|");
                break;
            case 9:
                System.out.println("|__|");
                break;
            case 0:
                System.out.println("|  |");
                break;
        }
    }

    static void row4(int display) {
        switch (display) {
            case 1:
                System.out.println("|");
                break;
            case 2:
                System.out.println("|");
                break;
            case 3:
                System.out.println("   |");
                break;
            case 4:
                System.out.println("   |");
                break;
            case 5:
                System.out.println("   |");
                break;
            case 6:
                System.out.println("|  |");
                break;
            case 7:
                System.out.println("  |");
                break;
            case 8:
                System.out.println("|  |");
                break;
            case 9:
                System.out.println("   |");
                break;
            case 0:
                System.out.println("|  |");
                break;
        }
    }

    static void row5(int display) {
        switch (display) {
            case 1:
                System.out.println("|");
                break;
            case 2:
                System.out.println("|__");
                break;
            case 3:
                System.out.println(" __|");
                break;
            case 4:
                System.out.println("   |");
                break;
            case 5:
                System.out.println(" __|");
                break;
            case 6:
                System.out.println("|__|");
                break;
            case 7:
                System.out.println("  |");
                break;
            case 8:
                System.out.println("|__|");
                break;
            case 9:
                System.out.println(" __|");
                break;
            case 0:
                System.out.println("|__|");
                break;
        }
    }

    public static void main(String[] args) {
        int display  = 9;
        row1(display);
        row2(display);
        row3(display);
        row4(display);
        row5(display);
    }
}