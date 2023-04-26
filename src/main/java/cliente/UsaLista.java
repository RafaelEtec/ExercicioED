package cliente;
import lista.*;
/**
 *
 * @author rafael.fgoulart1
 */
public class UsaLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Aluno("Ana Maria", "TADS", 2));
        lista.inserir(new Aluno("Ana Clara", "TADS", 5));
        lista.inserir(new Aluno("Ana Letícia", "TADS", 11));
        lista.inserir(new Aluno("Ana Lúcia", "TADS", 3));
        
        System.out.println("A média dos alunos é: " + lista.pegaMedia());
        lista.maiorEMenorNota();
    }
}