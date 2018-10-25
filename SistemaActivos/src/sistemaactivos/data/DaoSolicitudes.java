/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaactivos.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sistemaactivos.logic.Activo;
import sistemaactivos.logic.Funcionario;
import sistemaactivos.logic.Usuario;

/**
 *
 * @author ExtremeTech
 */
public class DaoSolicitudes {

    RelDatabase db;

    public DaoSolicitudes() {
        db = new RelDatabase();
    }

    
    public  void close(){
    }
}
