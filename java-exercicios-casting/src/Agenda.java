import java.util.*;
public class Agenda {
    private Pessoa[] contatos=new Pessoa[50];
    private  int  quantidadeDeContatos=0;

    public void adicionarcontatos(Amigo amigo){
        contatos[quantidadeDeContatos]= amigo;
        quantidadeDeContatos+=1;
    }
    public void  adicionaContatos(Conhecido conhecido){
        contatos[quantidadeDeContatos]= conhecido;
        quantidadeDeContatos+=1;

    }



    public static void main(String[] args) {
        Agenda agenda=new Agenda();

        agenda.adicionarcontatos(new Amigo("dssd",12,"fsdfsdf"));
        agenda.adicionarcontatos(new Amigo("dssd",12,"fsdfsdf"));
        agenda.adicionaContatos(new Conhecido("asas",18,"joa@"));
        agenda.listaContatos();
        agenda.listaAmigos();
        agenda.listaConhecidos();
        agenda.imprimeAniversarios();
        agenda.imprimeEmails();

        agenda.alteraContato();

        agenda.listaContatos();
    }
    public void alteraContato(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("\nnome:");
        String nome=scanner.next();
        for (int i=0; i<quantidadeDeContatos; i++){
            if (contatos[i].getNome().equalsIgnoreCase(nome)){
                System.out.println("\nnome:");

                nome=scanner.next();
                System.out.println("\nidade:");
                int idade=scanner.nextInt();
                if (contatos[i].type()=='A'){
                    System.out.println("\nanivessario:");
                    String ani=scanner.next();
                    contatos[i]=new Amigo(nome,idade,ani);
                    break;
                }else {
                    System.out.println("\nemail:");
                    String email=scanner.next();
                    contatos[i]=new Conhecido(nome,idade,email);
                    break;
                }

            }
        }
    }
    public void listaContatos(){
        for (int i=0; i<quantidadeDeContatos; i++){
            System.out.println(contatos[i]);
        }
    }
    public void listaConhecidos(){
        for (int i=0; i<quantidadeDeContatos; i++){
            if (contatos[i].type()=='C')
                System.out.println(contatos[i]);
        }
    }
    public void listaAmigos(){
        for (int i=0; i<quantidadeDeContatos; i++){
            if (contatos[i].type()=='A')
                System.out.println(contatos[i]);
        }
    }
    public void imprimeAniversarios(){
        for (int i=0; i<quantidadeDeContatos; i++){
            if (contatos[i].type()=='A') {
                Amigo amigo =(Amigo) contatos[i];
                System.out.println(amigo.getAnivessario());
            }
        }
    }
    public void imprimeEmails(){
        for (int i=0; i<quantidadeDeContatos; i++){
            if (contatos[i].type()=='C') {
                Conhecido amigo =(Conhecido) contatos[i];
                System.out.println(amigo.getEmail());
            }
        }
    }
}
