package singltonDesignPattern;

class Singleton1 {

	// private and static object
	private static Singleton1 obj = null;

	// private constructor
	private Singleton1() {
	}

	// public method to get the instance of class
	public static Singleton1 getInstance() {
		if (obj == null) {
			obj = new Singleton1();
		}
		return obj;
	}

	public void doSomething() {
		System.out.println("Singleton class method");
	}
}





class LazySingletone {
	private static final LazySingletone obj = new LazySingletone();

	private LazySingletone() {
	};

	public static LazySingletone getInstance() {
		return obj;
	}

	public void doSomething() {
		System.out.println("Lazy Singleton class method");
	}

}

public class SingletonImplementation {
	public static void main(String[] args) {
		Singleton1 s = Singleton1.getInstance();
		s.doSomething();
		Singleton1 s1 = Singleton1.getInstance();
		s1.doSomething();
		if (s == s1) {
			System.out.println("Pointing towards same obj..");
		}
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

		LazySingletone l = LazySingletone.getInstance();
		l.doSomething();
	}
}







/*
 * public class SingletonExampleArchitecture { // private field that refers to
 * the object private static SingletonExampleArchitecture singleObject;
 * 
 * private SingletonExampleArchitecture() { // constructor of the
 * SingletonExample class }
 * 
 * public static SingletonExampleArchitecture getObject() { // if null - then
 * create an new object singleObject // if not null then return the existing
 * object of singleObject return singleObject; // write code that allows us to
 * create only one object // access the object as per our need }
 * 
 * }
 * 
 */