# Java Masterclass

## Как решать задания (автоматически!)

1. **Форкни репозиторий** (кнопка **Fork** вверху)
2. **Клонируй свой форк**
   ```bash
   git clone https://github.com/ТВОЙ-ЛОГИН/java-masterclass.git
   ```
3. **Создай ветку**
   ```bash
   git checkout -b task-01-hello-world-ИМЯ
   ```
4. **Реши задание** в `module-01-core/task-01-hello-world/`
5. **Запусти тесты локально**
   ```bash
   ./gradlew test
   ```
6. **Запушь в свой форк**
   ```bash
   git push origin task-01-hello-world-ИМЯ
   ```
7. **Перейди в `Actions`** → увидишь результат!
> **Зелёный — сдал. Красный — исправь.**

## Как получить новые задания

### Вариант 1: Через кнопку (рекомендуется)
1. Зайди в **свой форк**
2. Нажми **"Sync fork"** → **"Update branch"**

### Вариант 2: Через терминал
```bash
# Один раз:
git remote add upstream https://github.com/sproshchaev/java-masterclass.git

# При новых модулях:
git checkout main
git fetch upstream
git reset --hard upstream/main
git push origin main --force
```

> **Твои решения в ветках `task-*` — не пострадают!**

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

2. Создай ветку - имя ветки должно обязательно начинаться с "task-", примеры: 
```angular2html
task-01-hello-world-test
task-02-calculator-test
и тп
```
3. Выполни задание
4. Пушни выполненное задание из ветки "task-..." на GitHub
5. Зади на GitHub → Actions → Test Solution
6. Если зелёный — всё работает!