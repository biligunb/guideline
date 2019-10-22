package unit.test.content;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * ItemService - GetItemByUserIdTest() - Test
 * 
 * @author Bilguun.B
 * @version 1.0
 * @since 1.0
 */
public class GetItemByUserIdTest extends UnitTestBase {                 // Unit Test Base class contains necessary files

    /**
     * Test - getItemByUserId - userIdExist - item
     * 
     * find existing item by userId = 1
     */
    @Test
    public void getItemByUserId_userIdExist_shouldReturnItem() {        // given-when-then naming

        int userId = 1;                                                 // test data

        int expectedItemId = 2;                                         // expected value

        Item item = (Item) itemsService.getItemByUserId(userId);        // method to be tested -> getItemByUserId(int)

        assertEquals(expectedItemId, item.getId());                     // actual value -> item.getId()
    }
}