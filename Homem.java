
import java.time.LocalDate;

public class Homem extends PessoaIMC{

    public Homem(String nome, String dataNascimento, String cpf, float peso, float altura){
        super(nome, dataNascimento, cpf, peso, altura);
    }

    @Override
    public String resultIMC(){
        float imc = calculaIMC();
        if (imc < 20.7){
            return "Abaixo do peso ideal";
        } else if (imc <= 26.4){
            return "Peso ideal";
        } else{
            return "Acima do peso ideal";
        }
    }
    @override
    public String toString(){
        return super.toString() + "Gênero: Masculino\n" + "Resultado IMC: " + this.resultIMC() + "\n";
    }
}