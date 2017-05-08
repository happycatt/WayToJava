package foundation;
/*
 * 打印出童谣：	99 bottles  of beer on the wall
          		99 bottles  of beer.
				Take one down.
				pass it around.
				98 bottles  of beer on the wall
				98 bottles  of beer.
						：
						：
						：
				1 bottle  of beer on the wall
				1 bottle  of beer.
				Take one down.
				pass it around.
				No more bottles of beer on the wall.
 */				
public class Game2 {
	public static void main(String[] args){
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum>0){
			if (beerNum==1){
				word = "bottle";
			}	
			System.out.println(beerNum+" "+word+"  of beer on the wall");
		    System.out.println(beerNum+" "+word+"  of beer.");
			System.out.println("Take one down.");
			System.out.println("pass it around.");
			beerNum = beerNum - 1;
			
				
			
		}
	 if(beerNum<1){
			System.out.println("No more bottles of beer on the wall.");
	 }
		
			
	}

}
