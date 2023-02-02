package codelab01.suite.tests;

import codelab01.extension.ScreenshotExtension;
import codelab01.config.TestConfig;
import codelab01.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TestConfig.class)
@ExtendWith(ScreenshotExtension.class)
public class SecondTest {

    @Autowired
    private HomePage homePage;

    @Test
    void name() {
        homePage.open()
                .goToLogin()
                .throwError();
    }

    @Test
    void name2() {
        homePage.open()
                .goToLogin();;
    }


}
