package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class X_O {

    public String[][] array_game_zone;
    Scanner UserData = new Scanner(System.in);
    static int size_array_game_zone = 3;
    private String NameFirstUser;
    private String SimbolFirstUser;

    private String NameSecondUser;
    private String SimbolSecondUser;



    //constructors
    public X_O(){
        this.start_game();
    }
    /*public X_O(){

    }
    public X_O(){

    }*/


    //methods
    public void questions () {
        System.out.println("Wich size of game_zone you want--> 3*3 (write 3), 4*4 (write 4), 5*5 (write 5)?");
        int size_array = UserData.nextInt();


        if (size_array >= 3 && size_array <= 5) {
            size_array_game_zone = size_array;
            System.out.println("your choise of size game_zone is " + size_array_game_zone + "*" + size_array_game_zone);
        }
        else {
            System.out.println("Error of size of game_zone, size was 3*3 on default");
        }

        System.out.println("What is name of first user?");
        NameFirstUser = UserData.next();
        System.out.println("Name of first user is:" + NameFirstUser);

        System.out.println("What is name of second user?");
        NameSecondUser = UserData.next();
        System.out.println("Name of second user is:" + NameSecondUser);
    }
    public void game_zone () {
        this.questions();
        array_game_zone = new String [size_array_game_zone][size_array_game_zone];
    }
    public int who_is_first () {
        int first = 1;
        int second = 2;
        int who_is_first = first + (int ) (Math.random() * second);
        System.out.println("user " + who_is_first + " was start game");
        if (who_is_first == 1) {
            SimbolFirstUser = " X ";
            SimbolSecondUser = " O ";
        }
        else {
            SimbolFirstUser = " O ";
            SimbolSecondUser = " X ";
        }
        return who_is_first;
    }
    public void sequence_users() {
        if (this.who_is_first() == 1) {
            for (int i = 0; i <= (size_array_game_zone * size_array_game_zone); i++) {
                this.question_where_is_your_turn(SimbolFirstUser, NameFirstUser);
                this.question_where_is_your_turn(SimbolSecondUser, NameSecondUser);
            }
        }
        else{
            for (int i = 0; i <= (size_array_game_zone * size_array_game_zone); i++) {
                this.question_where_is_your_turn(SimbolSecondUser, NameSecondUser);
                this.question_where_is_your_turn(SimbolFirstUser, NameFirstUser);
            }
        }
    }
    public void question_where_is_your_turn (String char_X_O, String name) {
        this.ptint_game();
        System.out.println(name + " now it's your turn");
        System.out.println("enter a column, then lead the row of finding your move");
        int column = this.UserData.nextInt() - 1;
        int row = this.UserData.nextInt() - 1;
        boolean correct_move = false;
        while (correct_move == false)
        {
            if (array_game_zone[row][column] == null) {//if column/row free then write data
                array_game_zone[row][column] = char_X_O;
                correct_move = true;
            }
            else {
                System.out.println("Error: data cell occupied, try again");
                System.out.println("enter a column, then lead the row of finding your move");
                column = this.UserData.nextInt() - 1;
                row = this.UserData.nextInt() - 1;
                correct_move = false;
            }
        }


    }
    public void ptint_game () {
        for (int i = 0; i <= (size_array_game_zone); i++)
            System.out.print("--- --");
        System.out.println("\n");
        for (int column = 0; column <= size_array_game_zone-1; column++) {
            for (int row = 0; row <= size_array_game_zone-1; row++) {
                System.out.print("| " + array_game_zone[row][column] + " |");
            }
            System.out.println("\n");
        }

    }
    public void start_game() {
        this.game_zone();
        this.who_is_first();
        this.sequence_users();

    }







}

