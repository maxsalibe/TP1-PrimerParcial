package parcial1.clases.nuevasClases;

import parcial1.clases.OpcionDeMenu;

public class OpcionOnOff extends OpcionDeMenu implements Activable {
	private boolean activada;
	
	public OpcionOnOff(String descripcion, char charSelector) {
	super(descripcion, charSelector);
		// TODO Auto-generated constructor stub
	}
	
	public OpcionOnOff(String descripcion, char charSelector, boolean activada) {
	super(descripcion, charSelector);
	this.activada = activada;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		activada = !activada;
	}

	@Override
	public void activar() {
		// TODO Auto-generated method stub
		activada = true;
	}

	@Override
	public void desactivar() {
		// TODO Auto-generated method stub
		activada = false;
	}

	@Override
	public boolean estaActivada() {
		// TODO Auto-generated method stub
		return activada;
	}
	
	@Override
	public void mostrar() {
		System.out.printf(activada ? "[x]%s" : "[ ]%s", " ");
		super.mostrar();
	}

}
