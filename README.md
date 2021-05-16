# java_labs
Завдання
Створити консольну програму мовою Java і написати клас із вашої лабораторної роботи 1:
Додаткових 5 приватних полів, які найкраще описують даний клас (додатково до полів, вказаних в таблиці)
Методи доступу до цих полів (наприклад для поля name – getName() і setName())
Статичне поле (числового типу)
Для кожного класу слід додати 2 захищених поля (protected)
Поля з пунктів 3 і 4 мають представляти атрибути описуваного класу
Дефолтний конструктор, конструктор з чотирма параметрами (першими чотирма властивостями з п.1) і конструктор з усіма полями. При роботі з конструкторами слід переадресовувати виклик в один з конструктор з-за допомогою this та уникати копіювання коду
Методи
toString - вивести інформацію про об’єкт
Статичний метод printStaticField() - виводить інформацію про значення статичного поля (де Field - назва поля)
Метод printField()  - виводить інформацію про значення статичного поля
resetValues(параметри) - змінює значення всіх полів на передані в параметрах
Розроблений код має бути залито в гіт репозиторій! В репозиторії мать бути README і .gitignore файл.

В main() методі визначіть 3 об’єкти типу із завдання (з-за допомогою різних конструкторів) та виведіть інформацію про них з-за допомогою методу toString() та виведіть інформацію за допомогою методів printStaticField() і printField()


Умова
Створити клас “Повідок для тварин” котрий містить поля:
- виробник
- максимальна довжина повідка (в метрах)
- максимальна маса тварини (в кілограмах)
- колір


    Інструкція по запуску:

    1. Клонувати репозиторій (Ввести в терміналі git clone https://github.com/Zarikkk/laba7)
    2. Перейти в папку з даним репозиторієм
    3. Запустити lab7.java