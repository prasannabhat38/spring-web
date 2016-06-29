package com.springweb.model;


public class Foo {
    public final String DEFAULT_VERSION = "1.0";
    
    private Integer id;
    private String version;
    
    public Foo(Integer id) {
        this.id = id;
        version = DEFAULT_VERSION;
    }
    
    public Foo(Integer id, String version) {
        this.id = id;
        this.version = version;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    
    public String toString() {
        return "id: " + this.id.toString() + " ver:" + this.version; 
    }
}
