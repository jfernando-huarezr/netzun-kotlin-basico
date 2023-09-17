fun main() {

    // var-val NombreVariable : TipoVariable = Valor
    //variable
    //var numeroVar : Int = 4

    //constante
    //val numeroVal : Int = 25

    //println(numeroVar)
    //println(numeroVal)

    //Inferencia de tipos. Kotlin identifica automaticamente el tipo de dato que usamos
    //Sin embargo, si la variable empezo como String, luego ya no se puede cambiar y se queda asi
    //var saludos = "Hola Mundo"


    //*****STRINGS

//    var nombre = "Peter"
//    var apellido ="Parker"
//
//    println(nombre + " " + apellido)
//    //String Interpolation
//    println("$nombre $apellido")


    //*****NUMEROS

//    var numero1 = 4
//    var numero2 = 6
//
//    println(numero1 + numero2)
//    println("Multiplicacion ${numero1*numero2}")
//    println("Los numeros son ${numero1} y ${numero2}")

    //*****NULLABLES
        //no puedo hacer esto
//    var nombre : String
//    nombre = null

        //esto si puedo hacer! quiere decir "Puede ser String o Null"
//    var nombreNull : String?
//    nombreNull = null
//    print(nombreNull)


    //null safe
//    var name : String?
//    name = "Peter"
//    var longitud : Int? = name.length
//    println(longitud)
//    name = null
//    longitud = name?.length
//    println(longitud)

    //si coloco name!! retiro esta caracteristica de Java

    //****ELVIS OPERATOR ?:
    //Cuando llegue un parametro null genera errores como se vio en la parte anterior
    //valida que una variable no sea nula, y si es nula asigna otro valor

    var nombre: String?
    nombre = null ?: "Usuario"

    var longitud: Int? = nombre?.length ?: 0
    println("Hola ${nombre} tu nombre tiene ${longitud} letras")

}