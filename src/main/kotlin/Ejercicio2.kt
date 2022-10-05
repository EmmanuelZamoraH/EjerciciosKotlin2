
fun main() {
    val valores = arrayOf<Int>(1,2,3,4,5,6,7,8,9);
    sumarLista(valores, ::suma)
}

fun sumarLista(num: Array<Int> , operacion:(Int)->Int): Array<Int> {
    for (posicion in 0..num.size-1){
        num.set(posicion,operacion(num.get(posicion)))
        println(num.get(posicion))
    }
    return num
}
fun suma(num: Int): Int{
    return num+10
}
