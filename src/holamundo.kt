const val N = "NAME" //const en tiempo de compilacion
var n="n" //mala practica

//funcion pura
fun main(args: Array<String>) {
    println("Hola Mundo")
    println(1 + 1)
    println(3 - 1)
    println(2 * 2)
    println(4 / 2)
    println(7 % 2)
    val a = 4
    val b = 2


    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    val name = args[0] //tiempo de ejecucion
    println(name)

    val nombre = "Alex"
    val apellido: String = "Velasco"
    println("Tu nombre es: $nombre \n $apellido")

    //raw string
    val parrafo: String = """
        **hola esta es una prueba del uso de los parrafos
        **en una varible string de kotlin
        **bienvenido
    """.trimIndent()
    println(parrafo.trimMargin(marginPrefix = "**"))

    //Operador rango
    val onetofive = 1..5
    for (i in onetofive) {
        println(i)
    }
    //val atof='A'..'F'
    for (letra in 'A'..'F') {
        println(letra)
    }

    //if operadores logicos
    val numero = 2
    if (numero.equals(2)) {
        println("correcto")

    } else {
        println("No son iguales")
    }

    //when switch
    when (numero) {
        in 1..5 -> println("si esta en el rango")
        !in 5..10 -> println("No esta en este rango")
        else -> println("No esta en alguno de los anteriores")
    }

    var i = 1
    //while contadores
    while (i < 1) {
        println("MENSAJE: $i")
        i++
    }

    do {
        println("MENSAJE DoWhile: $i")
        i++
    } while (i < 1)

    var daysOfWeek = listOf("Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado")

    for ((index, day) in daysOfWeek.withIndex()) {

        println("$index : $day")
    }
    daysOfWeek.forEach {
        println(it)
    }


    /* try {
        var compute: String?
        compute = null
        var logitud: Int = compute!!.length
    }catch (e: NullPointerException){
        println("Ingresa un valor")
    }*/
    //llamada segrua
    var compute: String? = null
    var longitud: Int? = compute?.length
    println("Longitud: $longitud")

    //Operador Elvis
    var teclado: String? = null
    val logitudteclado: Int = teclado?.length ?: 0
    println("Longitud del teclado: $logitudteclado")


    val listwithnulls: List<Int?> = listOf<Int?>(7, null, null, 5)
    println("Lista con NUll: ${listwithnulls}")

    val listwithoutnulls: List<Int?> = listwithnulls.filterNotNull()
    println("lista sin nulls:  $listwithoutnulls")

    //Array
    val contries: Array<String> = arrayOf("India", "Colombia", "Mexico", "Argentina", "Chile")
    val days: Array<String> = arrayOf<String>("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado")


    var arrayobject = arrayOf(1, 2, 3)
    var arrayprimitive: IntArray = arrayobject.toIntArray()

    val suma = arrayobject.sum()
    println("La suma es: $suma")
    arrayobject = arrayobject.plus(4)
    for (a in arrayobject) {
        println("Array: $a")
    }
    arrayobject = arrayobject.reversedArray()
    for (a in arrayobject) {
        println("Array en reversa: $a")
    }
    arrayobject.reverse()
    for (a in arrayobject) {
        println("Array en reversa: $a")
    }
    var x = 5
    println("X es igual 5? ${x == 5}")//true
    var mensaje = "El valor de x es: $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")

    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

    println("Raiz cuadrada de: ${Math.sqrt(4.0)}")

    println("El promedio de los numeros es: ${promedio(numbers, 2)}")
    println("${evaluate( '*' , 5)}")

    //labdas
    val saludo = { println("Hola mundo")}
    saludo()

    //var suma = {instrucciones -> sentencias}
    val plus ={A: Int,B: Int, C:Int -> A+B+C}
    val result = plus(3,4,5)
    println(result)
    println(plus(1,2,3))
    println({A: Int,B: Int, C:Int -> A+B+C}(3,4,5))

    val calculateN={ con: Int ->
        when(con){
            in 1..3 -> println("Tu numero esta entre 1 y 3")
            in 4..6 -> println("Tu numero esta entre 4 y 6")
        }


    }
    println(calculateN(6))

    val camera = Camer()
    camera.turnOn()
    camera.turnOff()
    println(camera.getcameraStatus())
    camera.setResolution(567)
    println("Ressolution: ${camera.getResolution()}")

    //var shoe = Shoe()
    //shoe.size = 37
    //println(shoe.size)

    //shoe.model = "Zapatos"
    //println(shoe.model)
    //dataclass
    val movie = Movie("Coco","pixar",120)
    println(movie.title)
    println(movie.creator)
    println(movie.duration)

    var shoe= Shoe("Shoe","Blue",12345,"Praga")
    println("Shoe: ${shoe}")
}

    fun evaluate(character: Char = '=', number: Int = 2): String{
        return "${character} es ${number}"

    }
    fun promedio(numbers: IntArray, i: Int): Int {
        var sum = 0
        for (num in numbers) {
            sum += num
        }
        return (sum / numbers.size) + i
    }


