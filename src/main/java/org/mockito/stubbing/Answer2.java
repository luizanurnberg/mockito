package org.mockito.stubbing;

/**
 * Two parameter function which returns something
 *
 * @param <T> return type
 * @param <A> input parameter 1 type
 * @param <B> input parameter 2 type
 */
public interface Answer2<T, A, B> {
    T answer(A a, B b);
}
