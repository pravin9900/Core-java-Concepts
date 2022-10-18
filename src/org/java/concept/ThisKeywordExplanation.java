package org.java.concept;

public  class ThisKeywordExplanation {

	int var;

	public ThisKeywordExplanation() {
		System.out.println("Default Constructor");
	}

	public ThisKeywordExplanation(int var) {
		this();
		this.var = var;
		System.out.println(var);

		System.out.println(this.var);
		this.method3();
	}

	public ThisKeywordExplanation(ThisKeywordExplanation te) {
		te.method1();
	}

	public void method1() {
		System.out.println("Method1");
	}

	public void method2(ThisKeywordExplanation te) {
		te.method1();
		System.out.println("Method2");
	}

	public ThisKeywordExplanation method4() {
		System.out.println("This is used to return type");
		return this;
	}

	public void method3() {
		ThisKeywordExplanation tk = new ThisKeywordExplanation(this);
		tk.method4();
		// tk.method2(tk);
		this.method2(this);
	}

	public static void main(String[] args) {
		 
		ThisKeywordExplanation t = new ThisKeywordExplanation(10);
		t.method1();
	}
}
