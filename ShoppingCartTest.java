import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew Wethington, Martin Boerwinkle, Jonathan Guidry, Yoseph Wordofa
 */
public class ShoppingCartTest {

    public ShoppingCartTest() {
    }

    /**
     * Test of getBalance method, of class ShoppingCart.
     */
    @Test
    public void testGetBalance() {
        System.out.println("Commencing Test For Correct Balance.");
        ShoppingCart instance = new ShoppingCart();
        //Create the products and add them to the shopping cart
        Product iPhone = new Product("iPhone 7", 200.00);
        Product laptopchassis = new Product("Clevo P775TM Barebone Chassis", 1200.00);
        Product processor = new Product("i7-9700K", 400.00);
        Product wlancard = new Product("Dell DW1830", 50.00);
        instance.addItem(iPhone);
        instance.addItem(laptopchassis);
        instance.addItem(processor);
        instance.addItem(wlancard);
        //Set expected result and test to see if the result was correct
        double expResult = 1850.0;
        double result = instance.getBalance();
        System.out.println("Balance Is: $" + result + " Expected Value Was: $" + expResult);
        //assertEquals(expResult, result, 0.0);
        if (result == expResult)
            System.out.println("Test Passed!");
        else
        {
            System.out.println("Test Failed.");
            System.out.println();
            fail("Test Failed.");
        }
        System.out.println();
    }

    /**
     * Test of addItem method, of class ShoppingCart.
     */
    @Test
    public void testAddItem() {
        System.out.println("Commencing Test For Adding Products.");
        ShoppingCart instance = new ShoppingCart();//create shopping cart object
        Product iPhone = new Product("iPhone 7", 200.00);//create iphone to add
        //Product item = null;
        instance.addItem(iPhone);//add 1 item, which is iphone
        // TODO review the generated test code and remove the default call to fail.
        int result = instance.getItemCount(); //test/get the new count
        System.out.println("Result Is: " + result + " Expected Value Was: 1");
        if (result == 1)//if cout is 1, we added 1 item passed
            System.out.println("Test Passed!");
        else
        {
            System.out.println("Test Failed.");
            System.out.println();
            fail("Test Failed.");
        }
        System.out.println(); 
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeItem method, of class ShoppingCart.
     */
    @Test
    public void testRemoveItem() throws Exception {
        System.out.println("Commencing Test For Removing Products.");
        ShoppingCart instance = new ShoppingCart();//create shopping cart object
        Product iPhone = new Product("iPhone 7", 200.00);//create iphone to add
        instance.addItem(iPhone);
        Product processor = new Product("i7-9700K", 400.00);
        instance.addItem(processor);
        //Product item = null;
        //ShoppingCart instance = new ShoppingCart();
        instance.removeItem(iPhone);
        // TODO review the generated test code and remove the default call to fail.
        int result = instance.getItemCount();
        System.out.println("Result Is: " + result + " Expected Value Was: 1");
        if (result == 1)//there should be one item left, then passed!
            System.out.println("Test Passed!");
        else
        {
            System.out.println("Test Failed.");
            System.out.println();
            fail("Test Failed.");
        }
        System.out.println();
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getItemCount method, of class ShoppingCart.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        ShoppingCart instance = new ShoppingCart();
        int expResult = 0;
        int result = instance.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println();
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class ShoppingCart.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        ShoppingCart instance = new ShoppingCart();
        instance.empty();
        // TODO review the generated test code and remove the default call to fail.
        System.out.println();
        fail("The test case is a prototype.");
    }

}
