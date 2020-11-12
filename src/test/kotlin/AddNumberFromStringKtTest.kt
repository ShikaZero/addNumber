import io.reactivex.Observable
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class AddNumberFromStringKtTest{

    @Test
    fun returnIntFromString(){

        val intObs :  Observable<Int> = Observable.just(1)

        assertEquals(intObs.blockingFirst(),generateAddFromString(Observable.just("1")).blockingFirst())
    }

    @Test
    fun returnValueWithoutComma(){

        val intObs :  Observable<Int> = Observable.just(14)

        assertEquals(intObs.blockingFirst(),generateAddFromString(Observable.just("1,4")).blockingFirst())
    }

    @Test
    fun returnAddIfComma(){

        val intObs :  Observable<Int> = Observable.just(5)

        assertEquals(intObs.blockingFirst(),generateAddFromString(Observable.just("1,4")).blockingFirst())
    }

    @Test
    fun returnAndChangeDelimiter(){

        val intObs :  Observable<Int> = Observable.just(14)

        assertEquals(intObs.blockingFirst(),generateAddFromString(Observable.just("\\;\n1;4")).blockingFirst())
    }

    @Test
    fun returnAndChangeDelimiterAndAddNumber(){

        val intObs :  Observable<Int> = Observable.just(5)

        assertEquals(intObs.blockingFirst(),generateAddFromString(Observable.just("\\;\n1;4")).blockingFirst())
    }
}
