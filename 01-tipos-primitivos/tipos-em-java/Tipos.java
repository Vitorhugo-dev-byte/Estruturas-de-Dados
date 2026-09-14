public class Tipos {

    public static void main(String[] args) {

        int numeroInteiro = 10;
        double numeroDecimal = 10.5;
        char caractere = 'A';
        boolean verdadeiro = true;
        String texto = "Olá, mundo!";

        System.out.println("Inteiro: " + numeroInteiro);
        System.out.println("Decimal: " + numeroDecimal);
        System.out.println("Caractere: " + caractere);
        System.out.println("Booleano: " + verdadeiro);
        System.out.println("Texto: " + texto);

        System.out.println("\nTipos:");

        System.out.println(((Object) numeroInteiro).getClass().getSimpleName());
        System.out.println(((Object) numeroDecimal).getClass().getSimpleName());
        System.out.println(((Object) caractere).getClass().getSimpleName());
        System.out.println(((Object) verdadeiro).getClass().getSimpleName());
        System.out.println(texto.getClass().getSimpleName());
    }
}
