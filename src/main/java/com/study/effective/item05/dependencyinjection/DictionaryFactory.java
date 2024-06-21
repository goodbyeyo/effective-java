package com.study.effective.item05.dependencyinjection;

import com.study.effective.item05.DefaultDictionary;

public class DictionaryFactory {

    public static DefaultDictionary get() {
        return new DefaultDictionary();
    }

}
