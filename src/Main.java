public class Main {
    private String mode;

    public Main(String mode) {
        this.mode = mode;
    }

    public int add(int... args) {
        if (args.length == 2) {
            if (mode.equals("normal")) {
                return args[0] + args[1];
            } else if (mode.equals("opposite")) {
                return args[0] - args[1];
            }
        } else if (args.length == 3) {
            if (mode.equals("normal")) {
                return args[0] + args[1] + args[2];
            } else if (mode.equals("opposite")) {
                return args[0] - args[1] - args[2];
            }
        }
        throw new IllegalArgumentException("Invalid number of arguments");
    }

    public int subtract(int... args) {
        if (args.length == 2) {
            if (mode.equals("normal")) {
                return args[0] - args[1];
            } else if (mode.equals("opposite")) {
                return args[0] + args[1];
            }
        } else if (args.length == 3) {
            if (mode.equals("normal")) {
                return args[0] - args[1] - args[2];
            } else if (mode.equals("opposite")) {
                return args[0] + args[1] + args[2];
            }
        }
        throw new IllegalArgumentException("Invalid number of arguments");
    }

    public static void main(String[] args) {
        // Creating a calculator in normal mode
        Main calculatorNormal = new Main("normal");
        System.out.println("Normal Mode:");
        System.out.println("Addition: " + calculatorNormal.add(10, 5));
        System.out.println("Subtraction: " + calculatorNormal.subtract(10, 5));

        // Creating a calculator in opposite mode
        Main calculatorOpposite = new Main("opposite");
        System.out.println("\nOpposite Mode:");
        System.out.println("Addition: " + calculatorOpposite.add(10, 5));
        System.out.println("Subtraction: " + calculatorOpposite.subtract(10, 5));
    }
}
