public class Main {
    public static void main(String[] args) {
        String nome = "Ana";
        double[] notas = {7.0, 8.5, 6.0, 1.0};
        double media = 0.0;
        String resultado = "";

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        media = soma / notas.length;

        int mediaInt = (int) media;

        if (media >= 6.0) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }
        System.out.println("Aluna "+ nome + " obteve média = " + mediaInt+ " Está " + resultado);
    }
}
