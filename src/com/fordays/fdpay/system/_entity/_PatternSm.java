package com.fordays.fdpay.system._entity;



/**
 * PatternSm generated by hbm2java
 */


public class _PatternSm 

  extends org.apache.struts.action.ActionForm implements Cloneable
 {
	private static final long serialVersionUID = 1L;

    // Fields    

     protected int id;
     protected String name;
     protected Integer status;
     protected String content;
     protected String code;

     // Constructors
   
    // Property accessors


    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    


    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    


    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    


    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    


    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
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


