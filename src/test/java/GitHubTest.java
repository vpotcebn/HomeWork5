import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTest {
    @Test
    void hoverTest() {
        open("https://github.com/");
        $(".Header-old").$(byText("Solutions")).hover();
        $("[href='/enterprise']").click();
        $(".enterprise-hero").shouldHave(text("Build like the best"));
    }
}
