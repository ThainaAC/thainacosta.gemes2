package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "plataformas")
public class Plataforma {
    private int id;
    private String nome;

    @ManyToMany(mappedBy = "plataformas")
    private Set<Jogo> jogos = new HashSet<>();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<Jogo> getJogos() {
        return jogos;
    }
}
