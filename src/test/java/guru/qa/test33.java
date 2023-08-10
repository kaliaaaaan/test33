package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class test33 {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy="eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        open("/text-box");

        $("#userName").setValue("Nikolay");
        $("#userEmail").setValue("kalian48881@ya.ru");
        $("#currentAddress").setValue("Russia");
        $("#permanentAddress").setValue("Moscow");
        $("#submit").click();

//        $("#output").$("#name").shouldHave(text("Nikolay"));
        $("#output #name").shouldHave(text("Nikolay"));
        $("#output #email").shouldHave(text("kalian48881@ya.ru"));
        $("#output #currentAddress").shouldHave(text("Russia"));
        $("#output #permanentAddress").shouldHave(text("Moscow"));
    }
}