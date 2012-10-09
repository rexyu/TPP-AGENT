package com.fordays.fdpay.user._entity;



/**
 * SysUser generated by hbm2java
 */


public class _SysUser 

  extends org.apache.struts.action.ActionForm implements Cloneable
 {
	private static final long serialVersionUID = 1L;

    // Fields    

     protected long userId;
     protected String userName;
     protected String userNo;
     protected String userPassword;
     protected Long userStatus;
     protected Long userType;
     protected java.util.Set sysLogs = new java.util.HashSet(0);
     protected java.util.Set draws = new java.util.HashSet(0);
     protected java.util.Set drawLogs = new java.util.HashSet(0);
     protected java.util.Set charges = new java.util.HashSet(0);

     // Constructors
   
    // Property accessors


    public long getUserId() {
        return this.userId;
    }
    
    public void setUserId(long userId) {
        this.userId = userId;
    }
    


    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    


    public String getUserNo() {
        return this.userNo;
    }
    
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
    


    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    


    public Long getUserStatus() {
        return this.userStatus;
    }
    
    public void setUserStatus(Long userStatus) {
        this.userStatus = userStatus;
    }
    


    public Long getUserType() {
        return this.userType;
    }
    
    public void setUserType(Long userType) {
        this.userType = userType;
    }
    


    public java.util.Set getSysLogs() {
        return this.sysLogs;
    }
    
    public void setSysLogs(java.util.Set sysLogs) {
        this.sysLogs = sysLogs;
    }
    


    public java.util.Set getDraws() {
        return this.draws;
    }
    
    public void setDraws(java.util.Set draws) {
        this.draws = draws;
    }
    


    public java.util.Set getDrawLogs() {
        return this.drawLogs;
    }
    
    public void setDrawLogs(java.util.Set drawLogs) {
        this.drawLogs = drawLogs;
    }
    


    public java.util.Set getCharges() {
        return this.charges;
    }
    
    public void setCharges(java.util.Set charges) {
        this.charges = charges;
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


