public class Principal {
    public static void main(String[] args) {
        ConfiguracaoAPP d1, d2;
        d1 = ConfiguracaoAPP.getInstance();
        d2 = ConfiguracaoAPP.getInstance();
        System.out.println(d1);
        System.out.println(d2);
 ----------------------------------
    Notificacao notificacao = NotificacaoFactory.criarNotificacao("WHATSAPP");
    notificacao.enviar("Olá! Mensagem enviada!");




    }
}
