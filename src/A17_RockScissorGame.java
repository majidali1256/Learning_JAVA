import java.util.Scanner;
import java.util.Random;

public class A17_RockScissorGame {
    public static void main(String[] args) {
        System.out.println("ROCK AND SCISSOR GAME \n 1. Enter 1 for Rock \n 2. Enter 2 for Paper \n 3. Enter 3 for Scissor ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    Random sc1 = new Random();
     int b = sc1.nextInt(1,3) ;

     if(a==1 && b==2){
         System.out.println(" Opponent chosed Paper and You Lose ");}
         if(a==1 && b==3){
             System.out.println(" Opponent chosed Scissor and You Win ");}
          else   if(a==2 && b==1){
                 System.out.println(" Opponent chosed rock and You Win ");}
            else     if(a==2 && b==3){
                     System.out.println(" Opponent chosed Scissor and You Lose ");}
                  else   if(a==3 && b==1){
                         System.out.println(" Opponent chosed Rock and You Lose ");}
                    else     if(a==3 && b==2){
                             System.out.println(" Opponent chosed Paper and You Win ");}
                        else if (a==b)   {
                                 System.out.println("Draw, Same Choice ");}
                        else{
                                 System.out.println( "Wrong Selection");}
    }
}
