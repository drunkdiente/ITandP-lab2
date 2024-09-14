public abstract class App {

    private String name;

    private double version;

    protected boolean isEnabled;

    public App(String name, double version) {
        this.name = name;
        this.version = version;
        this.isEnabled = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }


    public abstract void launch();

    public abstract void shutdown();
}
