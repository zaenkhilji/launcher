package net.varago.utils;

public class Utils {

	/**
	 * @author: Zaen Khilji
	 */

	private static final long INIT_NANOS = System.nanoTime();
	private static final long INIT_MILLIS = System.currentTimeMillis();

	private static long millisSinceClassInit() {
		return (System.nanoTime() - INIT_NANOS) / 1000000;
	}

	public static long currentTimeMillis() {
		return INIT_MILLIS + millisSinceClassInit();
	}
}