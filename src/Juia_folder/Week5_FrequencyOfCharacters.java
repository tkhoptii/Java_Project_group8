package Juia_folder;
// Write a return method that can find the frequency of characters
//  Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

public class Week5_FrequencyOfCharacters {
        public static void main(String[] args) {
            String input = "AAABBCDD";
            String result = frequencyOfChars(input);// вызываем метод
            System.out.println(result); // Вывод: A3B2C1D2
        }

        public static String frequencyOfChars(String str) {
            StringBuilder result = new StringBuilder(); // Строка для хранения результата
            while (!str.isEmpty()) { // Пока строка не пустая
                char currentChar = str.charAt(0); // Берём первый символ
                int count = 0; // Переменная для подсчёта

                // Считаем, сколько раз текущий символ встречается
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == currentChar) {
                        count++;
                    }
                }

                // Добавляем символ и его частоту в результат
                result.append(currentChar).append(count);

                // Убираем из строки все вхождения текущего символа
                str = str.replace(String.valueOf(currentChar), "");
            }
            return result.toString(); // Возвращаем результат как строку
        }
    }

