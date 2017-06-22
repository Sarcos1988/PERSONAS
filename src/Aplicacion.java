import Controlador.Logica;
import Modelo.Persona;
import Util.Ayudante;
import Vista.Pantallas;

public class Aplicacion {

	public static void main(String[] args) {
		Pantallas vista = new Pantallas();

		Logica controlador = new Logica();
		
		int cantidadPersonas = Ayudante.conversor(vista.ingresarValor("ingrese cantidad de personas"));
		
		controlador.inicializarPersonas(cantidadPersonas);
		
		for (int i=0; i<cantidadPersonas; i++){
			controlador.ingresarPersona(i, vista.ingresarValor("coloque el nombre"));
	
		}
		for (int x=0; x<cantidadPersonas; x++){
			Persona ekis = controlador.traerPersona(x);
			vista.mostrarMensaje(ekis.getNombre());
		}
	}
}
