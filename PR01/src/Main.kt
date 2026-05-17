fun main() {
    // 1 задание
    print("Введите первое число: ")
    val s1 = readLine()
    print("Введите второе число: ")
    val s2 = readLine()
    try {
        val a = s1!!.toDouble()
        val b = s2!!.toDouble()
        if (b == 0.0)
            println("На ноль делить нельзя")
        else
            println("Результат: ${a / b}")
    } catch (e: Exception) {
        println("Ошибка ввода")
    }
    // 2 задание
    print("Введите зарплату: ")
    val s3 = readLine()
    try {
        val salary = s3!!.toDouble()
        val result = salary + salary * 0.15
        println("С премией: $result")
    } catch (e: Exception) {
        println("Ошибка ввода")
    }
    // 3 задание
    print("Введите год рождения: ")
    val s4 = readLine()
    try {
        val year = s4!!.toInt()
        val age = 2026 - year - 7
        println("Возраст 7 лет назад: $age")
    } catch (e: Exception) {
        println("Ошибка ввода")
    }
}

