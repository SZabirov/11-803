package com.company.v2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        NoteUser user = new NoteUser();
        Class<NoteUser> userClass = NoteUser.class;
        Field[] allFields =
                userClass.getDeclaredFields();
        for (Field f : allFields) {
            Annotation[] annotations =
                    f.getAnnotations();
            if (Arrays.stream(annotations)
                    .map(Annotation::annotationType)
                    .collect(Collectors.toList())
                    .contains(InjectImpl.class)) {
                String interfaceName = f.getType().getName();
                String className = interfaceName + "Impl";
                Class classToInstantiate = Class.forName(className);
                Object o = classToInstantiate.newInstance();
                f.setAccessible(true);
                f.set(user, o);
            }
        }
        user.takeNotes(5);
    }
}
