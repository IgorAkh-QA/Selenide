package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class BestSelenideContribtor {
 @Test
    void solntsevShoulbBeTheTopContributor() {
  //Изменить конфигурацию окна браузера - разрешение
  Configuration.browserSize="1000x800";
     //открыть страницу репозитория селенида
     open("https://github.com/selenide/selenide");
     //подвести мышку к первому аватару в блоке контрибюторов
     $(".BorderGrid").$(Selectors.byText("Contributors")).ancestor(".BorderGrid-row")
             .$$("ul li").first().hover();
     sleep (6000);

     //проверка в диалоговом окне есть текст Andrei Solntsev
     //hover можно поймать запаузив страницу, в консоли браузера setTimeout(function(){debugger;},4000)
     $$(".Popover .Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));
 }
}
