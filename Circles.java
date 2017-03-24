
public class Circles extends AbsShape{
	int radius;
	
	
	Circles(int radius, int color){
		super(color);
		this.radius = radius;
		
	}
	
	public boolean fitsText(String text){
		return text.length() < this.radius;
	}

}
