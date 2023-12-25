import java.util.Random;
import java.util.Scanner;

// Create Class Game To ask you to guess the Number, its Guessing Number Game
class Game{
    int RandomNumber;
    int Guess;
    int counter=0;
    public Game(){
        Random obj = new Random(RandomNumber);
       RandomNumber = obj.nextInt(1,100);
    }

    public int getGuess() {
        Scanner obj2= new Scanner(System.in);
        Guess = obj2.nextInt();
        return Guess;
    }

    public int getRandomNumber() {
        return RandomNumber;
    }
   public void setCounter(){
        counter++;
   }
}
public class A30_ExerciseGame {
    public static void main(String[] args) {
        Game obj1 = new Game();
        obj1.getRandomNumber();

        System.out.print("Enter Number Between 1 to 100 : ");
        obj1.getGuess();

        while (true) {
            if (obj1.Guess == obj1.RandomNumber) {
                obj1.setCounter();
                System.out.println("You Have Won, You have Chose Right Number");
                break;}
             else if (obj1.Guess > obj1.RandomNumber) {
                obj1.setCounter();
                System.out.println("Your Number is Greater \nChoose Again ");
                obj1.getGuess(); }
             else if (obj1.Guess< obj1.RandomNumber) {
                obj1.setCounter();
                System.out.println("Your Number is Smaller \nChoose Again: ");
                obj1.getGuess();}
             else {
                System.out.println("Error");
            }
        }
        System.out.println(" You Have won in " + obj1.counter + " Attempts.");
    }
}




