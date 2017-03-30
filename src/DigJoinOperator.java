import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

import java.util.concurrent.TimeUnit;

public class DigJoinOperator {

    public static void main(String[] args) throws InterruptedException {

//        Observable<Long> observable1 = Observable.interval(1, TimeUnit.SECONDS, Schedulers.immediate())
//                .map(aLong -> aLong * 5)
//                .take(3);
//
//        Observable.interval(2, TimeUnit.SECONDS, Schedulers.immediate())
//                .map(aLong -> {
//                    System.out.println("interval action: " + aLong);
//                    return aLong * 10;
//                })
//                .subscribe(System.out::println);

//        observable1.join(
//                observable2,
//                aLong -> Observable.timer(0, TimeUnit.MILLISECONDS),
//                aLong -> Observable.timer(0, TimeUnit.MILLISECONDS),
//                (aLong, aLong2) -> {
//                    System.out.println("aLong: " + aLong + " aLong2: " + aLong2);
//                    return aLong + aLong2;
//                })
//                .subscribe(aLong -> System.out.println("values: " + aLong));


        Observable.interval(1, TimeUnit.SECONDS)
                .map(new Func1<Long, Long>() {
                    @Override
                    public Long call(Long aLong) {
                        return aLong * 5;
                    }
                })
                .take(3)
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        System.out.println("value: " + aLong);
                    }
                });

        Thread.sleep(20_000);
    }
}
