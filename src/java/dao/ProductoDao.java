/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import conection.conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transferObject.Producto;

public class ProductoDao {
     public ArrayList<Producto> listarProducto() {
        //para devolver el array al final
        ArrayList<Producto> listaProducto = new ArrayList<>();
        conexion db=new conexion();
        Connection cn=db.getConnection();
        String procedimientoalmacenado ="{CALL sp_listarProducto ()}";
        //proceso
        
        if (cn != null){
        try{
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                Producto Produc = new Producto();
                
               Produc. setPrecio(rs.getDouble("Precio"));
                listaProducto.add(Produc);
            }
             
        }   catch (SQLException e) {
               
            }finally{
            try{
                cn.close();
            }catch(SQLException e){
        }
    }
         
        
    }
    
        return listaProducto;
    }
    public boolean insertProducto(Producto Produc) {
        boolean insert = false;
        
        return insert;
    }

    public boolean actualizarProducto(Producto Produc) {
       boolean  update = false;
       
       return update;
    }

    public boolean eliminarProducto(int idProducto) {
       boolean delete = false;
       
       return delete;
    }
    
}
