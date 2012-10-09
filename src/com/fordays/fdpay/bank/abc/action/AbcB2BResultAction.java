package com.fordays.fdpay.bank.abc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.fordays.fdpay.bank.BankAction;
import com.fordays.fdpay.bank.FinishCharge;
import com.fordays.fdpay.bank.abc.AbcB2BResultFromBank;
import com.fordays.fdpay.bank.abc.biz.AbcBankBiz;
import com.fordays.fdpay.transaction.biz.ChargeBiz;
import com.neza.exception.AppException;

/**
 * @接收农业银行B2B订单处理结果
 */
public class AbcB2BResultAction extends BankAction {
	private AbcBankBiz abcBankBiz;
	private ChargeBiz chargeBiz;

	public ActionForward unspecified(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws AppException {
		AbcB2BResultFromBank abcresult = abcBankBiz.getB2BResult(request);
		
		FinishCharge returnMsg = chargeBiz.finishCharge(abcresult);

		return notifyForward(returnMsg, mapping, request);
	}

	public void setAbcBankBiz(AbcBankBiz abcBankBiz) {
		this.abcBankBiz = abcBankBiz;
	}

	public void setChargeBiz(ChargeBiz chargeBiz) {
		this.chargeBiz = chargeBiz;
	}
}