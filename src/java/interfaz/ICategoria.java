/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;
import transferObject.Categoria;

/**
 *
 * @author USUARIO
 */
public interface ICategoria {
    
    
    //metodos que no estan implementados
    //Void ..que te retorne vacio
    //ArrayList....retornar el metodo
    public abstract ArrayList<Categoria> listarCategoria();
    public abstract boolean insertCategoria(Categoria cate);//guarda a todos los campos que quiero actualizar
    public abstract boolean actualizarCategoria(Categoria cate);
    public abstract boolean eliminarCategoria( int idCategoria);
    
}
