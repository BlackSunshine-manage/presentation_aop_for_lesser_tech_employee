package object_oriented_design_object_style;

import object_oriented_design_procedure_style_after_refactoring.Прораб;
import object_oriented_design_procedure_style_after_refactoring.Строитель;
import object_oriented_design_procedure_style_after_refactoring.Стройплощадка;

class ObjectOrientedDesign {
    {
        object_oriented_design_procedure_style_after_refactoring.Прораб прораб = new Прораб();
        object_oriented_design_procedure_style_after_refactoring.Строитель строитель = new object_oriented_design_procedure_style_after_refactoring.Строитель();
        object_oriented_design_procedure_style_after_refactoring.Стройплощадка стройплощадка = new object_oriented_design_procedure_style_after_refactoring.Стройплощадка();
        прораб.замешай_бетон(строитель, стройплощадка);
        ...
    }
}