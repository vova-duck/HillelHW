package HW16.cprocessor;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToJsonTest {

    @Test
    void convertYamlToJson() throws JsonProcessingException {
        String kiko = ConvertToJson.convertYamlToJson("Doggy");
        Assert.assertEquals("\"Doggy\"", kiko);
    }
}