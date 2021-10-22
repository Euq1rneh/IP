import java.util.Random;

public class guiao33 {
    
    public static void main(String[] args) {
        System.out.println((SomaDeAlgarismos(RandomGenerator(), MathRandomGenerator())));
    }

    static int RandomGenerator(){
        Random randomNumber = new Random();
        int lowerLimit = 100, higherLimit = 999;

        int number = randomNumber.nextInt(higherLimit-lowerLimit)+lowerLimit;

        return number;
    }
    
    static int MathRandomGenerator(){
        int higherLimit = 999, lowerLimit = 100, range = (higherLimit-lowerLimit)+1;
        int mathRand = (int) (Math.random()*range) + lowerLimit;
        return mathRand;
    }

    static String SomaDeAlgarismos(int numberRand, int numberMathRand){
        String msgFinalRandom, msgFinalMathRandom;
        int numRandPlaceHolder = numberRand, numMathRandPlaceHolder = numberMathRand;
        int somaAlgarismosRand = 0, somaAlgarismosMathRand = 0;

        while(numberRand>0){
            somaAlgarismosRand += numberRand % 10;
            numberRand /= 10;
        }
        while(numberMathRand > 0){
            somaAlgarismosMathRand += numberMathRand % 10;
            numberMathRand /= 10;
        }

        msgFinalRandom = "\nA soma dos algarismos de "+ numRandPlaceHolder + " da " + somaAlgarismosRand + " (usa o modulo Random)";
        msgFinalMathRandom = "\nA soma dos algarismos de "+ numMathRandPlaceHolder + " da " + somaAlgarismosMathRand + " (usa o modulo Math)\n";

        return msgFinalRandom + msgFinalMathRandom;
    }
}


