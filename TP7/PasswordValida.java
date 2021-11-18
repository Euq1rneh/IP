public class PasswordValida {
    public static void main(String[] args) {
        System.out.println(passwordValida("hen@rique22")); // false
        System.out.println(passwordValida("hen"));//false
        System.out.println(passwordValida("henrique22")); // true
        System.out.println(passwordValida("22222222")); // true
        System.out.println("--------------V2-------------");
        System.out.println(passwordValidaV2("22222222")); // true
        System.out.println(passwordValidaV2("henrique22")); // true
        System.out.println(passwordValidaV2("hen"));//false

    }

    public static boolean passwordValida(String s){
        boolean valida = false, onlyLettersNumbers = false;
        int length = s.length(), algarismos = 0;


        for(int index = 0; index <= length-1; index++){
            if(Character.isLetterOrDigit(s.charAt(index))){
                if(Character.isDigit(s.charAt(index)))
                    algarismos++;
                onlyLettersNumbers = true;
            }
            else{
                index = length;
            }
        }
        if(length>=8 && onlyLettersNumbers && algarismos>=2)
            valida = true;

        return valida;
    }

    public static boolean passwordValidaV2(String s){
        int len = s.length(), numDigits = 0;
        boolean correctLen = len >=8;
        boolean validPassord = false;

        for(int index = 0; index<len; index++){

            if(!Character.isLetterOrDigit(s.charAt(index))){
                return validPassord;
            }
            else{
                if(Character.isDigit(s.charAt(index))){
                    numDigits++;
                }
            }
        }

        if(correctLen && numDigits>=2)
            validPassord = true;
        return validPassord;
    }
}
