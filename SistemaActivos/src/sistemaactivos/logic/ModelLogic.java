/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.logic;

import sistemaactivos.data.Dao;

/**
 *
 * @author ExtremeTech
 */
public class ModelLogic {
    private Dao dao;
    private static ModelLogic uniqueInstance;
    
    public static ModelLogic instance(){
        if (uniqueInstance == null){
            uniqueInstance = new ModelLogic();
        }
        return uniqueInstance; 
    }
    
    private ModelLogic(){
        dao = new Dao();
    }
    
    public  Usuario getUsuario(String id, String clave) throws Exception{
        Usuario u= dao.usuarioGet(id);
        if (u.getPass().equals(clave)){
            return u;
        }
        else{
            throw new Exception ("Clave incorrecta");
        }
    }
    
    public void close(){
        dao.close();
    }
}
