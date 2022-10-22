import java.util.Scanner;

public class Cliente {

    Scanner scanner = new Scanner(System.in);
    public String cpf;
    public String nome;
    public String telefone;
    public String endereco;
    public double credito;

    public Cliente(String cpf, String nome, String telefone, String endereco, double credito) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.credito = credito;
    }

    public Cliente() {
    }

    public void aumentarCredito(double aumento){
        credito += aumento;
    }
    public void removerCredito(double remover){
        credito -= remover;
    }

    
    



    @Override
    public String toString() {
        return "Cliente (CPF= " + cpf + " | Nome= " + nome + " | Telefone= " + telefone + " | Endereco= " + endereco + " | Credito= " + credito + ")";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

}
