import java.lang.reflect.Array;

public class ArrayUtils {
    public static <T> T[] filter(T[] array, Filter filter, Class<T> clazz) {
        // Создаем список для хранения результатов
        Object[] result = new Object[array.length];
        int count = 0;

        for (T element : array) {
            // Применяем фильтр к текущему элементу
            Object appliedValue = filter.apply(element);
            // Если результат не равен null, добавляем в результат
            if (appliedValue != null) {
                result[count++] = appliedValue;
            }
        }

        // Создаем новый массив нужного типа с учетом количества элементов
        T[] finalResult = (T[]) Array.newInstance(clazz, count);
        System.arraycopy(result, 0, finalResult, 0, count); // Копируем результат

        return finalResult;
    }
}
