import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MinhaListaOrdenavel {

    public static final int PESO_CRESCENTE = 1;
    public static final int PESO_DECRESCENTE = 2;
    public static final int NOME_AZ = 3;
    public static final int NOME_ZA = 4;
    public static final int IMC_CRESCENTE = 5;
    public static final int IMC_DECRESCENTE = 6;
    public static final int DATA_CRESCENTE = 7;
    public static final int DATA_DECRESCENTE = 8;
    public static final int CPF_CRESCENTE = 9;
    public static final int CPF_DECRESCENTE = 10;

    private ArrayList<PessoaIMC> listaPessoas;

    public MinhaListaOrdenavel() {
        this.listaPessoas = new ArrayList<>();
    }

    public void add(PessoaIMC p) {
        this.listaPessoas.add(p);
    }

    public PessoaIMC get(int i) {
        return this.listaPessoas.get(i);
    }

    public int size() {
        return this.listaPessoas.size();
    }

    // --- COMPARADORES ---

    public Comparator<PessoaIMC> pesoC = (p1, p2) -> Float.compare(p1.getPeso(), p2.getPeso());

    public Comparator<PessoaIMC> nomeC = (p1, p2) -> p1.getNome().compareTo(p2.getNome());

    public Comparator<PessoaIMC> imcC = (p1, p2) -> Float.compare(p1.calculaIMC(), p2.calculaIMC());

    public Comparator<PessoaIMC> dataNascC = (p1, p2) -> p1.getDataNasc().compareTo(p2.getDataNasc());

    public Comparator<PessoaIMC> cpfC = (p1, p2) -> p1.getNumCPF().compareTo(p2.getNumCPF());

    public ArrayList<PessoaIMC> ordena(int criterio) {
        switch (criterio) {
            case PESO_CRESCENTE:
                Collections.sort(this.listaPessoas, this.pesoC);
                break;
            case PESO_DECRESCENTE:
                Collections.sort(this.listaPessoas, this.pesoC.reversed());
                break;
            case NOME_AZ:
                Collections.sort(this.listaPessoas, this.nomeC);
                break;
            case NOME_ZA:
                Collections.sort(this.listaPessoas, this.nomeC.reversed());
                break;
            case IMC_CRESCENTE:
                Collections.sort(this.listaPessoas, this.imcC);
                break;
            case IMC_DECRESCENTE:
                Collections.sort(this.listaPessoas, this.imcC.reversed());
                break;
            case DATA_CRESCENTE:
                Collections.sort(this.listaPessoas, this.dataNascC);
                break;
            case DATA_DECRESCENTE:
                Collections.sort(this.listaPessoas, this.dataNascC.reversed());
                break;
            case CPF_CRESCENTE:
                Collections.sort(this.listaPessoas, this.cpfC);
                break;
            case CPF_DECRESCENTE:
                Collections.sort(this.listaPessoas, this.cpfC.reversed());
                break;
            default:
                break;
        }
        return this.listaPessoas;
    }
}