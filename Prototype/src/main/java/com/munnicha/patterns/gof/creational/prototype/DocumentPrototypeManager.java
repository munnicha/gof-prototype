package com.munnicha.patterns.gof.creational.prototype;

import com.munnicha.patterns.gof.creational.prototype.model.Approver;
import com.munnicha.patterns.gof.creational.prototype.model.CertificateOfCompletionDocument;
import com.munnicha.patterns.gof.creational.prototype.model.GDPRDocument;
import com.munnicha.patterns.gof.creational.prototype.model.PrototypeDocument;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author munnicha
 */
public class DocumentPrototypeManager {
    
    private static final Map<String,PrototypeDocument> documents;
    
    static {
        //Load documents
        //1. GDPR document
        GDPRDocument gdpr = new GDPRDocument();
        gdpr.setVendorName("Default VendorName");
        gdpr.setContent("GDPR content legal document...");
        //2. Certificate of Completion of contract
        CertificateOfCompletionDocument contract = new CertificateOfCompletionDocument();
        Approver contractApprover = new Approver();
        contractApprover.setName("Treasure Jemmy");
        contractApprover.setRole("seller");
        contract.setVendorName("Default VendorName");
        contract.setContent("The contract has been performed...");
        contract.setApprover(contractApprover);
        //3. Certificate of Completion of course
        CertificateOfCompletionDocument course = new CertificateOfCompletionDocument();
        Approver courseApprover = new Approver();
        courseApprover.setName("Jeannine Elea");
        courseApprover.setRole("instructor");
        course.setVendorName("Default VendorName");
        course.setContent("The course has been completed successfully...");
        course.setApprover(courseApprover);
        //Add documents to the map
        documents = new HashMap<>();
        documents.put("GDPR", gdpr);
        documents.put("CompletionOfContract",contract);
        documents.put("CompletionOfCourse",course);
    }
    
    public static PrototypeDocument getClonedDocument(String type){
        PrototypeDocument clonedDoc;
        try{
            PrototypeDocument doc = documents.get(type);
            clonedDoc = doc.cloneDocument();
            return clonedDoc;
        }catch(CloneNotSupportedException  e){
            System.out.println("Clone not supported: "+e.getMessage());
            return null;
        }catch(NullPointerException e){
            System.out.println("Document does not exist: "+type);
            return null;
        }
    }
    
}
