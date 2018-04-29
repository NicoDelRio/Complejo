package tda;

public class Test {

	public static void main(String[] args) {
		Complejo c1 = new Complejo(3,2);
		Complejo c2 = new Complejo(1,4);
		Complejo c3 = new Complejo(c2);
		
		Complejo s = c1.sumar(c2);
		System.out.println(s.toString());

		Complejo r = c1.restar(c2);
		System.out.println(r.toString());
		
		Complejo m = c1.multiplicar(c2);
		System.out.println(m.toString());
		
		System.out.println(c3.equals(c2));
				
	}

}
