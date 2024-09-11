public class Main {
    public static void main(String[] args) {
            Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            // Создаем фильтр, который будет оставлять только четные числа
            Filter evenFilter = new Filter() {
                @Override
                public Object apply(Object o) {
                    if (o instanceof Integer) {
                        return (Integer) o % 2 == 0 ? o : null; // Возвращаем элемент, если он четный
                    }
                    return null;
                }
            };

            Integer[] filteredNumbers = ArrayUtils.filter(numbers, evenFilter, Integer.class);

            // Выводим отфильтрованные числа
            for (Integer number : filteredNumbers) {
                System.out.print(number + " "); // Ожидается: 2 4 6 8 10
            }
        }
    }
