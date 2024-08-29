public class Principal{
    public static void main(String[] args) {
        System.out.println("=== Testando Fila ===");
        Fila<String> fila = new Fila<String>("Letras");
        fila.enfileirar("A");
        fila.imprimeDados();

        fila.enfileirar("B");
        fila.imprimeDados();
    }
}