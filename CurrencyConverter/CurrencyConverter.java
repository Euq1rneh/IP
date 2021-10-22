import java.util.Scanner;

class CurrencyConverter{
    
    public static void main(String[] args) {
        
        Selector();
    }


    static void Selector(){
        StringBuilder currencies = new StringBuilder();
        Scanner reader = new Scanner(System.in);

        System.out.print("What is your currency? ");

        String currentCurrency = reader.nextLine();
        currencies.append(currentCurrency);
        
        System.out.print("To what currency do you wish to convert to? ");

        String convertCurrency = reader.nextLine();
        currencies.append(" " + convertCurrency);

        switch(currentCurrency){
            case "USD":
                ConvertFromUSD(currencies);
                break;
            case "EUR":
                ConvertFromEUR(currencies);
                break;
            case "JPY":

                break;
            case "GBP":

                break;
            case "AUD":

                break;
            case "CAD":

                break;
            case "CHF":

                break;
            case "CNY":

                break;
            case "HKD":

                break;
            case "NZD":

                break;
            case "SEK":

                break;
            case "KRW":

                break;
            case "SGD":

                break;
            case "NOK":

                break;
            case "MXN":

                break;
            case "INR":

                break;
            case "RUB":

                break;
            case "ZAR":

                break;
            case "TRY":

                break;
            case "BRL":

                break;
            case "TWD":

                break;
            case "DKK":

                break;
            case "PLN":

                break;
            case "THB":

                break;
            case "IDR":

                break;
            case "HUF":

                break;
            case "CDF":

                break;
            case "CZK":

                break;
            case "ILS":

                break;
            case "CLP":

                break;
            case "PHP":

                break;
            case "AED":

                break;
            case "COP":

                break;
            case "SAR":

                break;
            case "MYR":

                break;
            case "RON":

                break;
        }
    }

    static void ConvertFromUSD(StringBuilder currencyPair){
        String currentCurrency = currencyPair.substring(0, 3);
        String convertToCurrency = currencyPair.substring(4); // gets the 2nd part of the StringBuilder that corresponds to the 2nd currency
        Scanner amountToConvert = new Scanner(System.in);

        System.out.print("Amount: ");
        Double amount = amountToConvert.nextDouble();
        Double conversion;
        switch(convertToCurrency){
            case "EUR":
                conversion = amount * 0.86;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;

            case "JPY":
                conversion = amount * 114.27;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "GBP":
                conversion = amount * 0.73;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "AUD":
                conversion = amount * 1.35;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "CAD":
                conversion = amount * 1.24;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "CHF":
                conversion = amount * 0.92;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "CNY":
                conversion = amount * 6.44;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "HKD":
                conversion = amount * 7.78;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "NZD":
                conversion = amount * 1.41;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "SEK":
                conversion = amount * 8.61;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
        }
    }

    static void ConvertFromEUR(StringBuilder currencyPair){ // conversions are still wrong
        String currentCurrency = currencyPair.substring(0, 3);
        String convertToCurrency = currencyPair.substring(4); // gets the 2nd part of the StringBuilder that corresponds to the 2nd currency
        Scanner amountToConvert = new Scanner(System.in);

        System.out.print("Amount: ");
        Double amount = amountToConvert.nextDouble();
        Double conversion;
        switch(convertToCurrency){
            case "USD":
                conversion = amount * 0.86;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                amountToConvert.close();
                RepeatProcess();
                break;

            case "JPY":
                conversion = amount * 114.27;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                amountToConvert.close();
                RepeatProcess();
                break;
            case "GBP":
                conversion = amount * 0.73;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "AUD":
                conversion = amount * 1.35;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "CAD":
                conversion = amount * 1.24;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "CHF":
                conversion = amount * 0.92;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "CNY":
                conversion = amount * 6.44;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "HKD":
                conversion = amount * 7.78;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "NZD":
                conversion = amount * 1.41;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;
            case "SEK":
                conversion = amount * 8.61;
                System.out.println("From " + currentCurrency + " to " + convertToCurrency +" " + amount+" "+currentCurrency + " = " + conversion+" "+convertToCurrency);
                RepeatProcess();
                break;            
        }
    }

    static void RepeatProcess(){
        Scanner repeatReader = new Scanner(System.in);

        System.out.println("Do you wish to make more conversions?(yes/no)");
        String repeat = repeatReader.nextLine();

        if(!repeat.equals("yes") && !repeat.equals("no")){
            System.out.println("Please input a valid option");
            RepeatProcess();
        }
        else if(repeat.equals("yes")){
            Selector();
        }
        else{
            System.out.println("Thank you for using this currency converter");
            repeatReader.close();
            return;
        }
        repeatReader.close();
    }
}