import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascrip");
        curso2.setDescricao("Descrição do curso javascript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Mentoria sobre java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarlos = new Dev();
        devCarlos.setName("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Wander:" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Wander:" + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Wander:" + devCarlos.getConteudosConcluidos());
        System.out.println("XP:" + devCarlos.calcularTotalXp());

        System.out.println("------------");

        Dev devAna = new Dev();
        devAna.setName("Maria");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Ana:" + devAna.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXp());
    }
}
