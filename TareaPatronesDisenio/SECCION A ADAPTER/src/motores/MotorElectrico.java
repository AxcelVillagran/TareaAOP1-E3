package motores;

public class MotorElectrico {

private boolean conectado = false;
	
	public void conectar() {
		this.conectado=true;
		System.out.println("Conectando motor electrico");
	}
	
	
	public void encender() {
		if (!this.conectado) {
			System.out.println("No se puede activar, no esta conectado");
	} else {
			System.out.println("Conectado, activando motor electrico");
	}
		
		
	}
	public void moverse() {
		if (!this.conectado) {
			System.out.println("No esta conectado, no se puede mover");
		}else {
			System.out.println("Moviendose");
		}
	}
	
	
	public void detener() {
		if(this.conectado) {
			System.out.println("No se detiene, no esta conectado");
		}else {
			System.out.println("Deteniendose");
		}
	}
	
	
	public void desconectar() {
		this.conectado=false;
		System.out.println("Desconectando motor electrico");
	}

}
