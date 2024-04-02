package object_oriented_design_procedure_style_after_refactoring;

class Рация {
    Рация(Прораб прораб) {
        this.прораб = прораб;
    }
    Прораб прораб;
    void сообщить(String сообщение) {
        прораб.принять_сообщение(сообщение);
    }
}