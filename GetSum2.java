package foundation;
/*
 * 数列求和：
 * 请输入一个整数：
 * 例（输入5）
 * 打印：1+1/2+1/3+1/4+1/5=？
 */
import java.util.Scanner;
public class GetSum2 {
	public static void main(String[] args){
		System.out.println("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		double sum =0;
		for(int i=1;i<num+1;i++){
			double result=1.0/i;
			sum+=result;
			if(i<num){
				System.out.print(1+"/"+i+"+");
			}
			if(i==num){
				System.out.print(1+"/"+i+"=");
			}
			
		}
		System.out.println(sum);
	}

}
