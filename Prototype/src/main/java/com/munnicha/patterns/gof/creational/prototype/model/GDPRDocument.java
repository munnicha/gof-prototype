package com.munnicha.patterns.gof.creational.prototype.model;

/**
 *
 * @author munnicha
 */
public class GDPRDocument extends PrototypeDocument{

    @Override
    public PrototypeDocument cloneDocument() throws CloneNotSupportedException{
        return (GDPRDocument) super.clone();
    }
    
    @Override
    public String toString() {
        return "GDPR: Vendor Name - " + getVendorName() + ", Content - " + getContent();
    }
}
