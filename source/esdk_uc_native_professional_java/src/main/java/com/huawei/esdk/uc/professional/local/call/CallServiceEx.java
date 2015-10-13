package com.huawei.esdk.uc.professional.local.call;

import com.huawei.esdk.uc.professional.local.bean.CallStatusInfo;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;

public interface CallServiceEx {
	
	/**
	 * 发起CTD呼叫
	 * @param initiator
	 * @param caller
	 * @param callee
	 * @return
	 */
	UCSDKResponse<String> dialCall(String initiator,String caller,String callee);
	
	/**
	 * 终止CTD呼叫
	 * @param callId
	 * @return
	 */
	Integer releaseCall(String callId);
	
	/**
	 * 查询CTD呼叫状态
	 * @param callId
	 * @return
	 */
	UCSDKResponse<CallStatusInfo> getCallStatus(String callId);

}
