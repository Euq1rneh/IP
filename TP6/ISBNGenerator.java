public class ISBNGenerator {
    public static void main(String[] args) {
/*
        int inteiro = Integer.parseInt(args[0]);
        isbnConstructor(isbnGenerator(inteiro));
        */
        System.out.println(isbnGenerator(020131452));// inteiro ontroduzido e completamente diferente do que e utilizado mas nao excede a capacidade de representacao do int
        System.out.println(isbnGenerator(972662905)); // funciona ultimo digito = 5
        System.out.println(isbnGenerator(999215810));// ultimo digito 7
        System.out.println(isbnGenerator(997150210));//ultimo digito 0
        System.out.println(isbnGenerator(853590277));//ultimo digito 5
    }

    private static String isbnGenerator(int inteiro){ 
        String isbn = "" + inteiro;
        int sum = 0, lasDigit;

        for(int i = 9; i > 0; i--){
            sum += i*(inteiro%10);
            inteiro /= 10;
        }

        lasDigit = sum%11;
        isbn = isbn + "-"+ lasDigit;

        return isbn;
    }

    
}
