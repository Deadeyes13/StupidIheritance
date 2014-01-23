package stupid;

/**
 * @author CJ Oman
 * @version 1.1
 * @date Dec 3, 2013 9:11:29 AM
 */
public class StupidRunner
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Dumb lloyd = new Dumb(0);
		Dumber harry = new Dumber();
		
		System.out.println("Lets test inheritance!");
		
		System.out.println("lloyd is dumb and his blerg is: " + lloyd.getBlerg());
		System.out.println("harry is dumber and his blerg is: " + harry.getBlerg());
		System.out.println("Lets test inheritance!");
		harry.setBlerg(45);
		System.out.println("harry is dumber and his blerg is: " + harry.getBlerg());
		System.out.println("lloyd is dumb and his blerg is: " + lloyd.getBlerg());
		System.out.println("harry's car: " + harry.getMyCar());
	}

}
