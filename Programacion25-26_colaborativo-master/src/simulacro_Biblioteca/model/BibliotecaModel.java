package simulacro_Biblioteca.model;


/**
 * BibliotecaModel es una interfaz
 * Una interfaz es una especie clase abstracta que no tiene atributos y todos sus
 * métodos son abstractos.
 *
 * Las interfaces establecen un contrato entre dos partes
 *
 * En cuanto a las clases que la implementan ("hijas adoptivas"), se ven obligadas a implementar los métodos (darle cuerpo/lógica a los métodos) indicados en la propia interfaz.
 *
 * En cuanto a las clases consumidoras (las que usan la interfaz) se les indica cómo
 * tienen que llamar a las funcionalidades de las clases que implementan la interfaz
 */
public interface BibliotecaModel {

    public void addLibro(int id, String titulo, String autor, TipoPrestamo tipoPrestamo, int numeroPaginas); // Libro

    public void addRevista(int id, String titulo, String autor, TipoPrestamo tipoPrestamo, int numeroEdicion); // Revista
    
}
