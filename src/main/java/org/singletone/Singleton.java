package org.singletone;

import lombok.Getter;

public class Singleton {
    @Getter
    private static final Singleton instance = new Singleton();

    private Singleton() {}

}