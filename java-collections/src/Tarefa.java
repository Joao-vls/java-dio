public class Tarefa {
    private String description;

    Tarefa(String description){
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Tarefa{"+
                "descriçâo : "+description+'\''+'}';
    }
}
