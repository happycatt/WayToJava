package foundation;
/*
 * 猜数字：输入一个数字，猜大了打印猜大了；猜小了打印猜小了；猜中了打印猜对了。三次均猜错打印sorry.
 */
import java.util.Random;
import java.util.Scanner;
public class GuessNumber3 {
	public static void main(String[] args) {
		Random ran=new Random();
		int answer=ran.nextInt(100);
		System.out.println(answer+"please input a number:");
		Scanner sc=new Scanner(System.in);
		int i=1;
		for(;i<4;i++){
			int input=sc.nextInt();
			if(input>answer){
				System.out.println("猜大了");
			}
			if(input<answer){
				System.out.println("猜小了");
			}
			if(input==answer){
				System.out.println("恭喜你，猜对了！");
				break;
			}
		}
		if(i>3){
			System.out.println("sorry!");
		}
	}

}
