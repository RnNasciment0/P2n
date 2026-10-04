import java.time.LocalDate;
import java.time.Period;

public class Mulher extends PessoaIMC {

    public Mulher(String nome, String sobreNome, int dia, int mes, int ano, String numCPF, float peso, float altura) {
        super(nome, sobreNome, dia, mes, ano, numCPF, peso, altura);
    }

    @Override
    public String resultIMC() {
        float imc = calculaIMC();
        if (imc < 19) {
            return "Abaixo do peso ideal";
        } else if (imc <= 25.8) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }

    @Override
    public String toString() {
        int idade = Period.between(this.getDataNasc(), LocalDate.now()).getYears();
        return super.toString()
                + "Gênero: Feminino\n"
                + "Idade: " + idade + " anos\n"
                + "CPF: " + this.getNumCPF() + "\n"
                + "IMC: " + String.format("%.1f", this.calculaIMC()) + " (" + this.resultIMC() + ")\n";
    }
}