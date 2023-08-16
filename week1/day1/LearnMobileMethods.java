package week1.day1;

public class LearnMobileMethods {
 //instance/global variable/class variable
	String brandName="Samsung";
	int price=32000;
	long phNo=2634723919L;
	boolean buyMobile=false;
	
	//method dec as rt mn(){}
	//calls, message, picture, playing, transactions, browsing
	
	public long typeMessages() {
		long friendNo=8645443413l;
		System.out.println(phNo);
		return friendNo;
	}
	
    public void makeCalls() {
		System.out.println(price);
	}

	public static void main(String[] args) {
		
		LearnMobileMethods obj =new LearnMobileMethods();
		//ctrl 2 l		
		String name=obj.brandName;
		System.out.println(name);
		obj.typeMessages();

	}

}
