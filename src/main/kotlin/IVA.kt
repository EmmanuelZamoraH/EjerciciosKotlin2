
fun main(){
    val valores = arrayOf<Double>(13.5,7.0,66.0,8.5,3.5);
    val IVA=0.18
    val desc=0.1
    println(Valorescesta(valores,IVA,::IVA))
    println(Valorescesta(valores,desc,::Desc))

}

fun Desc(desc: Double, price: Double):Double{
    val precioDes= price-(price*desc)
    return precioDes
}
fun IVA(iva: Double, price: Double):Double{
    val priceIva= price+(price*iva)
    return priceIva
}
fun Valorescesta(productos: Array<Double>, porcentaje: Double,operacion:(Double, Double)->Double): Double{
    var total=0.0
    for (pos in 0..productos.size-1){
        total+=operacion(porcentaje,productos.get(pos))
    }
    return total
}

