package com.github.reach.common.exceptions;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TryCatchInFunction {

    public  <T> Function<Supplier<T>, Optional<T>> tryCatch(Consumer<String> exceptionConsumer) {
        return source -> {
            try {
                return Optional.ofNullable(source.get());
            } catch (RuntimeException e) {
                exceptionConsumer.accept(e.getMessage());
            }
            return Optional.empty();
        };
    }

    public  <T> Function<Supplier<T>, Optional<T>> tryCatch() {
        return source -> {
            try {
                return Optional.ofNullable(source.get());
            } catch (RuntimeException ignore) {
            }
            return Optional.empty();
        };
    }

}
