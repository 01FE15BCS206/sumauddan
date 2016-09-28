package in.ac.kletech;

public class RectangleDemo {

	public static void main(String[] args) {
		Rectangle1 box=new Rectangle1(2,3,4);
		int area1=box.area();	//superclass method
		int volume1=box.volume();//subclass method
		System.out.println("area="+area1);
		System.out.println("volume="+volume1);

	}

}
