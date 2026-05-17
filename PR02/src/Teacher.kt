class Teacher : User()
{
    fun getQualification(year: Int): String
    {
        if (year < 5)
            return "Начинающий"

        else if (year < 10)
            return "Опытный"

        else
            return "Профессиональный"
    }
}