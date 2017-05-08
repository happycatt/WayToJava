package foundation;
/*循环开始前打印：before the loop
 * 循环期间打印在每次循环打印角标：1，2，3；
 * 循环完成打印：the loop is over
 */

public class Game {

	public static void main(String[] args) {
		System.out.println("before the loop");
		int a = 1;
		while (a<4){
			System.out.println("in the loop");
			System.out.println("the value of a is :"+a);
			a++;
		}
		System.out.println("the loop is over");

	}

} 
