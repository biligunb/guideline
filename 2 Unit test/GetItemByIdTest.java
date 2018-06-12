import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * ItemService - GetItemByIdTest() - Test
 * 
 * @author Bilguun.B
 * @version 1.0
 * @since 1.0
 */
public class GetItemByIdTest {

    /*
        method : getItemById(int)
            - gets argument between [0-100]
            - if argument is 0 return all items
            - if argument is between [1-100] return an item
            - if argument is other than [0-100] throw ItemNotFoundException
            - if argument is other than int throw InvalidIdException

        Valid cases     -> 2, 50, 99
        Boundary cases  -> 1, 100
        Invalid cases   -> -1 101, Integer.MAX_VALUE, Integer.MIN_VALUE
        Invalid type    -> 2.5
        Special cases   -> 0
    */

    @Test
    public void getItemById_idExist_shouldReturnItem() {                    // given-when-then naming

        int[] ids = {1, 2, 50, 99, 100};                                    // test data

        for (int i=0; i<ids.length; i++) {
            assertNotNull(itemsService.getItemById(ids[i]));                // assert item is returned by the method
        }
    }

    @Test
    public void getItemById_idExist_shouldReturnAllItems() {                // given-when-then naming

        int id = 0;                                                         // test data

        int expectedItemsCount = 100;                                       // expected value

        List<Item> items = itemsService.getItemByUserId(id);                // method to be tested -> getItemById(int)

        assertEquals(expectedItemsCount, items.size());
    }

    @Test(expected = ItemNotFoundException.class)
    public void getItemById_idNotExist_shouldThrowItemNotFoundxception() {  // given-when-then naming

        int[] ids = {Integer.MIN_VALUE, -1, 101, Integer.MAX_VALUE };       // test data

        for (int i=0; i<ids.length; i++) {
            itemsService.getItemByUserId(ids[i]);                           // method to be tested -> getItemById(int)
        }

        fail();                                                             // if reaches this line test should fail
    }

    @Test(expected = InvalidIdException.class)
    public void getItemById_idIsInvalid_shouldThrowInvalidIdException() {   // given-when-then naming

        double id = 2.5;                                                    // test data

        itemsService.getItemByUserId(id);                                   // method to be tested -> getItemById(int)

        fail();                                                             // if reaches this line test should fail
    }
}