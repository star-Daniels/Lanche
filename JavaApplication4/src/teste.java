
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste {
    public static void main(String [] args){ 
        List<Lanche> lanche = new ArrayList<Lanche>();
        Scanner scanner =  new Scanner(System.in);
        Lanche l1 = new Lanche("Cachorro-Quente",1,4);//ja deixei adicionado os lanches que estão na tabela
        lanche.add(l1);
        Lanche l2 = new Lanche("X-Salada",1 ,4.5);//para ser mais rapido de testar
        lanche.add(l2);
        Lanche l3 = new Lanche("X-Bacon",2 ,5);
        lanche.add(l3);
        Lanche l4 = new Lanche("Torrada Simples",3 ,2);
        lanche.add(l4);
        Lanche l5 = new Lanche("Refrigerante",4 ,1.5);
        lanche.add(l5);
        
        boolean cond=true;
        while(cond){
            System.out.println("|Escolha oque deseja fazer|\n"
                    + "|1-Ver quanto ira pagar|\n"
                    + "|2-Adicionar Lanche|\n"
                    + "|3-Sair|\n");
            
            
            int escolha =  scanner.nextInt();
           
           switch(escolha){
               case 1:
                       System.out.println("Digite o codigo do lanche\n");
                       int cod = scanner.nextInt();
                       for(Lanche lanc: lanche){
                           int i = 0;
                           if(lanc.getCod() == cod){
                               i++;
                               System.out.println("codigo encontrado\n");
                               System.out.println("Digite a quantidade\n");
                               int qtd = scanner.nextInt();
                               double preco = lanc.getPrice();
                               double total = preco *qtd;
                               
                               
                               System.out.println("O total sera: "+ total);
                               
                           } else {
                                System.out.println("codigo nao encontrado\n");
                           }
                           
                           
                       }
                    break;
               case 2:
                   String n = scanner.nextLine();
                   System.out.println("Digite o nome do lanche: ");
                   String nome = scanner.nextLine();
                   
                   System.out.println("digite o preco\n");
                   double preco = scanner.nextDouble();
                   
                   //nâo consegui fazer funcionar a parte de mover a imagem
                   /*
                   System.out.println("Coloque o endereço da imagen");
                   String ender = scanner.nextLine();
                   
                   Path origem = Path.get(ender);  
        
                    
                    Path destino = Path.of("C:/imagens/destino/copia.jpg");

                    try {
                        
                        Files.createDirectories(destino.getParent());

                        
                        Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);

                        System.out.println("Imagem transferida");
                    } catch (IOException e) {
                        System.err.println("Erro  " + e.getMessage());
                    }*/
                   
                   int cd = lanche.size() + 1;
                   Lanche n_lanche = new Lanche(nome, cd, preco);
                   
                   lanche.add(n_lanche);
                   System.out.println("lanche adicionado");
                   break;
               case 3:
                   System.out.println("sessao finalizada");
                   cond = false;
                   break;
               default:
                   System.out.println("Opcao invalida");
                   break;
           
            
            
           }
        }
    }    
}
