package com.meehealth.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user_test")
public class Customers {

  private String custId;
  private String custName;
  private String custAddress;
  private String custCity;
  private String custState;
  private String custZip;
  private String custCountry;
  private String custContact;
  private String custEmail;


  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
  }


  public String getCustName() {
    return custName;
  }

  public void setCustName(String custName) {
    this.custName = custName;
  }


  public String getCustAddress() {
    return custAddress;
  }

  public void setCustAddress(String custAddress) {
    this.custAddress = custAddress;
  }


  public String getCustCity() {
    return custCity;
  }

  public void setCustCity(String custCity) {
    this.custCity = custCity;
  }


  public String getCustState() {
    return custState;
  }

  public void setCustState(String custState) {
    this.custState = custState;
  }


  public String getCustZip() {
    return custZip;
  }

  public void setCustZip(String custZip) {
    this.custZip = custZip;
  }


  public String getCustCountry() {
    return custCountry;
  }

  public void setCustCountry(String custCountry) {
    this.custCountry = custCountry;
  }


  public String getCustContact() {
    return custContact;
  }

  public void setCustContact(String custContact) {
    this.custContact = custContact;
  }


  public String getCustEmail() {
    return custEmail;
  }

  public void setCustEmail(String custEmail) {
    this.custEmail = custEmail;
  }

}
