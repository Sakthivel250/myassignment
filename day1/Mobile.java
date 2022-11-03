package week1.day1;

public class Mobile {
 private void makecall() {
	String mobilemodel="Samsung A52";
 	float mobweight=180.0f;
 	System.out.println("Model Nmae="+mobilemodel);
 	System.out.println("MObweight is="+mobweight);
}
 private void sendmsg() {
	boolean isfullcharged=true;
	int mobcost=25000;
	System.out.println("phone is fully charged "+isfullcharged);
	System.out.println("cost="+mobcost);
}
public static void main(String[] args) {
	Mobile sakthi=new Mobile();
	sakthi.makecall();
	sakthi.sendmsg();
}
}
