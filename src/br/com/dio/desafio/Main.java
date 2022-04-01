package br.com.dio.desafio;

import br.com.dio.desafio.bootcamp.Bootcamp;
import br.com.dio.desafio.bootcamp.Curso;
import br.com.dio.desafio.bootcamp.Dev;
import br.com.dio.desafio.bootcamp.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Lógica de Programação Essencial");
        curso1.setDescricao("Descrição do Curso Lógica de Programação Essencial");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Aprenda o que são Estrutura de Dados e Algoritmos");
        curso2.setDescricao("Descrição do Curso Aprenda o que são Estrutura de Dados e Algoritmos");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Agile Tester");
        mentoria.setDescricao("Descrição Mentoria Agile Tester");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Quality Assurance #1");
        bootcamp.setDescricao("Descrição Bootcamp GFT Quality Assurance #1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndreia = new Dev();
        devAndreia.setNome("Andreia");
        devAndreia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andreia: \n" + devAndreia.getConteudosInscritos());
        devAndreia.progredir();
        devAndreia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Andreia: \n" + devAndreia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Andreia: \n" + devAndreia.getConteudosConcluidos());
        System.out.println("XP:" + devAndreia.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: \n" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: \n" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João: \n" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}