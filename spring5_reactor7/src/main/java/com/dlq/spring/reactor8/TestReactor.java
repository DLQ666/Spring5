package com.dlq.spring.reactor8;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *@program: Spring5
 *@description:
 *@author: Hasee
 *@create: 2020-08-12 16:39
 */
public class TestReactor {
    public static void main(String[] args) {

        //just方法直接声明
        Flux.just(1,2,3,4).subscribe(System.out::println);
        System.out.println();
        Mono.just(1).subscribe(System.out::println);

        //其它的方法
        /*Integer[] array = {1,2,3,4};
        Flux.fromArray(array);

        List<Integer> list = Arrays.asList(array);
        Flux.fromIterable(list);

        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);*/
    }
}
