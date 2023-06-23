import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Qual tipo de carne você levará? Tipos disponiveis: Picanha, Alcatra e File Duplo. ");
        String tipo = ler.nextLine();
        System.out.println("");

        System.out.print("Qual quantidade de Kgs você levará? ");
        double peso = ler.nextDouble();
        ler.nextLine();
        System.out.println("");

        System.out.print("A compra será paga no cartão Tabajara (S/N)? ");
        String pagamento = ler.nextLine();
        System.out.println("");

        ler.close();

        double preco;
        double desconto;


        if("Picanha".equalsIgnoreCase(tipo)){
            if(peso <= 5){
                preco = peso * 6.90;
                if("S".equalsIgnoreCase(pagamento)){
                    desconto = preco*0.05;
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ %2.2f, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,desconto,(preco - desconto));
                }
                else{
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ 0,00, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,preco);
                }
                
            }
            if(peso > 5){
                preco = peso * 7.80;
                if("S".equalsIgnoreCase(pagamento)){
                    desconto = preco*0.05;
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ %2.2f, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,desconto,(preco - desconto));
                }
                else{
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ 0,00, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,preco);
                }
                                
            }
        }

        if("Alcatra".equalsIgnoreCase(tipo)){
            if(peso <= 5){
                preco = peso * 5.90;
                if("S".equalsIgnoreCase(pagamento)){
                    desconto = preco*0.05;
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ %2.2f, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,desconto,(preco - desconto));
                }
                else{
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ 0,00, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,preco);
                }
                                
            }
            if(peso > 5){
                preco = peso * 6.80;
                if("S".equalsIgnoreCase(pagamento)){
                    desconto = preco*0.05;
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ %2.2f, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,desconto,(preco - desconto));
                }
                else{
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ 0,00, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,preco);
                }
                
            }
        }

        if("File duplo".equalsIgnoreCase(tipo)){
            if(peso <= 5){
                preco = peso * 4.90;
                if("S".equalsIgnoreCase(pagamento)){
                    desconto = preco*0.05;
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ %2.2f, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,desconto,(preco - desconto));
                }
                else{
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ 0,00, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,preco);
                }
                
            }
            if(peso > 5){
                preco = peso * 5.80;
                if("S".equalsIgnoreCase(pagamento)){
                    desconto = preco*0.05;
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ %2.2f, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,desconto,(preco - desconto));
                }
                else{
                    System.out.printf("%s, %2.2f Kgs, Valor total: %2.2f Pagamento cartão Tabajara: %s, Valor do desconto: R$ 0,00, Valor à pagar: %2.2f",tipo,peso,preco,pagamento,preco);
                }
                
            }
        }
        
        

    }
}
