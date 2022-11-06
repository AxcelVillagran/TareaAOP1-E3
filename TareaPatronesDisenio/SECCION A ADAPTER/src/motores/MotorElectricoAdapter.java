package motores;

public class MotorElectricoAdapter extends Motor {
	
	private MotorElectrico motorElectrico;
	
	@Override
	public void encender() {
		System.out.println("Encendiendo motor electrico adapter");
		this.motorElectrico.conectar();
		this.motorElectrico.encender();
	}
	
	@Override
	public void moverse() {
		System.out.println("Motor electrico adapter moviendose");
		this.motorElectrico.moverse();
	}
	
	@Override
	public void apagar() {
		System.out.println("Apagando motor electrico adapter");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
		
	}
}

