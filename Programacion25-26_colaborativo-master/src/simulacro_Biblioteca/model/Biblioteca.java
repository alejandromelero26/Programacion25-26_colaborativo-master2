package simulacro_Biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements BibliotecaModel {

    private List<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }



    public Recurso buscarPorId(int id){
        Recurso resultado = null;
        Recurso temporal;
        //boolean seguirBuscando = true;
        int posicion = 0;
        int cantidad = this.recursos.size();

        while( cantidad > 0 && resultado == null && posicion < cantidad ){
            temporal = recursos.get(posicion);

            if( temporal.getId() == id ){
                resultado = temporal;
            }
            posicion++;
        }
        return resultado;
    }

    public Recurso buscarPorId2(int id){
        Recurso resultado = null;
        Recurso temporal;
        boolean seguirBuscando = true;  // flag de continuidad
        int posicion = 0;
        int cantidad = this.recursos.size();

        while( cantidad > 0 && seguirBuscando /* == true */ && posicion < cantidad ){
            temporal = recursos.get(posicion);

            if( temporal.getId() == id ){
                resultado = temporal;
                seguirBuscando = false;
            }
            posicion++;
        }
        return resultado;
    }

    /**
     * Busca por título con coincidencia exacta
     * @param titulo
     * @return
     */
    public Recurso buscarPorTitulo(String titulo) {
        Recurso resultado = null;
        Recurso temporal;
        //boolean seguirBuscando = true;
        int posicion = 0;
        int cantidad = this.recursos.size();

        while( cantidad > 0 && resultado == null && posicion < cantidad ){
            temporal = recursos.get(posicion);

            if( temporal.getTitulo().equalsIgnoreCase( titulo )){
                resultado = temporal;
            }
            posicion++;
        }
        return resultado;
    }


    /* **********************************************************************
        POLIMORFISMO
    ********************************************************************** */

    /**
     * Busca un recurso por su id y lo devuelve o null si no lo encuentra
     * @param id
     * @return Recurso o null
     */
    public Recurso buscar(int id){
        Recurso resultado = null;
        Recurso temporal;
        //boolean seguirBuscando = true;
        int posicion = 0;
        int cantidad = this.recursos.size();

        while( cantidad > 0 && resultado == null && posicion < cantidad ){
            temporal = recursos.get(posicion);

            if( temporal.getId() == id ){
                resultado = temporal;
            }
            posicion++;
        }
        return resultado;
    }

    /**
     * Busca por título con coincidencia exacta
     * @param titulo
     * @return
     */
    public Recurso buscar(String titulo) {
        Recurso resultado = null;
        Recurso temporal;
        //boolean seguirBuscando = true;
        int posicion = 0;
        int cantidad = this.recursos.size();

        while( cantidad > 0 && resultado == null && posicion < cantidad ){
            temporal = recursos.get(posicion);

            if( temporal.getTitulo().equalsIgnoreCase( titulo )){
                resultado = temporal;
            }
            posicion++;
        }
        return resultado;
    }

    /* Este es el equivalente polimórfico al metodo buscar por titulo
    */
    public List<Recurso> buscar(TipoPrestamo tipoPrestamo){
        List<Recurso> resultados = new ArrayList<>();

        for (Recurso r : this.recursos ){
            if( r.getTipoPrestamo() == tipoPrestamo ) {
                resultados.add(r);
            }
        }

        return resultados;
    }



    /* **********************************************************************
        FIN DE POLIMORFISMO
     ********************************************************************** */

    //buscarPorTipoPrestamo(TipoPrestamo tipo)


    /**
     * Añade un recurso
     * @param r
     */
    public void addRecurso(Recurso r){
        this.recursos.add(r);
    }

    /**
     * Elimina el recurso que tiene el id recibido.
     * @param id
     * @return Recurso o null
     */
    public Recurso deleteRecurso(int id){
        Recurso recurso = buscar(id);

        if( recurso != null ){
            recursos.remove(recurso);
        }

        return recurso;
    }

    public Recurso updateAutor(int id, String nuevoAutor){
        Recurso recurso = buscar(id);

        if( recurso != null){
            recurso.setAutor(nuevoAutor);
        }

        return recurso;
    }

    /**
     * Devuelve una cadena de texto (String) con la información de cada recurso. Un recurso por línea
     * @return Cadena de texto
     */
    public String listarTodos(){
        StringBuilder sb = new StringBuilder("Todos los recursos: \n");

        for( Recurso r : recursos ){
            sb.append(r.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    /**
     * Devuelve un texto con los recursos que tienen el tipo de préstamo recibido
     * @param tipo
     * @return Cadena de texto con un recurso por línea
     */
    public String listarPorTipoPrestamo(TipoPrestamo tipo){
        StringBuilder sb = new StringBuilder("Todos los recursos por tipo de préstamo: \n");

        for( Recurso r : recursos ){
            if( r.getTipoPrestamo() == tipo ){
                sb.append(r.toString());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    /**
     * Devuelve un texto con todos los libros del catálogo
     * @return Cadena de texto con un Libro por línea
     */
    public String listarLibros(){
        StringBuilder sb = new StringBuilder("Todos los Libros: \n");

        for( Recurso r : recursos ){
            if( r instanceof Libro){
                sb.append(r.toString());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    /**
     * Devuelve un texto con todas las revistas del catálogo
     * @return Cadena de texto con una Revista por línea
     */
    public String listarRevistas(){
        StringBuilder sb = new StringBuilder("Todas las Revistas: \n");

        for( Recurso r : recursos ){
            if( r instanceof Revista){
                sb.append(r.toString());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    /*
    //public static <T> T crearInstancia(Class<T> clase)
    public String listarTipoRecurso(Class<Libro> clase){
        //StringBuilder sb = new StringBuilder("Todos los recursos de tipo " + clase.getCanonicalName());

        StringBuilder sb = new StringBuilder("Todos los recursos de tipo " + clase.getSimpleName());

        return sb.toString();
    }
*/
    /**
     * Devuelve todos
     * @return
     */
    public String listar(){
        StringBuilder sb = new StringBuilder("Todos los recursos: \n");

        for( Recurso r : recursos ){
            sb.append(r.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    /**
     * Devuelve los de un tipo determinado
     */
    public String listar(TipoPrestamo tipoPrestamo){
        StringBuilder sb = new StringBuilder("Todos los recursos por tipo de préstamo: \n");

        for( Recurso r : recursos ){
            if( r.getTipoPrestamo() == tipoPrestamo ){
                sb.append(r.toString());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    @Override
    public void addLibro(int id, String titulo, String autor, TipoPrestamo tipoPrestamo, int numeroPaginas) {
        Libro libro = new Libro(id, titulo, autor, tipoPrestamo, numeroPaginas);

        addRecurso(libro);
    }

    @Override
    public void addRevista(int id, String titulo, String autor, TipoPrestamo tipoPrestamo, int numeroEdicion) {

    }

    /* FIXME

    public String listar(Class<Libro> clase){
        //StringBuilder sb = new StringBuilder("Todos los recursos de tipo " + clase.getCanonicalName());

        StringBuilder sb = new StringBuilder("Todos los recursos de tipo " + clase.getSimpleName());

        for (Recurso r : recursos ){
            if( clase.isInstance(r) ){
                sb.append(r.toString());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public String listar(Class<Revista> claseRevista){
        return null;
    }
     */

}
