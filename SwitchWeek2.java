package foundation;
import java.util.Scanner;
public class SwitchWeek2 {
	public static void main(String[] args){
		System.out.println("is today weekends?");
		Scanner sc = new Scanner(System.in);
		int day=sc.nextInt();
		switch(day){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		System.out.println("today is workday!");
		break;
		case 6:
		case 7:
		System.out.println("today is weekend");
		break;
		default:
		System.out.println("invalid number");
		break;
		}
			
	}

}
