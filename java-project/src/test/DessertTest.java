package test;

import org.junit.Assert;

import org.junit.Test;

import dessert.*;

public class DessertTest {
	@Test
	public void test_gaufre_chocolat(){
		Dessert d1 = new Gaufre();
	    	d1 = new Chocolat(d1);
	    
		Assert.assertEquals("Gaufre, chocolat : 2,00€", d1.toString());
	}
	
}
