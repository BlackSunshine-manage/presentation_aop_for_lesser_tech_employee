package object_oriented_design_object_style;

class Рация {
    Рация(Прораб прораб) {
        this.прораб = прораб;
    }
    Прораб прораб;
    void сообщить(String сообщение) {
        прораб.принять_сообщение(сообщение);
    }
}