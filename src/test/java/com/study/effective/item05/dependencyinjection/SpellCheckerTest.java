package com.study.effective.item05.dependencyinjection;

import com.study.effective.item05.DefaultDictionary;
import com.study.effective.item05.Dictionary;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        // Supplier<Dictionary> dictionarySupplier = () -> new DefaultDictionary();
        // SpellChecker spellChecker = new SpellChecker(() -> new DefaultDictionary());

        // di
        // SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
        SpellChecker spellChecker = new SpellChecker(DictionaryFactory::get);
        spellChecker.isValid("test");
    }

}