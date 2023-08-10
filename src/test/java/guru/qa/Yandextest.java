package guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Yandextest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy="eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void Yandextest() {
        Selenide.open("https://ya.ru");
        //test conflict
    }
}