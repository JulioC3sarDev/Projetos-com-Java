import java.text.SimpleDateFormat;
import java.util.Date;

public class Orcamento{
    private int nrOrcamento;
    private Date data;
    private String nomeContato;
    private String telefoneContato;
    private double valor;
    private char situacao;

    public Orcamento(int nrOrcamento, String nomeContato, String telefoneContato) {
        this.nrOrcamento = nrOrcamento;
        this.data = new Date();
        this.nomeContato = nomeContato;
        this.telefoneContato = telefoneContato;
        this.situacao = '1';
    }
    public String getDataFormatada() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }

    public boolean registrarValor(double valor) {
        if (situacao == '1') {
            this.valor = valor;
            this.situacao = '2';
            return true;
        }
        return false;
    }
    public boolean definirExecucao(char decisao){
        if (situacao == '2') {
            if (decisao == 'A' || decisao == 'a') {
                situacao = '3';
                return true;
            }
            else if (decisao == 'R' || decisao == 'r') {
                situacao = '4';
                return true;
            }
        }
        return true;
    }
    public char avancar(){
        if (situacao == '3') {
            situacao = '5';
            return this.situacao;
        }else if (situacao == '4') {
            situacao = '0';
            return this.situacao;
        }else if (situacao == '5') {
            situacao = '9';
            return this.situacao;
        }
        return '0';
    }

    public int getNrOrcamento() {
        return nrOrcamento;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public double getValor() {
        return valor;
    }

    public char getSituacao() {
        return situacao;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

}