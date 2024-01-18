import java.util.HashSet;
import java.util.Set;

public class PesquisaAgenda {
   private Set<Agenda> agenda;

   public  PesquisaAgenda(){
       this.agenda=new HashSet<>();
   }
   public void setAgendaList(String nome,int numero){
       agenda.add(new Agenda(nome,numero));
   }

   public void imprimeContatos(){
       System.out.println(agenda);
   }

//   public void pesquisarNome(String nome){
//       for (Agenda a : agenda){
//           if (a.getNome().startsWith(nome)){
//               System.out.println(a);
//           }
//       }
//   }
   public Set<Agenda> pesquisarNome(String nome){
       Set<Agenda> agenda1 =new  HashSet<>();
       for (Agenda a : agenda){
           if (a.getNome().startsWith(nome)){
               agenda1.add(a);
           }
       }
       return agenda1;
   }
   public Agenda atualixarNome(int numero , String nome){
       Agenda agenda1=null;
       for (Agenda a : agenda){
           if (a.getNumero() == numero){
               a.setNome(nome);
               agenda1=a;
               break;
           }
       }
       return  agenda1;
   }

    public static void main(String[] args) {
        PesquisaAgenda pesquisaAgenda = new PesquisaAgenda();

        pesquisaAgenda.setAgendaList("nome1",119878);
        pesquisaAgenda.setAgendaList("nome2",119979);
        pesquisaAgenda.setAgendaList("nome2",119977);
        pesquisaAgenda.setAgendaList("nome4",119977);


        System.out.println(pesquisaAgenda.pesquisarNome("nome2"));
        System.out.println(pesquisaAgenda.atualixarNome(119977,"nome77"));

        pesquisaAgenda.imprimeContatos();

    }
}
