/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conection.conexion;
import interfaz.IVenta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transferObject.Venta;


public class VentaDao {
    public ArrayList<Venta> listarVenta() {
        //para devolver el array al final
        ArrayList<Venta> listaVenta = new ArrayList<>();
        conexion db=new conexion();
        Connection cn=db.getConnection();
        String procedimientoalmacenado ="{CALL sp_listarVenta ()}";
        //proceso
        
        if (cn != null){
        try{
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
               Venta Vent = new Venta();
                
               Vent. setTotal(rs.getDouble("Total"));
                listaVenta.add(Vent);
            }
             
        }   catch (SQLException e) {
               
            }finally{
            try{
                cn.close();
            }catch(SQLException e){
        }
    }
         
        
    }
    
        return listaVenta;
    }
    public boolean insertVenta(Venta Vent) {
        boolean insert = false;
        
        return insert;
    }

    public boolean actualizarVenta(Venta Vent) {
       boolean  update = false;
       
       return update;
    }

    public boolean eliminarVenta(int idVenta) {
       boolean delete = false;
       
       return delete;
    }
    
    
}
