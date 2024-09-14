public class Game extends App {

    private String developer;

    private int levelCount;


    public Game(String name, double version, String developer, int levelCount) {
        super(name, version);
        this.developer = developer;
        this.levelCount = levelCount;
    }

    @Override
    public void launch() {
        System.out.println("Игра запущена");
    }

    @Override
    public void shutdown() {
        System.out.println("Игра выключена");
    }

    public void createLevel() {
        System.out.println("Уровень создан");
        levelCount += 1;
    }

    public void removeLevel() {
        System.out.println("Уровень удален");
        levelCount -= 1;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public int getLevelCount() {
        return levelCount;
    }

    public void setLevelCount(int levelCount) {
        this.levelCount = levelCount;
    }
}
