package fields;

public class WallF implements Field{
	boolean isEmpty;
	boolean isCol;
	char mark = 'X';
	
	public WallF(){
		isEmpty = false;
		isCol = true;
	}
		
	public void draw(){
		System.out.print(mark);
	}
	
}
