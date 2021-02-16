package com.munnicha.patterns.gof.creational.prototype.test;

import com.munnicha.patterns.gof.creational.prototype.DocumentPrototypeManager;
import com.munnicha.patterns.gof.creational.prototype.model.CertificateOfCompletionDocument;
import com.munnicha.patterns.gof.creational.prototype.model.GDPRDocument;
import com.munnicha.patterns.gof.creational.prototype.model.PrototypeDocument;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author munnicha
 */
public class PrototypeTest {
    
    @Test
    public void testPrototype(){
        //1. GDPR
        PrototypeDocument gdpr1 = DocumentPrototypeManager.getClonedDocument("GDPR");
        gdpr1.setVendorName("VNDR Corp. - 1");
        PrototypeDocument gdpr2 = DocumentPrototypeManager.getClonedDocument("GDPR");
        gdpr2.setVendorName("VNDR Corp. - 2");
        //2. Contract
        PrototypeDocument contract = DocumentPrototypeManager.getClonedDocument("CompletionOfContract");
        contract.setVendorName("VNDR Corp.");
        //3. Course
        PrototypeDocument course = DocumentPrototypeManager.getClonedDocument("CompletionOfCourse");
        course.setVendorName("VNDR Corp.");

        assertNotEquals(gdpr1,gdpr2);
        assertEquals(contract.getVendorName(),"VNDR Corp.");
        assertNotEquals(contract.getContent(),course.getContent());
    }
    
    @Test
    public void testPrototypeDoesNotExist(){
        //1. No such document
        PrototypeDocument termsAndConditions = DocumentPrototypeManager.getClonedDocument("TermsAndConditions");
        assertEquals(termsAndConditions, null);
    } 
}
