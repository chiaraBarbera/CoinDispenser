/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package coindispenser;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test of the CoinDispenser class.
 *  * 
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public class CoinDispenserTest {

    @Test
    public void  testAddCoins() {
        CoinDispenser coinDispenser = new CoinDispenser(3);
        coinDispenser.addCoins(100, 7);
        assertEquals(10, coinDispenser.countCoins(100));
    }


    @Test
    public void  testAddCoinsBis() {
        CoinDispenser coinDispenser = new CoinDispenser(3);
        coinDispenser.addCoins(200, 7);
        assertEquals(10, coinDispenser.countCoins(200));
    }




    @Test (expected = DispenserError.class)
    public void testDispenser() throws DispenserError{
        CoinDispenser coinDispenser = new CoinDispenser();
        ArrayList <Integer> coins = new ArrayList<>();
        coins.add(200);
        coinDispenser.dispenseCoins(coins);
    }

    @Test (expected = DispenserError.class)
    public void testDispenserZero() throws DispenserError{
        CoinDispenser coinDispenser = new CoinDispenser(10);
        ArrayList <Integer> coins = new ArrayList<>();
        coins.add(0);
        coinDispenser.composeChange(0,10,4);
    }

 @Test (expected = DispenserError.class)
    public void testDispenserOne() throws DispenserError{
        CoinDispenser coinDispenser = new CoinDispenser(10);
        ArrayList <Integer> coins = new ArrayList<>();
        coins.add(-55555);
        coinDispenser.composeChange(coins.get(0),10,4);
    }


}

   
