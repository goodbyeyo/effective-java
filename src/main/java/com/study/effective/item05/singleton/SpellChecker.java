package com.study.effective.item05.singleton;

import com.study.effective.item05.DefaultDictionary;
import com.study.effective.item05.Dictionary;

import java.util.List;

public class SpellChecker {
    private final Dictionary dictionary = new DefaultDictionary();
    private SpellChecker() {}

    public static final SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }


}
