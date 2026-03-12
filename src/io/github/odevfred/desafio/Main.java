import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso especializado em Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso especializado em Python");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tudo sobre o Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JavaFred");
        bootcamp.setDescricao("O melhor bootcamp do mundo");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("================ Maria ===================");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-=+=-");
        System.out.println("Conteúdos concluidos Maria: " + devMaria.getConteudosConluidos());
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
        
        System.out.println(" ");
        System.out.println("================ João ===================");
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-=+=-");
        System.out.println("Conteúdos concluidos João: " + devJoao.getConteudosConluidos());
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
