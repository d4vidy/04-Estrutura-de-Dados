public class Principal{
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>("Alunos");

        lista.addInicio("David");
        lista.imprimeDados();
        lista.addInicio("Deniel");
        lista.imprimeDados();
        lista.addFinal("Eliane");
        lista.imprimeDados();

        lista.removeInicio();
        lista.imprimeDados();

        lista.removeFinal();
        lista.imprimeDados();
    }
}