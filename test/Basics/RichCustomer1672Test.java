package test.Basics;

import org.junit.jupiter.api.Test;
import src.Basics.RichCustomer1672;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RichCustomer1672Test {

    @Test
    void calculatesMaxWealthForMultipleAccounts() {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        assertEquals(6, RichCustomer1672.getMaxWealth(accounts));
    }

    @Test
    void calculatesMaxWealthForSingleAccount() {
        int[][] accounts = {
                {1, 2, 3}
        };
        assertEquals(6, RichCustomer1672.getMaxWealth(accounts));
    }

    @Test
    void calculatesMaxWealthForEmptyAccounts() {
        int[][] accounts = {};
        assertEquals(0, RichCustomer1672.getMaxWealth(accounts));
    }

    @Test
    void calculatesMaxWealthForAccountsWithZeroBalance() {
        int[][] accounts = {
                {0, 0, 0},
                {0, 0, 0}
        };
        assertEquals(0, RichCustomer1672.getMaxWealth(accounts));
    }

    @Test
    void calculatesMaxWealthForAccountsWithNegativeBalance() {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {10, 20, -10}
        };
        assertEquals(20, RichCustomer1672.getMaxWealth(accounts));
    }
}