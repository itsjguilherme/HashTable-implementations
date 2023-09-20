public class TesteEspalhamento {

    public static void main(String[] args) {

        ConjuntoEspalhamemento conjunto = new ConjuntoEspalhamemento();

        for (int i = 0; i  < 100; i++) {
            conjunto.adiciona("" + i);
        }

        conjunto.imprimeTabela();
    }
}
