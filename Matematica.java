public class Matematica{

  //ATRIBUTO (VARIAVEL)
    double a, b;
    
 //METODOS

//METODO CONSTRUTOR
public Matematica(double valor1, double valor2){
    this.a = valor1;   //av1
    this.b = valor2;   //av2
}

    //METODO
    public double media(){
        return (this.a + this.b) / 2.0;
    }

    public void exibir_valores(){
    System.out.printf("AV1 = %.2f\n", this.a);
    System.out.printf("AV2 = %.2f\n", this.b);    
 }
     public double maior(){
      return ( (this.a + this.b +Math.abs(this.a - this.b)) / 2);
     }
         
    public void exibir_totais(){
    System.out.printf("Media = %.2f\n", this.media() );
    System.out.printf("Maior valor = %.2f\n", this.maior() );    
}    
    public double ponderada(){
       return( ((this.a * 6) + (this.b * 4)) /10.0);

   }
   
    public void exibir_ponderada(){
    System.out.printf("Media Ponderada = %.2f\n", this.ponderada());   
  
    }
}