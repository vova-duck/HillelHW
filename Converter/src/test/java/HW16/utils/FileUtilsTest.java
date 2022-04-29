package HW16.utils;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @Test
    void check() {
        boolean answer = FileUtils.check(5.4);
        Assert.assertEquals(false,answer);
        boolean answer2 = FileUtils.check(2);
        Assert.assertEquals(true, answer2);
    }

    @Test
    void checkIn() {
        boolean answer = FileUtils.checkIn("fjgebhgfej");
        Assert.assertEquals(false, answer);
        boolean answer2 = FileUtils.checkIn("/Users/bogdanyakovenko/Downloads/Projects/16-th Homework/src/main/java/HW16/utils/FileUtils.java");
        Assert.assertEquals(true,answer2);

    }

}