import java.io.Serializable;

public class Contato implements Serializable {
    private String nome;
    private int diaAniversario;
    private int mesAniversario;
    public Contato(String nome, int diaAniversario, int mesAniversario){
        this.nome=nome;
        this.diaAniversario=diaAniversario;
        this.mesAniversario=mesAniversario;
    }
    public String getNome(){return nome;}
}
