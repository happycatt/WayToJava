package foundation;
/*
 * 重载
 */
public class OverLoad{
	public static void main(String[] args){
		int area1 = getArea(2,3);
		int area2 = getArea(2,3,4);
		double area3 = getArea(2.10,3.10);
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
	}
	public static int getArea(int x,int y){
		return x*y;
	}
	public static int getArea(int x,int y,int z){
		return x*y*z;
	}
	public static double getArea(double x,double y){
		return x*y;
	}
}
