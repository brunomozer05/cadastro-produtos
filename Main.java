import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int idMenu = 0;
        int idProduto = 0;
        double precoTotal = 0;
        int quantTotal = 0;
        double precoCalc = 0;
        int quantCalc = 0;
        ArrayList<Produto> produtos = new ArrayList<>();
        while (idMenu != 4){
            System.out.println();
            System.out.println("--- Sistema de Cadastro de Produtos --- ");
            System.out.println();
            System.out.println(" 1 - Cadastrar Produtos");
            System.out.println(" 2 - Listar Produtos");
            System.out.println(" 3 - Calcular Total da compra");
            System.out.println(" 4 - Sair");
            System.out.println();
            System.out.println();
            System.out.print("Digite a opção desejada : ");
            idMenu = scanner.nextInt();
            scanner.nextLine();
            if (idMenu == 1){
                Produto p = new Produto();
                System.out.println();
                System.out.println("--- Cadastro de Produtos --- ");
                System.out.println();
                System.out.println();
                System.out.print("Digite o Nome do produto : ");
                p.nome = scanner.nextLine();
                System.out.println();
                System.out.print("Digite o Preço do produto : ");
                p.preco = scanner.nextDouble();
                System.out.println();
                System.out.print("Digite a Quantidade do produto : ");
                p.quantidade = scanner.nextInt();
                System.out.println();
                produtos.add(p);
                System.out.println("Seu Produto foi cadastrado.");
            } else if (idMenu == 2) {

                System.out.println();
                System.out.println("--- Listar Produtos ---");
                for (int c = 0; c < produtos.size(); c++) {

                    System.out.println();
                    System.out.println("--------");
                    System.out.println("ID do Produto : " + c);
                    produtos.get(c).listarProdutos();
                    System.out.println("--------");

                }
            } else if (idMenu == 3) {

                for (int c = 0;c < produtos.size();c++){
                    precoCalc = produtos.get(c).preco;
                    quantCalc = produtos.get(c).quantidade;
                    precoTotal += precoCalc;
                    quantTotal += quantCalc;
                }

                System.out.println();
                System.out.println("=== Total da compra ===");
                System.out.println();
                System.out.println("Produtos comprados : " + quantTotal );
                System.out.println("Total gasto : R$" + precoTotal );
            }


        }scanner.close();
    }
}
