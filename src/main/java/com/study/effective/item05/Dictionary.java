package com.study.effective.item05;

import java.util.List;

public interface Dictionary {

    boolean contains(String word);

    List<String> closeWordsTo(String typo);
}
