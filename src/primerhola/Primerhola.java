
package primerhola;
import java.util.Scanner;
public class Primerhola {
// que pasara? 
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.println("hola mundo");
        System.out.println("como estamoooos");
        int num, num2;

        System.out.println("escriba un numero entero para realizar 4 operaciones basicas: ");
        num = teclado.nextInt();
        System.out.println("escriba el segundo numero entero: ");
        num2= teclado.nextInt();
        int resultadosum, res, mul,div;
        resultadosum = num + num2;
        res = num - num2;
        mul = num * num2;
        div = num / num2;
        
        System.out.println("el resultado de la suma sera: "+ resultadosum);
        System.out.println("el resultado de la resta sera: "+ res);
        System.out.println("el resultado de la multiplicacion sera: "+ mul);
        System.out.println("el resultado de la divicion sera: "+ div);
        
    }
    
}
