import br.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.alura.screenmatch.calculo.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filmeJulio = new Filme();
        filmeJulio.setNome("Carros");
        filmeJulio.setAnoDeLancamento(2022);
        filmeJulio.setDuracaoEmMinutos(180);
        System.out.println("A duração do filme: " + filmeJulio.getDuracaoEmMinutos());


        filmeJulio.exibeFichaTecnica();
        filmeJulio.avalia(8);
        filmeJulio.avalia(5);
        filmeJulio.avalia(10);


        System.out.println("Esse é o total de avaliações: " + filmeJulio.getTotalDeAvaliacao());
        System.out.println(filmeJulio.pegaMedia());

        Serie serieJulio = new Serie();
        serieJulio.setNome("Lost");
        serieJulio.setAnoDeLancamento(2022);
        serieJulio.exibeFichaTecnica();
        serieJulio.setTemporadas(10);
        serieJulio.setEpisodiosPorTemporada(10);
        serieJulio.setMinutosPorEpisodio(50);
        System.out.println("A duração da serie: " + serieJulio.getDuracaoEmMinutos());

        Filme filmeDois = new Filme();
        filmeDois.setNome("Avatar");
        filmeDois.setAnoDeLancamento(2023);
        filmeDois.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeJulio);
        calculadora.inclui(filmeDois);
        calculadora.inclui(serieJulio);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(filmeJulio);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serieJulio);
        episodio.setTotalDeVizualizacoes(300);
        filtro.filtra(episodio);
    }

}