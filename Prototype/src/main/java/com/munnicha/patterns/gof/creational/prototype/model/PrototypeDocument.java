package com.munnicha.patterns.gof.creational.prototype.model;

/**
 *
 * @author munnicha
 */
public abstract class PrototypeDocument implements Cloneable{
    
    private String vendorName;
    private String content;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public abstract PrototypeDocument cloneDocument() throws CloneNotSupportedException;
    
}
