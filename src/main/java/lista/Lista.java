package lista;

/**
 *
 * @author rafael.fgoulart1
 */
public class Lista {
    private Elemento inicio, atual, aux;
    
    public boolean verificar() {
        return inicio == null;
    }
    
    public void inserir(Object obj) {
        if(verificar()){
            inicio=new Elemento(obj,null,null);
            aux=inicio;
        } else {
            atual=new Elemento(obj,null,aux);
            aux.setProx(atual);
            aux=atual;
        }
    }
    
    public void exibir() {
        Elemento e = inicio;
        while(e != null) {
            System.out.println(e.getObj());
            e = e.getProx();
        }
    }
    
    public Elemento buscar(int id) {
        Elemento e = inicio;
        Aluno a;
        while(e != null) {
            a = (Aluno)e.getObj();
            if(id == a.getId()) {
                return e;
            }
            e = e.getProx();
        }
        return null;
    }
    
    public void remover(int id) {
        Elemento e=buscar(id);
        if(e != null) {
            if(e == inicio) {
                inicio = e.getProx();
                e.setProx(null);
                inicio.setAnt(null);
            } else if(e == atual) {
                aux = e.getAnt();
                atual = aux;
                e.setAnt(null);
                atual.setProx(null);
            } else {
                e.getAnt().setProx(e.getProx());
                e.getProx().setAnt(e.getAnt());
                e.setAnt(null);
                e.setProx(null);
            }
        }
    }
    
    public int tamanho() {
        Elemento e = inicio;
        int cont = 0;
        while(e != null) {
            cont++;
            e = e.getProx();
        }
        return cont;
    }
    
    /**
     * a) Escreva um método que calcule a média da turma.
     * @return 
     */
    public double pegaMedia() {
        Elemento e = inicio;
        int tam = tamanho();
        double media = 0;
        Aluno a;
        double notas[] = new double[tam];
        
        for (int i = 0; i < tam; i++) {
            a = (Aluno) e.getObj();
            media = media + a.getNota();
            e = e.getProx();
        }
        
        media = media / tam;
        
        return media;
    }
    
    /**
     * b) Escreva um método que determine e exibe a maior e menor nota da turma.
     */
    public void maiorEMenorNota() {
        Elemento e = inicio;
        int tam = tamanho();
        double maior = 0, menor = 1000, nota;
        String nomeMa = "", nomeMe = "";
        Aluno a;
        
        for (int i = 0; i < tam; i++) {
            a = (Aluno) e.getObj();
            nota = a.getNota();
            if(nota > maior) {
                nomeMa = a.getNome();
                maior = nota;
            }
            if(nota < menor) {
                nomeMe = a.getNome();
                menor = nota;
            }
            e = e.getProx();
        }
        
        System.out.println("Maior nota: \n  Aluno: " + nomeMa + "\n  nota: " + maior);
        System.out.println("Menor nota: \n  Aluno: " + nomeMe + "\n  nota: " + menor);
    }
}