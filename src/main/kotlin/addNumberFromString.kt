import io.reactivex.Observable
import io.reactivex.Observer

fun main(args:Array<String>){
    print("Hello World")
    generateAddFromString(Observable.just("2"))
}

fun generateAddFromString(value : Observable<String>) :Observable<Int> {
    return value.flatMap{ valueS: String ->
        if ( valueS.contains(",")) Observable.just(valueS.filterNot{ it == ','}.toInt())
        if ( valueS.contains("\\;\n")) Observable.just(valueS.filterNot{ it == '\\' && it == '\n'}.filterNot { it == valueS[0] }.toInt())
        else Observable.just(valueS.toInt())
    }
}
