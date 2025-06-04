import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int idMenu = 0;
        int idProduto = 0;
        String[] nomes = {"0","0","0","0","0"};
        double[] precos = {0,0,0,0,0};
        int[] quantidades = {0,0,0,0,0};
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
        if (idMenu == 1){
            System.out.println();
            System.out.println("--- Cadastro de Produtos --- ");
            System.out.println();
            System.out.print("Digite o ID do produto que predende cadastrar : ");
            idProduto = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            System.out.print("Digite o Nome do produto : ");
            nomes[idProduto] = scanner.nextLine();
            System.out.println();
            System.out.print("Digite o Preço do produto : ");
            precos[idProduto] = scanner.nextDouble();
            System.out.println();
            System.out.print("Digite a Quantidade do produto : ");
            quantidades[idProduto] = scanner.nextInt();
            System.out.println();

            System.out.println("Seu Produto foi cadastrado.");
        } else if (idMenu == 2) {
            System.out.println();
            System.out.println("--- Listar Produtos ---");

            for (int c = 0;c < 5;c++) {
                System.out.println();
                System.out.println("--------");
                System.out.println("ID do Produto : " + c);
                System.out.println("Nome : " + nomes[c]);
                System.out.println("Quantidade : " + quantidades[c]);
                System.out.println("Preços : " + precos[c]);
                System.out.println("--------");

            }
        } else if (idMenu == 3) {
            double item0 = quantidades[0] * precos[0];
            double item1 = quantidades[1] * precos[1];
            double item2 = quantidades[2] * precos[2];
            double item3 = quantidades[3] * precos[3];
            double item4 = quantidades[4] * precos[4];

            int totalQuantidade = quantidades[0] + quantidades[1] + quantidades[2] + quantidades[3] + quantidades[4];
             double total = item0 + item1 + item2 + item3 + item4;

            System.out.println();
            System.out.println("=== Total da compra ===");
            System.out.println();
            System.out.println("Produtos comprados : " + totalQuantidade );
            System.out.println("Total gasto : R$" + total);
        }


        }scanner.close();
    }
}
