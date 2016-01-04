/*
 * IFPI - ADS - 2015.2
 * 2011.2ADS0019 Adriano José Sousa Santos  * 
 */
package Exercicio23dez2015;

/**
 *
 * @author adrianonef
 */
public class Question06 {
    
    public static void main(String[] args) {
        Interatividade interatividade = new Interatividade();
        interatividade.digiteValor();
        int N = interatividade.teclado.nextInt();
        Cobaia[] cobaias = new Cobaia[N];
                 
        //Preenchendo Array do Tipo Cobaia com N elementos        
        for(Cobaia cobaia : cobaias){
            System.out.println("Entrando no FOR");
            interatividade.digiteValor();
            cobaia.setAmontTest(interatividade.teclado.nextInt());
            System.out.println("Digite o tipo C = Coelho, R = Rato, S = Sapo");
            cobaia.setType(interatividade.teclado.next());
        }
        
        //Somando todas cobaias
        System.out.println("Total : " + interatividade.sumAllTest(cobaias) + " cobaias");

        //Somando Testes com Coelhos        
        System.out.println("Total de coelhos : " + interatividade.sumTestTypeN("C",cobaias) );
        
        //Somando Testes com Ratos      
        System.out.println("Total de ratos : " + interatividade.sumTestTypeN("R",cobaias) );
        
        //Somando Testes com Sapos       
        System.out.println("Total de sapos : " + interatividade.sumTestTypeN("S",cobaias) );
        
        
    }
}
