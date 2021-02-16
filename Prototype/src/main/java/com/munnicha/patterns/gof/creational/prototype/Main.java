package com.munnicha.patterns.gof.creational.prototype;

import com.munnicha.patterns.gof.creational.prototype.model.PrototypeDocument;

/**
 *
 * @author munnicha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        System.out.println("Prototype Pattern");
        //1. GDPR
        PrototypeDocument gdpr = DocumentPrototypeManager.getClonedDocument("GDPR");
        gdpr.setVendorName("VNDR Corp.");
        //2. Contract
        PrototypeDocument contract = DocumentPrototypeManager.getClonedDocument("CompletionOfContract");
        contract.setVendorName("VNDR Corp.");
        //3. Course
        PrototypeDocument course = DocumentPrototypeManager.getClonedDocument("CompletionOfCourse");
        course.setVendorName("VNDR Corp.");
        //Actions
        System.out.println(gdpr);
        System.out.println(contract);
        System.out.println(course);
    }
}
