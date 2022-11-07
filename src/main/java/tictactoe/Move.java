package tictactoe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Move extends Board {



    static Scanner scanner = new Scanner(System.in);


    public static void Play() {
        System.out.println("Select where you want to play on the grid = 1-9");
        String userInput = scanner.nextLine();
//        System.out.println(userInput);

        switch (userInput) {
            case "1":
                board[0][0] = 'X';
                break;
            case "2":
                board[0][1] = 'X';
                break;
            case "3":
                board[0][2] = 'X';
                break;
            case "4":
                board[1][0] = 'X';
                break;
            case "5":
                board[1][1] = 'X';
                break;
            case "6":
                board[1][2] = 'X';
                break;
            case "7":
                board[2][0] = 'X';
                break;
            case "8":
                board[2][1] = 'X';
                break;
            case "9":
                board[2][2] = 'X';
                break;
            default:
                System.out.println("Wrong move");

        }
         new Board();


    }

}

