
public class Squares extends AbsShape {
	int length;
	int width;
	
	
	Squares(int length, int width, int color){
		super(color);
		this.length = length;
		this.width = width;
		
	}
	
	public boolean fitsText(String text){
		return text.length() < this.length;
		
	}

	
	
	

}
