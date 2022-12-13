package zadanie14;

import java.lang.reflect.Field;
import java.util.Objects;

public class FieldEqualsValidator {

    public static boolean validate (Object object) throws Exception {
        Class<?> clazz = object.getClass();

        if(clazz.isAnnotationPresent(FieldEquals.class)) {
            FieldEquals fieldEquals = clazz.getDeclaredAnnotation(FieldEquals.class);
            Object firstValue = null;
            Object secondValue = null;
            String fieldOneName = "";
            String fieldSecondName = "";

            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields) {
                if(field.getName().equals(fieldEquals.firstField())) {
                    fieldOneName = field.getName();
                    firstValue = field.get(object);
                }if(field.getName().equals(fieldEquals.secondField())) {
                    fieldSecondName = field.getName();
                    secondValue = field.get(object);
                }
            }
            if (!fieldOneName.equals(fieldSecondName)) {
                return false;
            }
            return Objects.equals(firstValue, secondValue);
        }
        return false;
    }
}
