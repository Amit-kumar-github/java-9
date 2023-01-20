package tutorial;

import client.Welcome;

public class WelcomeImpl implements Welcome {

	@Override
	public void sayHi() {
     System.out.println("hii");
	}
	
	public static void main(String[] args) {
		Welcome welcome=new WelcomeImpl();
		welcome.sayHi();
		welcome.greet();
		Welcome.test();
	}

}
