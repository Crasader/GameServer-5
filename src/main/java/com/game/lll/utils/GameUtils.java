package com.game.lll.utils;

public class GameUtils {
	public static void checkNotNull(Object v) {
        if (v == null)
            throw new NullPointerException();
    }
}
