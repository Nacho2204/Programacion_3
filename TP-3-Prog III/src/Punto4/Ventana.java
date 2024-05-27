package Punto4;

public class Ventana {
    
    private Boton boton1, boton2, boton3, boton4, boton5;
    private ScrollBar scrollBarVertical, scrollBarHorizontal;
    private CajaTexto cadaTexto;
    private TextoVentana textoVentana;

    public Ventana(Boton boton1, Boton boton2, Boton boton3, Boton boton4, Boton boton5, ScrollBar scrollBarVertical,
            ScrollBar scrollBarHorizontal, CajaTexto cadaTexto,TextoVentana textoVentana ) {

        this.boton1 = boton1;
        this.boton2 = boton2;
        this.boton3 = boton3;
        this.boton4 = boton4;
        this.boton5 = boton5;
        this.scrollBarVertical = scrollBarVertical;
        this.scrollBarHorizontal = scrollBarHorizontal;
        this.cadaTexto = cadaTexto;
        this.textoVentana = textoVentana;
    }

    public Ventana() {
        
    }
    public Boton getBoton1() {
        return boton1;
    }

    public void setBoton1(Boton boton1) {
        this.boton1 = boton1;
    }

    public Boton getBoton2() {
        return boton2;
    }

    public void setBoton2(Boton boton2) {
        this.boton2 = boton2;
    }

    public Boton getBoton3() {
        return boton3;
    }

    public void setBoton3(Boton boton3) {
        this.boton3 = boton3;
    }

    public Boton getBoton4() {
        return boton4;
    }

    public void setBoton4(Boton boton4) {
        this.boton4 = boton4;
    }

    public Boton getBoton5() {
        return boton5;
    }

    public void setBoton5(Boton boton5) {
        this.boton5 = boton5;
    }

    public ScrollBar getScrollBarVertical() {
        return scrollBarVertical;
    }

    public void setScrollBarVertical(ScrollBar scrollBarVertical) {
        this.scrollBarVertical = scrollBarVertical;
    }

    public ScrollBar getScrollBarHorizontal() {
        return scrollBarHorizontal;
    }

    public void setScrollBarHorizontal(ScrollBar scrollBarHorizontal) {
        this.scrollBarHorizontal = scrollBarHorizontal;
    }

    public CajaTexto getCadaTexto() {
        return cadaTexto;
    }

    public void setCadaTexto(CajaTexto cadaTexto) {
        this.cadaTexto = cadaTexto;
    }

    public TextoVentana getTextoVentana() {
        return textoVentana;
    }

    public void setTextoVentana(TextoVentana textoVentana) {
        this.textoVentana = textoVentana;
    }


    public class TextoVentana{
    
        private String fuente;
        private double tamano;
        private String color;
        
        public TextoVentana (String fuente, double tamano, String color) {
            
            this.fuente = fuente;
            this.tamano = tamano;
            this.color = color;
        }

        
        public String getFuente() {
            return fuente;
        }

        public void setFuente(String fuente) {
            this.fuente = fuente;
        }

        public double getTamano() {
            return tamano;
        }

        public void setTamano(double tamano) {
            this.tamano = tamano;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        
    }

    public class Boton{
        
        private TextoVentana texto;
        private String urlLogo;
        private double ancho;
        private double largo;
        private String textoCopiar;

        public Boton(TextoVentana texto, String urlLogo, double ancho, double largo, String textoCopiar) {
            this.texto = texto;
            this.urlLogo = urlLogo;
            this.ancho = ancho;
            this.largo = largo;
            this.textoCopiar = textoCopiar;
        }

        public TextoVentana getTexto() {
            return texto;
        }

        public void setTexto(TextoVentana texto) {
            this.texto = texto;
        }

        public String getUrlLogo() {
            return urlLogo;
        }

        public void setUrlLogo(String urlLogo) {
            this.urlLogo = urlLogo;
        }

        public double getAncho() {
            return ancho;
        }

        public void setAncho(double ancho) {
            this.ancho = ancho;
        }

        public double getLargo() {
            return largo;
        }

        public void setLargo(double largo) {
            this.largo = largo;
        }

    }

    public class CajaTexto{

        
        private double ancho;
        private double largo;

        public CajaTexto( double ancho, double largo) {
            
            this.ancho = ancho;
            this.largo = largo;
        }

        
        public double getAncho() {
            return ancho;
        }
        public void setAncho(double ancho) {
            this.ancho = ancho;
        }
        public double getLargo() {
            return largo;
        }
        public void setLargo(double largo) {
            this.largo = largo;
        }
        
    }

    public class ScrollBar{
        private double maxPosicion;
        private double minPosicion;
        private String direccion;
        
        
        public ScrollBar(double maxPosicion, double minPosicion, String direccion) {
            this.maxPosicion = maxPosicion;
            this.minPosicion = minPosicion;
            this.direccion = direccion;

        }


        public double getMaxPosicion() {
            return maxPosicion;
        }


        public void setMaxPosicion(double maxPosicion) {
            this.maxPosicion = maxPosicion;
        }


        public double getMinPosicion() {
            return minPosicion;
        }


        public void setMinPosicion(double minPosicion) {
            this.minPosicion = minPosicion;
        }


        public String getDireccion() {
            return direccion;
        }


        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

       

    }
}
