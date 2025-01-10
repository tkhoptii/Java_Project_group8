package Juia_folder;
/*2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int */


public class Week4_ReverseNegative {

        public static void main(String[] args) {
            int num = -1234; // Задаём отрицательное число
            int reversedNum = reverseNegativeNumber(num); // Вызываем метод
            System.out.println(reversedNum); // Ожидаемый вывод: -4321
        }

        public static int reverseNegativeNumber(int num) {
            if (num < 0) { // Проверяем, что число отрицательное
                num = num * -1; // Делаем число положительным, убирая минус
            }

            int reversed = 0; // Переменная для хранения развернутого числа

            while (num > 0) { // Пока число больше нуля
                int lastDigit = num % 10; // Берём последнюю цифру числа
                reversed = reversed * 10 + lastDigit; // Добавляем цифру к развернутому числу
                num = num / 10; // Убираем последнюю цифру из исходного числа
            }

            return -reversed; // Возвращаем развернутое число с минусом
        }
    }



