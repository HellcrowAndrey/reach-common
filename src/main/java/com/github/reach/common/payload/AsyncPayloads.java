package com.github.reach.common.payload;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface AsyncPayloads<T> {

    static <T> AsyncPayloads<T> of(T payload) {
        if (Objects.isNull(payload)) {
            throw new NullPointerException();
        }
        return new AsyncPayloadsDefault<>(payload);
    }

    T doOnNext(Consumer<T> consumer);

    T doOnNext(Runnable runnable);

    class AsyncPayloadsDefault<T> implements AsyncPayloads<T> {

        private final T payload;

        private AsyncPayloadsDefault(T payload) {
            this.payload = payload;
        }

        @Override
        public T doOnNext(Consumer<T> consumer) {
            CompletableFuture.runAsync(() -> consumer.accept(this.payload));
            return this.payload;
        }

        @Override
        public T doOnNext(Runnable runnable) {
            CompletableFuture.runAsync(runnable);
            return this.payload;
        }
    }

}
