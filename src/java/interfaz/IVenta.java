/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;
import transferObject.Venta;

public interface IVenta {
    public abstract ArrayList<Venta> listarVenta();
    public abstract boolean insertProducto(Venta Vent);//guarda a todos los campos que quiero actualizar
    public abstract boolean actualizarProducto(Venta Vent);
    public abstract boolean eliminarProducto( int idVenta);
    
}
