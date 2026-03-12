import java.time.LocalDate;

import dominio.Conteudo;
import dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
