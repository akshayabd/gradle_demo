/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.gradlelab;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    /*@Test void writeToResourcesDir() throws IOException {
        Random rand = new Random();
        int timeTaken = rand.nextInt(1000000);

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("test_data.txt").getFile());
        String outputFilePath = file.getAbsolutePath().replace("test_data", "output");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath.toString()));
        writer.write("Time taken: " + timeTaken + " seconds");
        writer.close();
    }*/
}
