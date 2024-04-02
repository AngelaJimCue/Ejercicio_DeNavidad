package pantalon;
import ropa.Ropa;/*Esta línea con el "extends Ropa", se conectará con el padre que es Ropa*/
public class Pantalon extends Ropa{
	//Propiedades de pantalon y propiedad instancia.
		private String ropaDefinirP;//Definir que tipo de ropa es.
		private byte tallaPantalon = 0; /*Talla que van de la 32, 34, 36, 38, 40, 42, 44, 48, 50 e
		 							inicializar para que funcione, aunque para el proyecto lo vamos a cambiar.*/
	
	//CONSTRUCTORES HIJO.
		//TODOS LOS PARAMETROS.
		public Pantalon(short porcentajeDescuento, int stock, long id, double precioCompra, float precioVenta,
				boolean disponibilidad, String ropaDefinirP, byte tallaPantalon) {
			super(porcentajeDescuento, stock, id, precioCompra, precioVenta, disponibilidad);//Llama al constructor padre que es Ropa
			this.ropaDefinirP = ropaDefinirP;
			this.tallaPantalon = tallaPantalon;
		}
			
		//Sólo String.
		public Pantalon(short porcentajeDescuento, int stock, long id, double precioCompra, float precioVenta,
				boolean disponibilidad, String ropaDefinirP) {
			super(porcentajeDescuento, stock, id, precioCompra, precioVenta, disponibilidad);//Llama al constructor padre que es Ropa
			this.ropaDefinirP = ropaDefinirP;
		}
			
			
	//MÉTODO.
		//Muestra pantalon con talla.
		public void mostarPantalonTalla() {
			System.out.printf("        CARACTERÍSTICAS PANTALON CON TALLA:      %n"
							+ "        ----------------------------------   %n"
							+ "- Tipo: %s%n"
							+ "- Talla:%d%n" 
							+ "- ID:%d%n"
							+ "- Precio Compra: %.2f%n"
							+ "- Precio Venta:%.1f%n"
							+ "- Stock:%d%n"
							+ "- Descuento:%d%%%n"
							+ "- Disponible:%s%n", 
							ropaDefinirP, tallaPantalon,getId(),getPrecioCompra(),
							getPrecioVenta(), getStock(), getPorcentajeDescuento(), 
							isDisponibilidad()==true? "si":"no");
		}
				
		//Muestra pantalon.
		public void mostarPantalon() {
			System.out.printf("        CARACTERÍSTICAS PANTALON:      %n"
							+ "        ------------------------   %n"
							+ "· Tipo: %s%n"
							+ "· ID:%d%n"
							+ "· Precio Compra: %.2f%n"
							+ "· Precio Venta:%.1f%n"
							+ "· Stock:%d%n"
							+ "· Descuento:%d%%%n"
							+ "· Disponible:%s%n", 
							ropaDefinirP,super.getId(),super.getPrecioCompra(),
							super.getPrecioVenta(), super.getStock(), super.getPorcentajeDescuento(), 
							super.isDisponibilidad()==true? "si":"no");
		}/*se puede reducir el codigo con las partes que son iguales, con super.mostrarPantalonTalla(), si fuese el
		otro método "mostrarPantalonTalla" pondremos super.mostrarPantalon()*/
				
		//Método para usar el While ---> Mostrar el stock actual de pantalones, si queda menos de 100 pondrá un aviso.
		public void stockActual() { 
			while (super.getStock() >= 0 && super.getStock() <= 100 || super.getStock()> 100) {
				if (super.getStock() == 0) {//si el stock es 0, imprime lo siguiente.
					System.out.printf("%nLlegaste tarde ya no quedan.%n");
				}else if(super.getStock()> 100) {
					System.out.printf("%nTranquilidad, queda todavía stock, actualmente %d.%n",super.getStock());
				}else {//excepto 0 y lo que este fuera del bucle , imprime lo siguiente.
					System.out.printf("%nAVISO!!! Quedan pocas unidades corre, quedan %d.%n", super.getStock());
					
				}
				break;//para parar el bucle.
			}
		}	
				
		//Método Do-While --> Comprueba si la talla es correcta o no.
		private void tallaCorrecta(int size) {
			 byte[] tallasDisponibles = {32, 34, 36, 38, 40, 42, 44, 48, 50};//Aquí ponemos las tallas correcta.
			 boolean tallaCorrecta = false;
			 
			 do{
		            //La talla la ponemos en el byte del la clase RUN.		            
		            //Uso este for, para que recorra "tallaDisponibles" y comprueba si "tallaPantalon" es correcta o no.
		            for(int talla : tallasDisponibles) {
		                if (talla == tallaPantalon) {//Compara talla y "tallaPantalon".
		                    tallaCorrecta = true;//Si la tallaCorrecta es true, que muestre lo siguiente.
		                    System.out.printf("La talla %d es correcta.%n",tallaPantalon);
		                }
		            }
		            
		            if (!tallaCorrecta) {//Si la talla no es correcta, es decir, no esta en el array, pondrá lo siguiente.
		                System.out.printf("La talla %d NO es correcta.%n",tallaPantalon);
		                break;//Para parar el bucle.
		            }

		        }while (!tallaCorrecta);
		}
		
		//Para llamar al metodo privado de arriba
		public void laTalla(int size) {
			tallaCorrecta(size);
		}	
}
