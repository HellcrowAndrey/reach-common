package com.github.reach.common.payload;

import com.github.reach.common.exceptions.ConverterIsNull;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class PayloadCollectors {

    public static <T, R> ToArrayList<T, R> toArrayList(Function<T, R> converter) {
        if (Objects.isNull(converter)) throw new ConverterIsNull();
        return new ToArrayList<>(converter);
    }

    public static <T, R> ToLinkedList<T, R> toLinkedList(Function<T, R> converter) {
        if (Objects.isNull(converter)) throw new ConverterIsNull();
        return new ToLinkedList<>(converter);
    }

    public static <T, R> ToHashSet<T, R> toHashSet(Function<T, R> converter) {
        if (Objects.isNull(converter)) throw new ConverterIsNull();
        return new ToHashSet<>(converter);
    }

    public static <T, R> ToLinkedHashSet<T, R> toLinkedHashSet(Function<T, R> converter) {
        if (Objects.isNull(converter)) throw new ConverterIsNull();
        return new ToLinkedHashSet<>(converter);
    }

    private static class
    ToArrayList<T, R> implements Collector<T, List<R>, List<R>> {

        private final Function<T, R> converter;

        private ToArrayList(Function<T, R> converter) {
            this.converter = converter;
        }

        @Override
        public Supplier<List<R>> supplier() {
            return ArrayList::new;
        }

        @Override
        public BiConsumer<List<R>, T> accumulator() {
            return (list, obj) -> list.add(this.converter.apply(obj));
        }

        @Override
        public BinaryOperator<List<R>> combiner() {
            return (first, second) -> {
                first.addAll(second);
                return first;
            };
        }

        @Override
        public Function<List<R>, List<R>> finisher() {
            return ArrayList::new;
        }

        @Override
        public Set<Characteristics> characteristics() {
            return Set.of(Characteristics.UNORDERED);
        }
    }

    private static class ToLinkedList<T, R> implements Collector<T, List<R>, List<R>> {

        private final Function<T, R> converter;

        private ToLinkedList(Function<T, R> converter) {
            this.converter = converter;
        }

        @Override
        public Supplier<List<R>> supplier() {
            return LinkedList::new;
        }

        @Override
        public BiConsumer<List<R>, T> accumulator() {
            return (list, obj) -> list.add(this.converter.apply(obj));
        }

        @Override
        public BinaryOperator<List<R>> combiner() {
            return (first, second) -> {
                first.addAll(second);
                return first;
            };
        }

        @Override
        public Function<List<R>, List<R>> finisher() {
            return LinkedList::new;
        }

        @Override
        public Set<Characteristics> characteristics() {
            return Set.of(Characteristics.UNORDERED);
        }
    }

    private static class ToHashSet<T, R> implements Collector<T, Set<R>, Set<R>> {

        private final Function<T, R> converter;

        private ToHashSet(Function<T, R> converter) {
            this.converter = converter;
        }

        @Override
        public Supplier<Set<R>> supplier() {
            return HashSet::new;
        }

        @Override
        public BiConsumer<Set<R>, T> accumulator() {
            return (list, obj) -> list.add(this.converter.apply(obj));
        }

        @Override
        public BinaryOperator<Set<R>> combiner() {
            return (first, second) -> {
                first.addAll(second);
                return first;
            };
        }

        @Override
        public Function<Set<R>, Set<R>> finisher() {
            return HashSet::new;
        }

        @Override
        public Set<Characteristics> characteristics() {
            return Set.of(Characteristics.UNORDERED);
        }
    }

    private static class ToLinkedHashSet<T, R> implements Collector<T, Set<R>, Set<R>> {

        private final Function<T, R> converter;

        private ToLinkedHashSet(Function<T, R> converter) {
            this.converter = converter;
        }

        @Override
        public Supplier<Set<R>> supplier() {
            return LinkedHashSet::new;
        }

        @Override
        public BiConsumer<Set<R>, T> accumulator() {
            return (list, obj) -> list.add(this.converter.apply(obj));
        }

        @Override
        public BinaryOperator<Set<R>> combiner() {
            return (first, second) -> {
                first.addAll(second);
                return first;
            };
        }

        @Override
        public Function<Set<R>, Set<R>> finisher() {
            return LinkedHashSet::new;
        }

        @Override
        public Set<Characteristics> characteristics() {
            return Set.of(Characteristics.UNORDERED);
        }
    }

}
