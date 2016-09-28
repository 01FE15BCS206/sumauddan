package in.ac.kletech;

public class Rectangle {
	private int ilength;
	private int iwidth;
	
	Rectangle(int ilength,int iwidth)
	{
		this.ilength=ilength;
		this.iwidth=iwidth;
	}
	


	public int getIlength() {
		return ilength;
	}


	public int getIwidth() {
		return iwidth;
	}
	
	public int area(){
		int area1=ilength*iwidth;
		return(area1);
				
	}
}
public class Rectangle1 extends Rectangle{
	private int iheigth;
	Rectangle1(int ilength,int iwidth,int iheigth)
	{
		super(ilength,iwidth);
		this.iheigth=iheigth;
		
	}
	
	public int getiheigth(){
		return iheigth;
	}
	
	public int volume(){
		int volume1=ilength*iwidth*iheigth;
		return(volume1);
	}
		

}










