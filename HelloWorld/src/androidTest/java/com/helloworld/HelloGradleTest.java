package com.helloworld;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.helloworld.HelloGradleTest \
 * com.helloworld.tests/android.test.InstrumentationTestRunner
 */
public class HelloGradleTest extends ActivityInstrumentationTestCase2<HelloGradle> {

    public HelloGradleTest() {
        super("com.helloworld", HelloGradle.class);
    }

}
