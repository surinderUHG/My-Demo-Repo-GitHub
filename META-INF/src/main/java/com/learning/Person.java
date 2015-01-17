package com.learning;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person
{
    private String name;
    private String dob;
 
    @XmlElementWrapper(name = "emailAddresses")
    @XmlElement(name = "emailAddress")
    private List<EmailAddress> emailAddresses;
 
    public String getName() { return name; }
 
    public void setName(String name) { this.name = name; }
 
    public String getDob() { return dob; }
 
    public void setDob(String dob) { this.dob = dob; }
 
    public List<EmailAddress> getEmailAddresses() { return emailAddresses; }
 
    public void setEmailAddresses(List<EmailAddress> emailAddresses) { this.emailAddresses = emailAddresses; }
}