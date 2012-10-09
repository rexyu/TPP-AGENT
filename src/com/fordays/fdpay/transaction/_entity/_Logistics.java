package com.fordays.fdpay.transaction._entity;



/**
 * Logistics generated by hbm2java
 */


public class _Logistics 

  extends org.apache.struts.action.ActionForm implements Cloneable
 {
	private static final long serialVersionUID = 1L;

    // Fields    

     protected long id;
     protected String no;
     protected String companyName;
     protected String note;
     protected Long type;
     protected java.sql.Timestamp consignmentDate;
     protected com.fordays.fdpay.transaction.OrderDetails orderDetails;

     // Constructors
   
    // Property accessors


    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    


    public String getNo() {
        return this.no;
    }
    
    public void setNo(String no) {
        this.no = no;
    }
    


    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    


    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    


    public Long getType() {
        return this.type;
    }
    
    public void setType(Long type) {
        this.type = type;
    }
    


    public java.sql.Timestamp getConsignmentDate() {
        return this.consignmentDate;
    }
    
    public void setConsignmentDate(java.sql.Timestamp consignmentDate) {
        this.consignmentDate = consignmentDate;
    }
    


    public com.fordays.fdpay.transaction.OrderDetails getOrderDetails() {
        return this.orderDetails;
    }
    
    public void setOrderDetails(com.fordays.fdpay.transaction.OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }
    




  // The following is extra code specified in the hbm.xml files

  public Object clone()
  {
    Object o = null;
    try
    {
      o = super.clone();
    }
    catch (CloneNotSupportedException e)
    {
      e.printStackTrace();
    }
    return o;
}

private String thisAction="";
 public String getThisAction()
 {
     return thisAction;
 }


public void setThisAction(String thisAction)
 {
     this.thisAction=thisAction;
 }

private int index=0;
 public int getIndex()
 {
     return index;
 }


public void setIndex(int index)
 {
     this.index=index;
 }
 





  // end of extra code specified in the hbm.xml files


}


