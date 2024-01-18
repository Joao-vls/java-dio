import java.util.HashSet;
import java.util.Set;


public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet=new HashSet<>();
    }
    public void setConvidadoList(String nome,int id){
        convidadoSet.add(new Convidado(nome,id));
    }

    public void removerConvidado(int id){
        for (Convidado c : convidadoSet){
            if (id==c.getId()){
                convidadoSet.remove(c);
            }
        }
    }
    public  int totalConvidados(){
        return convidadoSet.size();
    }

    public void imprimeConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.setConvidadoList("jj7",1);
        convidados.setConvidadoList("jj5",2);
        convidados.setConvidadoList("jj4",2);

        convidados.imprimeConvidados();
    }

}
