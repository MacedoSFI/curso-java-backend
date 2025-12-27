public class ConfiguracaoAPP {
    private static ConfiguracaoAPP instance;
    private ConfiguracaoAPP() {

    }
    public static synchronized ConfiguracaoAPP getInstance() {
        if (instance == null) {
            instance = new ConfiguracaoAPP();
        }
        return instance;
    }
}
