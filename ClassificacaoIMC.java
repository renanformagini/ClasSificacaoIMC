import java.util.Scanner;

public class ClassificacaoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu gênero (M/F/N):");
        char genero = scanner.nextLine().toUpperCase().charAt(0);

        System.out.println("Digite sua altura (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso (em kg):");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("\nNome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.printf("Altura: %.2f metros\n", altura);
        System.out.printf("Peso: %.2f kg\n", peso);
        System.out.printf("IMC: %.2f\n", imc);

        System.out.println("\nClassificação IMC:");

        if (genero == 'M') {
            classificarIMCMasculino(imc);
        } else {
            classificarIMCFeminino(imc);
        }

        scanner.close();
    }

    public static void classificarIMCMasculino(double imc) {
        if (imc >= 40) {
            System.out.println("Obesidade Mórbida");
        } else if (imc >= 30) {
            System.out.println("Obesidade Moderada");
        } else if (imc >= 25) {
            System.out.println("Obesidade Leve");
        } else if (imc >= 20) {
            System.out.println("Normal");
        } else {
            System.out.println("Abaixo do Normal");
        }
    }

    public static void classificarIMCFeminino(double imc) {
        if (imc >= 39) {
            System.out.println("Obesidade Mórbida");
        } else if (imc >= 29) {
            System.out.println("Obesidade Moderada");
        } else if (imc >= 24) {
            System.out.println("Obesidade Leve");
        } else if (imc >= 19) {
            System.out.println("Normal");
        } else {
            System.out.println("Abaixo do Normal");
        }
    }
}