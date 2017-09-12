package holaMundoCapas;

public class DAO implements DAOInterface {
	@Override
	public String leerSaludo(){
		return "Hola mundo!! Soy una aplicación por capas"; 
	}
}
