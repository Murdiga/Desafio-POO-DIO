package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {

        this.conteudosInscritos.addAll(bootcamp.getConteudos());

        bootcamp.getDevsInscritos().add(this);

    };

    public void progredir() {

        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        if (conteudo.isEmpty()) {

            System.err.println("Você não está matriculado em nenhum conteúdo");

        }

        this.conteudosConcluidos.add(conteudo.get());

        this.conteudosInscritos.remove(conteudo.get());

    };

    public double calcularTotalXp() {

        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
        //return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularxp).sum(); <- segunda forma de realizar metodo
    };

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public Set<Conteudo> getConteudosInscritos() {

        return conteudosInscritos;

    }

    public void setConteudosInscritos(Set<Conteudo> conteudoInscritos) {

        this.conteudosInscritos = conteudoInscritos;

    }

    public Set<Conteudo> getConteudosConcluidos() {

        return conteudosConcluidos;

    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {

        this.conteudosConcluidos = conteudosConcluidos;

    }

    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return true;

        Dev dev = (Dev) o;

        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos)
                && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);

    }

    public int hashCode() {

        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);

    }

}
