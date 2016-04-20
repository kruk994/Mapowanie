package fields;

public class EmptyF implements Field{
	boolean isEmpty;
	boolean isCol;
	char mark = ' ';
	
	public EmptyF(){
		isEmpty = true;
		isCol = false;
	}
	
	public void draw(){
			 System.out.print(mark);
		 }
}