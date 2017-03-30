import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class DigJoinOperator {

    public static void main(String[] args) throws InterruptedException {

        Observable.interval(1, TimeUnit.SECONDS, Schedulers.immediate())
                .map(aLong -> aLong * 5)
                .take(1)
                .subscribe(aLong -> System.out.println("value: " + aLong));

//        Observable<Long> observable2= Observable.interval(2, TimeUnit.SECONDS, Schedulers.immediate())
//                .map(aLong -> aLong * 10)
//                .take(1);
//
//        observable1.join(
//                observable2,
//                aLong -> Observable.timer(0, TimeUnit.MILLISECONDS),
//                aLong -> Observable.timer(0, TimeUnit.MILLISECONDS),
//                (aLong, aLong2) -> {
//                    System.out.println("aLong: " + aLong + " aLong2: " + aLong2);
//                    return aLong + aLong2;
//                })
//                .subscribe(aLong -> System.out.println("values: " + aLong));

        Thread.sleep(20_000);
    }
}
