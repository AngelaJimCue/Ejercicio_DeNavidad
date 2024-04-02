package run;
//Hay que ser específico importando clase, paquete.
import ropa.Ropa;
import camiseta.Camiseta;
import pantalon.Pantalon;
public class Run {
	public static void main(String[] args) {
		//PROBAMOS LOS CONTRUCTORES PADRE.
			//1º CONSTRUCTOR (TODOS LOS PARAMETROS).
			Ropa r1 = new Ropa((short)2, 23,(long)2, 2.50, (float)6.0, true) {};
			System.out.println(r1);//Este método esta en la clase ROPA y así muestra el "toString".
			
			//2º CONSTRUCTOR (Porcentaje Descuento y Disponibilidad).
			Ropa r2 = new Ropa((short)4, false) {};
			System.out.println();
			System.out.println(r2);//Este método esta en la clase ROPA y así muestra el "toString".
			
			//3º CONSTRUCTOR (stock,ID, disponiblidida, mas lo demas por defecto).
			Ropa r3 = new Ropa(40,6, false) {};
			System.out.println()
			System.out.println(r3);//Este método esta en la clase ROPA y así muestra el "toString".
					
			
			
		//PROBAMOS LOS CONSTRUCTORES HIJO(CAMISETA).
			//1º CONSTRUCTOR (TODOS LOS PARAMETROS).
				//POLIMORFISMO.
			Ropa c1= new Camiseta((short)22,(int)120,(long)232323,(double)45.89,(float)102.23,false,"Pantalón", 
					false, 'm') {};
			System.out.println();
			c1.mostrarPoli();//Este método esta en la clase ROPA.
				
				
				//HERENCIA --> Probar el "extra de talla".
				Camiseta c2 = new Camiseta((short)36, 4, (long)2236, 24.50, (float)30.50, true, "Camiseta corta", 
						true, 's') {};
				System.out.println();
				c2.mostarCamisetaTalla();//Este método esta en la clase Camiseta.
			
			//2º CONSTRUCTOR (sólo String)---> HERENCIA.
				Camiseta c3 = new Camiseta((short)52,(int)223,(long)2576,(double)12.50,(float)98.0,false,"Camiseta larga"){};
				System.out.println();
				c3.mostarCamiseta();//Este método esta en la clase Camiseta.
			
			//3º CONSTRUCTOR (EDAD) Y EL SWITCH.
				Camiseta c4= new Camiseta((short)2,(int)3,(long)8693,(double)5.0,(float)12.0, false, 30){};
				c4.seccionEdad();//Este método esta en la clase Camiseta.
				System.out.println();

			//PROBAR MÉTODO FOR ---> double (precioCompra) y float (precioVenta) de las camiseta.
				c4.camisetaCompararPrecio();
			
			//PROBAR MÉTEDO ESTÁTICO ----> longitud de la ropa según la altura del cliente
				System.out.println(Ropa.calcularLargoRopa(1.68));
				System.out.println(Camiseta.calcularLargoRopa(1.68));
				System.out.println(Pantalon.calcularLargoRopa(1.68));
				
				
		//PROBAMOS LOS CONSTRUCTORES HIJO(PANTALON).
			//1º CONSTRUCTOR (TODOS LOS PARAMETROS).
				//HERENCIA.
				Pantalon p1 = new Pantalon((short)44,(int)666,(long)156962,(double)29.99,(float)78.0,true,
						"Pantalon", (byte)38) {};
				System.out.println();
				p1.mostarPantalonTalla();//Este método esta en la clase Pantalon.
			
			
			//2º CONSTRUCTOR (sólo String).
				//POLIMORFISMO.
				Ropa p2= new Pantalon((short)22,(int)100,(long)232323,(double)45.89,(float)102.23,false,
						"Pantalón", (byte)32) {}; 
				System.out.println();
				p2.mostrarPoli();//Este método esta en la clase ROPA.
						
				
				//HERENCIA
				Pantalon p3 = new Pantalon((short)44,(int)120,(long)156962,(double)29.99,(float)31.0,true,
						"Pantalón corto"){};
				System.out.println();
				p3.mostarPantalon();//Este método esta en la clase Pantalon.
				//p3.comprobarDescuento(porcentajeDescuento()); //método estático
				
			//PROBAR MÉTODO WHILE ---> Int Stock pantalón.
				p3.stockActual();
				
			//PROBAR MÉTODO DO-WHILE ---> Byte talla de pantalón.
				Pantalon p4 = new Pantalon((short)44,(int)102,(long)156962,(double)29.99,(float)31.0,true,
						"Pantalón largo", (byte)33){};
				p4.laTalla(33);//método privado
				
	}
}