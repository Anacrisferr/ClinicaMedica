package clinicamedica;

import java.util.InputMismatchException;

public class Validacao {
    
      //Validação de CPF
    
    
    public boolean CPF (String cpf){
    //Considera-se se for informado uma sequencia de numeros iguais, caso contrátio CPF válido.
       
        if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999") ||
           (cpf.length() != 11))
            return(false);
        
        char d10, d11;
        int sm, i, r, num, peso;
        
        //try protege o codigo para erro de conversao de tipo (int)
        try{
        
        //Calculo do 1 digito verificador
            sm = 0;
            peso = 10;
            
            for (i=0; i<9; i++){               
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            //Converte o i-esimo caractere do CPF em numero: 
            //transforma o caractere '0' no inteiro (48 eh a posicao de '0' tabela ASCII)

            r = 11 - (sm % 11);
            
            if ((r == 10) || (r == 11))
                d10 = '0';
            else
                d10 = (char)(r + 48); //Converte no respctivo caractere numerico
            
            //Calculo do 2 digito verificador
            
            sm = 0;
            peso = 11;
            for(i =0; i<10; i++){
                num = (int)(cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                d11 = '0';
            else
                d11 = (char)(r + 48);
            
            //Verifica se os digitos calculados conferem com os digitos informados.
            
            if ((d10 == cpf.charAt(9)) && (d11 == cpf.charAt(10)))
                return(true);
            else
                return(false);
        } catch (InputMismatchException erro){
            return (false);
        }
    }
    public static String imprimeCPF (String cpf){
        return(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + 
                cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
    }
    
}
