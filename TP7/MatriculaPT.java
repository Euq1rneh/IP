import java.util.Random;

public class MatriculaPT {
    public static void main(String[] args) {
        System.out.println(licenceBuilder("ABCDEFGHIJLMNOPQRSTUVXZ"));
    }
    private static String licenceLetters(String ABC){
        Random rd = new Random();
        StringBuilder letters = new StringBuilder();
        for(int i = 0; i!=2; i++){
            letters.append(ABC.charAt(rd.nextInt(ABC.length()+1)));
        }
        return letters.toString();
    }

    private static String licenceNumbers(){
        Random rd = new Random();
        StringBuilder numbers = new StringBuilder();
        for(int i = 0; i!=2; i++){
            numbers.append(rd.nextInt(10));
        }
        return numbers.toString();
    }
/**
 * Builds a licence plate with the following format: AAxxBB
 * Where x represents a number
 *
 * @param ABC The type of alphabet 23 or 26 letters
 * @return  String that represents the licence plate
 */
    public static String licenceBuilder(String ABC){
        StringBuilder licencePlate = new StringBuilder();

        licencePlate.append(licenceLetters(ABC));
        licencePlate.append(licenceNumbers());
        licencePlate.append(licenceLetters(ABC));

        return licencePlate.toString();
    }
}
