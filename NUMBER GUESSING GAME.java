import java.util.*;
import java.io.*;
public class Main {
    public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    Random rd=new Random();
    System.out.println("WELCOME TO GUESS THE NUMBER");
    System.out.println("game has 3 levels");
    
    System.out.println("you have to guess the random number generated by this code in less than 5 chances");
    System.out.println("you guess the game correctly you will be promoted to the next level");
    
    
    int c1=5;
    int score=0;
    boolean flag=false;
    System.out.println("start the game");
    for(int l=1;l<4;l++){
        flag=false;
        int num=rd.nextInt(100)+1;
        System.out.println();
        System.out.println("number is:"+num);
        System.out.println(" you are in level" +l);
    
        for(int ch=0;ch<c1;ch++){
            System.out.println("Enter the number betwween 1 to 100");
            int num1=in.nextInt();
            if(num1>num)
            System.out.println("your guess the lower then the number");
            else if(num1<num)
            System.out.println("your guess the greater then then number");
            else{
                if(num1==num){    
                score+=10;
                System.out.println("Hurray!! yor guessed the number");
                if(l!=3)
                System.out.println("congrats!you have been qualified to"+(l+1)+"level");
    
                else {
                System.out.println("CONGRATULATIONS!! you won the game");
    
                     }
                    flag=true;
                    break;
                }
    
            }
        
        }
        if(flag==false)
        {
            System.out.println("you lost:(");
            System.out.println("play from start");
            break;
        
        }
    }
    System.out.println();
    System.out.println("your score is"+score);
    System.out.println("Thanks for playing!!");
    }
}
