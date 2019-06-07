/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Categoria {
    
     private int Idcategoria;
    private String descripcion;
    private char estado;
    private List<Producto>listaMateriales;
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    public int getIdcategoria() {
          return Idcategoria;
    }

    public void setIdcategoria(int categoria) {
        this.Idcategoria = categoria;
    }

    public List<Producto> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(List<Producto> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    
    
    
}
