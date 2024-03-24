import com.example.lab5.Item;
import com.example.lab5.ItemManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ItemTest {
    List<Item> items = new ArrayList<>();
    ItemManager newItem = new ItemManager();


// Add
    @Test
    public void testAdd1() {
        Assertions.assertTrue(newItem.addItems(new Item(1, "Aooo dep")));
    }
    @Test
    public void testAdd2() {
        Assertions.assertTrue(newItem.addItems(new Item(2, "Cuong")));
    }
    @Test
    public void testAdd3() {
        Assertions.assertTrue(newItem.addItems(new Item(3, "Cuongggggggggggggggg")));
    }

    @Test
    public void testAdd4() {
        Assertions.assertTrue(newItem.addItems(new Item(3, "Syyyyyyyyyyyyyyyyyyyyyyyyyyyyaaaaaa")));
    }

    @Test
    public void testAdd5() {
        Assertions.assertFalse(newItem.addItems(new Item(4, "Cuongggggggggggggggggggggggggggggggggfaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")));
    }
    @Test
    public void testAdd6() {
        Assertions.assertFalse(newItem.addItems(new Item(5, "Cuongggggggggggggggggggggggggggggggggffaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaeeeee")));
    }
    @Test
    public void testAddCharacters1() {
        Assertions.assertFalse(newItem.addItems(new Item(6, "####@@@@")));
    }

    @Test
    public void testAddNumber1() {
        Assertions.assertFalse(newItem.addItems(new Item(7, "123456")));
    }
    @Test
    public void testAddNumberCharacters1() {
        Assertions.assertFalse(newItem.addItems(new Item(8, "123456###")));
    }
    @Test
    public void testAddNumberName() {
        Assertions.assertFalse(newItem.addItems(new Item(9, "12345aaaa")));
    }
    @Test
    public void testAddCharactersName() {
        Assertions.assertFalse(newItem.addItems(new Item(10, "#####aaaa")));

    }



    // Update
    @Test
    public void testUpdate() {
        newItem.addItems(new Item(1, "Anh dep"));
        newItem.updateItem(1, "Anh nen dep");
        Assertions.assertEquals("Anh nen dep", newItem.getAllItems().get(0).getName());
    }
    @Test
    public void testUpdate49() {
        newItem.addItems(new Item(1, "Anh dep"));
        newItem.updateItem(1, "Anh nen deppooooooooooooooooooooooooooooooooooooo");
        Assertions.assertEquals("Anh nen deppooooooooooooooooooooooooooooooooooooo", newItem.getAllItems().get(0).getName());
    }
    @Test
    public void testUpdate2() {
        newItem.addItems(new Item(1, "Ly"));
        newItem.updateItem(1, "La");
        Assertions.assertEquals("La", newItem.getAllItems().get(0).getName());
    }

    @Test
    public void testUpdate50() { // 50 ký tự
        newItem.addItems(new Item(1, "Anh dep"));
        newItem.updateItem(1, "Anh nen depppppppppppppppppppppppppppppppppppppppppp");
        Assertions.assertEquals("Anh nen dep", newItem.getAllItems().get(0).getName());
    }
    @Test
    public void testUpdate1() { //1 ký tự
        newItem.addItems(new Item(1, "Anh dep"));
        newItem.updateItem(1, "L");
        Assertions.assertEquals("Anh nen dep", newItem.getAllItems().get(0).getName());
    }


    // Delete
    @Test
    public void testDelete1() {
        newItem.addItems(new Item(1, "Anh dep"));
        Assertions.assertTrue(newItem.deleteItem(1));
        Assertions.assertEquals(0, items.size());
    }
    @Test
    public void testDelete2() {
        newItem.addItems(new Item(10, "Anh dep 2"));
        Assertions.assertTrue(newItem.deleteItem(10));
        Assertions.assertEquals(0, items.size());
    }
    @Test
    public void testDelete3() {
        newItem.addItems(new Item(3, "Anh dep 2"));
        Assertions.assertTrue(newItem.deleteItem(3));
        Assertions.assertEquals(0, items.size());
    }
    @Test
    public void testDelete4() {
        Assertions.assertTrue(newItem.deleteItem(-1));
    }

    @Test
    public void testDelete5() {
        Assertions.assertTrue(newItem.deleteItem(11));
    }
    @Test
    public void testDelete6() {
        Assertions.assertTrue(newItem.deleteItem(15));
    }
}
