/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import java.util.ArrayList;
import transferObject.Producto;


public interface IProducto {
    public abstract ArrayList<Producto> listarProducto();
    public abstract boolean insertProducto(Producto Produc);//guarda a todos los campos que quiero actualizar
    public abstract boolean actualizarProducto(Producto Produc);
    public abstract boolean eliminarProducto( int idProducto);
    
}
