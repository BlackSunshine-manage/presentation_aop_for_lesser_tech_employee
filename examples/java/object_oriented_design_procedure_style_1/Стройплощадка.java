package object_oriented_design_procedure_style_1;

import object_oriented_design.Ведро;
import object_oriented_design.Вода;
import object_oriented_design.Лопата;
import object_oriented_design.Песок;
import object_oriented_design.Строитель;
import object_oriented_design.Цементная_смесь;

class Стройплощадка {
    Ведро ведро = new Ведро();
    Лопата лопата = new Лопата();
    Песок песок = new Песок();
    Цементная_смесь цементная_смесь = new Цементная_смесь();
    Вода вода = new Вода();
    public void замес_бетона(Строитель строитель) {
        ()(строитель.взять_из_инвентаря());
        строитель.
        строитель.взять(лопата);
        строитель.применить(песок);
        строитель.применить(цементная_смесь);
        строитель.положить(лопата);
        строитель.взять(ведро);
        строитель.применить(вода);
        строитель.положить(ведро);
    }
}