fun main()
{
    val c = Country()
    print("Введите площадь: ")
    try
    {
        val area = readLine()!!.toDouble()
        println(c.getArea(area))
    }
    catch (e: Exception)
    {
        println("Ошибка")
    }
    // 2 задание
    val car = Car()
    val cars = arrayOf(
        "BMW",
        "Audi",
        "Toyota"
    )
    for (i in cars)
    {
        println(car.getModel(i))
    }
    // 3 задание
    val b = Book()
    print("Введите название: ")
    val title = readLine()!!
    print("Введите автора: ")
    val author = readLine()!!
    print("Введите страницы: ")
    try
    {
        val pages = readLine()!!.toInt()
        println(b.getBookInfo(title, author, pages))
    }
    catch (e: Exception)
    {
        println("Ошибка")
    }
    // 4 задание
    val t = Teacher()
    print("Введите имя: ")
    val name = readLine()!!
    print("Введите фамилию: ")
    val surname = readLine()!!
    print("Введите стаж: ")
    try
    {
        val year = readLine()!!.toInt()
        println(t.getFullName(name, surname))
        println(t.getQualification(year))
    }
    catch (e: Exception)
    {
        println("Ошибка")
    }
}