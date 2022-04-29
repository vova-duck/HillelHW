package HW16.cprocessor;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToYamlTest {

    @Test
    void convertYamlToJson() throws JsonProcessingException {
        String kiko = ConvertToJson.convertYamlToJson("69");
        Assert.assertEquals("69",kiko);
    }
}