package codelab01.config;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class ScreenshotExtension implements TestWatcher {

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        WebDriver driver = SpringExtension.getApplicationContext(context).getBean(WebDriver.class);
        Optional<File> screenshotFile = getScreenshotFile(driver);
        screenshotFile.ifPresent(screenshot -> copy(screenshot, getDestinationFile(context)));
    }

    private File getDestinationFile(ExtensionContext context) {
        new File("target/selenium").mkdirs();
        return new File("target/selenium/" + getFileName(context));
    }

    private String getFileName(ExtensionContext context) {
        return context.getRequiredTestClass().getSimpleName() + "-" + context.getRequiredTestMethod().getName() + "-screenshot.png";
    }

    private void copy(File originalFile, File destinationFile) {
        try {
            FileCopyUtils.copy(originalFile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Optional<File> getScreenshotFile(WebDriver driver) {
        if (driver instanceof TakesScreenshot) {
            return Optional.of(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
        }
        return Optional.empty();
    }

}
