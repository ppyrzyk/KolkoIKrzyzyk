package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

import static tictactoe.Winner.checkWinner;


public class Move extends Board {
    static boolean Player1 = true;
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> player1Positions = new ArrayList<>();
    static ArrayList<Integer> player2Positions = new ArrayList<>();

    public static String start() {
        System.out.println("Player1 - what is your name?");
        String p1Name = scan.nextLine();
        System.out.println("Player2 - what is your name?");
        String p2Name = scan.nextLine();


        while (true) {
            System.out.println("Select your move 1-9");
            if (Player1) {
                System.out.println( p1Name + "'s turn (X)");
            } else {
                System.out.println( p2Name + "'s turn (O)");
            }

            int userInput = scan.nextInt();
            char symbol = ' ';

            if (Player1) {
                symbol = 'X';
                player1Positions.add(userInput);
            } else {
                symbol = 'O';
                player2Positions.add(userInput);
            }

            switch (userInput) {
                case 1 -> board[0][0] = symbol;
                case 2 -> board[0][1] = symbol;
                case 3 -> board[0][2] = symbol;
                case 4 -> board[1][0] = symbol;
                case 5 -> board[1][1] = symbol;
                case 6 -> board[1][2] = symbol;
                case 7 -> board[2][0] = symbol;
                case 8 -> board[2][1] = symbol;
                case 9 -> board[2][2] = symbol;
                default -> System.out.println("Wrong move");

            }
            new Board();

            Player1 = !Player1;
//            checkWinner();

        }

    }

}
