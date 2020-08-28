package model.test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import model.Categoria;

/**
*
* @author Leonardo Cabreira
*/

@RunWith(JUnitPlatform.class)
public class CategoriaTest {
	
	      
	    
	    @Test
	    public void TestCategoria() {
	        Categoria categoria = new Categoria("Teste");
	    	assertEquals("Teste", categoria.getDescricao());
	    } 
	
}
