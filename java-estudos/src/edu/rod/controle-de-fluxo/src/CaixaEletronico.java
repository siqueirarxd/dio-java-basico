public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 10.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println("Saque efetuado.");
        } else 
            System.out.println("Saldo Insuficiente.");
        
        System.out.println("Saldo: R$ " + saldo);
    }
}
