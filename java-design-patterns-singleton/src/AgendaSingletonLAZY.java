import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {
    private Map<String,Boolean> contatosMap=new HashMap<>();
    private static  AgendaSingletonLAZY INSTANCE=null;

    private AgendaSingletonLAZY(){
        contatosMap.put("NOMe1",Boolean.TRUE);
        contatosMap.put("NOMe0",Boolean.TRUE);
        contatosMap.put("NOMe2",Boolean.TRUE);
        contatosMap.put("NOMe3",Boolean.FALSE);
    }

    public static AgendaSingletonLAZY getInstance(){
        if (Objects.isNull(INSTANCE)){
            INSTANCE=new AgendaSingletonLAZY();
        }
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
