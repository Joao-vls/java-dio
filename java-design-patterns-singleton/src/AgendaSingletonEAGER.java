import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER {
    private Map<String,Boolean> contatosMap=new HashMap<>();
    private static final AgendaSingletonEAGER INSTANCE=new AgendaSingletonEAGER();

    private AgendaSingletonEAGER(){
        contatosMap.put("NOMe1",Boolean.TRUE);
        contatosMap.put("NOMe0",Boolean.TRUE);
        contatosMap.put("NOMe2",Boolean.TRUE);
        contatosMap.put("NOMe3",Boolean.FALSE);
    }

    public static AgendaSingletonEAGER getInstance(){
        return INSTANCE;
    }

    public Map<String, Boolean> getContatosMap() {
        return contatosMap;
    }
    void bloqueia(String nome){
        contatosMap.replace(nome,Boolean.FALSE);
    }
    void desbloqueia(String nome){
        contatosMap.replace(nome,Boolean.TRUE);
    }
}
