import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        SimpleStartup game = new SimpleStartup();
        Scanner scanner = new Scanner(System.in);
        int randomResult = (int) (Math.random() * 5);
        int[] gamePositions = new int[]{randomResult, randomResult++, randomResult + 2};
        game.setLocationCells(gamePositions);
        boolean play = true;
        while (play) {
            System.out.print("Scegli la posizione per attaccare: ");
            int guessPlayer = scanner.nextInt();
            String result = game.checkYourself(guessPlayer);
            numOfGuesses++;
            if (result.equals("kill")) {
                System.out.println("You've won!");
                System.out.println("Hai impiegato " + numOfGuesses + " tentativi");
                play = false;
            }

        }
    }
}