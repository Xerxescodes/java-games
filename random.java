import java.util.*;
import java.io.*;

public class random
{
public static void main(String[]args)
{
System.out.println();
System.out.println("......................................XerxesCodes.......................");
System.out.println();
int count=0;
int humanwin=0;
int botwin=0;
int draw=0;
boolean brad=false;

do{
Scanner in = new Scanner(System.in);
System.out.println("......Rock Paper Scissors....");
System.out.println("Make choice");
String chce=in.next().toLowerCase();

count++;

if(chce.charAt(0)=='s')
{
System.out.println("Human:Scissors");
}
else if(chce.charAt(0)=='p')
{
System.out.println("Human:Paper");
}
else if(chce.charAt(0)=='r')
{
System.out.println("Human:Rock");
}
else
{
System.out.println("Error:Wrong Choice");
break;}

String[]arr={"rock","paper","scissors"};
String bot=f(arr);
System.out.println("Bot:"+bot+"");

if(chce.equals("paper")&&bot.equals("paper")||chce.equals("rock")&&bot.equals("rock")||chce.equals("scissors")&&bot.equals("scissors"))
{
draw++;
System.out.println("DRAW!");
}
else if (chce.equals("rock")&&bot.equals("scissors")||chce.equals("scissors")&&bot.equals("paper")||chce.equals("rock")&&bot.equals("scissors")||chce.equals("paper")&&bot.equals("rock"))
{
humanwin++;
System.out.println("HUMAN WINS!");
}
else
{
botwin++;
System.out.println("BOT WINS!");
}
System.out.println("***************");
System.out.println();

if(count==4)
{
brad=true;
}
}while(!brad);

while(brad)
{
System.out.println();
System.out.println("***RESULT BOARD***");
System.out.println("BOT WINS: "+botwin);
System.out.println("HUMAN WINS: "+humanwin);
System.out.println("DRAWS: "+draw);
brad=false;
}
}

public static String f(String[]arr)
{
int s=arr.length;
int e=(int)(Math.random()*s);
return arr[e];
}
}