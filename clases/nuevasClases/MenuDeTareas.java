package parcial1.clases.nuevasClases;

import java.util.Scanner;

import parcial1.clases.Menu;
import parcial1.clases.OpcionDeMenu;

public class MenuDeTareas extends Menu {
	
	public MenuDeTareas(String titulo, Scanner input) {
		super(titulo, input);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void registrar(OpcionDeMenu op) {
		if (op instanceof OpcionOnOff) {
			super.registrar(op);
		}
	}
	
	public int getTotalTareasCumplidas() {
		return informarCumplidas();
	}
	

}
