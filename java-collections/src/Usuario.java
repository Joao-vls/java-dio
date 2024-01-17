public class Usuario {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.setTarefaList("um");

        System.out.println(listaTarefas.returnAllTarefas()+""+listaTarefas.totalTarefa());
    }
}
