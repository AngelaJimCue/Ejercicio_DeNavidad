package ropa;
public abstract class Ropa {//Clase padre y las clases hijos son Camiseta y Pantalon.
	//PROPIEDADES general para toda la ropa y propiedad instancia.
		private short porcentajeDescuento; //%2, %40, por ejemplo.
		private int stock;//Cantidad de ropa.
		private long id;//Identificador de cada ropa.
			//Propiedad estática.
			private static long idRopa = 1; //Irá aumentando/incrementando cada ves que haya una nueva ropa. 
		private double precioCompra;//Precio a la que compra la ropa el dueño de la tienda.
		private float precioVenta;//Precio a la que vende la ropa el dueño de la tienda.
		private boolean disponibilidad;//Si esa ropa esta disponible o no con true o false.
	
	//CONTRUCTORES PADRE.
		//Todos los parámetros.
		public Ropa(short porcentajeDescuento, int stock, long id, double precioCompra, float precioVenta,
			boolean disponibilidad) {
			this.porcentajeDescuento = porcentajeDescuento;
			this.stock = stock;
			this.id = id;
			//Autodecremento
			Ropa.idRopa++;
			this.precioCompra = precioCompra;
			this.precioVenta = precioVenta;
			this.disponibilidad = disponibilidad;
		}
		
		//Sólo los parámetros de Porcentaje Descuento y Disponibilidad
		public Ropa(short porcentajeDescuento, boolean disponibilidad) {
			this(porcentajeDescuento,1,1,1.0,(float)1.0,disponibilidad);
		}
		
		//Sólo parámetro a stock, ID, disponiblidida, los demás parámetros darle cualquier valor.
		public Ropa(int stock, long id, boolean disponibilidad) {
			this((short)5,stock, id,2.8,(float)6.0,disponibilidad);
		}
		
		
	//GETTER Y SETTER.
		public short getPorcentajeDescuento() {
			return porcentajeDescuento;
		}

		public int getStock() {
			return stock;
		}

		public long getId() {
			return id;
		}

		public static long getIdRopa() {
			return idRopa;
		}

		public double getPrecioCompra() {
			return precioCompra;
		}

		public float getPrecioVenta() {
			return precioVenta;
		}

		public boolean isDisponibilidad() {
			return disponibilidad;
		}
		
		
	//MÉTODO.
		//MÉTODO ESTÁTICO.
		public static void comprobarDescuento(short porcentajeDescuento) {
			if (porcentajeDescuento <= 22) {
	            System.out.printf("%nHay mejores ofertas!!%n");
	        } else {
	            System.out.printf("%nEs tu mejor opción.%n");
	        }
		}		
		
		//Para el polimorfismo de camiseta y pantalón en este formato.
		public void mostrarPoli() {
			System.out.printf(" CARACTERÍSTICAS DEL POLIMOR: "
					+ " ID:%d, "
					+ " Precio Compra: %.2f, "
					+ " Precio Venta:%.1f, "
					+ " Stock:%d, "
					+ " Descuento:%d%% y "
					+ " Disponible:%s%n"
					+ " --------------------------- %n",id, precioCompra,precioVenta,stock, porcentajeDescuento, 
					disponibilidad==true? "si":"no");//Ternaria para que NO aparezca true y false, sino si o no.
		}
	
	//toString ---> Mostrar las características generales de ropa en este formato.
		 @Override
		    public String toString() {
			 return String.format("CARACTERÍSTICAS GENERAL ROPA:%n"
						+ "-----------------------------%n"
						+ " *ID:%d%n"
						+ " *Precio Compra: %.2f%n"
						+ " *Precio Venta:%.1f%n"
						+ " *Stock:%d%n"
						+ " *Descuento:%d%%%n"
						+ " *Disponible:%s%n", idRopa
						, precioCompra,precioVenta,stock, porcentajeDescuento, 
						disponibilidad==true? "si":"no" );//Ternaria para que NO aparezca true y false, sino si o no.
		    }
	//MÉTODO ESTÁTICO ---> Calcular el largo de la ropa según la altura del cliente.
		 /*Lo que hace es que le ponemos la altura de la persona, eso se multiplica por 0.5(la mitad de la altura) 
		 y se suma 10 (para añadir más valor obtenido)*/
		public static String calcularLargoRopa(double alturaDelCliente) {
			return String.format("El largo de la ropa es: %.1f cm.", alturaDelCliente * 0.5 + 10);
		}
}
