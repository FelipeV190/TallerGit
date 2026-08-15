import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
    public double calcularTotalConDescuento(double descuento) {
        if (descuento < 0 || descuento > 1) {
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 1");
        }
        return calcularTotal() * (1 - descuento);
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public double calcularTotalConImpuesto(double impuesto) {
        if (impuesto < 0) {
            throw new IllegalArgumentException("El impuesto no puede ser negativo");
        }
        return calcularTotal() * (1 + impuesto);
    }
    public double calcularTotalConDescuentoPorVolumen() {
    double total = calcularTotal();

    if (productos.size() > 5) {
        return total * 0.90;
    }

    return total;
}
}