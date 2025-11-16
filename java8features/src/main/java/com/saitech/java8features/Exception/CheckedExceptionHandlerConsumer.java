package com.saitech.java8features.Exception;

@FunctionalInterface
public interface CheckedExceptionHandlerConsumer<Target, ExpObject extends Exception> {

	public void accept(Target t) throws ExpObject;
}
