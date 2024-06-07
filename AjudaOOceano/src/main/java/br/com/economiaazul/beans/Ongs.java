package br.com.economiaazul.beans;

public class Ongs {
    private int id;
    private String nome;
    private int anoFundacao;
    private String missao;
    private String sede;
    private String website;
    private String emailContato;

    // Construtor
    public Ongs(int id, String nome, int anoFundacao, String missao, String sede, String website, String emailContato) {
        this.id = id;
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.missao = missao;
        this.sede = sede;
        this.website = website;
        this.emailContato = emailContato;
    }

    // Getters e Setters
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

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    @Override
    public String toString() {
        return "\nOng{" +
                "id=" + id +
                "\nnome='" + nome +
                "\nanoFundacao=" + anoFundacao +
                "\n missao='" + missao +
                "\nsede='" + sede +
                "\nwebsite='" + website +
                "\nemailContato='" + emailContato +
                "}";
    }
}
