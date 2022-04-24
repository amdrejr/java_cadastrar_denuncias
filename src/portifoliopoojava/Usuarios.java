/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portifoliopoojava;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andre Jr Mello
 */
public abstract class Usuarios {

    // acesso - senha
    static Map<String, String> cadastrados = new HashMap<String, String>()
        {
            {
                put("andre", "12345");
                put("julia", "12345");
                put("sandro", "12345");
                put("maria", "12345");
            }
        };
    

}
