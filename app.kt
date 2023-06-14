// Компиляция данного файла
//
// kotlinc app.kt -include-runtime -d app.jar
//
// -include-runtime - параметр указывает, что создаваемый файл будет включать
//     среду Kotlin.
// -d - параметр указывает, как будет называться создаваесый файл приложения.

// Запуск полученного файла
// java -jar app.jar

fun main() {
    println("Start Kotlin")

    print("Введите имя: ")
    val name = readLine()
 
    println("Ваше имя: $name")

    for(i in 1..9){
        for(j in 1..9){
            print("${i * j} \t")
        }
        println()
    }
}