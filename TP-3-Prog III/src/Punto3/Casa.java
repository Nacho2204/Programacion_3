package Punto3;

public class Casa {
    
    private Dormitorio dormitorio;
    private Bano banio;
    private Patio patio;
    private Cocina cocina;


    public Casa(int metrosCuadradosDormitorio, boolean baniooEnSuit, int cantVentanas,
                boolean baniera, boolean anteBanio,String ubicacion, int metrosCuadradosPatio,
                String tipoHorno, int metrosCuadradosCocina, String color ) 
                
        {
        this.dormitorio = new Dormitorio(metrosCuadradosDormitorio, baniooEnSuit, cantVentanas);
        this.banio = new Bano(baniera, anteBanio);
        this.patio = new Patio(ubicacion, metrosCuadradosPatio);
        this.cocina = new Cocina(tipoHorno, metrosCuadradosCocina, color);
        }

    public class Dormitorio{
        private int metrosCuadradosDormitorio;
        private boolean baniooEnSuit;
        private int cantVentanas;

        public Dormitorio(int metrosCuadradosDormitorio, boolean baniooEnSuit, int cantVentanas) {
            this.metrosCuadradosDormitorio = metrosCuadradosDormitorio;
            this.baniooEnSuit = baniooEnSuit;
            this.cantVentanas = cantVentanas;
        }

        public int getMetrosCuadradosDormitorio() {
            return metrosCuadradosDormitorio;
        }

        public void setMetrosCuadradosDormitorio(int metrosCuadradosDormitorio) {
            this.metrosCuadradosDormitorio = metrosCuadradosDormitorio;
        }

        public boolean isBaniooEnSuit() {
            return baniooEnSuit;
        }

        public void setBaniooEnSuit(boolean baniooEnSuit) {
            this.baniooEnSuit = baniooEnSuit;
        }

        public int getCantVentanas() {
            return cantVentanas;
        }

        public void setCantVentanas(int cantVentanas) {
            this.cantVentanas = cantVentanas;
        }

    }

    public class Bano{
        private boolean baniera;
        private boolean anteBanio;

        public Bano(boolean baniera, boolean anteBanio) {
            this.baniera = baniera;
            this.anteBanio = anteBanio;
        }
        
        public boolean isBaniera() {
            return baniera;
        }
        public void setBaniera(boolean baniera) {
            this.baniera = baniera;
        }
        public boolean isAnteBanio() {
            return anteBanio;
        }
        public void setAnteBanio(boolean anteBanio) {
            this.anteBanio = anteBanio;
        }

    }

    public class Patio{
        private String ubicacion;
        int metrosCuadradosPatio;

        public Patio(String ubicacion, int metrosCuadradosPatio) {
            this.ubicacion = ubicacion;
            this.metrosCuadradosPatio = metrosCuadradosPatio;
        }
        
        public String getUbicacion() {
            return ubicacion;
        }
        public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
        }
        public int getMetrosCuadradosPatio() {
            return metrosCuadradosPatio;
        }
        public void setMetrosCuadradosPatio(int metrosCuadradosPatio) {
            this.metrosCuadradosPatio = metrosCuadradosPatio;
        }
        
    }

    public class Cocina{
        private String tipoHorno;
        private int metrosCuadradosCocina;
        private String color;

        public Cocina(String tipoHorno, int metrosCuadradosCocina, String color) {
            this.tipoHorno = tipoHorno;
            this.metrosCuadradosCocina = metrosCuadradosCocina;
            this.color = color;
        }

        public String getTipoHorno() {
            return tipoHorno;
        }

        public void setTipoHorno(String tipoHorno) {
            this.tipoHorno = tipoHorno;
        }

        public int getMetrosCuadradosCocina() {
            return metrosCuadradosCocina;
        }

        public void setMetrosCuadradosCocina(int metrosCuadradosCocina) {
            this.metrosCuadradosCocina = metrosCuadradosCocina;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        
    }

    public Dormitorio getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(Dormitorio dormitorio) {
        this.dormitorio = dormitorio;
    }

    public Bano getBanio() {
        return banio;
    }

    public void setBanio(Bano banio) {
        this.banio = banio;
    }

    public Patio getPatio() {
        return patio;
    }

    public void setPatio(Patio patio) {
        this.patio = patio;
    }

    public Cocina getCocina() {
        return cocina;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

}
