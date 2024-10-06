package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public int getCargaHoraria() {

        return cargaHoraria;

    }

    @Override
    public double calcularXp() {
       
       return XP_PADRAO * cargaHoraria;
       
    }

    public void setCargaHoraria(int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;

    }

    public String toString() {

        return """
                Nome do curso: %s
                Descrição : %s
                Carga Horaria : %d
                """.formatted(getTitulo(), getDescricao(), cargaHoraria);

    }

}
