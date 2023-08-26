package WEActivity2;

public class P {
	int i; // instance variable
	static int j; // class variable

	P() {
		i = 10;
		j = 20;
	}

	void show() {
		System.out.println(i + " " + j);
	}

	public static void main(String args[]) {
		P p1 = new P();
		p1.show();
		j = 200;
		p1.show();
		P p2 = new P();
		p2.show();
		P.j = 200;
		p1.show();
	}
}
