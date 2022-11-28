package entidades;

public class Fabrica {
	public static Producto crearProducto(int tipo) {
		Producto p = null;
		switch (tipo) {
		case 0:
			p = new Computadora();
			break;
		case 1:
			p = new Mouse();
			break;
		case 2:
			p = new Teclado();
			break;

		default:
			p = null;
		}
		return p;
	}
}
