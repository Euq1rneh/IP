/**
 * Programa que imprime a tabuada do tres.
 *
 * Compilar:	javac Tabuada.java
 * Executar:	java Tabuada
 *
 * @author IP1819
 */
import java.util.Scanner;
public class TabuadaDeA {


    public static void main (String[] args) {
    //Yes NO

    // Tabuada de X
    System.out.print("Introduza um valor de 0 a 100 (natural): ");
    Scanner inputNumber = new Scanner(System.in);
    int a = inputNumber.nextInt();

    funcaoTabuada(a);
    }

    static void funcaoTabuada(int valor){
  		System.out.println (valor + " x " + 1 + " = " + valor  * 1);
  		System.out.println (valor + " x " + 2 + " = " + valor  * 2);
  		System.out.println (valor + " x " + 3 + " = " + valor  * 3);
  		System.out.println (valor + " x " + 4 + " = " + valor  * 4);
  		System.out.println (valor + " x " + 5 + " = " + valor  * 5);
  		System.out.println (valor + " x " + 6 + " = " + valor  * 6);
  		System.out.println (valor + " x " + 7 + " = " + valor  * 7);
  		System.out.println (valor + " x " + 8 + " = " + valor  * 8);
  		System.out.println (valor + " x " + 9 + " = " + valor  * 9);
      System.out.println (valor + " x " + 10 + " = " + valor  * 10);

      funcaoEscolha();
    }

// Funcao Escolha
    static void funcaoEscolha(){

      System.out.print("Desejas continuar?(no /yes) ");

      String choice;
      Scanner escolha = new Scanner(System.in);
      choice = escolha.nextLine();

      if(choice.equals("yes")){

        System.out.print("Introduza um valor de 0 a 100 (natural): ");
        Scanner inputNumber = new Scanner(System.in);
        int a = inputNumber.nextInt();

        funcaoTabuada(a);
      }
      else{
        return;
      }
    }

}
