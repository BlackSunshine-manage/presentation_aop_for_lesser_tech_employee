package object_oriented_design;

class Стройплощадка {
    Ведро ведро = new Ведро();
    Лопата лопата = new Лопата();
    Песок песок = new Песок();
    Цементная_смесь цементная_смесь = new Цементная_смесь();
    Вода вода = new Вода();
    public void замес_бетона(Строитель строитель) {
        строитель.взять(лопата);
        строитель.применить(песок);
        строитель.применить(цементная_смесь);
        строитель.положить(лопата);
        строитель.взять(ведро);
        строитель.применить(вода);
        строитель.положить(ведро);
    }
}