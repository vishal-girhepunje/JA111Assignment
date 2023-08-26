package Problem3;

public class A  {
	void show(int a){
        a = a + 10;
    }
    public static void main(String args[]){
        A a = new A();
        int i = 20;
        System.out.print(i + " ");
        a.show(i);
        System.out.print(i);
    }
}

/*Output: 20 20*/