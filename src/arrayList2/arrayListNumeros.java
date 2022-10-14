
package arrayList2;


import java.util.ArrayList;
import java.util.Scanner;

public class arrayListNumeros 
{
    Scanner sp = new Scanner(System.in);
    ArrayList<Integer> valores = new ArrayList<>();
    
    //metodo numero entero
    public boolean ingreso(int numero)
    {
       
        if (numero == -99 ) 
        {
            return  false;
        }else
        {
            valores.add(numero);
            return true;
        }
    }
    
    //metodo inicio scanner
    public void inicio()
    {
        boolean parar = true;
        while (parar) 
        {
            System.out.print("Ingrese un numero: ");
            parar = ingreso(sp.nextInt());
        }
        System.out.println("Valores Leidos: " +valores.size());
        
        int aux = 0;
        for (Integer valore : valores) 
        {
            aux += valore;
        }
        System.out.println("Su valor sumado es: " +aux);
        
           //La media
           System.out.println("Su media es: "+ (float)(aux/(float)valores.size()));
           
           //mostrar los valores mayores a la media
           for(Integer valor: valores)
           {
               if(valor >(aux/valores.size()))
               {
                   System.out.println("Valores ingresados mayores a la media: "+valor);
               }
           }
    }
    
 
   
    
    public static void main(String[] args) {
        arrayListNumeros a = new arrayListNumeros();
        a.inicio();
    }
}
