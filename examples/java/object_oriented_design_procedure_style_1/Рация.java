package object_oriented_design_procedure_style_1;

import object_oriented_design_procedure_style.Прораб;

class Рация {
    Рация(Прораб прораб) {
        this.прораб = прораб;
    }
    Прораб прораб;
    void сообщить(String сообщение) {
        прораб.принять_сообщение(сообщение);
    }
}