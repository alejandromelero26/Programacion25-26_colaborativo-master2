package simulacro_Comercios1;


import java.util.ArrayList;
import java.util.List;

public class GestorComercios {

    private final List<Comercio> comercios;

    public GestorComercios() {
        this.comercios = new ArrayList<>();
    }

    public Comercio buscarPorID(String id){
        Comercio resultado = null;
        Comercio temporal = null;
        int posicion = 0;
        //boolean seguirBuscando = true ;
        int cantidadComercios = comercios.size();

        // c. entrada && c. continuidad && c. salida
        while( cantidadComercios > 0 && resultado == null && posicion < cantidadComercios ){
            temporal = comercios.get(posicion);

            if( temporal.getID().equalsIgnoreCase( id ) ){
                resultado = temporal;
            }
            posicion ++;
        }

        return resultado;
    }

    public Comercio buscarPorNombre(String nombre){
        Comercio resultado = null;
        Comercio temporal = null;
        int cantidadComercios = comercios.size();
        int posicion = 0;

        while( cantidadComercios > 0 && resultado == null && posicion < cantidadComercios ){
            temporal = comercios.get(posicion);

            if( temporal.getNombre().equalsIgnoreCase( nombre )) {
                resultado = temporal;
            }
            posicion++;
        }

        return resultado;
    }

    public boolean addComercio(Comercio c){
        boolean resultado = false;
        if( buscarPorID( c.getID() ) == null ){
            comercios.add( c );
            resultado = true;
        }

        return resultado;
    }

    public Comercio eliminarPorID(String id){
        Comercio resultado = null;

        resultado = buscarPorID( id );
        comercios.remove(resultado);

        return resultado;
    }

    public Comercio modificarCiudad(String id, String nuevaCiudad){
        Comercio resultado = null;

        resultado = buscarPorID( id );

        if( resultado != null ){
            resultado.setCiudad( nuevaCiudad );
        }

        return resultado;
    }

    public String imprimirTodos(){
        StringBuilder sb = new StringBuilder();

        for (Comercio comercio : comercios ){
            sb.append( comercio.toString() );
        }

        return sb.toString();
    }

    public String imprimirPorTipoComercio(TipoComercio tipo){
        StringBuilder sb = new StringBuilder(String.format("Comercios del tipo '%s'", tipo));

        for (Comercio comercio : comercios ){
            if( comercio.getTipoComercio() == tipo ){
                sb.append( comercio.toString() );
            }
        }

        return sb.toString();
    }

    public String listarTiendasFisicas(){
        // instanceof  --> comprueba si un objeto es una instancia de una clase determinada
        StringBuilder sb = new StringBuilder();

        for (Comercio c : comercios ){
                // objeto es instancia de Clase
            if( c instanceof TiendaFisica ){
                sb.append(c.toString());
            }
        }

        return sb.toString();
    }

    public String listarTiendasOnline(){
        StringBuilder sb = new StringBuilder();

        for (Comercio c : comercios ){
            // objeto es instancia de Clase
            if( c instanceof TiendaOnline ){
                sb.append(c.toString());
            }
        }

        return sb.toString();
    }

    public String[] listarTiendasPorTipo(){
        String[] resultado = new String[2];
        // poscion 0: TiendaFisica; posicion 1: TiendaOnline
        int pFisica = 0;
        int pOnline = 1;
        StringBuilder sbFi = new StringBuilder();
        StringBuilder sbOn = new StringBuilder();

        for (Comercio c : comercios){
            if( c instanceof TiendaFisica ){
                sbFi.append(c.toString());
            } else {
                sbOn.append(c.toString());
            }
        }

        resultado[pFisica] = sbFi.toString();
        resultado[pOnline] = sbOn.toString();

        return resultado;
    }


}
