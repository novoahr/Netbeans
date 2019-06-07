/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import java.util.ArrayList;
import transferObject.DetalleVenta;

/**
 *
 * @author USUARIO
 */
public interface IDetalleVenta {
    public abstract ArrayList<DetalleVenta> listarDetalle();
    public abstract boolean insertDetalle(DetalleVenta cate);//guarda a todos los campos que quiero actualizar
    public abstract boolean actualizarDetalle(DetalleVenta Deta);
    public abstract boolean eliminarDetalle( int idDetalle);
    
}
