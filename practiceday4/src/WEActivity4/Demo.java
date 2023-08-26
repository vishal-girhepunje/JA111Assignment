package WEActivity4;

public class Demo {
	public static void main(String args[]) {
        A aOne = new A();
        B bOne = new B(aOne, 30);
        System.out.println(bOne.a.i + " " + bOne.a.j + " " + bOne.k);
    }
}
