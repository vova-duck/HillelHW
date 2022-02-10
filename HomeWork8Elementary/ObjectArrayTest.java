package HomeWork8Elementary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectArrayTest {

    @Test
    void testAddObj() {
        ObjectArray array = new ObjectArray();
        array.add("dog");
        assertEquals("dog",array.get(0));
    }


    @Test
    void testAddObjIndex() {
        ObjectArray array = new ObjectArray();
        array.add("что-то");
        array.add("что-то");
        array.add("что-то");
        array.add("что-то");
        array.add("что-то");
        array.add(1,"что");
        assertEquals(6, array.size());
        assertEquals("что", array.get(1));
    }

    @Test
    void testDelete() {
        ObjectArray array = new ObjectArray();
        array.add("красный");
        array.add("оранжевый");
        array.add("желтый");
        array.add("зелёный");
        array.add("голубой");
        array.add("синий");
        array.add("фиолетовый");
        array.delete("оранжевый");
        assertEquals("желтый", array.get(1));

    }

    @Test
    void testGet() {
        ObjectArray array = new ObjectArray();
        array.add("красный");
        array.add("оранжевый");
        array.add("желтый");
        array.add("зелёный");
        array.add("голубой");
        array.add("синий");
        array.add("фиолетовый");
        assertEquals("оранжевый", array.get(1));

    }

    @Test
    void contain() {
        ObjectArray array = new ObjectArray();
        array.add("красный");
        array.add("оранжевый");
        array.add("желтый");
        array.add("зелёный");
        array.add("голубой");
        array.add("синий");
        array.add("фиолетовый");
        assertTrue(array.contain("оранжевый"));
        assertEquals(false, array.contain("orange"));
    }

    @Test
    void testEquals() {
        ObjectArray array = new ObjectArray();
        ObjectArray array1 = new ObjectArray();
        ObjectArray array2 =new ObjectArray();
        array.add("красный");
        array.add("оранжевый");
        array.add("желтый");
        array.add("зелёный");
        array.add("голубой");
        array.add("синий");
        array.add("фиолетовый");
        array1.add("один");
        array1.add("два");
        array1.add("три");
        array1.add("четыре");
        array1.add("пять");
        array1.add("шесть");
        array1.add("семь");
        array2.add("красный");
        array2.add("оранжевый");
        array2.add("желтый");
        array2.add("зелёный");
        array2.add("голубой");
        array2.add("синий");
        array2.add("фиолетовый");
     assertEquals(false,array.equals(array1));
        assertTrue(array.equals(array2));
    }

    @Test
    void clear() {
        ObjectArray array = new ObjectArray();
        array.add("красный");
        array.add("оранжевый");
        array.add("желтый");
        array.add("зелёный");
        array.add("голубой");
        array.add("синий");
        array.add("фиолетовый");
        array.clear();
        assertEquals(0,array.size());

    }

    @Test
    void size() { ObjectArray array = new ObjectArray();
        array.add("красный");
        array.add("оранжевый");
        array.add("желтый");
        array.add("зелёный");
        array.add("голубой");
        array.add("синий");
        array.add("фиолетовый");
        assertEquals(7,array.size());
        
    }
}