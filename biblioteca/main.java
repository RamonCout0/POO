package biblioteca;
import biblioteca.midia;
import biblioteca.midia.Livro;
import biblioteca.midia.Revista;
import biblioteca.midia.filme;
public class main {
    public  void main(String[] args) {
        midia livro = new midia.Livro("Java POO", 2023);
        livro.exibirInfo();

        midia revista = new midia.Revista("Revista de Tecnologia", 2022);
        revista.exibirInfo();

        midia filme = new midia.filme("Aventura em Java", 2021);
        filme.exibirInfo();
    }
}

    

