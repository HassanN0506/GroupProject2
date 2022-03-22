package com.syntax.groupExercise2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome");
    }

    @Override
    public String getTitle() {
        return "Chrome is getting title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome is taking a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating Chrome");
    }
}

class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox");
    }

    @Override
    public String getTitle() {
        return "Firefox is getting title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox is taking a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating Firefox");
    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari");
    }

    @Override
    public String getTitle() {
        return "Safari is getting title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari is taking a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating Safari");
    }
}