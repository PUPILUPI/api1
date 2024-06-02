package com.example.demo.entity;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

@Data
@JacksonXmlRootElement(localName = "Detail")
public class Detail {
    @JacksonXmlProperty
    public String mfr;
    @JacksonXmlProperty
    public String part;
    @JacksonXmlProperty
    public String note;
    @JacksonXmlProperty
    public String pack;
    @JacksonXmlProperty
    public String min;
    @JacksonXmlProperty
    public String img;
    @JacksonXmlProperty
    public String pdf;
    @JacksonXmlProperty
    public String dc;
    @JacksonXmlProperty
    public String cur;
    @JacksonXmlProperty
    public String p1;
    @JacksonXmlProperty
    public String p2;
    @JacksonXmlProperty
    public String p3;
    @JacksonXmlProperty
    public String stock;
    @JacksonXmlProperty
    public String instock;

    public Detail(String part, String p1, String p2, String p3, String stock, String inStock) {
        this.part = part;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.stock = stock;
        this.instock = inStock;
    }

}
