package com.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utilities.ScreenshotUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestListener implements ITestListener {

    private static final Logger log = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        log.info("STARTED: {}", result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("PASSED: {}", result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        log.error("FAILED: {}", result.getName());

        String path = ScreenshotUtil.capture(result.getName());

        log.error("Screenshot saved at: {}", path);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log.warn("SKIPPED: {}", result.getName());
    }
}