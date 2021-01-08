package EnumClases;


public enum Calendario {
    
        Enero(31),
        Febrero(28),
        FebreroBi(29),
        Marzo(31),
        Abril(30),
        Mayo(31),
        Junio(30),
        Julio(31),
        Agosto(31),
        Septiembre(30),
        Octubre(31),
        Noviembre(30),
        Diciembre(31);
        
        
        public final int dias;
        
        private Calendario(int dias){
            this.dias = dias;
        }
        
        
       public int getDias(){
           return dias;
       }
        
        
}
