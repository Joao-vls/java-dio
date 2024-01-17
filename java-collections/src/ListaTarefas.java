import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;



    public ListaTarefas(){
        this.tarefaList=new ArrayList<>();
    }

    public void setTarefaList(String description){
        tarefaList.add(new Tarefa(description));
    }

    public void removeTarefaList(String desc){
        List <Tarefa> cloneRemove = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescription().equalsIgnoreCase(desc)){
                cloneRemove.add(t);
            }
        }
        tarefaList.removeAll(cloneRemove);
    }

    public int totalTarefa(){
        return tarefaList.size();
    }

    public Object returnAllTarefas(){
        return tarefaList;
    }
}
