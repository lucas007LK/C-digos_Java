import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        double av1, av2, media;

        av1 = entrada.nextDouble();
        av2 = entrada.nextDouble();

        Matematica calcular = new Matematica(av1, av2);

        calcular.exibir_valores();
        calcular.exibir_totais();
        calcular.exibir_ponderada();

        
        //Av1 = Peso 6
        //Av2 = Peso 4

        
        //System.out.printf("Media = %.2f\n", calcular.maior() );
        //System.out.printf("Maior Valor = %.2f\n", calcular.media() );

        //media =(av1 + av2) /2.0;
        //System.out.printf("Media = %.2f\n", media);
        
       
    }
}