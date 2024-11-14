package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        WebDriverManager.chromedriver().setup();git remote add origin https://github.com/Arushitester/demo.git

        driver.get("https://www.amazon.in");
        String act  =driver.getTitle();
        if(act.equals("amazon.in"))
        {
            System.out.println("Right title");

        }
        else {

            System.out.println("Wrong title");
        }
    }
}