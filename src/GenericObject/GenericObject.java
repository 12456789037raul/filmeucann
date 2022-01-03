/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericObject;

/**
 *
 * @author vicente-jpro
 */
public class GenericObject {
    private Object objectName;

    public GenericObject(Object objectName) {
        this.objectName = objectName;
    }

    public Object getObjectName() {
        return objectName;
    }

    public void setObjectName(Object objectName) {
        this.objectName = objectName;
    }
    
    public String toString(){
        return objectName.toString();
    }
}
