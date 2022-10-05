
fun main(){
    val asignaturas= arrayOf<String>("Progamacion logica y funcional","Programacion web 1","Programacion movil 1"
        ,"Gestion de proyectos de software","Ingles")
    val calificaciones= arrayOf<Int>(87,90,96,77,66)
    calificaciones(asignaturas,calificaciones)
}

fun calificaciones(asignaturas: Array<String>,calificaciones: Array<Int>){
    for(pos in 0..asignaturas.size-1){
        println(asignaturas.get(pos).toUpperCase()+" "+calificar(calificaciones.get(pos)))
    }

}

fun calificar(cali: Int):String{
    if(cali<=100&&cali>=95){
        return "Excelente"
    }else if(cali<=94&&cali>=85){
        return "Notable"
    }else if(cali<=84&&cali>=75){
        return "Bueno"
    }else if(cali<=74&&cali>=70){
        return "Suficiente"
    }else return "Desempeño insuficiente"
}

