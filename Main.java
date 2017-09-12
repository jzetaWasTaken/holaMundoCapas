package holaMundoCapas;

public class Main{
	public static void main(String args[]){
		new Controlador().run(UIFactory.obtainUI(), DAOFactory.obtainDAO());
	}
}
