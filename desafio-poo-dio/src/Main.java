
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();

        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Curso 1");
        curso.setDescricao("Este é sobre Java");
        curso.setCargaHoraria(10);

        mentoria.setTitulo("Mentoria 1");
        mentoria.setDescricao("Mentoria sobre POO");
        mentoria.setData(LocalDate.now());

        /*
         * System.out.println(curso);
         * 
         * System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp JavaDeveloper");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();

        dev.setNome("Guilherme Murdiga");

        dev.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Dev 1" + dev.getConteudosInscritos() + "\n");

        dev.progredir();

        dev.progredir();

        System.out.println("Conteudos Inscritos Dev 1" + dev.getConteudosInscritos() + "\n");

        System.out.println("Conteudos Concluidos Dev 1" + dev.getConteudosConcluidos() + "\n");

        System.out.println("XP Dev 1: " + dev.calcularTotalXp() + "\n");

        System.out.println("*-----------------------------------------------*");

        Dev dev2 = new Dev();

        dev2.setNome("Leonardo");

        dev2.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Dev 2" + dev2.getConteudosInscritos() + "\n");

        dev2.progredir();

        System.out.println("Conteudos Inscritos Dev 2" + dev2.getConteudosInscritos() + "\n");

        System.out.println("Conteudos Concluidos Dev 2" + dev2.getConteudosConcluidos() + "\n");

        System.out.println("XP Dev 2: " + dev2.calcularTotalXp() + "\n");

    }

}
