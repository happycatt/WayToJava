package foundation;
import java.util.Scanner;
	public class Recursion{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int x =sc.nextInt();
			int sum = getSum(x);
			System.out.println("总和为："+sum);
		}
		public static int getSum(int n){
			if(n==1){
				return 1;
			}
			return getSum(n-1)+n;
		}
}
