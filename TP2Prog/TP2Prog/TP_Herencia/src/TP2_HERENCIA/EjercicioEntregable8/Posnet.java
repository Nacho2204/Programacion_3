package TP2_HERENCIA.EjercicioEntregable8;

public class Posnet extends Tarjeta{

        
        
        public Posnet(String entFinanciera, String entBancaria, String numeroTarjeta, double saldo, long DNI, String nombre,
                String apellido, String email, long telefono) {
            super(entFinanciera, entBancaria, numeroTarjeta, saldo, DNI, nombre, apellido, email, telefono);
            
        }

        
        public String efectuarPago(double montoTotal, int cuotas, Tarjeta tarjeta) { 
            double saldo = getSaldo();
            double montoCuotas=0;
            int porcentaje = 0;
        
            if (cuotas==1) {
               System.out.println("El pago se hara sin cuotas");
               montoCuotas=montoTotal;
            } else if (cuotas<=0||cuotas>6) {
                System.out.println("La cantidad de cuotas no es valida");
            }
            else {
                for (int i = 1; i < cuotas; i++) {
                    porcentaje += 3;
                }
                montoTotal = montoTotal + (montoTotal * porcentaje) / 100;
                montoCuotas = montoTotal / cuotas;
            }
    
        
            if (saldo < montoTotal) {
                return null; //retornar null
            } else {
               Ticket ticket = new Ticket(montoCuotas, montoTotal, tarjeta.getNombre(), tarjeta.getApellido());
               return ticket.toString();
            }
        }

       
}
