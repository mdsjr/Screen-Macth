package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

import static java.util.Collection.*;


public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoPaulo = new Filme("DogVille", 2003);

        Serie lost = new Serie("Lost",2000);

        List<Titulo> lista = new  LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

       for (Titulo item : lista) {
           System.out.println(item.getNome());
           if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Filme com classificação maior que 2" + filme.getClassificacao());
           }
       }

       ArrayList<String> buscaPorArtista = new ArrayList<>();
       buscaPorArtista.add("Al Pacino");
       buscaPorArtista.add("Marlon Brando");
       buscaPorArtista.add("James Cameron");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        Collections.sort(lista);

        System.out.println("Lista de filmes ordenados");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("ordenando por ano");
        System.out.println(lista);







    }
}
