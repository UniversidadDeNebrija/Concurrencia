public class Pedido {
    private final int idPedido;
    private final String detalles;

    public Pedido(int idPedido, String detalles) {
        this.idPedido = idPedido;
        this.detalles = detalles;
    }

    // Métodos get
    public int getIdPedido() {
        return idPedido;
    }

    public String getDetalles() {
        return detalles;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pedido {" +
                "idPedido=" + idPedido +
                ", detalles='" + detalles + '\'' +
                '}';
    }
}
