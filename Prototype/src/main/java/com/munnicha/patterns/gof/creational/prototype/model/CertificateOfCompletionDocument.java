package com.munnicha.patterns.gof.creational.prototype.model;

/**
 *
 * @author munnicha
 */
public class CertificateOfCompletionDocument extends PrototypeDocument{

    private Approver approver;
    
    @Override
    public PrototypeDocument cloneDocument() throws CloneNotSupportedException {
        CertificateOfCompletionDocument cloneCocd = (CertificateOfCompletionDocument) super.clone();
        Approver cloneApprover = (Approver) cloneCocd.getApprover().clone();
        cloneCocd.setApprover(cloneApprover);
        return cloneCocd;
    }

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }
    
    @Override
    public String toString() {
        return "CertificateOfCompletionDocument: Vendor Name - " + getVendorName() + ", Content - " + getContent() + ", Approver - " + getApprover().getName();
    }
    
}
