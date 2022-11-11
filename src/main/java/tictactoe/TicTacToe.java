package tictactoe;

import java.util.Scanner;

import static tictactoe.Board.printBoard;
import static tictactoe.PlayersMoves.player1Move;
import static tictactoe.PlayersMoves.player2Move;
import static tictactoe.WinnerVerification.winnerCheck;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};

        printBoard(board);
        System.out.println("Player1 - what is your name?");
        String p1Name = scanner.nextLine();
        System.out.println("Player2 - what is your name?");
        String p2Name = scanner.nextLine();

        while (true) {
            System.out.println(p1Name + "'s turn(X)");

            player1Move(board, scanner);
            if (winnerCheck(board)) {
                System.out.println(p1Name + " wins!!");
                break;
            }

            printBoard(board);
            System.out.println(p2Name + "'s turn(O)");

            player2Move(board, scanner);
            if (winnerCheck(board)) {
                System.out.println(p2Name + " wins!!");
                break;
            }
            printBoard(board);
        }
        scanner.close();
    }
}
