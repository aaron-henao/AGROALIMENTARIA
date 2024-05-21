public class ProductosCongelados extends Producto{

    private double temperatura;

    public ProductosCongelados(String caducidad, int lote, double temperatura) {
        super();
        this.setCaducidad(caducidad);
        this.setLote(lote);
        this.setTemperatura(temperatura);
    }

    //getters - setters
    public double getTemperatura() {return temperatura;}
    public void setTemperatura(double temperatura) {this.temperatura = temperatura;}

    public String informacionProductosCongelados() {
        return "Fecha de caducidad: " + getCaducidad() + " Número de lote: " + getLote() +
                " Temperatura de congelacion: " + getTemperatura();
    }
}
