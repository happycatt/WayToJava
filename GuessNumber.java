package foundation;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
	public static void main(String[] args){
		System.out.println("can you guess the number?");
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		Random ra=new Random();
		int num =ra.nextInt(14);
		if (x>13|x<0){
			System.out.println("you`ve type the invalid number");
		}
		else if (x==num){
			System.out.println("congratulations!you are right!");	
		}
		else{
			System.out.println("sorry,you`re wrong,the right number is:"+num);
		}
	}

}
