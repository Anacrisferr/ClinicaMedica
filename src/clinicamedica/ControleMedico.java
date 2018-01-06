
package clinicamedica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleMedico {
   
    Scanner ler = new Scanner(System.in);
    //Medico medico;
    List<Medico> listMedico = new ArrayList<>();

    public ControleMedico() {
        this.ler = new Scanner(System.in);
    }

    // Metodos para Medico
    public void menuMedico() {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n\n");
            System.out.println("\t Você está em Medico\n");

            System.out.println("(1) Cadastrar");
            System.out.println("(2) Listar");
            System.out.println("(3) Alterar");
            System.out.println("(4) Deletar");
            System.out.println("(0) Sair");
            System.out.println("\nOpcão: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    novoMedico();
                    break;

                case 2:
                    listarMedico();
                    break;

                case 3:
                    alterarMedico();
                    break;
                    
                case 4:
                    chamarMetodoDeletar();
                    
                case 0:
                    break;

                default:
                    System.out.println("\n\t\tOPCAO INVALIDA!");
            }
        } while (opcao != 0);

    }

    public void novoMedico() {
        
        Validacao validacao = new Validacao();
        
        Medico medico = new Medico();
        
        
        
        System.out.println("Digite o Nome \n");
        medico.setNome(ler.nextLine());

         boolean cpfOK = false;

        while (cpfOK == false) {
            System.out.println("Digite CPF: \n");
            String cpf = ler.nextLine();
            if (validacao.CPF(cpf)) {
                medico.setCpf(cpf);
                cpfOK = true;
            } else {
                System.out.println("\tERRO! CPF invalido, impossível cadastrar!\n");
                System.out.println("\tFaça um novo cadrastro com CPF válido\n");
            }
        }
        
        System.out.println("Data de Nascimento: \n");
        medico.setNascimento(ler.nextLine());
        
        System.out.println("Endereço: \n");
        medico.setEndereco(ler.nextLine());
        
        System.out.println("Número da casa: \n");
        medico.setNumCasa(ler.nextInt());
        
        System.out.println("Número do CRM: \n");
        medico.setCrm(ler.nextInt());
        
        System.out.println("\tERRO! CPF invalido, impossível cadastrar!\n");
        System.out.println("\tFaça um novo cadrastro com CPF válido\n");
        
        
        cadMedico(medico);
        System.out.println("Medico Cadastrado");

    }

    public void cadMedico(Medico m) {
        Medico medico = new Medico();
        medico.setNome(m.getNome());
        medico.setCpf(m.getCpf());
        medico.setCrm(m.getCrm());
        medico.setEspecialidade(m.getEspecialidade());
        medico.setEndereco(m.getEndereco());
        medico.setNascimento(m.getNascimento());
        medico.setNumCasa(m.getNumCasa());
        listMedico.add(medico);

    }

    public void listarMedico() {
        if (listMedico.size() <= 0) {
            System.out.println("Não há Medicos Cadastrados");
        } else {
            System.out.println("lista de Medicos Cadastrados");
            for (int i = 0; i < listMedico.size(); i++) {
                System.out.println("Nome: " + listMedico.get(i).getNome());
                System.out.println("CPF: " + listMedico.get(i).getCpf());
                System.out.println("CRM: " + listMedico.get(i).getCrm());
                System.out.println("Especialidade: " + listMedico.get(i).getEspecialidade());
                System.out.println("Endereço: " + listMedico.get(i).getEndereco());
                System.out.println("Data de Nascimento: " + listMedico.get(i).getNascimento());
                System.out.println("Número da casa: " + listMedico.get(i).getNumCasa());
                System.out.println("");
            }
        }
    }
    
     public void alterarMedico() {
        System.out.println("Informe o CPF do Paciente");
        Scanner ler = new Scanner(System.in);    
        String cpf;
        
        cpf = ler.nextLine();
        Medico m = new Medico();
        
        for (int i = 0; i < listMedico.size(); i++) {
            if (listMedico.get(i).getCpf().equals(cpf)) {
                System.out.println("Nome: " + listMedico.get(i).getNome());
                System.out.println("Novo Nome: \n");
                m.setNome(ler.nextLine());
                
                System.out.println("CPF: " + listMedico.get(i).getCpf());
                System.out.println("Novo CPF: \n");
                m.setCpf(ler.nextLine());
                
                System.out.println("Data de nascimento: " + listMedico.get(i).getNascimento());
                System.out.println("Nova data de nascimento: \n");
                m.setNascimento(ler.nextLine());
                
                
                System.out.println("Sexo: " + listMedico.get(i).getSexo());
                System.out.println("Novo Sexo: \n");
                m.setSexo(ler.nextLine());
                
                System.out.println("Endereço: " + listMedico.get(i).getEndereco());
                System.out.println("Novo Endereço: \n");
                m.setEndereco(ler.nextLine());
                
                System.out.println("Número da casa: " + listMedico.get(i).getNumCasa());
                System.out.println("Novo número da casa: \n");
                m.setNumCasa(ler.nextInt());
                        
                System.out.println("Número do SUS: " + listMedico.get(i).getCrm());
                System.out.println("Novo número do SUS: \n");
                m.setCrm(ler.nextInt());
                
                
                listMedico.set(i, m);
              
            }
              System.out.println("Dados alterados! ");
        }
    }

    public void chamarMetodoDeletar(){

        System.out.println("Digite o CPF do Medico para Deletar");
        String cpf = ler.nextLine();
        deletarMedico(cpf);
        
    }
    
    public void deletarMedico(String cpf) {
        int listSize = listMedico.size();
        if (listMedico.size() <=0) {
            System.out.println("Não há Medicos Cadastrados");
        }else{
              for(int i=0; i < listMedico.size(); i++){
                  if (listMedico.get(i).getCpf().equals(cpf)) {
                     listMedico.remove(i);
                      if (listSize > listMedico.size()) {
                          
                          System.out.println("Registro Excluido");
                      }else{
                          System.out.println("Registro não encontrado");
                      }
                  }
              }
        }
           
    }
    
}
