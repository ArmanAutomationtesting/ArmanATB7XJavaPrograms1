package JavaPractice.RealLifebaseabstract;

public class ChromeBrowser extends BaseClass {

    @Override
    String ChromeBrowser(String Browser) {
        System.out.println("Open Chrome browser");
        return Browser;
    }

    @Override
    String FirefoxBfrowser(String Browser) {
        System.out.println("Open Firefox browser");
        return Browser;
    }
}
