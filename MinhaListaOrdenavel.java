import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MinhaListaOrdenavel {
    public static final int PESO_CRESCENTE = 1;
    public static final int PESO_DECRESCENTE = 2;

    private ArrayList<PessoaIMC> listaPessoas;

    public MinhaListaOrdenavel(){
        this.listaPessoas = new ArrayList<>();
    };

    public void add(PessoaIMC p){
        this.listaPessoas.add(p);
    };

    public PessoaIMC get(int i){
        return this.listaPessoas.get(i);
    };

    public Comparator<PessoaIMC> pesoC = (p1, p2) -> {
        float peso1 = p1.getPeso();
        float peso2 = p2.getPeso();
        return Float.compare(peso1, peso2);

    };

    public ArrayList<PessoaIMC> ordena(int criterio){
        switch (criterio){
            case PESO_CRESCENTE:
                Collections.sort(this.listaPessoas, this.pesoC);
                break;
            case PESO_DECRESCENTE:
                Collections.sort(this.listaPessoas, this.pesoC);
                break;
            default:
                break;
        }
        return this.listaPessoas;
    }
}