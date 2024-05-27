package TP2_HERENCIA.EjercicioEntregable9;

public class Principal {
        public static void main(String[] args) {
            Cajero cajero1=new Cajero("Juan","Perez",1.75,12345678,"2018-01-01","Calle 123 # 123-123",650000);
            Vendedor vendedor1=new Vendedor("Juan","Perez",1.75,12345678,"2018-01-01","Calle 123 # 123-123",650000, 25000);
            Repartidor repartidor1=new Repartidor("Juan","Perez",1.75,12345678,"2018-01-01","Calle 123 # 123-123",650000, 10);
            Administrativo administrativo1=new Administrativo("Juan","Perez",1.75,12345678,"2018-01-01","Calle 123 # 123-123",650000, "media");
           System.out.println(cajero1.imprimirRecibo());

           System.out.println(vendedor1.imprimirRecibo());

            System.out.println(administrativo1.imprimirRecibo());

            System.out.println(repartidor1.imprimirRecibo());
        }
}
