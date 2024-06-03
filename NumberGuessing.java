import java.util.*;
public class NumberGuessing
{
 public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
Random r=new Random();
int n=r.nextInt(101);
System.out.println("WELCOME TO NUMBER GUESSING NAME");
System.out.println("You have 10 chances to win");
System.out.println("Enter number of rounds you want to play");
int rounds=sc.nextInt();
while(rounds>0){
   for(int i=1;i<11;i++){
   System.out.println("Enter Your Guess");
   int m=sc.nextInt();
   if(m<n){
      System.out.println("Enter a greater number");
      System.out.println("You have "+(10-i) +" chances left!!");
   }
   else if(m==n){
      System.out.println("You have entered the correct number");
      System.out.println("YOU WON!!!");
      System.out.println("YOUR SCORE IS: "+(10-i));
      break;
   }
   else
   {
      System.out.println("Enter a smaller number");
   }
}
rounds--;
}
 }
}