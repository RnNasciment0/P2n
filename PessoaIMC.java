public abstract class PessoaIMC extends Pessoa {
    protected float peso;
    protected float altura;

    public PessoaIMC(String nome, String sobreNome, int dia, int mes, int ano, String numCPF, float peso, float altura) {
        super(nome, sobreNome, dia, mes, ano, numCPF);
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public float calculaIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return super.toString()
                + "Data de Nascimento: " + this.getDataNasc() + "\n"
                + "Peso: " + this.peso + "\n"
                + "Altura: " + this.altura + "\n";
    }
}