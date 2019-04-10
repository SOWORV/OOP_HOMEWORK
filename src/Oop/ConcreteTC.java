package Oop;

public class ConcreteTC extends Abstract2 implements InterfaceTC, InterfaceTC_vol2{

	@Override
	public void outgoing() {
		System.out.println(" [outgoing] from InterfaceTC ");
		
		
	}

	@Override
	public void network() {
		System.out.println("[this is network] from InterfaceTC ");
		networkType();
		
	}

	@Override
	public void incoming() {
		System.out.println(" [incoming] from InterfaceTC ");
		
		
	}

	@Override
	public void keypad() {
		System.out.println("[keypad] from InterfaceTC_vol2 ");
		
		
	}

	@Override
	public void camera() {
		System.out.println("[camera] from InterfaceTC_vol2 ");
		CameraType();
		
		
	}

	@Override
	public void videoCall() {
		System.out.println("[videoCall] from InterfaceTC_vol2");
		videocallType();
		
		
	}

	@Override
	public void faceReader() {
		System.out.println("[faceReader] from InterfaceTC_vol2");
		
		
	}

}
