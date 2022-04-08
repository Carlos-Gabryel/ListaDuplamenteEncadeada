public class Cliente implements Comparable <Cliente>{

    private String cpf;
    private String nome;
    private String fone;
    private String email;



    public Cliente(String cpf, String nome, String fone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public int compareTo (Cliente c) {
        int retorno;
        retorno = this.cpf.compareTo(c.cpf);
        return retorno;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", fone='" + fone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}