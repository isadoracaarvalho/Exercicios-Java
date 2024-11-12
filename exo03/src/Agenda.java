import java.util.Arrays;

public class Agenda {

    private String nomeAgenda;
    private Contato[] contatos;

    public Agenda() {
    }

    public Agenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {

        String dado = nomeAgenda;

        if(contatos != null) {
            for (Contato c : contatos) {
                dado +=  c.toString() + "\n";
            }
        }
        return dado;
    }
}
