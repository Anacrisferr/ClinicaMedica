
package clinicamedica;

/**
 *
 * @author dell
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private int numCasa;
    private String fone;
    private String nascimento;
    private String sexo;
    
    private Pessoa() {
        
    }

    public Pessoa(String nome, String cpf, String endereco, int numCasa, String fone, String nascimento, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numCasa = numCasa;
        this.fone = fone;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
   
}
