# Java Masterclass 2025

# 1. ЗАДАНИЯ
1. Написать строку "Hello, Java 25!" (тестовое) [HelloWorld.java](module-01-core/task-01-hello-world/src/main/java/com/prosoft/core/task01/HelloWorld.java)  

# 2. НАСТРОЙКИ
### 2.1. КАК ПРОВЕРИТЬ ЛОКАЛЬНО В IDE
1. Запускается `public class HelloWorld {` из IDE
2. Запускается тесты `class HelloWorldTest {` из IDE
3. Проверка запуска тестов из командной строки: 
```
./gradlew test
```
Должно быть: 
```angular2html
BUILD SUCCESSFUL in ...ms
```

### 2.2. КАК ПРОВЕРИТЬ В GitHub
1. Запушь этот файл
2. Создай ветку task-01-hello-world-test
3. Пушни → GitHub
4. Зади на GitHub → Actions → Test Solution
5. Если зелёный — всё работает!