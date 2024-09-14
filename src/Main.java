import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocialNetwork vk = new SocialNetwork("VKontakte",1.0);
        vk.launch();
        vk.sendMessage("Hello World");
        System.out.println(vk.getName());
        vk.printCounter();
        SocialNetwork telegram = new SocialNetwork("Telegram",1.12);
        telegram.printCounter();

        System.out.println("");

        Game hedonisticBlood = new Game("Hedonistic Blood",1.0,"MelvuzeStudio",2);
        System.out.println(hedonisticBlood.getLevelCount());
        hedonisticBlood.launch();
        hedonisticBlood.removeLevel();
        System.out.println(hedonisticBlood.getLevelCount());
        hedonisticBlood.setDeveloper("KingGnom");
        System.out.println(hedonisticBlood.getDeveloper());

        System.out.println("");

        Weather weatherNews = new Weather("Weather News",2.0,"Moscow","10.09.26",25.3);
        weatherNews.launch();
        System.out.println(weatherNews.getTemperature());
        System.out.println(weatherNews.getCity());
        weatherNews.shutdown();
    }
}