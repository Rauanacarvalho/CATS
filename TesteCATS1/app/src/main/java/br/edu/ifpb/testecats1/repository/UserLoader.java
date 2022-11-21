package br.edu.ifpb.testecats1.repository;

import java.util.Observable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class UserLoader {

    public static Observable<Object> fetch() {
        return Observable
                .range(1, 8)
                .zipWith(Observable.interval(200, TimeUnit.MILLISECONDS),
                        (Function<Integer, Long, Object>) (integer, aLong) -> UserFactory.makeUser())
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

    }
}