public class ProductosRefrigerados extends Producto{

    private int codigo;

    public ProductosRefrigerados(String caducidad, int lote, int codigo) {
        super();
        this.setCaducidad(caducidad);
        this.setLote(lote);
        this.setCodigo(codigo);
    }

    //getters - setters
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}


    public String informacionProductosRefrigerados() {
        return "Fecha de caducidad: " + getCaducidad() + " Número de lote: " + getLote() +
                " Código del organismo de supervicion alimentaria: " + getCodigo();
    }
}
