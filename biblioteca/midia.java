package biblioteca;

public abstract class  midia {


public abstract void exibirInfo();
public abstract String getTitulo();
public abstract int getAno();


class Livro extends midia {
    private String titulo;
    private int ano;

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Livro: " + titulo + ", Ano: " + ano);
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public int getAno() {
        return ano;
    }
}

class Revista extends midia {
    private String titulo;
    private int ano;

    public Revista(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Revista: " + titulo + ", Ano: " + ano);
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public int getAno() {
        return ano;
    }



}

class filme extends midia {
    private String titulo;
    private int ano;

    public filme(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Filme: " + titulo + ", Ano: " + ano);
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public int getAno() {
        return ano;
    }

        class lista extends midia() {
        public void listarMidias(midia[] midias) {
            for (midia m : midias) {
                m.exibirInfo();
            }
        }
    }
}

 public void main(String[] args) {
        Livro livro = new Livro("Java POO", 2023);
        livro.exibirInfo();

        Revista revista = new Revista("Revista de Tecnologia", 2022);
        revista.exibirInfo();

        filme filme = new filme("Aventura em Java", 2021);
        filme.exibirInfo();
    }
    
}


