package com.fordays.fdpay.transaction._entity;



/**
 * 订单类
 * OrderDetails generated by hbm2java
 */


public class _OrderDetails 

  extends org.apache.struts.action.ActionForm implements Cloneable
 {
	private static final long serialVersionUID = 1L;

    // Fields    

     protected long id;   //主键
     protected String orderNo;
     protected String orderDetailsNo; //交易号
     protected String referenceOrderDetailsNo;//外部订单号
     protected String shopName; //商品名称
     protected java.math.BigDecimal shopPrice;//商品价格
     protected Long shopTotal;//商品数量
     protected String shopUrl;//商品展示地
     protected String detailsContent;//说明
     protected Long logisticsType;//物流方式
     protected Long emailPriceUndertake;//邮费承担方
     protected java.math.BigDecimal emailPrice;//邮费
     protected java.math.BigDecimal salePrice;//折扣
     protected Long orderDetailsType;//交易类型
     protected Long buyType;//购买类型
     protected String paymentReason;//付款原因
     protected java.math.BigDecimal paymentPrice;//付款金额
     protected String consigneeAddress;//收货地址
     protected java.sql.Timestamp createDate;//创建时间
     protected java.sql.Timestamp finishDate;//完成时间
     protected Long status;//交易状态
     protected String partner;//买方商户
     protected String refundsNote;//
     protected java.sql.Timestamp consignmentDate;//发货时间
     protected java.sql.Timestamp repaymentDate;//预计还款时间
     protected java.math.BigDecimal repayAmount;
     protected java.util.Set transactions = new java.util.HashSet(0);
     protected com.fordays.fdpay.agent.Agent agent;
     protected java.util.Set logisticss = new java.util.HashSet(0);
     protected java.util.Set actionLogs = new java.util.HashSet(0);

     // Constructors
   
    // Property accessors


    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    


    public String getOrderNo() {
        return this.orderNo;
    }
    
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    


    public String getOrderDetailsNo() {
        return this.orderDetailsNo;
    }
    
    public void setOrderDetailsNo(String orderDetailsNo) {
        this.orderDetailsNo = orderDetailsNo;
    }
    


    public String getReferenceOrderDetailsNo() {
        return this.referenceOrderDetailsNo;
    }
    
    public void setReferenceOrderDetailsNo(String referenceOrderDetailsNo) {
        this.referenceOrderDetailsNo = referenceOrderDetailsNo;
    }
    


    public String getShopName() {
        return this.shopName;
    }
    
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    


    public java.math.BigDecimal getShopPrice() {
        return this.shopPrice;
    }
    
    public void setShopPrice(java.math.BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }
    


    public Long getShopTotal() {
        return this.shopTotal;
    }
    
    public void setShopTotal(Long shopTotal) {
        this.shopTotal = shopTotal;
    }
    


    public String getShopUrl() {
        return this.shopUrl;
    }
    
    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }
    


    public String getDetailsContent() {
        return this.detailsContent;
    }
    
    public void setDetailsContent(String detailsContent) {
        this.detailsContent = detailsContent;
    }
    


    public Long getLogisticsType() {
        return this.logisticsType;
    }
    
    public void setLogisticsType(Long logisticsType) {
        this.logisticsType = logisticsType;
    }
    


    public Long getEmailPriceUndertake() {
        return this.emailPriceUndertake;
    }
    
    public void setEmailPriceUndertake(Long emailPriceUndertake) {
        this.emailPriceUndertake = emailPriceUndertake;
    }
    


    public java.math.BigDecimal getEmailPrice() {
        return this.emailPrice;
    }
    
    public void setEmailPrice(java.math.BigDecimal emailPrice) {
        this.emailPrice = emailPrice;
    }
    


    public java.math.BigDecimal getSalePrice() {
        return this.salePrice;
    }
    
    public void setSalePrice(java.math.BigDecimal salePrice) {
        this.salePrice = salePrice;
    }
    


    public Long getOrderDetailsType() {
        return this.orderDetailsType;
    }
    
    public void setOrderDetailsType(Long orderDetailsType) {
        this.orderDetailsType = orderDetailsType;
    }
    


    public Long getBuyType() {
        return this.buyType;
    }
    
    public void setBuyType(Long buyType) {
        this.buyType = buyType;
    }
    


    public String getPaymentReason() {
        return this.paymentReason;
    }
    
    public void setPaymentReason(String paymentReason) {
        this.paymentReason = paymentReason;
    }
    


    public java.math.BigDecimal getPaymentPrice() {
        return this.paymentPrice;
    }
    
    public void setPaymentPrice(java.math.BigDecimal paymentPrice) {
        this.paymentPrice = paymentPrice;
    }
    


    public String getConsigneeAddress() {
        return this.consigneeAddress;
    }
    
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }
    


    public java.sql.Timestamp getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(java.sql.Timestamp createDate) {
        this.createDate = createDate;
    }
    


    public java.sql.Timestamp getFinishDate() {
        return this.finishDate;
    }
    
    public void setFinishDate(java.sql.Timestamp finishDate) {
        this.finishDate = finishDate;
    }
    


    public Long getStatus() {
        return this.status;
    }
    
    public void setStatus(Long status) {
        this.status = status;
    }
    


    public String getPartner() {
        return this.partner;
    }
    
    public void setPartner(String partner) {
        this.partner = partner;
    }
    


    public String getRefundsNote() {
        return this.refundsNote;
    }
    
    public void setRefundsNote(String refundsNote) {
        this.refundsNote = refundsNote;
    }
    


    public java.sql.Timestamp getConsignmentDate() {
        return this.consignmentDate;
    }
    
    public void setConsignmentDate(java.sql.Timestamp consignmentDate) {
        this.consignmentDate = consignmentDate;
    }
    


    public java.sql.Timestamp getRepaymentDate() {
        return this.repaymentDate;
    }
    
    public void setRepaymentDate(java.sql.Timestamp repaymentDate) {
        this.repaymentDate = repaymentDate;
    }
    


    public java.math.BigDecimal getRepayAmount() {
        return this.repayAmount;
    }
    
    public void setRepayAmount(java.math.BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }
    


    public java.util.Set getTransactions() {
        return this.transactions;
    }
    
    public void setTransactions(java.util.Set transactions) {
        this.transactions = transactions;
    }
    


    public com.fordays.fdpay.agent.Agent getAgent() {
        return this.agent;
    }
    
    public void setAgent(com.fordays.fdpay.agent.Agent agent) {
        this.agent = agent;
    }
    


    public java.util.Set getLogisticss() {
        return this.logisticss;
    }
    
    public void setLogisticss(java.util.Set logisticss) {
        this.logisticss = logisticss;
    }
    


    public java.util.Set getActionLogs() {
        return this.actionLogs;
    }
    
    public void setActionLogs(java.util.Set actionLogs) {
        this.actionLogs = actionLogs;
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


