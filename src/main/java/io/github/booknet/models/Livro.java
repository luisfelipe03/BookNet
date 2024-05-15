package io.github.booknet.models;

import io.github.booknet.utils.Generos;
import io.github.booknet.utils.Status;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity // Indica que a classe é uma entidade JPA
public class Livro {

    @Id // Indica que o campo abaixo é a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia de geração de ID automático
    private long id; // Identificador único do livro

    private String titulo; // Título do livro
    private String autor; // Nome do autor do livro
    private String editora; // Editora do livro
    private int ano; // Ano de publicação do livro

    @Enumerated(EnumType.STRING) // Mapeia a enumeração para ser armazenada como uma string
    private Generos genero; // Gênero do livro

    private String idioma; // Idioma do livro

    @OneToOne // Indica a relação um-para-um com a classe Avaliacao
    private Avaliacao avaliacao; // Avaliação do livro

    private int paginas; // Número de páginas do livro
    private double preco; // Preço do livro
    private Date inicioLeitura; // Data de início da leitura do livro
    private Date fimLeitura; // Data de término da leitura do livro

    @Enumerated(EnumType.STRING) // Mapeia a enumeração para ser armazenada como uma string
    private Status status; // Status do livro



    public Livro() {
    }

    public Livro(String titulo, String autor, String editora, int ano, Generos genero, String idioma, int paginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.genero = genero;
        this.idioma = idioma;
        this.paginas = paginas;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Date getInicioLeitura() {
        return inicioLeitura;
    }

    public void setInicioLeitura(Date inicioLeitura) {
        this.inicioLeitura = inicioLeitura;
    }

    public Date getFimLeitura() {
        return fimLeitura;
    }

    public void setFimLeitura(Date fimLeitura) {
        this.fimLeitura = fimLeitura;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return id == livro.id && ano == livro.ano && paginas == livro.paginas && Double.compare(preco, livro.preco) == 0 && Objects.equals(titulo, livro.titulo) && Objects.equals(autor, livro.autor) && Objects.equals(editora, livro.editora) && genero == livro.genero && Objects.equals(idioma, livro.idioma) && Objects.equals(avaliacao, livro.avaliacao) && Objects.equals(inicioLeitura, livro.inicioLeitura) && Objects.equals(fimLeitura, livro.fimLeitura) && status == livro.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, autor, editora, ano, genero, idioma, avaliacao, paginas, preco, inicioLeitura, fimLeitura, status);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", ano=" + ano +
                ", genero=" + genero +
                ", idioma='" + idioma + '\'' +
                ", avaliacao=" + avaliacao +
                ", paginas=" + paginas +
                ", preco=" + preco +
                ", inicioLeitura=" + inicioLeitura +
                ", fimLeitura=" + fimLeitura +
                ", status=" + status +
                '}';
    }
}
