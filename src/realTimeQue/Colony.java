package realTimeQue;

interface Home {
	void maintainance();
}

class Owner implements Home {

	String address = "H/S no 1, latur";
	String owner = "Pravin";
	int bedRooms = 4;

	@Override
	public void maintainance() {
		System.out.println("Owner Name : "+owner + " is responsible for maintainance of house having " + bedRooms
				+ " bed rooms and address of home is : " + address);
	}

}

class Son extends Owner {
	String son;

	public Son(String son) {
		this.son = son;
	}

	public void maintainance() {
		System.out.println("Follower Name : "+son + " is responsible for maintainance of house having " + bedRooms
				+ " bed rooms and address of home is : " + address);
	}
}

public class Colony {

	public static void main(String[] args) {
		Son son = new Son("Mahesh");
		son.maintainance();

	}
}
