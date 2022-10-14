
import java.util.ArrayList; //import 
import javax.crypto.spec.GCMParameterSpec;
public class arrayList {

    public static void main(String[] args) {
        //ArrayList <objeto> nombre = ArrayList <objeto> ();
        ArrayList <Persona> guardado = new ArrayList<Persona>();
        
        guardado.add(new Persona(35, "Rigo", "Sazo", "Moreno claro", 1.60, 85478569));
        System.out.println(guardado.get(0).nombre);
        System.out.println(guardado.get(0).apellido);
        System.out.println(guardado.get(0).color_piel);
        System.out.println(guardado.get(0).altura);
        System.out.println(guardado.get(0).telefono);
        
        //tambien se puede con un for each
        for (Persona datos: guardado){
            System.out.println(datos.nombre);
        }
    }
    
}
