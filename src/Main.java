// GestorPedidos: Cada instancia de esta clase representa un hilo separado que maneja un pedido.
// Inventario: Esta clase utiliza métodos sincronizados para evitar condiciones de carrera al actualizar el inventario.
// Simulación: Se crean múltiples instancias de GestorPedidos, cada una en su propio hilo, demostrando la concurrencia.

// Creación de Hilos: Utilizando la extensión de la clase Thread y la implementación de la interfaz Runnable.
// Sincronización y Evitación de Condiciones de Carrera: Utilizando el bloque synchronized.
// Manejo de Interrupciones y Estados de Hilos: Controlando el comportamiento del hilo en diferentes escenarios.


public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        for (int i = 0; i < 10; i++) {
            Pedido pedido = new Pedido(i, "detalles del pedido " + i);
            GestorPedidos gestor = new GestorPedidos(pedido){
                @Override
                public void run() {
                    super.run();
                    inventario.actualizarInventario(pedido);
                }
            };
            gestor.start();
        }
    }
}
