package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Winner extends Move{
    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);

        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);

        List diagonal1 = Arrays.asList(1, 5, 9);
        List diagonal2 = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<>();

        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(diagonal1);
        winning.add(diagonal2);

        for (List wl : winning) {
            if (player1Positions.containsAll(wl)) {
                return  "Player1 - You have won";
            } else if (player2Positions.containsAll(wl)) {
                return "Player 2 - You have won";
            } else if (player1Positions.size() + player2Positions.size() == 9) {
                return "Board is full- it is a tie";
            }
        }
        return "";
    }
}
