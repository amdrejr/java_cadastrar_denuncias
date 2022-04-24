package portifoliopoojava;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andre Jr Mello
 * 
 */
public abstract class Usuarios {

    
    static Map<String, String> cadastrados = new HashMap<String, String>()
        {
            {   // acesso - senha
                put("andre", "12345");
                put("julia", "12345");
                put("sandro", "12345");
                put("maria", "12345");
            }
        };
    

}
