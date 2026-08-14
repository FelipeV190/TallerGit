public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestión e Inventario EcoCoffee ===");

        // Crear producto inicial de prueba
        Producto cafe = new Producto("Café Origen Huila 250g", 15000.0);

        // Crear pedido y agregar producto
        Pedido pedido = new Pedido();
        pedido.agregarProducto(cafe);

        // Mostrar resumen
        System.out.println("Producto agregado: " + cafe.getNombre());
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
    }
}
