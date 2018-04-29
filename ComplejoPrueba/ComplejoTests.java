import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tda.Complejo;

public class ComplejoTests {

	Complejo uno, dos;
	
	@Before
	public void setUp() {
		uno = new Complejo(1, 2);
		dos = new Complejo(3, 4);		
	}
	
	@Test
	public void suma() {
		Complejo tres = new Complejo(4, 6);
		Assert.assertEquals(tres, uno.sumar(dos));
	}
	
	@Test
	public void resta() {
		Complejo tres = new Complejo(-2, -2);
		Assert.assertEquals(tres, uno.restar(dos));
	}
	
	@Test
	public void multiplica() {
		Complejo cuatro = new Complejo(3, 2);
		Complejo cinco = new Complejo(1, 4);
		Complejo sies = new Complejo(-5, 14);
		Assert.assertEquals(sies, cuatro.multiplicar(cinco));
	}
	
	@Test
	public void postIncremento() {
		Complejo tres = new Complejo(2, 3);
		uno.incrementarPost();
		Assert.assertEquals(tres, uno);
//		Assert.assertEquals(tres, uno.incrementarPost()); // Error (compara y despues incrementa)
	}
	
	@Test
	public void preIncremento() {
		Complejo tres = new Complejo(2, 3);
//		uno.incrementarPre();
//		Assert.assertEquals(tres, uno);
		Assert.assertEquals(tres, uno.incrementarPre()); // (incrementa y despues compara)
	}
	
	@Test
	public void clonacion() {
		Object tres = uno.clone();
		Assert.assertEquals(uno, tres);
	}
	
	@Test
	public void dividir() {
		Complejo tres = new Complejo (11.0 / 25, 2.0 / 25); // (1, 2) / (3, 4) = ( (a * c + b * d) / (c * c + d * d) , (b * c - a * d) / (c * c + d * d) )
		Assert.assertEquals(tres, uno.division(dos));
	}

	@Test
	public void valorModulo () {
		double modulo =  Math.sqrt(5.0);
		Assert.assertEquals(Double.doubleToLongBits(modulo), Double.doubleToLongBits(uno.modulo()));
	}
	
}
