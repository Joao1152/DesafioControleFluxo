import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o primeiro parametro");
        int parametro_um = scan.nextInt();

        System.out.println("digite o segundo parametro");
        int parametro_dois = scan.nextInt();

        try {
                contar(parametro_um, parametro_dois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("o primeiro parametro não pode ser maior que o segundo");
        }
    }

    static void contar(int parametro_um,int parametro_dois) throws ParametrosInvalidosException{
        if(parametro_um > parametro_dois){
            throw new ParametrosInvalidosException();
        }else{
            int contador = parametro_dois - parametro_um;
           
            for(int i = 0; i < contador; i++){
                System.out.println("imprimindo o numero " + (i+1));
            }
        }
    }
}
