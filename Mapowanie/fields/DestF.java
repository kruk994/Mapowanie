package fields;

public class DestF implements Field{
	boolean isEmpty;
	boolean isCol;
	char mark = 'O';
	
	public DestF(){
		isEmpty = false;
		isCol = false;
	}
	
	public void draw(){
		System.out.print(mark);
		
	}
}
