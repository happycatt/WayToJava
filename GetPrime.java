package foundation;
/*
 * 取质数
 */
import java.util.Scanner;
public class GetPrime {
	public static void main(String[] args){
		System.out.println("取这个范围内的所有质数2～");
		Scanner sc=new Scanner(System.in);
		int range =sc.nextInt();
		int prime=2;
		int count=0;
		for(;prime<=range;prime++){
			boolean flag=true;
			for(int i=2;i<=Math.sqrt(prime);i++){
				int remainder=prime%i;
				if(remainder==0){
				    flag=false;
					break;
				}
			}
			if(flag){
				count++;
				System.out.print(prime+"\t");
				if(count%10==0){
					System.out.println( );
				}
			}
		
			
		}
	System.out.println("共有质数"+count+"个");	
		
	

	}
}
