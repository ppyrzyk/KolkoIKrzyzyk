package tictactoe;

import java.util.Scanner;

import static tictactoe.ValidMove.isValidMove;

public class PlayersMoves {

    static void player1Move(char[][] board, Scanner scanner) {
        String player1Input;
        while (true) {
            System.out.println("Select your move- (1-9)");
            player1Input = scanner.nextLine();
            if (isValidMove(board, player1Input)){
                break;
            } else {
                System.out.println(player1Input + " is not a valid move.");
            }
        }
        placeMove(board, player1Input, 'X');
    }
    static void player2Move(char[][] board,Scanner scanner) {
        String player2Input;
        while (true) {
            System.out.println("Select your move- (1-9)");
            player2Input = scanner.nextLine();
            if (isValidMove(board, player2Input)){
                break;
            } else {
                System.out.println(player2Input + " is not a valid move.");
            }
        }
        placeMove(board, player2Input, 'O');
    }


    private static void placeMove(char[][] board, String position, char symbol) {
        switch(position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println(":(");
        }
    }
}
