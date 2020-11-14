import java.io.*;
import java.util.*;

public class TicTac
{
public static boolean valid = false;
public static boolean game_still_going = true;
public static String winner;
public static String current_player = "X";
public static String[]boad=
             {"-", "-", "-",
              "-", "-", "-",
              "-", "-", "-"};
public static Scanner scan = new Scanner(System.in);
public static void main(String[]args)
{
System.out.println();
System.out.println("......................................XerxesCodes.......................");
System.out.println();

while(game_still_going)
{
handle_turn(current_player);
flip_player();
check_if_game_over();
}
}

public static void check_if_game_over()
{
if( winner == "X" || winner == "O")
{
System.out.println(winner + " won.");
game_still_going=false;
}
}

public static void handle_turn(String player)
{
boolean valid = false;
do
{
System.out.println(player + "'s turn.");
int position = scan.nextInt()-1;     
        if (boad[position] == "-"){
            valid = true;
            boad[position] = player;
             display(boad);}
        else
            System.out.println("Wrong move");
}while(!valid);

if (boad[0]=="X" && boad[1]=="X" && boad[2]=="X")
winner = "X";
else if(boad[3]=="X" && boad[4]=="X" && boad[5]=="X")
winner = "X";
else if(boad[6]=="X" && boad[7]=="X" && boad[8]=="X")
winner = "X";

else if (boad[0]=="O" && boad[1]=="O" && boad[2]=="O")
winner = "O";
else if(boad[3]=="O" && boad[4]=="O" && boad[5]=="O")
winner = "O";
else if(boad[6]=="O" && boad[7]=="O" && boad[8]=="O")
winner = "O";

else if(boad[0]=="O" && boad[3]=="O" && boad[6]=="O")
winner = "O";
else if(boad[1]=="O" && boad[4]=="O" && boad[7]=="O")
winner = "O";
else if(boad[2]=="O" && boad[5]=="O" && boad[8]=="O")
winner = "O";


else if(boad[0]=="X" && boad[3]=="X" && boad[6]=="X")
winner = "X";
else if(boad[1]=="X" && boad[4]=="X" && boad[7]=="X")
winner = "X";
else if(boad[2]=="X" && boad[5]=="X" && boad[8]=="X")
winner = "X";

else if (boad[0] =="X" && boad[4] == "X" && boad[8]=="X")
winner = "X";
else if(boad[6] =="X" && boad[4] =="X" && boad[2]=="X")
winner = "X";

else if (boad[0] =="O" && boad[4] == "O" && boad[8]=="O")
winner = "O";
else if(boad[6] =="O" && boad[4] =="O" && boad[2]=="O")
winner = "O";

else if (boad[0] != "-" && boad[1] != "-" && boad[2] != "-" && boad[3] != "-" && boad[4] != "-" && boad[5] != "-" &&boad[6] != "-" &&boad[7] != "-" && boad[8] != "-")
{
System.out.println("Draw");
game_still_going = false;
}
}

public static void flip_player()
{
    if (current_player == "X")
       current_player = "O" ;   
    else if (current_player == "O")
       current_player = "X";
}


public static void display(String[]boad)
{
System.out.println(boad[0] + " | " + boad[1] + " | " + boad[2]);
System.out.println(boad[3] + " | " + boad[4] + " | " + boad[5]);
System.out.println(boad[6] + " | " + boad[7] + " | " + boad[8]);
}
}