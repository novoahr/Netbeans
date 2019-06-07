/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import conection.conexion;
import interfaz.IDetalleVenta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transferObject.DetalleVenta;

/**
 *
 * @author USUARIO
 */
public class DetalleVentaDao extends DetalleVenta{
          public ArrayList<DetalleVenta> listarDetalle() {
        //para devolver el array al final
        ArrayList<DetalleVenta> listaDetalle = new ArrayList<>();
        conexion db=new conexion();
        Connection cn=db.getConnection();
        String procedimientoalmacenado ="{CALL sp_listarDetalle ()}";
        //proceso
        
        if (cn != null){
        try{
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                DetalleVenta Deta = new DetalleVenta();
                
               Deta. setCantidad(rs.getInt("cantidad"));
                listaDetalle.add(Deta);
            }
             
        }   catch (SQLException e) {
               
            }finally{
            try{
                cn.close();
            }catch(SQLException e){
        }
    }
         
        
    }
    
        return listaDetalle;
    }
    public boolean insertDetalleVenta(DetalleVenta Date) {
        boolean insert = false;
        
        return insert;
    }

    public boolean actualizarDetalleVenta(DetalleVenta Date) {
       boolean  update = false;
       
       return update;
    }

    public boolean eliminarDetalleVenta(int idDetalle) {
       boolean delete = false;
       
       return delete;
    }
}

    

