
public class SportsCar extends Car{
	protected String lights;

	public SportsCar(String engine, String wheels, String lights) {
		super(engine, wheels);
		this.lights = lights;
	}
	
//	public String start() {
//		return lights + " are shining, " + engine + " is on and " + wheels+ " are running!";
//	}
	
	public String speedOn() {
		return engine + " is overload and " + wheels + " are super running!";
	}

	@Override
	public String start() {
		return lights + " are shining, " + engine + " is on and " + wheels+ " are running!";
	}

}
