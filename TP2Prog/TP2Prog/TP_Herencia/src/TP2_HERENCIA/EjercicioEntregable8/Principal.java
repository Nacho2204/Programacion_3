package TP2_HERENCIA.EjercicioEntregable8;

class Principal {

    public static void main(String[] args) {
       

        
        Tarjeta tarjeta = new Tarjeta("Visa", "Banco X", "1234567890123456", 15000, 12345678, "Nacho", "Perez", "nacho.perez@gmail.com", 291655235);

        
        Posnet posnet = new Posnet("Visa", "Banco X", "1234567890123456", 15000, 12345678, "Nacho", "Perez", "nacho.perez@gmail.com", 291655235);

    
        System.out.println(posnet.efectuarPago(10000, 5, tarjeta));
    }

}