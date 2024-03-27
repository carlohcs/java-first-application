package initial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("This is Screen Match");

        System.out.println("Movie: Top Gun: Maverick");

        int year = 2022;

        System.out.println("Release: " + year);

        boolean itsOnPlan = true;

        double rate = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println("Media: " + media);

        String synopses;

        // Text block (template strings from JS)
        synopses = """
                Top Gun Movie
                A adventure movie with too many emotions!
                """ + year;

        System.out.println(synopses);

        // int x = 10;
        // double y = x; // implicit casting

        int stars = (int) (media / 2); // explicit casting

        System.out.println("Stars: " + stars);
/*
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        int num = 5;
        int resultado = num++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 5

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        String name = "Carlos"
        int years = 31;
        double value = 55.999;

        // System.out.printf("My name is %s, I'm %d and I have %.2f dollars%n", name, years, value);

        // Same as
        System.out.printf(String.format("My name is %s, I'm %d and I have %.2f dollars", name, years, value));

        // Same as

        String userName = "Carlos";
        int classes = 4;

        String msg = """
            Hello, %s!
            Welcome a board!
            We will have %d classes.
            """.formatted(userName, classes);

        System.out.println(msg);
*/
    }
}

// This bellow doesn't work
// You need to have a class based on the filename
// also, the 'public void main' is wrongly defined

/*public class Exemplo {

    public void main(String[] args) {
        System.out.println("Oi, meu nome é Alura!");
    }

}*/
