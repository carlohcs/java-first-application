package initial;

public class Switch {
    public static void main(String[] args) {
        int number = 5;

        switch (number) {
            case 1:
                System.out.println("Running for 1");
                break;
            case 2:
                System.out.println("Running for 2");
                break;
            case 5:
                System.out.println("Running for 3");
                break;
            default:
                System.out.println("Not found.");
                break;
        }
    }
}
