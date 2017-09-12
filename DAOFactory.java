package holaMundoCapas;

public class DAOFactory {
	public static DAOInterface obtainDAO() {
		return new DAO();
	}
}
