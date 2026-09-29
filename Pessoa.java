
import java.time.LocalDate;


public class Pessoa {
    private String nome;
    private String sobreNome;
    private String numCPF;
    private LocalDate dataNasc;
    private static int qtdPessoas;


    public Pessoa(String nome, String sobreNome, int dia, int mes, int ano){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNasc = LocalDate.of(ano, mes, dia);
        qtdPessoas++;

    }
    public Pessoa(String nome, String sobreNome, int dia, int mes, int ano, String numCPF, float peso, float altura){
        this(nome,sobreNome,dia,mes,ano);
        this.numCPF = numCPF;
    }
    public static int numPessoas(){
        return qtdPessoas;
    }

    public String getNome(){
        return this.nome;
    }
    public String getSobreNome(){
        return this.sobreNome;
    }
    public String getNumCPF(){
        return this.numCPF;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }
    public void setNumCPF(String numCPF){
        this.numCPF = numCPF;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\n"
                + "Sobrenome: " + this.sobreNome + "\n";
    }
}