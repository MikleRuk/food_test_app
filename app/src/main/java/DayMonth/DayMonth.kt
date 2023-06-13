package DayMonth

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateUtils {
    companion object {
        fun getCurrentDateAndMonth(): String {
            // Получаем текущую дату
            val currentDate = LocalDate.now()

            // Получаем день и месяц в нужном формате
            val dayOfMonth = currentDate.dayOfMonth
            val month = currentDate.month

            // Форматируем дату и месяц
            val dateFormatter = DateTimeFormatter.ofPattern("d MMMM", Locale("ru"))
            val dateString = currentDate.format(dateFormatter)

            // Возвращаем строку с датой и месяцем
            return dateString
        }
    }
}