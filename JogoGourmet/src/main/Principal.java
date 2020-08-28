package main;
import controller.EngineGame;
import view.Mensageiro;

/**
*
* @author Leonardo Cabreira
*/
public class Principal {
    

    public static void main(String[] args) {
        EngineGame Engine = new EngineGame();        
        
        while(Principal.deveContinuar()) {        	
        	Engine.start();	
        }
        
    }
    
    public static boolean deveContinuar() {
    return	Mensageiro.mensagem("Pense em um prato que você gosta.", "JogoGourmet", "Iniciar", "Cancelar") ;
    	
    }
    
}
