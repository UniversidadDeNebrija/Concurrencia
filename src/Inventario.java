public class Inventario {
    public synchronized void actualizarInventario(Pedido pedido) {
        // Lógica para actualizar el inventario basado en el pedido
        System.out.println("Inventario actualizado para " + pedido);
    }
}
