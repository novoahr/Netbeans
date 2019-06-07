/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import conection.conexion;
import interfaz.ICategoria;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transferObject.Categoria;

/**
 *
 *
 */
public class CategoriaDao implements ICategoria{

    @Override//sobre escrito 
    public ArrayList<Categoria> listarCategoria() {
        //para devolver el array al final
        ArrayList<Categoria> listaCate = new ArrayList<>(); //almacenar los valores de la bd
        conexion db=new conexion();
        Connection cn=db.getConnection(); 
        String procedimientoalmacenado ="{CALL sp_listarcategoria ()}";
        //proceso
        
        if (cn != null){
        try{
            CallableStatement cs = cn.prepareCall(procedimientoalmacenado);
            ResultSet rs = cs.executeQuery();
            
            while(rs.next()){
                Categoria cate  = new Categoria();
                cate.setIdcategoria(rs.getInt("id"));
                cate.setDescripcion(rs.getString("descripcion"));
                cate.setEstado(rs.getString("estado").charAt(0));
                listaCate.add(cate);
            }
             
        }   catch (SQLException e) {
               System.out.println("error"+e);
            }finally{
            try{
                cn.close();
            }catch(SQLException e){
                System.out.println("error"+e);
        }
    }
         
        
    }
    
        return listaCate;
    }
    @Override
    public boolean insertCategoria(Categoria cate) {
        boolean insert = false;
        int resp;
        conexion conn = new conexion(); // Conectandose..
        Connection cn= conn.getConnection();
        
        if(cn!=null) {
            try {
               CallableStatement cs = cn.prepareCall("CALL sp_insertarcategoria(?,?,?)");
               //setear los parametros del procedimiento
               cs.setInt(1, cate.getIdcategoria());
               cs.setString(2, cate.getDescripcion());
               cs.setString(3,String.valueOf(cate.getEstado()));
               resp = cs.executeUpdate();
                if (resp==1) {
                    insert = true;
                }
            } catch (SQLException ex) {
                System.out.println("error"+ex);// agregar codigo deseado
            }finally{
                try {
                    cn.close();
                } catch (SQLException ex) {
                    System.out.println("error"+ex);
                }
            }
            
        }
        //proceso
        return insert;
    }

    public boolean actualizarCategoria(Categoria cate) {
       boolean  update = false;
       int res;
       conexion conn = new conexion();
       Connection cn = conn.getConnection();
       //proceso
       //preguntar si ha llegado a conectar
       if(cn!=null){
           try {
               //Se ha conectado exitosamente
              CallableStatement cs = cn.prepareCall("CALL sp_actualizarcategoria(?,?)");
       
               cs.setString(1, cate.getDescripcion());
               cs.setString(2,String.valueOf(cate.getEstado()));
               cs.setInt(3, cate.getIdcategoria());
               res = cs.executeUpdate();
               //preguntamos si se actualizo correctamenete
               if (res==1) {
                 update = true;  
               }
           } catch (SQLException ex) {
               System.out.println("error"+ex);
           }
       }
       return update;
    }

    @Override
    public boolean eliminarCategoria(int idCategoria) {
       boolean delete = false;
       int res;
       conexion conn = new conexion();
       Connection cn = conn.getConnection();
       
        if (cn!=null) {
           try {
              CallableStatement cs = cn.prepareCall("CALL sp_eliminarcategoria(?,?,?)");
              //setear los parametros del procedimiento
               cs.setInt(1, idCategoria);
               res = cs.executeUpdate();
               
               if (res==1) {
                  delete = true;
                   
               }
               
           } catch (SQLException ex) {
               System.out.println("error"+ex);
           }finally {
               try {
                   cn.close();
               } catch (SQLException ex) {
                   
               }
                }
            
        }
       return delete;
    }
}
