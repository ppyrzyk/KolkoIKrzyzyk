package tictactoe;


import static tictactoe.Winner.checkWinner;

public class Main {
    public static void main(String[] args) {

            Move.start();
            String result = checkWinner();
            System.out.println(result);
        }
    }
