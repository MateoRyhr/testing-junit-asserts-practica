package asserts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Asserts {
	
	/*
	 * Hacer un test por cada assert y luego crear una clase que resuelva los test.
	assertTrue/assertFalse (condición a testear): Comprueba que la condición es cierta o falsa.
	assertEquals/assertNotEquals (valor esperado, valor obtenido). Es importante el orden de los valores esperado y obtenido - tambien hay un assertEquals que recibe un string de argumento que se mostrara si falla el test
	assertArrayEquals(int[] expecteds, int[] actuals) compara dos arrays
	assertNull/assertNotNull (object): Comprueba que el objeto obtenido es nulo o no.
	assertSame/assertNotSame(object1, object2): Comprueba si dos objetos son iguales o no.
	*/
	
	private Asertos asertos;
	
	@BeforeEach
	void before() {
		asertos = new Asertos();
	}
	
	//tests booleanos
	
	@Test
	void booleanoFalso(){
		assertFalse(asertos.getBooleano()); //si es falso pasa el test
	}
	
	@Test
	void booleanoVerdadero(){
		asertos.setBooleano(true);
		assertTrue(asertos.getBooleano());  //si es verdadero pasa el test
	}
	
	//tests equals && notEquals
	
	@Test
	void valorEsperadoIgualValorObtenido() {
		int esperado=5;
		asertos.setObtenido(5);
		int obtenido=asertos.getObtenido();
		assertEquals(esperado,obtenido); //si los objetos/valores son iguales pasa el test
	}
	
	@Test
	void valorEsperadoEsDistintoDeObtenido() {
		int inesperado = 9;
		asertos.setObtenido(1);
		int obtenido=asertos.getObtenido();
		assertNotEquals(inesperado,obtenido); //si los objetos/valores no son iguales pasa el test
		
	}
	
	//tests de comparacion de vectores
	
	@Test
	void vectorEsperadoIgualVectorObtenido() {
		int[] vectorEsperado = {1,2,3};
		asertos.setVector(1,2,3);
		assertArrayEquals(vectorEsperado, asertos.getVector());  //si los arrays son iguales pasa el test
	}
	
	//tests de comprobacion de objeto nulo y no nulo
	
	@Test
	void objetoNulo() {
		assertNull(asertos.getObject()); //si el objeto es nulo pasa el test
	}
	
	@Test
	void objetoNoNulo() {
		asertos.setObjectNotNull();
		assertNotNull(asertos.getObject());  //si el objeto tiene algun valor pasa el test
	}
	
	//Tests que comprueban si los objetos son iguales o no
	
	@Test
	void objetosIguales() {
		Date objetoEsperado = new Date();
		//asertos.setDateActual(); //aunque tengan el mismo valor no son el mismo objeto
		assertSame(objetoEsperado, objetoEsperado);  //si los objetos son el mismo pasa el test
	}
	
	@Test
	void objetosDistintos() {
		Date objetoInesperado = new Date(2018,11,29); //contructor obsoleto - se usa la GregorianCalendar(year, month, date)
		asertos.setDateActual();
		assertNotSame(objetoInesperado, asertos.getDate());
	}
	
	
	

	
	 


}
