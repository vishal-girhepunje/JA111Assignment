package Problem3;

public class Qa {

	    void change(P temp){
	        temp.i = temp.i + 10;
	        temp.j = temp.j + 20;
	    }
	    public static void main(String args[]){
	        P p = new P();
	        p.i = 10;
	        p.j = 20;
	        p.display();

	        Qa q = new Qa();
	        q.change(p);
	        p.display();
	    }
	
}


/*Output
10 20
20 40*/