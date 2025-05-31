package org.example.models.enums;

public enum RelationStatus {
    SENT("Отправлен"),
    REJECTED("Отклонен"),
    APPROVED("Подтвержден"),
    WATCHED("Просмотрено");

    private final String def;

    RelationStatus(String def) {
        this.def = def;
    }

    public String getDef() {
        return def;
    }



    /*
    * Сохранение юзеров
    * Создание аккаунта
    * Создание юзера
    * */

}
