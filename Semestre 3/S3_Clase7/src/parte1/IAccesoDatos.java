/*
Laboratorio III
Abel Pierna
Clase 7
17/05/23
interfases
 */
package parte1;

public interface IAccesoDatos {
    int MAX_REGISTROS = 10; //hay que si o si definir una variable
    
    //todos los metodos son publicos
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
