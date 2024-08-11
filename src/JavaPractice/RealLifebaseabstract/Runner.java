package JavaPractice.RealLifebaseabstract;

public class Runner {
    public static void main(String[] args) {
        ChromeBrowser Chrome = new ChromeBrowser();
        String s = Chrome.ChromeBrowser("Chrome");
        System.out.println(s);

        FireFox Firfox = new FireFox();
        String f = Chrome.FirefoxBfrowser("open Firefox");
    }
}
