package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConluido = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudoConluido() {
        return conteudoConluido;
    }

    public void setConteudoConluido(Set<Conteudo> conteudoConluido) {
        this.conteudoConluido = conteudoConluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome)
                && Objects.equals(conteudosInscritos, dev.conteudosInscritos)
                && Objects.equals(conteudoConluido, dev.conteudoConluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudoConluido);
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {}

    public void progredir() {}

    public void calcularTotalXp() {}

}
