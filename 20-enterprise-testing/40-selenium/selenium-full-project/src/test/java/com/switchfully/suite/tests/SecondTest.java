package com.switchfully.suite.tests;

import com.switchfully.extension.ScreenshotExtension;
import com.switchfully.config.TestConfig;
import com.switchfully.pages.HomePage;
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
