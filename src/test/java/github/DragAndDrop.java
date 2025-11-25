package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    public void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDrop(to($("#column-b")));
        $("#column-a").shouldHave(text("b"));
        $("#column-b").shouldHave(text("a"));
    }
}
