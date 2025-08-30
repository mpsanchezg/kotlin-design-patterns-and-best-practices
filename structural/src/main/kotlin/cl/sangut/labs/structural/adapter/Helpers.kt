package cl.sangut.labs.structural.adapter

import java.util.stream.Stream

fun <T> collectionProcessing(c: Collection<T>) {
    for (e in c) {
        println(e)
    }
}

fun <T> streamProcessing(stream: Stream<T>) {
    // Do something with stream
}
