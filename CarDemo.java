package in.ac.kletech;

public class CarDemo {

	public static void main(String[] args) {
		BMW b=new BMW("yellow","rorar",2,300);
		Ferrai f=new Ferrai("gray","rocket",3,400);
		for(int i=0;i<=100;i++){
			f.accelerate();
			b.accelerate();
			System.out.println("Ferrai"+f.dspeed+"BMW"+b.dspeed);
			
		}
		System.out.println("applying break");
		for(int i=0;i<=9;i++){
			f.powerbreak();
			b.powerbreak();
			System.out.println("after applying the break");
			System.out.println("Ferrai"+f.dspeed+"BMW"+b.dspeed);
		}
	}

	

}
