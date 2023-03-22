/**
 * Pessoa
 */
public abstract class Pessoa {
    private Pessoa chefe;
    private String nome;
   
    
    public Pessoa(String nome, Pessoa chefe) {
        this.nome = nome;
        this.chefe = chefe;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setChefe(Pessoa chefe) {
        this.chefe = chefe;
    }
    public Pessoa getChefe() {
        return chefe;
    }

    public abstract void getListaEmpregadosAssociados();
    
}


/*
 *Escreva um programa orientado a objetos para cadastrar pessoas que trabalham em uma empresa onde o chefe maior é seu Antonio Carlos Pereira. As pessoas que trabalham nesta empresa podem ser chefes que têm empregados e outros chefes sob sua supervisão ou então empregados. As classes Pessoa, Empregado, Chefe e Empresa devem ser implementadas. 
O método getListaEmpregadosAssociados (), da classe Pessoa é abstrato e precisa ser implementado por você nas subclasses. 

Com este método é possível mostrar a lista dos empregados subordinados (diretos e indiretos) desta Pessoa. Toda pessoa deve ser capaz de informar a lista dos empregados sobre sua supervisão, bem como a lista de seus superiores. Os empregados subordinados são aqueles que são empregados diretos de subordinados da Pessoa. Toda Pessoa possui um superior, que também é do tipo pessoa.
 */