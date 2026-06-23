package aulacontabancaria;

public class ContaBancaria {
    // Atributos solicitados
    public String nomeCliente;
    public String cpf;
    public String nomeBanco;
    public int agencia;
    public int numeroConta;
    public double saldo = 500.00; // O saldo deve começar com R$ 500,00

    // Método sacar que atualiza o saldo e retorna o novo saldo
    public double sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor; // Atualiza o saldo subtraindo o valor sacado
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido!");
        }
        return saldo;
    }
}