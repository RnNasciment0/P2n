import java.time.LocalDate;
import java.time.Period;

public class Homem extends PessoaIMC {

    public Homem(String nome, String sobreNome, int dia, int mes, int ano, String numCPF, float peso, float altura) {
        super(nome, sobreNome, dia, mes, ano, numCPF, peso, altura);
    }

    @Override
    public String resultIMC() {
        float imc = calculaIMC();
        if (imc < 20.7) {
            return "Abaixo do peso ideal";
        } else if (imc <= 26.4) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }

    @Override
    public String toString() {
        int idade = Period.between(this.getDataNasc(), LocalDate.now()).getYears();
        return super.toString()
                + "Gênero: Masculino\n"
                + "Idade: " + idade + " anos\n"
                + "CPF: " + this.getNumCPF() + "\n"
                + "IMC: " + String.format("%.1f", this.calculaIMC()) + " (" + this.resultIMC() + ")\n";
    }
}