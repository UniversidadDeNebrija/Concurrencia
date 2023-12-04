public class GestorPedidos extends Thread {
    private Pedido pedido;

    public GestorPedidos(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        try {
            System.out.println("Procesando:                 " + pedido);
            Thread.sleep(1000); // Simula el tiempo de procesamiento
            System.out.println("Pedido completado:          " + pedido);
        } catch (InterruptedException e) {
            System.out.println("Gestor interrumpido durante el procesamiento del pedido.");
        }
    }
}
