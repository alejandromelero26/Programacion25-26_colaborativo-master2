package simulacro_Biblioteca.model;

public abstract class Recurso {
    private final int id;
    private String titulo;
    private String autor;
    private TipoPrestamo tipoPrestamo;


    public Recurso(int id, String titulo, String autor, TipoPrestamo tipoPrestamo) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tipoPrestamo = tipoPrestamo;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public TipoPrestamo getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTipoPrestamo(TipoPrestamo tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public abstract int calcularDiasPrestamo();


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("id='%d'", id));
        sb.append(String.format(", titulo='%s'", titulo));
        sb.append(String.format(", autor='%s'", autor));
        sb.append(String.format(", tipoPrestamo='%s'", tipoPrestamo));

        return sb.toString();
    }
}
