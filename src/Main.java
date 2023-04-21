import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setCargaHoraria(8);
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição curso Java");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(8);
        curso2.setTitulo("curso JS");
        curso2.setDescricao("Descrição curso JS");



        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());


        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKell = new Dev();
        devKell.setNome("Kell");
        devKell.inscreverBootcamp(bootcamp);
        System.out.println("Kell - Conteúdos Incritos" + devKell.getConteudosInscritos());

        devKell.progredir();
        devKell.progredir();
        devKell.progredir();
        System.out.println("-");
        System.out.println("XP: " + devKell.calcularTotalXp());

        System.out.println("Kell - Conteúdos Incritos" + devKell.getConteudosInscritos());
        System.out.println("Kell - Conteúdos concluídos" + devKell.getConteudosConcluidos());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("João - Conteúdos Incritos" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        System.out.println("-");
        System.out.println("XP: " + devJoao.calcularTotalXp());


        System.out.println("João - Conteúdos Incritos" + devJoao.getConteudosInscritos());
        System.out.println("João - Conteúdos concluidos" + devJoao.getConteudosConcluidos());

    }
}