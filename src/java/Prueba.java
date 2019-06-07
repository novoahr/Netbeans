
import dao.CategoriaDao;
import java.util.ArrayList;
import transferObject.Categoria;


public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CategoriaDao catedao = new CategoriaDao();
        ArrayList<Categoria> lista = new ArrayList<>();   
        
//        Categoria cate = new Categoria();
//        cate.setIdcategoria(2);
//        cate.setDescripcion("Metal");
//        cate.setEstado('B');
//        catedao.insertCategoria(cate);
        
        
//      lista =  catedao.listarCategoria();
//      //size para un arraylist size:tamaño
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println("dato: "+lista.get(i).getDescripcion());
//  
//        }
            catedao.eliminarCategoria(1);
        
    
    }
    
}
