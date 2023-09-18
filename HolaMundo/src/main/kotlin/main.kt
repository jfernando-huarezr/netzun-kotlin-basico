import java.util.*

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

//    var nombre: String?
//    nombre = null ?: "Usuario"
//
//    var longitud: Int? = nombre?.length ?: 0
//    println("Hola ${nombre} tu nombre tiene ${longitud} letras")

    //***INGRESAR DATOS: Con la funcion readLine()
//    println("Ingrese un dato: ")
//    var dato = readln()
//    println("El dato es ${dato}")

    //****EXPRESION WHEN : Reemplaza al Switch Case en Kotlin
//    println("Ingrese 1 o 2")
//    var x = readln().toInt()
//    when (x) {
//        1 -> println("numero es 1")
//        2 -> println("numero es 2")
//        else -> {
//            println("es un numero diferente a 1 o 2")
//        }
//    }

    //*****RANGOS Y PROGRESIONES
//    var num = 25
//    if (num in 5..20) {
//        println("El numero se encuentra entre 5 y 20")
//    }
//    else {
//        println("El numero esta fuera del rango")
//    }
//
//    when (num) {
//        in 5 .. 20 -> println("numero en el rango con when")
//        in 21 .. 29 -> println("numero entre 21 y 29 con when")
//        in 30 .. 40 -> println("numero entre 30 y 40 con when")
//    }


    //********COLECCIONES: Lists, Sets y Maps. Por defecto son inmutables
    //**LISTAS

    //listOf(value1, value2, value3, value4...etc)
    //var/val listName = listOf(value1, value2, value3)
    //listOf() no puede es modificable. Habria que usar mutableListOf()

//    var paises = listOf("Peru", "Ecuador", "Marruecos", "Brasil")
//    println(paises)
//    println(paises[0])


    //****SETS
    //Coleccion desordenada de elementos unicos. Se filtra cualquier duplicado
    //al igual que listOf, no es modificable. Se tiene que usar mutableSetOf()
    //no funciona con corchetes. Se usa el metodo elementAt(index)
    //no podemos editar un elemento. Podemos eliminar o agregar.

//    var numeros = mutableSetOf(1,2,3,4,5,5,6,7,8,8,9)
//    println(numeros)
//    println(numeros.elementAt(0))
//
//    numeros.remove(1)
//    numeros.add(1)
//    println(numeros)

    //***MAPS o DICTIONARYS : Par clave , valor. Clave es unica, valor se puede repetir. Filtra las claves repetidas
    //el key NO se puede modificar

//    var mapita = mutableMapOf("nombre" to "Fernando", "apellido" to "Huarez", "edad" to 32, "estatura" to 180)
//    println(mapita)
//    println(mapita.keys)
//    println(mapita.values)
//    mapita["nombre"] = "Jose"
//    println(mapita["nombre"])

    //***ESTRUCTURAS REPETITITAS

    //*FOR
//    for (i in 1..4) {
//        println("Escribiendo ${i}")
//    }

    //**********CLASES

    //class Nombre { //Cuerpo de la clase }

//    class Persona {
//        val nombre = "Fernando"
//        val apellido = "Huarez"
//        val edad = 32
//    }
//
//    val persona1 = Persona()
//    println(persona1.apellido)
//
//    //constructores
//
//
//    class Car(val year: Int, val color: String, val model: String) {
//
//        //bloque init: agregar codigo que se ejecuta cuando instanciamos una clase
//        init{
//            val antiguedad = 2023 - year
//            println("La antiguedad del auto es de ${antiguedad} años")
//        }
//
//        //member functions: serian los metodos de la clase
//        fun encender() {
//            println("El carro esta encendido")
//        }
//
//        fun apagar() {
//            println("El carro esta apagado")
//        }
//    }
//
//    val carro1 = Car(2012,"azul", "Ferrari")
//    println(carro1.model)
//    carro1.encender()
//    carro1.apagar()

    //******DATA CLASSES
    //Solo tienen atributos. No deberia tener metodos o init
//    val human = Person("Gian", 18)
//    println(human.nombre)
//    println(human.edad)

    //****** HERENCIA
    //clases Barco y Buque. la clase Buque hereda los metodos de la clase Barco

//    val barco = Buque(2019,"Franky", "Azul")
//
//    barco.encender()

    //***** INTERFACES

    val tarjeta1 = MasterCard("1234567890")
    tarjeta1.score(32)

}