public class SearchTest {
    @Test
    void successfulSearchTest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }
}
