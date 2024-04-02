package camiseta;
import ropa.Ropa;/*Esta línea con el "extends Ropa", se conecta con el padre que es Ropa*/
public class Camiseta extends Ropa{
	//Propiedades de camiseta y propiedad instancia.
		private String ropaDefinirC;//Definir que tipo de ropa es.
		private boolean extraTalla; //Talla extra.
		private char tallaCamiseta; //Talla que van de la S,M,L.
		private int edad;
		
	//CONSTRUCTORES HIJO.
		//TODOS LOS PARAMETROS menos edad.
		public Camiseta(short porcentajeDescuento, int stock, long id, double precioCompra, float precioVenta,
				boolean disponibilidad, String ropaDefinirC, boolean extraTalla, char tallaCamiseta) {
			super(porcentajeDescuento, stock, id, precioCompra, precioVenta, disponibilidad);//Llama al constructor padre que es Ropa
			this.ropaDefinirC = ropaDefinirC;
			this.extraTalla = extraTalla;
			this.tallaCamiseta = tallaCamiseta;
		}
		
		//Sólo String.
		public Camiseta(short porcentajeDescuento, int stock, long id, double precioCompra, float precioVenta,
				boolean disponibilidad, String ropaDefinirC) {
			super(porcentajeDescuento, stock, id, precioCompra, precioVenta, disponibilidad);//Llama al constructor padre que es Ropa
			this.ropaDefinirC = ropaDefinirC;
		}
		
		//Sólo edad.
		public Camiseta(short porcentajeDescuento, int stock, long id, double precioCompra, float precioVenta,
				boolean disponibilidad, int edad) {
			super(porcentajeDescuento, stock, id, precioCompra, precioVenta, disponibilidad);
			this.edad = edad;
		}
		
	//MÉTODO.
		/*Para el switch-case:
			 * 1 a 3 años departamento bebe
			 * 4 a 12 años departamento infantil
			 * 13 a 17 años departamento adolescente
			 * Más de 18 departamento adulto*/
		public void seccionEdad() {
			switch (edad) {
				case 1:
				case 2:
				case 3:
					System.out.print("Pertenece al departamento: Bebe");
	                break;
	            case 4:
	            case 5:
	            case 6:
	            case 7:
	            case 8:
	            case 9:
	            case 10:
	            case 11:
	            case 12:
	            	System.out.print("Pertenece al departamento: Infantil");
	                break;
	            case 13:
	            case 14:
	            case 15:
	            case 16:
	            case 17:
	            	System.out.print("Pertenece al departamento: Adolescente");
	                break;
	            default:
	            	System.out.print("Pertenece al departamento: Adulto");
	                break;
			}
		}

		//Mostrar camiseta con talla.
		public void mostarCamisetaTalla() {
			System.out.printf("        CARACTERÍSTICAS CAMISETA CON TALLA:      %n"
					+ "        ----------------------------------   %n"
					+ "- Tipo: %s%n"
					+ "- Talla:%s%C%n" 
					+ "- ID:%d%n"
					+ "- Precio Compra: %.2f%n"
					+ "- Precio Venta:%.1f%n"
					+ "- Stock:%d%n"
					+ "- Descuento:%d%%%n"
					+ "- Disponible:%s%n", ropaDefinirC, extraTalla==true? "X":"",tallaCamiseta,super.getId(),super.getPrecioCompra(),
					super.getPrecioVenta(), super.getStock(), super.getPorcentajeDescuento(), 
					super.isDisponibilidad()==true? "si":"no");
		}
		
		//Mostrar camiseta.
		public void mostarCamiseta() {
			System.out.printf("        CARACTERÍSTICAS CAMISETA:      %n"
					+ "        ------------------------   %n"
					+ "- Tipo: %s%n"
					+ "- ID:%d%n"
					+ "- Precio Compra: %.2f%n"
					+ "- Precio Venta:%.1f%n"
					+ "- Stock:%d%n"
					+ "- Descuento:%d%%%n"
					+ "- Disponible:%s%n", ropaDefinirC,super.getId(),super.getPrecioCompra(),
					super.getPrecioVenta(), super.getStock(), super.getPorcentajeDescuento(), 
					super.isDisponibilidad()==true? "si":"no");
		}
		
		/*Método para usar el FOR ---> Comparar los precios compra y venta de las camisetas, 
		 * según lo que ponga un mensaje u otro. */
		public void camisetaCompararPrecio() {
			for (int i= 0; i<1; i++) {//pongo 1, para que se ejecute 1 veces
				if((float)super.getPrecioCompra() == super.getPrecioVenta()) {//tengo que poner un dato primitivo en común, porque sino da fallo
					System.out.print("NO hay nada de margen de ganancia.");
				}else {
					System.out.printf("La diferencia entre Precio de Compra %.2f€ "
							+ "y Precio Venta %.2f€ es: %.2f€.%n", super.getPrecioCompra(), super.getPrecioVenta(), 
							/*Hago la ternaria para que de igual cual de los dos sea mayor que el otro, la resta se haga correctamente*/
							(float)super.getPrecioCompra() > super.getPrecioVenta()? (super.getPrecioCompra() - super.getPrecioVenta()):
								(super.getPrecioVenta() - super.getPrecioCompra()));
				}
			}
		}	
		
}
