public class SocialNetwork extends App {

    private static int counter = 0;

    public SocialNetwork(String name, double version) {
        super(name, version);
        System.out.println("Социальная сеть создана");
        counter += 1;
    }

    public void sendMessage(String message) {
        System.out.println("Сообщение отправлено -" + message);
    }

    public void sendMessage(int message) {
        System.out.println("Сообщение отправлено -" + message);
    }

    @Override
    public void launch() {
        isEnabled = true;
        System.out.println("Сайт запущен");
    }

    @Override
    public void shutdown() {
        isEnabled = false;
        System.out.println("Сайт выключен");
    }

    public void printCounter() {
        System.out.println("Количество созданных соц.сетей - "+counter);
    }
}
