package clinicamedica;

/**
 *
 * @author dell
 */
public class Medico {
    
    private int crm;
    private String especialidade;

    public Medico() {
        super(null, null, null, 0, null, null, null);
    }

    
    public Medico(String nome, String cpf, String endereco, int numCasa, String fone, String nascimento, String sexo, int crm, String especialidade) {
        super(nome, cpf, endereco, numCasa, fone, nascimento, sexo);

        this.crm = crm;
        this.especialidade = especialidade;
    }

   

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
