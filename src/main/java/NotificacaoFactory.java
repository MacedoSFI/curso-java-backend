public class NotificacaoFactory {
    public static Notificacao criarNotificacao(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            return null;
        }
        return switch (tipo.toUpperCase()) {
            case "EMAIL" -> new EmailNotificacao();
            case "SMS" -> new SMSNotificacao();
            case "WHATSAPP" -> new WHATSAPPNotificacao();
            default -> throw new
                    IllegalArgumentException("Tipo de notificação desconhecido");
        };
    }
}
