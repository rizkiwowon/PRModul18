import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import java.nio.file.Paths;

public class ExampleTest {

    public static void main(String[] args) {

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setHeadless(false)
            );

            Page page = browser.newPage();

            page.navigate("https://www.tokopedia.com/");
            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/homepage.png"))
            );
            page.getByTestId("btnHeaderLogin").click();
            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/login.png"))
            );
            page.getByTestId("email-phone-input").fill("rizkiwowon@gmail.co");
            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/input salah.png"))
            );
            page.getByTestId("email-phone-submit").click();
            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/submit salah.png"))
            );
            page.getByText("Email belum terdaftar");
            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/email_salah.png"))
            );
            page.getByText("Ubah").click();


            //page.navigate("https://www.tokopedia.com/");
            //page.getByTestId("btnHeaderLogin").click();
            page.getByTestId("email-phone-input").fill("rizkiwowon@gmail.com");
            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/homepage 2.png"))
            );
            page.getByTestId("email-phone-submit").click();
            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/submit mail.png"))
            );
            page.getByLabel("password-input").fill("tess");
            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/password salah.png"))
            );
            page.getByLabel("login-button").click();
            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/login salah.png"))
            );
            page.getByText("Kata sandi terlalu pendek, minimum 6 karakter");
            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/alert.png"))
            );
            System.out.println("gagal");

            page.screenshot(
                    new Page.ScreenshotOptions()
                            .setPath(Paths.get("screenshots/login-gagal.png"))
            );

            //page.getByLabel("password-input").fill("");
            //page.getByLabel("login-button").click();
            //page.getByText("Masukkan Kode Verifikasi");
            //page.getByAltText("Rizki");
            //page.getByPlaceholder("Cari di Tokopedia").fill("Laptop");


            //browser.close();
        }
    }
}