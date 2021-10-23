class guiao41{
    public static void main(String[] args) {
        System.out.println(InterpretadorIMC(IndiceMassaCorporal()));
    }

    static Double IndiceMassaCorporal(){
        Double peso = 75.0, altura = 1.85, IMC =(double) peso / (altura * altura);
        return IMC;
    }
    static String InterpretadorIMC(Double IMC){

        String msgFinal;

        if(IMC < 15){
            msgFinal = "Com um IMC de " + IMC + " tens um peso muito abaixo do normal";
            return msgFinal;
        }
        else if(15 > IMC || IMC < 18.5){
            msgFinal = "Com um IMC de " + IMC + " tens um peso abaixo do normal";
            return msgFinal;
        }
        else if(18.5 > IMC || IMC < 25){
            msgFinal = "Com um IMC de " + IMC + " tens um peso normal";
            return msgFinal;
        }
        else if (25 > IMC || IMC <30){
            msgFinal = "Com um IMC de " + IMC + " tens um peso acima do normal";
            return msgFinal;
        }
        else if (30 > IMC || IMC < 40){
            msgFinal = "Com um IMC de " + IMC + " es obeso";
            return msgFinal;
        }
        else {
            msgFinal = "Com um IMC de " + IMC + " es muito obeso";
            return msgFinal;
        }
    }
}