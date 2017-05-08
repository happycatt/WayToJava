package foundation;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber2 {
	public static void main(String[] args){
		Random ran=new Random();
		int ans =ran.nextInt(100);
		System.out.println("please guess the number?");
		int x =0;
		while(true){
			Scanner sc=new Scanner(System.in);
			x=sc.nextInt();
			if(x>ans){
				System.out.println("猜大了");
			}
			if(x<ans){
				System.out.println("猜小了");
			}
			if(x==ans){
				System.out.println("恭喜你，猜对了！");
				break;
			}
			
			
		}
	}

}
