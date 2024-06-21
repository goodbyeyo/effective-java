package com.study.effective.item05.dependencyinjection;

import com.study.effective.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    // 구체적인 타입으로 받는 supplier 정의되어 있다면 다른 타입은 받을수 없다
    public SpellChecker(Supplier<? extends Dictionary> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
    }

//    public SpellChecker(Supplier<Dictionary> dictionarySupplier) {
//        this.dictionary = dictionarySupplier.get();
//    }

//    public SpellChecker(DictionaryFactory dictionaryFactory) {
//        this.dictionary = dictionaryFactory.get();
//    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
