package Pruebas;

public class PruebaSingleton {

    private String nombrePersona;
    private static PruebaSingleton instancia;
    
    private PruebaSingleton(String nombrePersona) {
        this.nombrePersona= nombrePersona;
    }
    
    public static PruebaSingleton newInstancia(String nombrePersona) {
        if (instancia == null){
            instancia = new PruebaSingleton(nombrePersona);
        }
   
    else {
        System.out.println("Acabamos de instanciar el objeto");   
    }
    return instancia;
}
}
