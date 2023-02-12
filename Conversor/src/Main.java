import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selecione a opção desejada:");
        System.out.println("1. Converter dólar para real");
        System.out.println("2. Converter real para dólar");
        int opcao = input.nextInt();
        if (opcao == 1) {
            System.out.println("Informe a quantidade de dólares:");
            double dolares = input.nextDouble();
            double cotacao = getCotacao(); // Busca a cotação atual
            double reais = dolares * cotacao;
            System.out.println("Valor em reais: " + reais);
        } else if (opcao == 2) {
            System.out.println("Informe a quantidade de reais:");
            double reais = input.nextDouble();
            double cotacao = getCotacao(); // Busca a cotação atual
            double dolares = reais / cotacao;
            System.out.println("Valor em dólares: " + dolares);
        } else {
            System.out.println("Opção inválida");
        }
        input.close();
    }

    private static double getCotacao() {
        // Aqui você pode buscar a cotação atual da moeda a partir de uma API
        // Por simplicidade, neste exemplo estamos usando uma cotação fixa
        return 5.50;
    }
}



