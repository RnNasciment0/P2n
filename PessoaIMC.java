public abstract class PessoaIMC extends Pessoa{
    protected float peso;
    protected float altura;

    public PessoaIMC(String nome, String dataNascimento, String cpf, float peso, float altura){
        super(nome, dataNascimento, cpf);
        this.peso = peso;
        this.altura = altura;
    }


    public float getPeso(){
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }
    public float calculaIMC(){
        return this.peso / (this.altura * this.altura)
    }
    public abstract String resultIMC();
}