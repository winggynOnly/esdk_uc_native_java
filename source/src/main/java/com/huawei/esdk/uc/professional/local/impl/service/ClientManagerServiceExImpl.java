package com.huawei.esdk.uc.professional.local.impl.service;

import java.util.Date;
import java.util.List;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;

import com.huawei.esdk.platform.professional.local.PlatformServiceFactoryEx;
import com.huawei.esdk.platform.professional.local.bean.SDKResponse;
import com.huawei.esdk.platform.professional.local.constant.PlatformNativeConstant;
import com.huawei.esdk.platform.professional.local.impl.utils.RSA2048Utils;
import com.huawei.esdk.platform.professional.local.service.common.PlatformKeyServiceEx;
import com.huawei.esdk.uc.professional.local.bean.PageInfo;
import com.huawei.esdk.uc.professional.local.bean.QueryResultList;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;
import com.huawei.esdk.uc.professional.local.bean.clientmanager.MsgHistoryCondition;
import com.huawei.esdk.uc.professional.local.bean.clientmanager.MsgHistoryInfo;
import com.huawei.esdk.uc.professional.local.bean.clientmanager.MsgInfo;
import com.huawei.esdk.uc.professional.local.bean.clientmanager.ResPubPresInfo;
import com.huawei.esdk.uc.professional.local.bean.clientmanager.UserMobile;
import com.huawei.esdk.uc.professional.local.clientmanager.ClientManagerServiceEx;
import com.huawei.esdk.uc.professional.local.constant.NativeConstant;
import com.huawei.esdk.uc.professional.local.bean.PresPublishInfo;
import com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.UCProfessionalClientCommon;
import com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.UCProfessionalClientMsgServer;
import com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.UCProfessionalClientPersonal;
import com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.UCProfessionalClientPublicGroup;
import com.huawei.esdk.uc.professional.local.impl.utils.Base64Utils;
import com.huawei.esdk.uc.professional.local.impl.utils.ClientProvider;
import com.huawei.esdk.uc.professional.local.impl.utils.ExceptionUtils;

public class ClientManagerServiceExImpl implements ClientManagerServiceEx {

	private static ClientManagerServiceExImpl instance = null;
	private UCProfessionalClientCommon ucProfessionalClientCommon = (UCProfessionalClientCommon) ClientProvider
			.getClient(UCProfessionalClientCommon.class);
	private UCProfessionalClientPersonal ucProfessionalClientPersonal = (UCProfessionalClientPersonal) ClientProvider
			.getClient(UCProfessionalClientPersonal.class);
	private UCProfessionalClientMsgServer ucProfessionalClientMsgServer = (UCProfessionalClientMsgServer) ClientProvider
	.getClient(UCProfessionalClientMsgServer.class);
	private UCProfessionalClientPublicGroup ucProfessionalClientPublicGroup = (UCProfessionalClientPublicGroup) ClientProvider
	.getClient(UCProfessionalClientPublicGroup.class);
	
	private PlatformKeyServiceEx keyServiceEx = PlatformServiceFactoryEx.getService(PlatformKeyServiceEx.class);
	
    private static final Logger LOGGER = Logger.getLogger(ClientManagerServiceExImpl.class);

	public static synchronized ClientManagerServiceExImpl getInstance() {
		if (null == instance) {
			instance = new ClientManagerServiceExImpl();
		}
		return instance;
	}

	@Override
	public Integer userLogin(String ucAccount, String password,
			String registerFunc) {
	    
        LOGGER.info("begin to execute getPublicKey method");
        SDKResponse<String> key = keyServiceEx.getPublicKey();
        if (null == key || 0 != key.getResultCode())
        {
            LOGGER.info("failed to get publicKey");
            return PlatformNativeConstant.FAILED_TO_GET_PUTLIC_KEY;
        }
        LOGGER.info("execute getPublicKey method completed");
	    
		try {
			return ucProfessionalClientCommon.userLogin(ucAccount, Base64Utils.encode(RSA2048Utils.encode(password.getBytes())),
					registerFunc);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer userLogOut(String ucAccount) {
		try {
			return ucProfessionalClientCommon.userLogout(ucAccount);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer setSignature(String ucAccount, String userInfo) {
		try {
			return ucProfessionalClientPersonal.setSignature(ucAccount, userInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<ResPubPresInfo> publishPresenceInfo(String ucAccount,
			PresPublishInfo presPublish, Long expires) {
		UCSDKResponse<ResPubPresInfo> result = new UCSDKResponse<ResPubPresInfo>();
		if (null == expires) 
		{
			result.setResultCode(NativeConstant.SDK_PARAM_NOT_COMPLETE_ERRORCODE);
			return result;
		}
		com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PresPublishInfo clientPresPublish = null;
		if (null != presPublish) {
			clientPresPublish = new com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PresPublishInfo();
			clientPresPublish.setAvailableTool(presPublish.getAvailableTool());
			clientPresPublish.setDeviceType(presPublish.getDeviceType());
			clientPresPublish.setLocation(presPublish.getLocation());
			clientPresPublish.setPresStatus(presPublish.getPresStatus());
			clientPresPublish.setPresType(presPublish.getPresType());
			clientPresPublish.setTimeZone(presPublish.getTimeZone());
		}
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<ResPubPresInfo> resPubPresInfo = new Holder<ResPubPresInfo>();
		try {
			ucProfessionalClientPersonal.publishPresenceInfo(ucAccount, clientPresPublish, expires, resultCode, resPubPresInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? resPubPresInfo.value : null);
		
		return result;
	}

	@Override
	public UCSDKResponse<ResPubPresInfo> refreshPresInfo(String ucAccount,
			PresPublishInfo presPublish, Long expires, String etag) {
		UCSDKResponse<ResPubPresInfo> result = new UCSDKResponse<ResPubPresInfo>();
		if (null == expires) 
		{
			result.setResultCode(NativeConstant.SDK_PARAM_NOT_COMPLETE_ERRORCODE);
			return result;
		}
		com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PresPublishInfo clientPresPublish = null;
		if (null != presPublish) {
			clientPresPublish = new com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PresPublishInfo();
			clientPresPublish.setAvailableTool(presPublish.getAvailableTool());
			clientPresPublish.setDeviceType(presPublish.getDeviceType());
			clientPresPublish.setLocation(presPublish.getLocation());
			clientPresPublish.setPresStatus(presPublish.getPresStatus());
			clientPresPublish.setPresType(presPublish.getPresType());
			clientPresPublish.setTimeZone(presPublish.getTimeZone());
		}
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<ResPubPresInfo> resPubPresInfo = new Holder<ResPubPresInfo>();
		try {
			ucProfessionalClientPersonal.refreshPresInfo(ucAccount, clientPresPublish, expires, etag, resultCode, resPubPresInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? resPubPresInfo.value : null);
		
		return result;
	}

	@Override
	public UCSDKResponse<Long> subPGM(String ucAccount, String subFlag,
			String groupUrl, String creator, Long expires) {
		UCSDKResponse<Long> result = new UCSDKResponse<Long>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<Long> expiresHolder = new Holder<Long>(expires);
		try {
			ucProfessionalClientPersonal.subPGM(ucAccount, subFlag, groupUrl, creator, expiresHolder, resultCode);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? expiresHolder.value : null);
		
		return result;
	}

	@Override
	public UCSDKResponse<Long> refreshSubscribePGM(String ucAccount, String subFlag,
			String groupUrl, String creator, Long expires) {
		UCSDKResponse<Long> result = new UCSDKResponse<Long>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<Long> expiresHolder = new Holder<Long>(expires);
		try {
			ucProfessionalClientPersonal.refreshSubscribePGM(ucAccount, subFlag, groupUrl, creator, expiresHolder, resultCode);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? expiresHolder.value : null);
		
		return result;
	}

	@Override
	public UCSDKResponse<List<UserMobile>> uploadMobileAddress(
			String ucAccount, List<String> mobilePhones) {
		UCSDKResponse<List<UserMobile>> result = new UCSDKResponse<List<UserMobile>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<UserMobile>> userMobile = new Holder<List<UserMobile>>();
		try {
			ucProfessionalClientPersonal.uploadMobileAddress(ucAccount, mobilePhones, resultCode, userMobile);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? userMobile.value : null);
		
		return result;
	}

	@Override
	public Integer uploadHeadImageId(String ucAccount, String headImageId) {
		try {
			return ucProfessionalClientPersonal.uploadHeadImageId(ucAccount, headImageId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer sendMessage(String ucAccount, Integer recvType,
			String recver, MsgInfo msg) {
		try {
			return ucProfessionalClientMsgServer.sendMessage(ucAccount, recvType, recver, msg);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer withdrawMessage(Integer msgType, String sender,
			String recver, MsgInfo msg) {
		try {
			return ucProfessionalClientMsgServer.withdrawMessage(msgType, sender, recver, msg);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer applyJoinGroup(String groupId, String groupName,
			String ucAccount, String creator) {
		try {
			return ucProfessionalClientPublicGroup.applyJoinGroup(groupId, groupName, ucAccount, creator);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer applyQuitGroup(String groupId, String groupName,
			String ucAccount, String creator) {
		try {
			return ucProfessionalClientPublicGroup.applyQuitGroup(groupId, groupName, ucAccount, creator);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer replyGroupApply(String groupId, String groupName,
			String ucAccount, String creator, Integer result) {
		try {
			return ucProfessionalClientPublicGroup.replyGroupApply(groupId, groupName, ucAccount, creator, result);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer replyGroupInvite(String groupId, String groupName,
			String ucAccount, String creator, Integer result) {
		try {
			return ucProfessionalClientPublicGroup.replyGroupInvite(groupId, groupName, ucAccount, creator, result);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer markMsgReadFlag(String ucAccount,
			MsgHistoryCondition msgHistoryCondition, String msgId) {
		try {
			return ucProfessionalClientMsgServer.markMsgReadFlag(ucAccount, msgHistoryCondition, msgId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<QueryResultList<MsgHistoryInfo>> getMsgLog(
			String ucAccount, MsgHistoryCondition msgHistoryCondition,
			PageInfo pageInfo) {
		UCSDKResponse<QueryResultList<MsgHistoryInfo>> result = new UCSDKResponse<QueryResultList<MsgHistoryInfo>>();
		
		QueryResultList<MsgHistoryInfo> resultList = new QueryResultList<MsgHistoryInfo>();
		
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<MsgHistoryInfo>> msgHistoryInfo = new Holder<List<MsgHistoryInfo>>();
		Holder<com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PageInfo> pgInfo = new Holder<com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PageInfo>();
		
		com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PageInfo info =null;
		
		if (null != pageInfo) {
			info = new com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PageInfo();
			info.setPageAmount(pageInfo.getPageTotal());
			info.setPageNum(pageInfo.getPageNum());
			info.setPageSize(pageInfo.getPageSize());
			pgInfo = new Holder<com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PageInfo>(info);
		}
		
		try {
			ucProfessionalClientMsgServer.getMsgLog(ucAccount, msgHistoryCondition, pgInfo, resultCode, msgHistoryInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		
		com.huawei.esdk.uc.professional.local.bean.PageInfo pg = new com.huawei.esdk.uc.professional.local.bean.PageInfo();
		
		pg.setPageNum(pgInfo.value.getPageNum());
		pg.setPageSize(pgInfo.value.getPageSize());
		pg.setPageTotal(pgInfo.value.getPageAmount());
		
		resultList.setPageInfo(pg);
		resultList.setResultInfos(msgHistoryInfo.value);
		
		result.setResult(resultCode.value == 0 ? resultList : null);
		
		return result;
	}

	@Override
	public UCSDKResponse<QueryResultList<MsgHistoryInfo>> getMessage(
			String ucAccount, Date timeStamp, String msgType, PageInfo pageInfo) {
		UCSDKResponse<QueryResultList<MsgHistoryInfo>> result = new UCSDKResponse<QueryResultList<MsgHistoryInfo>>();
		
		QueryResultList<MsgHistoryInfo> resultList = new QueryResultList<MsgHistoryInfo>();
		
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<MsgHistoryInfo>> msgHistoryInfo = new Holder<List<MsgHistoryInfo>>();
		
		com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PageInfo info = new com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PageInfo();
		
		if (null != pageInfo) {
			info.setPageAmount(pageInfo.getPageTotal());
			info.setPageNum(pageInfo.getPageNum());
			info.setPageSize(pageInfo.getPageSize());
		}
		Holder<com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PageInfo> pgInfo = new Holder<com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager.PageInfo>(info);
		
		try {
			ucProfessionalClientMsgServer.getMessage(ucAccount, timeStamp, msgType, pgInfo, resultCode, msgHistoryInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		
		com.huawei.esdk.uc.professional.local.bean.PageInfo pg = new com.huawei.esdk.uc.professional.local.bean.PageInfo();
		
		pg.setPageNum(pgInfo.value.getPageNum());
		pg.setPageSize(pgInfo.value.getPageSize());
		pg.setPageTotal(pgInfo.value.getPageAmount());
		
		resultList.setPageInfo(pg);
		resultList.setResultInfos(msgHistoryInfo.value);
		
		result.setResult(resultCode.value == 0 ? resultList : null);
		
		return result;
	}

}
