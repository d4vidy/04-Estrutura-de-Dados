public class Principal{
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<>("Alunos");
        
        lista.imprimeLista();
        lista.addInicio("David");
        lista.imprimeLista();
        lista.addInicio("Luis");
        lista.imprimeLista();
        lista.addFinal("Deniel");
        lista.imprimeLista();
        lista.addFinal("Raiane");
        lista.imprimeLista();
        
        lista.addMeio("Pedro", 2);
        lista.imprimeLista();

        lista.removeMeio(2);
        lista.imprimeLista();

        lista.removeInicio();
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
    }
}