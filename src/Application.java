/**
 * Created by yousufbhuiyan on 5/10/17.
 */
public class Application {

    public static void main(String[] args) {
        Calculator_e2e calc = new Calculator_e2e();

        JWPlayer jw = new JWPlayer();
        jw.jwHomePage();
        jw.navgateToPalyersPage();
        jw.loadExamplePlayers();
        jw.changePlayersProprities();
        jw.changePlayerRatio();
        jw.clickSaveChangeButton();
        jw.navgateToPalyersPage();
        jw.getThePlayerModifiedName();

        System.out.println("Test run successfully");
    }
}
