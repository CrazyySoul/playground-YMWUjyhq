package test;

import org.junit.Assert;

import org.junit.Test;

import dessert.*;

public class DessertTest {
	@Test
	public void test_gaufre_chocolat(){
		Dessert d1 = new Gaufre();
	    d1 = new Chocolat(d1);
	    
		assertEquals("Gaufre, chocolat : 2,00€", d1.toString());
	}
	
	@Test
	public void test_crepe_chocolat_chantilly(){
		Dessert d2 = new Crepe();
	    d2 = new Chocolat(d2);
	    d2 = new Chantilly(d2);
	    
	    assertEquals("Crêpe, chocolat, chantilly : 2,20€", d2.toString());
	}
	
	@Test
	public void test_crepe_chantilly(){
	    Dessert d3 = new Crepe();
	    d3 = new Chantilly(d3);
	    
	    assertEquals("Crêpe, chantilly : 2,00€", d3.toString());
	}
}
