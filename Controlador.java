package holaMundoCapas;

public class Controlador{

	public void run(UIInterface ui, DAOInterface dao){
		ui.mostrarSaludo(dao.leerSaludo());
	}
}
