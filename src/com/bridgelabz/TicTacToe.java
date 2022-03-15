package com.bridgelabz;
//Tic Tac Toc Game
import java.util.Scanner;
public class TicTacToe
{
    int i;
    char[] board = new char[10];
    char player, computer;
    Scanner scan = new Scanner(System.in);

    public void initialize() {
        for (i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }

    public void showboard()
    {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
}

