
import java.time.LocalDate;

public class Mulher extends PessoaIMC{

    public Mulher(String nome, String dataNascimento, String cpf, float peso, float altura){
        super(nome, dataNascimento, cpf, peso, altura);
    }

    @Override
    public String resultIMC(){
        float imc = calculaIMC();
        if (imc < 19){
            return "Abaixo do peso ideal";
        } else if (imc <= 25.8){
            return "Peso ideal";
        } else{
            return "Acima do peso ideal";
        }
    }
    @override
    public String toString(){
        return super.toString() + "Gênero: Feminino\n" + "Resultado IMC: " + this.resultIMC() + "\n";
    }
}