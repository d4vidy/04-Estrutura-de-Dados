public class Principal{
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<>("Alunos");
        //lista.imprimeLista();
        lista.addInicio("David");
        lista.imprimeLista();
        lista.addInicio("Deniel");
        lista.imprimeLista();
        lista.addFinal("Raiane");
        lista.imprimeLista();
    }
}