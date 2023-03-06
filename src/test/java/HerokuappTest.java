import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class HerokuappTest {
    @Test
    void hoverTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement elementA = $("#column-a");
        elementA.dragAndDropTo($("#column-b"));
        elementA.shouldHave(exactText("B"));

    }
}
