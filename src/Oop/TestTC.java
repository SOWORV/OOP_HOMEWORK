package Oop;

public class TestTC extends ConcreteTC {
	public static void  main(String [] args) {
		System.out.println("{TELECOMMUNICATION}");
		ConcreteTC concrete = new ConcreteTC ();
		System.out.println("");
		concrete.incoming();
		System.out.println("");
		concrete.network();
		System.out.println("");
		concrete.outgoing();
		System.out.println("");
		concrete.keypad();
		System.out.println("");
		concrete.camera();
		System.out.println("");
		concrete.videoCall();
		System.out.println("");
		concrete.faceReader();
		System.out.println("");
		concrete.music();
		
	}

}
 