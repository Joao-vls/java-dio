import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bloquearContato("NOMe1");
        desbloqueraContato("NOMe3");

        Constructor<AgendaSingletonEAGER> reflection=AgendaSingletonEAGER.class.getDeclaredConstructor();
        reflection.setAccessible(true);
        AgendaSingletonEAGER acessoPrivado=reflection.newInstance();
        System.out.println(acessoPrivado);

//        Constructor<AgendaSingletonEnumEAGER> reflectionEnum=AgendaSingletonEnumEAGER.class.getDeclaredConstructor();
//        reflection.setAccessible(true);
//        AgendaSingletonEAGER acessoPrivadoEnum=reflection.newInstance();
//        System.out.println(acessoPrivado);
    }
    static void bloquearContato(String nome){
        AgendaSingletonEAGER agenda =AgendaSingletonEAGER.getInstance();
        System.out.println(agenda);
        agenda.bloqueia(nome);
        System.out.println(agenda.getContatosMap());
    }
    static void desbloqueraContato(String nome){
        AgendaSingletonEAGER agenda =AgendaSingletonEAGER.getInstance();
        System.out.println(agenda);
        agenda.desbloqueia(nome);
        System.out.println(agenda.getContatosMap());
    }

}