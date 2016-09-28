package in.ac.kletech;

public class Car {
	String scolor;
	String sname;
	int inoofsheets;
	int imaxspeed;
	double dspeed=0;
	
	Car(String scolr,String sname,int inoofsheets,int imaxspeed){
		this.scolor=scolor;
		this.sname=sname;
		this.inoofsheets=inoofsheets;
		this.imaxspeed=imaxspeed;
	}

	public String getScolor() {
		return scolor;
	}

	public String getSname() {
		return sname;
	}

	public int getInoofsheets() {
		return inoofsheets;
	}

	public int getImaxspeed() {
		return imaxspeed;
	}
	void accelerate(){
		
	}
	void powerbreak(){
	
	}
}

class BMW extends Car{
	BMW(String scolor,String sname,int inoofsheets,int imaxspeed){
		super(scolor, sname, inoofsheets, imaxspeed);
	}
	void accelerate ()
	{
		dspeed=dspeed+2;
		if(dspeed>=imaxspeed)
			dspeed=imaxspeed;
	}
	void powerbreak(){
		dspeed=dspeed-45;
		if(dspeed<0)
			dspeed=0;
	}
}
class Ferrai extends Car{
	Ferrai(String scolor,String sname,int inoofsheets,int imaxspeed){
		super(scolor,sname,inoofsheets,imaxspeed);
}
	void accelerate ()
	{
		dspeed=dspeed+3;
		if(dspeed>=imaxspeed)
			dspeed=imaxspeed;
	}
	void powerbreak(){
		dspeed=dspeed-50;
		if(dspeed<0)
			dspeed=0;
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
