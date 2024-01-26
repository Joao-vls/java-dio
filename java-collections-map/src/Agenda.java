import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String,Integer> contatosMap;

    public Agenda(){
        this.contatosMap= new HashMap<>();
    }

    public void  setContatosMap(String nome,Integer numero){
        contatosMap.put(nome,numero);
    }

    public  void removerContatos(String nome){
        if (!contatosMap.isEmpty()){
            contatosMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(contatosMap);
    }

    public Integer pesquisaNome(String nome){
        Integer numero=null;
        if (!contatosMap.isEmpty()){
            numero=contatosMap.get(nome);
        }
        return numero;
    };

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.setContatosMap("www",123);
        agenda.setContatosMap("awww",124);
        agenda.setContatosMap("www",128);
        agenda.setContatosMap("cwww",127);

        agenda.exibirContato();
        agenda.removerContatos("www");
        agenda.exibirContato();
        System.out.println(agenda.pesquisaNome("cwww"));
    }
}
