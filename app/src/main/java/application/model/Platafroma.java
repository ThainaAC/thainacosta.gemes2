package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="plataformas")
public class Platafroma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Set<Jogo> getJogos() {
        return jogos;
    }


    public void setJogos(Set<Jogo> jogos) {
        this.jogos = jogos;
    }


    private String nome;


    private Set<Jogo> jogos = new HashSet <>();
    
}
