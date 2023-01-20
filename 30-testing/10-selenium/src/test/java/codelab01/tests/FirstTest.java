package codelab01.tests;

import codelab01.config.ScreenshotExtension;
import codelab01.config.TestConfig;
import codelab01.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TestConfig.class)
@ExtendWith(ScreenshotExtension.class)
public class FirstTest {

    @Autowired
    private HomePage homePage;

    @Test
    void name() {
        homePage.open().goToLogin();
    }

    @AfterEach
    void tearDown() {

    }
}
