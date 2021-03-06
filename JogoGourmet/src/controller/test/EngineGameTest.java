package controller.test;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import controller.EngineGame;
import model.Categoria;
import model.No;
import model.Prato;

/**
*
* @author Leonardo Cabreira
*/

@RunWith(JUnitPlatform.class)
public class EngineGameTest {
	
	      
	    
	    @Test
	    public void testCriarNovoRamo() {
	    	Prato     prato     = new Prato("Pudim");
	    	Categoria categoria = new Categoria("Sobremesa");
	        No noAtual          = new No(prato, new No(categoria,null,null),null);	        
	        
	        EngineGame Engine   = new EngineGame();
	        No         novoNo   = Engine.criarNovoRamo(noAtual);	       
	        
	    	assertTrue(!novoNo.getObjetoGenerico().getDescricao().equals(""));
	    
	    } 
	    
	    
	    @Test
	    public void testProximoNo() {
	    	
	    	Prato     prato     = new Prato("Pudim");
	    	Categoria categoria = new Categoria("Sobremesa");
	        No noAtual          = new No(prato, new No(categoria,null,null),null);	        
	        
	        EngineGame Engine   = new EngineGame();
	        No         novoNo   = Engine.proximoNo(noAtual);   
	        
	    	assertTrue(!novoNo.getObjetoGenerico().getDescricao().equals(""));
	    
	    } 
	    
	    
	    
	
}
