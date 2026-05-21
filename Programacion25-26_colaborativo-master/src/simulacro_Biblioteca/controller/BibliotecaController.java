package simulacro_Biblioteca.controller;

import simulacro_Biblioteca.model.BibliotecaConPredicados;
import simulacro_Biblioteca.model.BibliotecaModel;
import simulacro_Biblioteca.model.Recurso;
import simulacro_Biblioteca.view.BibliotecaView;

/**
 * Tiene la responsabilidad de "repartir juego".
 * - Recoge las peticiones de la VISTA.
 * - Envía peticiones procesadas al MODELO.
 * - Recoge las respuestas del MODELO
 * - Devuelve las respuestas del MODELO procesadas a la VISTA. *
 */
public class BibliotecaController {
    private BibliotecaModel model;
    private BibliotecaView view;


    public BibliotecaController(BibliotecaModel model, BibliotecaView view) {
        this.model = model;
        this.view = view;
        view.setController(this);
    }


    /*
    Privacidad en diagramas de clases
        + público: accesible desde cualquier parte
        - privado: accesible sólo desde la misma clase
        # protegido: accesible desde el propipo paquete y/o los hijos de la clase
     */


    /* Funcionalidades de una biblioteca
        C - añadir recursos
            + addRecurso
                - addLibro
                - addRevista
        R - listar recursos
            + listRecursos
            + listLibros
            + listRevistas
            + listPorAutor
            + listPorTipoPrestamo
            + listPorTitulo
            + listPorNumPaginas(int min, int max);
            + listPorTipoRecursoAutor(String tipoRecurso, String Autor)
        U - modificar recursos
            + updateTitulo(int id, String titulo)
            + updateAutor(int id, String autor)
            + updateNumPags(int id, int numPags)
        D - eliminar recursos
            + deleteRecurso(int id)
            + deleteRecurso(String titulo)
            + deleteRecurso(String autor)
        - buscar recursos
            + findById()
            + findByAutor()
            + findByTitulo()
            + findByTipoRecurso()
            + findByNumPaginas(int min, int max)
            + findByNumEdicion(int edicion)
            + findByTipoPrestamo(TipoPrestamo tipoPrestamo)

     */

    public Recurso findById(int id){
        return model.findById(int id);
    }




}
