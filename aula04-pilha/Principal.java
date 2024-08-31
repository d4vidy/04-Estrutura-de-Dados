public class Principal{
    public static void main(String[] args) {
        System.out.println("=== TESTANDO PILHA ===");
        Pilha<String> pilha = new Pilha<String>("Letras");

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.imprimePilha();

        System.out.println("Topo da pillha: " + pilha.peek());
        System.out.println("Elemento Removido: " + pilha.pop());
        pilha.imprimePilha();

    }
}