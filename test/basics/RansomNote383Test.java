package test.basics;

import org.junit.jupiter.api.Test;
import src.basics.RansomNote383;

import static org.junit.jupiter.api.Assertions.*;

class RansomNote383Test {

    @Test
    void canConstructReturnsTrueWhenRansomNoteCanBeConstructed() {
        assertTrue(RansomNote383.canConstruct("aa", "aab"));
    }

    @Test
    void canConstructReturnsFalseWhenRansomNoteCannotBeConstructed() {
        assertFalse(RansomNote383.canConstruct("aa", "ab"));
    }

    @Test
    void canConstructReturnsFalseWhenRansomNoteIsLongerThanMagazine() {
        assertFalse(RansomNote383.canConstruct("a", ""));
    }

    @Test
    void canConstructReturnsTrueWhenRansomNoteAndMagazineAreEmpty() {
        assertTrue(RansomNote383.canConstruct("", ""));
    }

    @Test
    void canConstructReturnsTrueWhenRansomNoteIsEmpty() {
        assertTrue(RansomNote383.canConstruct("", "a"));
    }

    @Test
    void canConstructReturnsFalseWhenMagazineIsEmpty() {
        assertFalse(RansomNote383.canConstruct("a", ""));
    }

    @Test
    void canConstructReturnsTrueWhenRansomNoteAndMagazineAreIdentical() {
        assertTrue(RansomNote383.canConstruct("abc", "abc"));
    }

    @Test
    void canConstructReturnsFalseWhenMagazineLacksSufficientCharacters() {
        assertFalse(RansomNote383.canConstruct("aaa", "aa"));
    }
}