public class Cpf {
    public static void main(String[] args)  {
        try {
            String cpf= formatarCpf("12345678912");
            System.out.println(cpf);
        } catch (CpfInvalidoException e) {
            System.out.println("cpf invalido para ser formatado");
        }


    }
    static String formatarCpf (String cpf) throws CpfInvalidoException{
        if (cpf.length()!=11){
            throw new CpfInvalidoException();
        }
        return  cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    }

}

class CpfInvalidoException extends Exception{

}
