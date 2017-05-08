package foundation;
/*
 * 数列求和：
 * 9+99+999++9999.....+9999999999=11111111100
 */

public class GetSum1 {
	public static void main(String[] args){
		long getSum = 0;
		long num=0;
		for(int i=0;i<10;i++){
			
			num=10*num+9;
			getSum+=num;
			if(i<9){
			System.out.print(num+"+");
			}
			if(i==9){
				System.out.print(num+"=");
			}
		}
		System.out.println(getSum);
	}

}
