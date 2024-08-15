public class ContatoInexistenteException extends Exception {
    public ContatoIncexistenteException(String msg){
    super(msg);}
    public ContatoInexistenteException{
        super("Este contato não existe.");
    }
}
