package parcial1.clases.nuevasClases;

import parcial1.clases.OpcionDeMenu;

public class OpcionTareasCumplidas extends OpcionDeMenu {
	private MenuDeTareas menuTareas;
	
	public OpcionTareasCumplidas(String descripcion, char charSelector, MenuDeTareas menuTareas) {
	super(descripcion, charSelector);
	this.menuTareas = menuTareas;
	}



	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		System.out.printf("Cantidad de tareas cumplidas: %d\n", menuTareas.getTotalTareasCumplidas());
	}

}
