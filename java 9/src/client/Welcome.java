package client;

public interface Welcome {

	public abstract void sayHi();
	public default void greet() {
		System.out.println("welcome to java 9");
		welcome1();
	}
	public static void test()
	{
		System.out.println("Test..");
		welcome2();
	}
	private void welcome1()
	{
		System.out.println("Welcome again to java 9");
	}
	
	private static void welcome2()
	{
		System.out.println("private static method");
	}
}
