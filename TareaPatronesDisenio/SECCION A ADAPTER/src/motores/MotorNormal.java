package motores;

public class MotorNormal extends Motor{

	@Override
	public void encender() {
		System.out.println("Encendiendo motor normal");
	}
	
	@Override
	public void moverse () {
		System.out.println("Motor normal moviendose");
	}
	
	@Override
	public void apagar() {
		System.out.println("Motor normal apagandose");
	}
}
