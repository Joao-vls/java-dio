import java.util.HashMap;
import java.util.Map;

public enum AgendaSingletonEnumEAGER {
    INSTANCE;
    private Map<String,Boolean> contatosMap=new HashMap<>();

    private AgendaSingletonEnumEAGER(){
        contatosMap.put("NOMe1",Boolean.TRUE);
        contatosMap.put("NOMe0",Boolean.TRUE);
        contatosMap.put("NOMe2",Boolean.TRUE);
        contatosMap.put("NOMe3",Boolean.FALSE);
    }

    public static AgendaSingletonEnumEAGER getInstance(){
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
