package funciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
//	public static void main(String a[])
//	{ 
//	suma s=new suma(4,2);
//	s.sumar();
//
//	} 
	
	//Suma s = new Suma(4,2);
	@Test
	public void testSuma(){
//		int res= s.sumar(4,2);
		assertEquals(6,Suma.sumar(4, 2));
	}

}
