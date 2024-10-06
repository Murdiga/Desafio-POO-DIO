package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;


    public LocalDate getData(){

        return data;

    }

    public void setData(LocalDate data){

        this.data = data;

    }

    @Override
    public double calcularXp() {
        
        return XP_PADRAO + 20;

    }

    public String toString(){

        return """
                Titulo Mentoria : %s
                Descrição : %s
                """.formatted(getTitulo(), getDescricao())
                + "Data : " + data;

    }

}
