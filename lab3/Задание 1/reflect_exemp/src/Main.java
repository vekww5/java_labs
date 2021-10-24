import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Main {

    public static void main(String args[])
    {
        try {
            Class cls = Class.forName("ClassC");
            ClassC classC = (ClassC) cls.newInstance();

            System.out.println("-------------------Поля класса-------------------");
            Field fieldlist[] = cls.getDeclaredFields();
            for (int i = 0; i < fieldlist.length; i++) {
                Field fld = fieldlist[i];
                System.out.println("name = " + fld.getName());
                System.out.println("decl class = " + fld.getDeclaringClass());
                System.out.println("type = " + fld.getType());
                int mod = fld.getModifiers();
                System.out.println("modifiers = " + Modifier.toString(mod));
                System.out.println("-----");
            }

            System.out.println("-------------------Методы класса-------------------");
            Method methlist[] = cls.getDeclaredMethods();
            for (int i = 0; i < methlist.length; i++) {
                Method m = methlist[i];

                System.out.println("name = " + m.getName());
                System.out.println("decl class = " + m.getDeclaringClass());

                Class pvec[] = m.getParameterTypes();
                for (int j = 0; j < pvec.length; j++)
                    System.out.println("param #" + j + " " + pvec[j]);

                Class evec[] = m.getExceptionTypes();
                for (int j = 0; j < evec.length; j++)
                    System.out.println("exc #" + j + " " + evec[j]);

                Annotation[] annotations = m.getAnnotations();
                System.out.print("annotation = ");
                for (Annotation a : annotations){
                    System.out.print(a.annotationType().getSimpleName()+" ");
                }

                System.out.println("");

                System.out.println("return type = " + m.getReturnType());
                System.out.println("-----");
            }

            System.out.println("-------------------Запуск методов-------------------");

            Method method = cls.getMethod("f2");
            System.out.print(method.toString() + " -> ");
            method.invoke(classC);

            method = cls.getMethod("StrPlusI", String.class);
            System.out.print(method.toString() + " -> ");
            method.invoke(classC, "Text");

            method = cls.getMethod("sum", Integer.TYPE, Integer.TYPE);
            System.out.print(method.toString() + " -> ");
            Object obj = method.invoke(classC, 2, 5);
            System.out.println((int)obj);

            System.out.println("-------------------Предки класса-------------------");

            Class subclass = classC.getClass();
            Class superclass = subclass.getSuperclass();
            while (superclass != null) {
                String className = superclass.getName();
                System.out.println(className);
                subclass = superclass;
                superclass = subclass.getSuperclass();
            }

        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}


