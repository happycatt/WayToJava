package foundation;
/*
 * 个税计算表
 */
import java.util.Scanner;
public class TaxCalculate {
	public static void main(String[] args){
		System.out.println("请输入你的工资税前金额：");
		Scanner sc = new Scanner(System.in);
		double num =sc.nextDouble()-3500;
		double tax =0;
		if(num<=0){
			tax=0;
		}
		else if(num<=1500){
			tax=num*0.03;
		}
		else if(num<=4500){
			tax=num*0.1-105;
		}
		else if(num<=9000){
			tax=num*0.2-555;
		}
		else if(num<=35000){
			tax=num*0.25-1005;
		}
		else if(num<=55000){
			tax=num*0.3-2755;
		}
		else if(num<=80000){
			tax=num*0.35-5505;
		}
		else{
			tax=num*0.45-13505;
		}
		System.out.println("您应缴纳的个人所得税是："+tax);
	}

}
