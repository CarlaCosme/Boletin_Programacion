//exemplo obxeto
package exemplo.obxeto;

public class ExemploObxeto {
    public static void main(String[] args) {
        semaforo unsemaforo=new semaforo();//instancio obxeto tipo semaforo
        unsemaforo.darcor("verde");
        String respuesta=unsemaforo.dimecor();
        System.out.println("cor semaforo="+respuesta);
        semaforo outrosemaforo)=new semaforo();//otro objeto
        outrosemaforo.darcor("Rojo");
        respuesta= outrosemaforo.dimecor();
        //String respuesta2=outrosemaforo.dimecor();
        System.out.print("color semaforo2="+respuesta2);
    }
    
}
