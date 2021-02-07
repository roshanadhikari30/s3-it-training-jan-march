package com.example.demo.api.oop2;

import com.example.demo.api.oop.Parent;

public class OOP4 {

    public void testingAccessModifiersProtectedFromParent() {
        Parent parent = new Parent();
        parent.getOtherInformation();

        /*
        you cannot access getDocuments because it is protected by Parent
         */
    }
}
