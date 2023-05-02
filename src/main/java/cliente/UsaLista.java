package cliente;
import lista.*;
/**
 *
 * @author rafael.fgoulart1
 */
public class UsaLista {
    public static void main(String[] args) {
        String nomes[] = {"Ana Maria", "Ana Clara", "Ana Letícia", "Ana Lúcia", "Ana Gomes", "Ana Fernanda", "Ana Braga", "Ana Renata", "Ana Banana", "Ana Paula", };
        String materia = "TADS";
        int notas[] = {15, 1, 6, 1, 9, 11, -4, 7, 0, 4};
        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            lista.inserir(new Aluno(nomes[i], materia, notas[i]));
        }
        
        //lista.exibir();
        
        System.out.println("A média dos alunos é: " + lista.pegaMedia() + "\n");
        lista.maiorEMenorNota();
    }
}