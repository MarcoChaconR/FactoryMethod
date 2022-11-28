package factory;

import entidades.Fabrica;
import entidades.Producto;

public class Main {

	public static void main(String[] args) {
		Producto producto = Fabrica.crearProducto(0);
		producto.imprimirProducto();

		System.out.println();

		producto = Fabrica.crearProducto(1);
		producto.imprimirProducto();

		System.out.println();

		producto = Fabrica.crearProducto(2);
		producto.imprimirProducto();
	}

}
