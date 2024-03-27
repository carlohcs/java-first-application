package initial;

public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean isIncludedPlan = true;
        String planType = "plus";

        if (releaseYear >= 2022) {
            System.out.println("It's already released!");
        } else {
            System.out.println("It will be released. Wait!");
        }

        // isIncludedPlan && anotherCondition
        if (isIncludedPlan || planType.equals("plus")) {
            System.out.println("You can watch it right now.");
        }
    }
}
