import javax.swing.JOptionPane;

public class Pagamento {
    private String nomeDoPagador;
    private String cpf;
    private double valorASerPago;

    public Pagamento(String nomeDoPagador, String cpf, double valorASerPago) {
        this.nomeDoPagador = nomeDoPagador;
        this.cpf = cpf;
        this.valorASerPago = valorASerPago;
    }

    public String getNomeDoPagador() {
        return nomeDoPagador;
    }

    public String getCpf() {
        return cpf;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setNomeDoPagador(String nomeDoPagador) {
        this.nomeDoPagador = nomeDoPagador;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }
}

class CartaoDeCredito extends Pagamento {
    private String numeroDoCartao;

    public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
}

class Cheque extends Pagamento {
    private String numeroDoCheque;

    public Cheque(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCheque) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCheque = numeroDoCheque;
    }

    public String getNumeroDoCheque() {
        return numeroDoCheque;
    }

    public void setNumeroDoCheque(String numeroDoCheque) {
        this.numeroDoCheque = numeroDoCheque;
    }
}

class Boleto extends Pagamento {
    private String numeroDoBoleto;
    private int dia;
    private int mes;
    private int ano;

    public Boleto(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoBoleto, int dia, int mes, int ano) {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoBoleto = numeroDoBoleto;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNumeroDoBoleto() {
        return numeroDoBoleto;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setNumeroDoBoleto(String numeroDoBoleto) {
        this.numeroDoBoleto = numeroDoBoleto;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome do Pagador:");
        String cpf = JOptionPane.showInputDialog("CPF do Pagador:");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser pago:"));

        String numeroCartao = JOptionPane.showInputDialog("Número do Cartão de Crédito:");
        CartaoDeCredito cartao = new CartaoDeCredito(nome, cpf, valor, numeroCartao);
        JOptionPane.showMessageDialog(null, "Pagamento via Cartão de Crédito criado!");

        String numeroCheque = JOptionPane.showInputDialog("Número do Cheque:");
        Cheque cheque = new Cheque(nome, cpf, valor, numeroCheque);
        JOptionPane.showMessageDialog(null, "Pagamento via Cheque criado!");

        String numeroBoleto = JOptionPane.showInputDialog("Número do Boleto:");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de vencimento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês de vencimento:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de vencimento:"));
        Boleto boleto = new Boleto(nome, cpf, valor, numeroBoleto, dia, mes, ano);
        JOptionPane.showMessageDialog(null, "Pagamento via Boleto criado!");

        String detalhes = String.format("Detalhes do Boleto:\nNúmero: %s\nVencimento: %02d/%02d/%d",
                boleto.getNumeroDoBoleto(), boleto.getDia(), boleto.getMes(), boleto.getAno());
        JOptionPane.showMessageDialog(null, detalhes);
    }
}
