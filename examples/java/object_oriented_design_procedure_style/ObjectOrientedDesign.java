package object_oriented_design_procedure_style;

import object_oriented_design.Прораб;
import object_oriented_design.Строитель;
import object_oriented_design.Стройплощадка;

class ObjectOrientedDesign {
    {
        object_oriented_design.Прораб прораб = new Прораб();
        object_oriented_design.Строитель строитель = new object_oriented_design.Строитель();
        object_oriented_design.Стройплощадка стройплощадка = new object_oriented_design.Стройплощадка();
        прораб.замешай_бетон(строитель, стройплощадка);
        ...
    }
}