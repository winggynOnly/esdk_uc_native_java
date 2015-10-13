package com.huawei.esdk.uc.professional.local.impl.service;

import java.util.Date;
import java.util.List;

import javax.xml.ws.Holder;

import org.apache.cxf.common.util.StringUtils;
import org.apache.log4j.Logger;

import com.huawei.esdk.platform.professional.local.PlatformServiceFactoryEx;
import com.huawei.esdk.platform.professional.local.bean.SDKResponse;
import com.huawei.esdk.platform.professional.local.constant.PlatformNativeConstant;
import com.huawei.esdk.platform.professional.local.impl.utils.RSA2048Utils;
import com.huawei.esdk.platform.professional.local.service.common.PlatformKeyServiceEx;
import com.huawei.esdk.uc.professional.local.bean.ConfSummary;
import com.huawei.esdk.uc.professional.local.bean.ConfUser;
import com.huawei.esdk.uc.professional.local.bean.ConferenceInfo;
import com.huawei.esdk.uc.professional.local.bean.PageInfo;
import com.huawei.esdk.uc.professional.local.bean.QueryResultList;
import com.huawei.esdk.uc.professional.local.bean.TerminalInConfInfo;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;
import com.huawei.esdk.uc.professional.local.conference.ConferenceServiceEx;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalCTC;
import com.huawei.esdk.uc.professional.local.impl.utils.AES128Utils;
import com.huawei.esdk.uc.professional.local.impl.utils.Base64Utils;
import com.huawei.esdk.uc.professional.local.impl.utils.ClientProvider;
import com.huawei.esdk.uc.professional.local.impl.utils.ExceptionUtils;

public class ConferenceServiceExImpl implements ConferenceServiceEx {
	
	private UCProfessionalCTC ucProfessionalCTC = (UCProfessionalCTC)ClientProvider.getClient(UCProfessionalCTC.class);
	
	private static final Logger LOGGER = Logger.getLogger(ConferenceServiceExImpl.class);
	
	private PlatformKeyServiceEx keyServiceEx = PlatformServiceFactoryEx.getService(PlatformKeyServiceEx.class);
	
    private static ConferenceServiceExImpl instance = null;
	
	public static synchronized ConferenceServiceExImpl getInstance()
	{
		if (null == instance) {
			instance = new ConferenceServiceExImpl();
		}
		return instance;
	}

	@Override
	public UCSDKResponse<String> createConf(ConferenceInfo confInfo) {
		UCSDKResponse<String> result = new UCSDKResponse<String>();
		
		LOGGER.info("begin to execute getPublicKey method");
        SDKResponse<String> key = keyServiceEx.getPublicKey("RSA2048");
        if (null == key || 0 != key.getResultCode())
        {
            LOGGER.info("failed to get publicKey");
            result.setResultCode(PlatformNativeConstant.FAILED_TO_GET_PUTLIC_KEY);
            return result;
        }
        LOGGER.info("execute getPublicKey method completed");
		
        Integer setSecretKeyResultCode = setSecretKey();
        if (null == setSecretKeyResultCode || 0 != setSecretKeyResultCode)
        {
            result.setResultCode(PlatformNativeConstant.FAILED_TO_SET_SECRET_KEY);
            return result;
        }
		
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<String> confId = new Holder<String>();
		if (null != confInfo && !StringUtils.isEmpty(confInfo.getChairmanPassword()))
        {
            try
            {
                String cpwd = Base64Utils.encode(AES128Utils.encode(confInfo.getChairmanPassword().getBytes("UTF-8")));
                if (StringUtils.isEmpty(cpwd))
                {
                    result.setResultCode(PlatformNativeConstant.SDK_UC_PASSWORD_ENCODE_ERRORCODE);
                    return result;
                }
                confInfo.setChairmanPassword(cpwd);
            }
            catch (Exception e)
            {
                result.setResultCode(PlatformNativeConstant.SDK_UC_PASSWORD_ENCODE_ERRORCODE);
                return result;
            }
        }
		if (null != confInfo && !StringUtils.isEmpty(confInfo.getMemberPassword()))
		{
            try
            {
                String mpwd = Base64Utils.encode(AES128Utils.encode(confInfo.getMemberPassword().getBytes("UTF-8")));
                
                if (StringUtils.isEmpty(mpwd))
                {
                    result.setResultCode(PlatformNativeConstant.SDK_UC_PASSWORD_ENCODE_ERRORCODE);
                    return result;
                }
                confInfo.setMemberPassword(mpwd);
            }
            catch (Exception e)
            {
                result.setResultCode(PlatformNativeConstant.SDK_UC_PASSWORD_ENCODE_ERRORCODE);
                return result;
            }
		}
		try {
			ucProfessionalCTC.createConf(confInfo, resultCode, confId);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? confId.value : null);
		return result;
	}

	@Override
	public Integer addIntoConf(String ucAccount, String confId,
			List<ConfUser> confUsers) {
		try {
			return ucProfessionalCTC.addIntoConf(ucAccount, confId, confUsers);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer modifyTalkMode(String ucAccount, String confId,
			String number, Integer talkMode) {
		try {
			return ucProfessionalCTC.modifyTalkMode(ucAccount, confId, number, talkMode);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer delFromConf(String ucAccount, String confId,
			List<ConfUser> confUsers) {
		try {
			return ucProfessionalCTC.delFromConf(ucAccount, confId, confUsers);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer endConf(String ucAccount, String confId) {
		try {
			return ucProfessionalCTC.endConf(ucAccount, confId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<QueryResultList<ConfSummary>> getConfList(String initiator,
			String queryType, Date beginTime, Date endTime,PageInfo pageInfo, String confType) {
		UCSDKResponse<QueryResultList<ConfSummary>> result = new UCSDKResponse<QueryResultList<ConfSummary>>();
		
		LOGGER.info("begin to execute getPublicKey method");
        SDKResponse<String> key = keyServiceEx.getPublicKey("RSA2048");
        if (null == key || 0 != key.getResultCode())
        {
            LOGGER.info("failed to get publicKey");
            result.setResultCode(PlatformNativeConstant.FAILED_TO_GET_PUTLIC_KEY);
            return result;
        }
        LOGGER.info("execute getPublicKey method completed");
		
        Integer setSecretKeyResultCode = setSecretKey();
        if (null == setSecretKeyResultCode || 0 != setSecretKeyResultCode)
        {
            result.setResultCode(PlatformNativeConstant.FAILED_TO_SET_SECRET_KEY);
            return result;
        }
		
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<ConfSummary>> confSummary = new Holder<List<ConfSummary>>();
		Holder<PageInfo> pgInfo = new Holder<PageInfo>(pageInfo);
		QueryResultList<ConfSummary> deptInfoBaseList = new QueryResultList<ConfSummary>();
		
		try 
		{
			ucProfessionalCTC.getConfList(initiator, queryType, beginTime, endTime, pgInfo, confType, resultCode, confSummary);
		} 
		catch (Exception e) 
		{
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		if (resultCode.value == 0) {
			deptInfoBaseList.setPageInfo(pgInfo.value);
			
			List<ConfSummary> confs = confSummary.value;
			if (null != confs && !confs.isEmpty())
			{
			    for (ConfSummary conf : confs)
			    {
			        if (null != conf && !StringUtils.isEmpty(conf.getChairmanPassword()))
			        {
			            conf.setChairmanPassword(AES128Utils.decodeFromBase64(conf.getChairmanPassword()));
			        }
			        if (null != conf && !StringUtils.isEmpty(conf.getMemberPassword()))
			        {
			            
			            conf.setMemberPassword(AES128Utils.decodeFromBase64(conf.getMemberPassword()));
			        }
			    }
			}
			deptInfoBaseList.setResultInfos(confs);
			result.setResult(deptInfoBaseList);
		}
		
		return result;
	}

	@Override
	public UCSDKResponse<ConferenceInfo> getConfInfo(String ucAccount,
			String confId) {
		UCSDKResponse<ConferenceInfo> result = new UCSDKResponse<ConferenceInfo>();
		
		LOGGER.info("begin to execute getPublicKey method");
        SDKResponse<String> key = keyServiceEx.getPublicKey("RSA2048");
        if (null == key || 0 != key.getResultCode())
        {
            LOGGER.info("failed to get publicKey");
            result.setResultCode(PlatformNativeConstant.FAILED_TO_GET_PUTLIC_KEY);
            return result;
        }
        LOGGER.info("execute getPublicKey method completed");
        
        Integer setSecretKeyResultCode = setSecretKey();
        if (null == setSecretKeyResultCode || 0 != setSecretKeyResultCode)
        {
            result.setResultCode(PlatformNativeConstant.FAILED_TO_SET_SECRET_KEY);
            return result;
        }
		
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<ConferenceInfo> conferenceInfo = new Holder<ConferenceInfo>();
		try {
			ucProfessionalCTC.getConfInfo(ucAccount, confId, resultCode, conferenceInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		ConferenceInfo conf = resultCode.value == 0 ? conferenceInfo.value : null;
		if (null != conf)
		{
		    if (!StringUtils.isEmpty(conf.getChairmanPassword()))
		    {
		        conf.setChairmanPassword(AES128Utils.decodeFromBase64(conf.getChairmanPassword()));
		    }
		    if (!StringUtils.isEmpty(conf.getMemberPassword()))
		    {
		        conf.setMemberPassword(AES128Utils.decodeFromBase64(conf.getMemberPassword()));
		    }
		}
		result.setResult(conf);
		
		return result;
	}

	@Override
	public Integer joinConf(String ucAccount, String confId, String number,
			String name,String role) {
		try {
			return ucProfessionalCTC.joinConf(ucAccount, confId, number, name,role);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer audioToVideoConf(String ucAccount, String confId) {
		try {
			return ucProfessionalCTC.audioToVideoConf(ucAccount, confId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<TerminalInConfInfo> informTerminalType(
			String ucAccount, String confId, String terminalType,
			String terminalIP, String location) {
		UCSDKResponse<TerminalInConfInfo> result = new UCSDKResponse<TerminalInConfInfo>();
		
		LOGGER.info("begin to execute getPublicKey method");
        SDKResponse<String> key = keyServiceEx.getPublicKey("RSA2048");
        if (null == key || 0 != key.getResultCode())
        {
            LOGGER.info("failed to get publicKey");
            result.setResultCode(PlatformNativeConstant.FAILED_TO_GET_PUTLIC_KEY);
            return result;
        }
        LOGGER.info("execute getPublicKey method completed");
		
        Integer setSecretKeyResultCode = setSecretKey();
        if (null == setSecretKeyResultCode || 0 != setSecretKeyResultCode)
        {
            result.setResultCode(PlatformNativeConstant.FAILED_TO_SET_SECRET_KEY);
            return result;
        }
        
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<TerminalInConfInfo> terminalInConfInfo = new Holder<TerminalInConfInfo>();
		try {
			ucProfessionalCTC.informTerminalType(ucAccount, confId, terminalType, terminalIP, location, resultCode, terminalInConfInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		
        TerminalInConfInfo terminal = resultCode.value == 0 ? terminalInConfInfo.value : null;
        if (null != terminal)
        {
            if (!StringUtils.isEmpty(terminal.getToken()))
            {
                terminal.setToken(AES128Utils.decodeFromBase64(terminal.getToken()));
            }
            if (!StringUtils.isEmpty(terminal.getHostKey()))
            {
                terminal.setHostKey(AES128Utils.decodeFromBase64(terminal.getHostKey()));
            }
        }
		result.setResult(terminal);
		
		return result;
	}

	@Override
	public Integer subConfStatus(String appId, String confId) {
		try {
			return ucProfessionalCTC.subConfStatus(appId, confId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer viewSite(String confId, String ucAccount,
			String videoSourceUri, Integer isLock) {
		try {
			return ucProfessionalCTC.viewSite(confId, ucAccount, videoSourceUri, isLock);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}
	
	private Integer setSecretKey()
    {
        LOGGER.info("begin to execute setSecretKey method");
        byte[] secretKey = AES128Utils.getBT_KEY();
        byte[] iv = AES128Utils.getBT_IV();
        Integer resultCode = null;
        try
        {
            String secretKeyStr =
                Base64Utils.encode(RSA2048Utils.encode(AES128Utils.byte2Hex(secretKey).getBytes("UTF-8")));
            String ivStr = Base64Utils.encode(RSA2048Utils.encode(AES128Utils.byte2Hex(iv).getBytes("UTF-8")));
            
            resultCode = keyServiceEx.setSecretKey("AES128", secretKeyStr, ivStr);
        }
        catch (Exception e)
        {
            LOGGER.info("failed to setSecretKey");
            resultCode = PlatformNativeConstant.FAILED_TO_SET_SECRET_KEY;
        }
        LOGGER.info("execute setSecretKey method completed");
        return resultCode;
    }

}
