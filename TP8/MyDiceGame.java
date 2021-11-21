import java.util.Scanner;
public class MyDiceGame {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String name = readName(reader);

        System.out.print("Insira o dinheiro que tem para jogar > ");
        int inicialMoney = reader.nextInt();

        playRound(inicialMoney, name, reader);
    }


    /**
     * Le o nome do jogador
     * @param reader reader para concretizar a leitura
     * @return  o nome do jogador
     */
    private static String readName(Scanner reader){
        System.out.print("Insira o seu nome > ");
        String name = reader.nextLine();
        return name;
    }


    /**
     * Verifica se o jogador pretende jogar outra vez
     * @param reader
     * @return true se pretender jogar outra vez false em caso contrario
     */
    private static boolean playAgain(Scanner reader){
        System.out.print("Deseja jogar outra vez? (0-nao 1-sim) > ");
        int again = readIntInInterval(0, 1, reader);
        return again != 0;
    }


    /**
     * Le a aposta do jogador e verifica se esta e valida
     * @param reader reader para concretizar a leitura
     * @param playerInicialMoney    o dinheiro que o jogador tem
     * @param playerName    o nome do jogador
     * @return  a aposta que o jogador fez
     */
    private static int readBet(Scanner reader, int playerInicialMoney, String playerName){
        int bet;
        do{
            System.out.print("Insira uma aposta (nao deve exceder " + playerInicialMoney +") > ");
            bet = reader.nextInt();
            if(!validBet(bet, playerInicialMoney) && playerInicialMoney >= 0)
                System.out.print("A sua aposta excede " + playerInicialMoney + " ou nao e valida");
        }while(!validBet(bet, playerInicialMoney));
        return bet;
    }

    /**
     * Inicia uma ronda do jogo e continua ate o jogador decidir parar
     * @param playerInicialMoney o dinheiro que o jogador tem
     * @param playerName    o nome do jogador
     * @param d1    dado 1
     * @param d2    dado 2
     * @param reader reader para concretizar a leitura
     */
    public static void playRound(int playerInicialMoney, String playerName, Scanner reader){
        DiceRoller d1 = new DiceRoller(), d2 = new DiceRoller();
        int winnings = 0, losses = 0, inicialMoney = playerInicialMoney;

        do{
            int bet = readBet(reader, inicialMoney, playerName);
            int dice1 = d1.rollDice(), dice2 = d2.rollDice();
    
            if(dice1 + dice2 == 7){
                System.out.println("Ganhou "+ 2*bet);
                winnings+= bet*2;
                inicialMoney+=bet*2;
            }else{
                System.out.println("A Casa ganhou, a Casa ganha sempre");
                losses = bet;
                inicialMoney-=bet;
            }    
        }while(playAgain(reader) && inicialMoney>0);
        showFinalResults(playerName, winnings, losses, inicialMoney, playerInicialMoney);        
    }


    /**
     * Verifica se uma aposta e valida, ou seja, {@code bet<=playerInicialMoney && bet>0}
     * @param bet
     * @param playerInicialMoney
     * @return true caso a aposta seja valida false caso contrario
     */
    private static boolean validBet(int bet, int playerInicialMoney){
        return bet<=playerInicialMoney && bet>0;
    }


    /**
     * Mostra os reultados do jogo (ganhos, perdas e saldo)
     * @param playerName    o nome do jogador
     * @param winnings  ganhos
     * @param losses    perdas
     * @param playerInicialMoney dinheiro que o jogador tinha inicialmente
     */
    private static void showFinalResults(String playerName, int winnings, int losses,int inicialMoney, int playerInicialMoney){
        StringBuilder sb = new StringBuilder();
        if(inicialMoney==0){
            sb.append(playerName + " ficou sem dinheiro, volte noutro dia");
        }else{
            sb.append(playerName + " acabou o jogo com:\n");
            sb.append("Winnings >" + winnings);
            sb.append("\nLosses > " + losses);
            sb.append("\nBalance > " + (playerInicialMoney + (winnings-losses)));
        }
        

        System.out.println(sb.toString());
    }

    /**
	 * Le um valor inteiro no intervalo entre min e max. Se numero lido nao verifica
	 * a condicao repete a leitura, acompanhado de mensagem de erro. A leitura de
	 * coisas que nao sao numeros inteiros causa um erro durante a execucao.
	 *
	 * @param min      o limite minimo do numero a ler
	 * @param max      o limite maximo do numero a ler
	 * @param reader   reader para concretizar a leitura
	 * @param errorMsg mensagem a apresentar em caso de erro
	 * @return o numero lido
	 * @requires {@code reader != null && min < max && errorMsg != null }
	 * @ensures {@code \return >= min && \return <= max}
	 */
    static int readIntInInterval(int min, int max, Scanner reader) {
		boolean error;
		int num;
		do {
			num = reader.nextInt();
			error = (num > max || num < min);
			if (error)
				System.out.println("Insira um valor valido");
		} while (error);
		return num;
	}
}
