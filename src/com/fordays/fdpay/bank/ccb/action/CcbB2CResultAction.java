package com.fordays.fdpay.bank.ccb.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.fordays.fdpay.bank.BankAction;
import com.fordays.fdpay.bank.FinishCharge;
import com.fordays.fdpay.bank.ccb.CcbB2CResultFromBank;
import com.fordays.fdpay.bank.ccb.biz.CcbBankBiz;
import com.fordays.fdpay.transaction.biz.ChargeBiz;
import com.neza.exception.AppException;

/**
 * @接收建设银行B2C订单处理结果
 */
public class CcbB2CResultAction extends BankAction {
	private CcbBankBiz ccbBankBiz;
	private ChargeBiz chargeBiz;

	public ActionForward unspecified(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws AppException {
		CcbB2CResultFromBank ccbresult = ccbBankBiz.getB2CResult(request);
		
		FinishCharge returnMsg = chargeBiz.finishCharge(ccbresult);

		return notifyForward(returnMsg, mapping, request);
	}

	public void setCcbBankBiz(CcbBankBiz ccbBankBiz) {
		this.ccbBankBiz = ccbBankBiz;
	}

	public void setChargeBiz(ChargeBiz chargeBiz) {
		this.chargeBiz = chargeBiz;
	}
}
