public class Service1 implements Service {
	
	public void execute() {
		System.out.println("Executing service1");
	}

	@Override
	public String getName() {
		return "Service1";
	}
}
