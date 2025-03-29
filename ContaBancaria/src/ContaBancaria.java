public class ContaBancaria{
     private int idConta;
     private String agencia;
     private String numeroConta;
     private char tipo;
     private double saldo;
     private double limiteCredito;

     public ContaBancaria(int idConta, String agencia, String numeroConta, char tipo){
          this.idConta = idConta;
          this.agencia = agencia;
          this.numeroConta = numeroConta;
          this.saldo = 0;
          if (tipo == 'N'){
               this.tipo = tipo;
          } else if (tipo == 'E') {
               this.tipo = tipo;
          }

     }

     public boolean alteraLimite(double valor){
          if (tipo == 'E'){
               limiteCredito = valor;
               if (limiteCredito == 0){
                    tipo = 'N';
                    return true;
               }
          }
          return false;
     }

     public boolean alteraTipo(char tipo){
          if(this.tipo != tipo){
               this.tipo = tipo;
               if (tipo == 'N'){
                    limiteCredito = 0;
               }
          }

          return false;
     }

     public void registraDeposito(double valor){
          saldo += valor;

     }
     public boolean registraSaque(double valor) {
          if (valor <= 0) {
               return false;
          }

          if (tipo == 'N') {
               if (saldo >= valor) {
                    saldo -= valor;
                    return true;
               }
          } else if (tipo == 'E') {
               if ((saldo + limiteCredito) >= valor) {
                    saldo -= valor;
                    return true;
               }
          }

          return false;
     }

     public int getIdConta() {
          return idConta;
     }

     public String getAgencia() {
          return agencia;
     }

     public String getNumeroConta() {
          return numeroConta;
     }

     public char getTipo() {
          return tipo;
     }

     public double getSaldo() {
          return saldo;
     }

     public double getLimiteCredito() {
          return limiteCredito;
     }

     public void setTipo(char tipo) {
          this.tipo = tipo;
     }

     public void setNumeroConta(String numeroConta) {
          this.numeroConta = numeroConta;
     }

     public void setAgencia(String agencia) {
          this.agencia = agencia;
     }

     public void setIdConta(int idConta) {
          this.idConta = idConta;
     }
}