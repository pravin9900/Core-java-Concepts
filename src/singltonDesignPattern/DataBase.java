package singltonDesignPattern;

public class DataBase {

	private static DataBase obj;

	private DataBase() {
		System.out.println("Database constructor..");
	}

	public static DataBase getInstance() {
		if (obj == null) {
			obj = new DataBase();
		}
		return obj;
	}

	public void databaseAction() {
		System.out.println("Database method...");
	}
}


