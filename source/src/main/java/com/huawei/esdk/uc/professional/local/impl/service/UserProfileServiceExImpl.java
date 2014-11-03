package com.huawei.esdk.uc.professional.local.impl.service;

import java.util.Date;
import java.util.List;

import javax.xml.ws.Holder;

import com.huawei.esdk.uc.professional.local.bean.AccountInfo;
import com.huawei.esdk.uc.professional.local.bean.BatchResultInfo;
import com.huawei.esdk.uc.professional.local.bean.BindInfo;
import com.huawei.esdk.uc.professional.local.bean.CorpInfo;
import com.huawei.esdk.uc.professional.local.bean.CustomLinkmanInfo;
import com.huawei.esdk.uc.professional.local.bean.DeptInfoBase;
import com.huawei.esdk.uc.professional.local.bean.DeptKeyInfo;
import com.huawei.esdk.uc.professional.local.bean.FriendChangeInfo;
import com.huawei.esdk.uc.professional.local.bean.FriendInfo;
import com.huawei.esdk.uc.professional.local.bean.GroupInfo;
import com.huawei.esdk.uc.professional.local.bean.GroupInfoBase;
import com.huawei.esdk.uc.professional.local.bean.GroupMember;
import com.huawei.esdk.uc.professional.local.bean.GroupModifyInfo;
import com.huawei.esdk.uc.professional.local.bean.JoinGroupInfo;
import com.huawei.esdk.uc.professional.local.bean.LinkmanInfo;
import com.huawei.esdk.uc.professional.local.bean.NumberInfo;
import com.huawei.esdk.uc.professional.local.bean.OffsetQueryStaffCond;
import com.huawei.esdk.uc.professional.local.bean.PageInfo;
import com.huawei.esdk.uc.professional.local.bean.PageQueryStaffCond;
import com.huawei.esdk.uc.professional.local.bean.PersonalChangeInfo;
import com.huawei.esdk.uc.professional.local.bean.PersonalInfo;
import com.huawei.esdk.uc.professional.local.bean.PersonalTeam;
import com.huawei.esdk.uc.professional.local.bean.PresInfoResult;
import com.huawei.esdk.uc.professional.local.bean.QueryMode;
import com.huawei.esdk.uc.professional.local.bean.QueryResultList;
import com.huawei.esdk.uc.professional.local.bean.StaffInfo;
import com.huawei.esdk.uc.professional.local.bean.StaffInfoBase;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;
import com.huawei.esdk.uc.professional.local.bean.DeptInfo;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalUserProfileCorpList;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalUserProfileFriend;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalUserProfilePSSvr;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalUserProfilePersonList;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalUserProfilePublicGroup;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalBMPAccountMaintenance;
import com.huawei.esdk.uc.professional.local.impl.autogen.UCProfessionalBMPNumber;
import com.huawei.esdk.uc.professional.local.impl.utils.ClientProvider;
import com.huawei.esdk.uc.professional.local.impl.utils.ExceptionUtils;
import com.huawei.esdk.uc.professional.local.userprofile.UserProfileServiceEx;

public class UserProfileServiceExImpl implements UserProfileServiceEx {

	private UCProfessionalUserProfileCorpList ucProfessionalUserProfileCorpList = (UCProfessionalUserProfileCorpList) ClientProvider
			.getClient(UCProfessionalUserProfileCorpList.class);
	private UCProfessionalUserProfileFriend ucProfessionalUserProfileFriend = (UCProfessionalUserProfileFriend) ClientProvider
			.getClient(UCProfessionalUserProfileFriend.class);
	private UCProfessionalUserProfilePersonList ucProfessionalUserProfilePersonList = (UCProfessionalUserProfilePersonList) ClientProvider
			.getClient(UCProfessionalUserProfilePersonList.class);
	private UCProfessionalUserProfilePSSvr ucProfessionalUserProfilePSSvr = (UCProfessionalUserProfilePSSvr) ClientProvider
			.getClient(UCProfessionalUserProfilePSSvr.class);
	private UCProfessionalUserProfilePublicGroup ucProfessionalUserProfilePublicGroup = (UCProfessionalUserProfilePublicGroup) ClientProvider
			.getClient(UCProfessionalUserProfilePublicGroup.class);
	private UCProfessionalBMPNumber ucProfessionalBMPNumber = (UCProfessionalBMPNumber)ClientProvider.getClient(UCProfessionalBMPNumber.class);
    
	private UCProfessionalBMPAccountMaintenance ucProfessionalBMPAccountMaintenance = (UCProfessionalBMPAccountMaintenance)ClientProvider.getClient(UCProfessionalBMPAccountMaintenance.class);
    
	private static UserProfileServiceExImpl instance = null;

	public static synchronized UserProfileServiceExImpl getInstance() {
		if (null == instance) {
			instance = new UserProfileServiceExImpl();
		}
		return instance;
	}

	@Override
	public UCSDKResponse<String> addLinkmanTeam(String ucAccount, String name) {
		UCSDKResponse<String> result = new UCSDKResponse<String>();
		Holder<String> teamId = new Holder<String>();
		Holder<Integer> resultCode = new Holder<Integer>();
		try {
			ucProfessionalUserProfilePersonList.addLinkmanTeam(ucAccount, name,resultCode,teamId);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(0 == resultCode.value ? teamId.value : null);
		return result;
	}

	@Override
	public Integer delLinkmanTeam(String ucAccount, String teamId) {
		try {
			return ucProfessionalUserProfilePersonList.delLinkmanTeam(ucAccount, teamId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer modifyLinkmanTeam(String ucAccount, String teamId,
			String name) {
		try {
			return ucProfessionalUserProfilePersonList.modifyLinkmanTeam(ucAccount, name, teamId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer addMemberToTeam(String ucAccount, String teamId,
			String linkmanId) {
		try {
			return ucProfessionalUserProfilePersonList.addMemberToTeam(ucAccount, teamId, linkmanId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer delMemberFromTeam(String ucAccount, String teamId,
			String linkmanId) {
		try {
			return ucProfessionalUserProfilePersonList.delMemberFromTeam(ucAccount, teamId, linkmanId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer delLinkman(String ucAccount, String teamId, String linkmanId) {
		try {
			return ucProfessionalUserProfilePersonList.delLinkman(ucAccount, teamId, linkmanId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer addFriend(String ucAccount, String friendAccount) {
		try {
			return ucProfessionalUserProfileFriend.addFriend(ucAccount, friendAccount);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer delFriend(String ucAccount, String friendAccount) {
		try {
			return ucProfessionalUserProfileFriend.delFriend(ucAccount, friendAccount);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer delGroup(String groupId, String creator) {
		try {
			return ucProfessionalUserProfilePublicGroup.delGroup(groupId, creator);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer addGroupMember(String groupId, String creator,
			String ucAccount, String groupName) {
		try {
			return ucProfessionalUserProfilePublicGroup.addGroupMember(groupId, creator, ucAccount, groupName);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer delGroupMember(String groupId, String creator,
			String ucAccount, String groupName) {
		try {
			return ucProfessionalUserProfilePublicGroup.delGroupMember(groupId, creator, ucAccount, groupName);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<CorpInfo> queryCorpInfo() {
		UCSDKResponse<CorpInfo> result = new UCSDKResponse<CorpInfo>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<CorpInfo> corpInfo = new Holder<CorpInfo>();
		try {
			ucProfessionalUserProfileCorpList.queryCorpInfo(resultCode, corpInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? corpInfo.value : null);
		return result;
	}

	@Override
	public UCSDKResponse<QueryResultList<DeptInfoBase>> queryDeptListInfo(
			QueryMode queryMode, String corpId, String deptId, String deptName,
			String parentDeptId) {
		UCSDKResponse<QueryResultList<DeptInfoBase>> result = new UCSDKResponse<QueryResultList<DeptInfoBase>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<PageInfo> pageInfo = new Holder<PageInfo>();
		Holder<List<DeptInfoBase>> deptInfoBase = new Holder<List<DeptInfoBase>>();
		
		QueryResultList<DeptInfoBase> deptInfoBaseList = new QueryResultList<DeptInfoBase>();
		try {
			ucProfessionalUserProfileCorpList.queryDeptListInfo(queryMode, corpId, deptId, deptName, parentDeptId, resultCode, pageInfo, deptInfoBase);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		if (resultCode.value == 0) {
			deptInfoBaseList.setPageInfo(pageInfo.value);
			deptInfoBaseList.setResultInfos(deptInfoBase.value);
			result.setResult(deptInfoBaseList);
		}
		return result;
	}

	@Override
	public UCSDKResponse<DeptInfo> queryDeptInfo(String deptId) {
		UCSDKResponse<DeptInfo> result = new UCSDKResponse<DeptInfo>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<DeptInfo> deptInfo = new Holder<DeptInfo>();
		try {
			ucProfessionalUserProfileCorpList.queryDeptInfo(deptId, resultCode, deptInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? deptInfo.value : null);
		return result;
	}

	@Override
	public UCSDKResponse<QueryResultList<StaffInfoBase>> queryStaffList(
			String ucAccount, QueryMode queryMode, PageQueryStaffCond pageCond,
			OffsetQueryStaffCond offsetCond) {
		UCSDKResponse<QueryResultList<StaffInfoBase>> result = new UCSDKResponse<QueryResultList<StaffInfoBase>>();
		QueryResultList<StaffInfoBase> staffInfoBaseList = new QueryResultList<StaffInfoBase>();
		Holder<PageInfo> pageInfo = new Holder<PageInfo>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<StaffInfoBase>> staffInfoBase = new Holder<List<StaffInfoBase>>();
		try {
			ucProfessionalUserProfileCorpList.queryStaffList(ucAccount, queryMode, pageCond, offsetCond, resultCode, pageInfo, staffInfoBase);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		if (resultCode.value == 0) {
			staffInfoBaseList.setPageInfo(pageInfo.value);
			staffInfoBaseList.setResultInfos(staffInfoBase.value);
			result.setResult(staffInfoBaseList);
		}
		return result;
	}

	@Override
	public UCSDKResponse<StaffInfo> queryStaffInfo(String ucAccount) {
		UCSDKResponse<StaffInfo> result = new UCSDKResponse<StaffInfo>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<StaffInfo> staffInfo = new Holder<StaffInfo>();
		try {
			ucProfessionalUserProfileCorpList.queryStaffInfo(ucAccount, resultCode, staffInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? staffInfo.value : null);
		return result;
	}

	@Override
	public UCSDKResponse<PersonalInfo> getPersonAllAddressBook(String ucAccount) {
		UCSDKResponse<PersonalInfo> result = new UCSDKResponse<PersonalInfo>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<PersonalInfo> personalInfo = new Holder<PersonalInfo>();
		try {
			ucProfessionalUserProfilePersonList.getPersonAllAddressBook(ucAccount, resultCode, personalInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? personalInfo.value : null);
		return result;
	}

	@Override
	public UCSDKResponse<PersonalChangeInfo> getPersonIncAddressBook(
			String ucAccount,Date timeStamp) {
		UCSDKResponse<PersonalChangeInfo> result = new UCSDKResponse<PersonalChangeInfo>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<PersonalChangeInfo> peronalChangeInfo = new Holder<PersonalChangeInfo>();
		try {
			ucProfessionalUserProfilePersonList.getPersonIncAddressBook(ucAccount, timeStamp, resultCode, peronalChangeInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? peronalChangeInfo.value : null);
		return result;
	}

	@Override
	public Integer addLinkman(String ucAccount, LinkmanInfo linkmanInfo,
			String teamId) {
		try {
			return ucProfessionalUserProfilePersonList.addLinkman(ucAccount, linkmanInfo, teamId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<LinkmanInfo> getLinkmanInfo(String ucAccount,
			String linkmanId, Integer queryType) {
		UCSDKResponse<LinkmanInfo> result = new UCSDKResponse<LinkmanInfo>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<LinkmanInfo> linkmanInfo = new Holder<LinkmanInfo>();
		try {
			ucProfessionalUserProfilePersonList.getLinkmanInfo(ucAccount, linkmanId, queryType, resultCode, linkmanInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? linkmanInfo.value : null);
		return result;
	}

	@Override
	public UCSDKResponse<List<PersonalTeam>> getPersonTeamInfo(String ucAccount) {
		UCSDKResponse<List<PersonalTeam>> result = new UCSDKResponse<List<PersonalTeam>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<PersonalTeam>> personalTeam = new Holder<List<PersonalTeam>>();
		try {
			ucProfessionalUserProfilePersonList.getPersonTeamInfo(ucAccount, resultCode, personalTeam);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? personalTeam.value : null);
		return result;
	}

	@Override
	public UCSDKResponse<List<FriendInfo>> getFriendList(String ucAccount) {
		UCSDKResponse<List<FriendInfo>> result = new UCSDKResponse<List<FriendInfo>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<FriendInfo>> friendInfo = new Holder<List<FriendInfo>>();
		try {
			ucProfessionalUserProfileFriend.getFriendList(ucAccount, resultCode, friendInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? friendInfo.value : null);
		return result;
	}

	@Override
	public UCSDKResponse<List<FriendChangeInfo>> getPersonIncFriendList(
			String ucAccount, Date timeStamp) {
		UCSDKResponse<List<FriendChangeInfo>> result = new UCSDKResponse<List<FriendChangeInfo>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<FriendChangeInfo>> friendChangeInfoBase = new Holder<List<FriendChangeInfo>>();
		try {
			ucProfessionalUserProfileFriend.getPersonIncFriendList(ucAccount, timeStamp, resultCode, friendChangeInfoBase);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? friendChangeInfoBase.value : null);
		return result;
	}

	@Override
	public UCSDKResponse<FriendInfo> getFriendInfo(String ucAccount,
			Integer type, String friendAccount) {
		UCSDKResponse<FriendInfo> result = new UCSDKResponse<FriendInfo>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<FriendInfo> friendInfo = new Holder<FriendInfo>();
		try {
			ucProfessionalUserProfileFriend.getFriendInfo(ucAccount, type, friendAccount, resultCode, friendInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? friendInfo.value : null);
		return result;
	}
	
	@Override
	public UCSDKResponse<List<PresInfoResult>> queryUCPresence(List<String> presences) {
		UCSDKResponse<List<PresInfoResult>> result = new UCSDKResponse<List<PresInfoResult>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<PresInfoResult>> presInfoResult = new Holder<List<PresInfoResult>>();
		try {
			ucProfessionalUserProfilePSSvr.queryUCPresence(presences, resultCode, presInfoResult);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? presInfoResult.value : null);
		return result;
	}

//	@Override
//	public UCSDKResponse<LBSInfo> queryLBSLocation(String routeNumber) {
//		UCSDKResponse<String> result = new UCSDKResponse<String>();
//		Holder<Integer> resultCode = new Holder<Integer>();
//		Holder<String> confId = new Holder<String>();
//		try {
//			ucProfessionalCTC.createConf(confInfo, resultCode, confId);
//		} catch (Exception e) {
//			ExceptionUtils.processSoapException(result,e);
//			return result;
//		}
//		
//		result.setResultCode(resultCode.value);
//		result.setResult(resultCode.value == 0 ? confId.value : null);
//		return result;
//	}

	@Override
	public UCSDKResponse<QueryResultList<GroupInfoBase>> queryGroupList(
			QueryMode queryMode, String groupNumber, String groupName) {
		UCSDKResponse<QueryResultList<GroupInfoBase>> result = new UCSDKResponse<QueryResultList<GroupInfoBase>>();
		QueryResultList<GroupInfoBase> groupInfoBaseList = new QueryResultList<GroupInfoBase>();
		Holder<List<GroupInfoBase>>  groupInfoBase= new Holder<List<GroupInfoBase>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<PageInfo> pageInfo = new Holder<PageInfo>();
		try {
			ucProfessionalUserProfilePublicGroup.queryGroupList(queryMode, groupNumber, groupName, resultCode, pageInfo, groupInfoBase);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		if (resultCode.value == 0) {
			groupInfoBaseList.setPageInfo(pageInfo.value);
			groupInfoBaseList.setResultInfos(groupInfoBase.value);
			result.setResult(groupInfoBaseList);
		}
		return result;
	}

	@Override
	public UCSDKResponse<List<GroupInfo>> queryGroupInfo(String groupId,
			String creator) {
		UCSDKResponse<List<GroupInfo>> result = new UCSDKResponse<List<GroupInfo>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<GroupInfo>> groupInfo = new Holder<List<GroupInfo>>();
		try {
			ucProfessionalUserProfilePublicGroup.queryGroupInfo(groupId, creator, resultCode, groupInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? groupInfo.value : null);
		return result;
	}

	@Override
	public UCSDKResponse<QueryResultList<GroupMember>> queryGroupMember(String groupId, String creator, QueryMode queryMode) {
		UCSDKResponse<QueryResultList<GroupMember>> result = new UCSDKResponse<QueryResultList<GroupMember>>();
		
		QueryResultList<GroupMember> resultList = new QueryResultList<GroupMember>();
		
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<GroupMember>> groupMember = new Holder<List<GroupMember>>();
		Holder<PageInfo> pageInfo = new Holder<PageInfo>();
		try {
			ucProfessionalUserProfilePublicGroup.queryGroupMember(queryMode,groupId, creator, resultCode, pageInfo,groupMember);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		resultList.setResultInfos(groupMember.value);
		resultList.setPageInfo(pageInfo.value);
		result.setResult(resultCode.value == 0 ? resultList : null);
		return result;
	}

	@Override
	public UCSDKResponse<String> addGroup(GroupInfo groupInfo) {
		Holder<Integer> resultCode = new Holder<Integer>();
		UCSDKResponse<String> result = new UCSDKResponse<String>();
		Holder<String> groupNumber = new Holder<String>();
		try {
			ucProfessionalUserProfilePublicGroup.addGroup(groupInfo,resultCode,groupNumber);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result , e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? groupNumber.value : null);
		
		return result;
	}

	@Override
	public Integer modifyGroup(String groupId, String creator,
			GroupModifyInfo groupModifyInfo) {
		try {
			return ucProfessionalUserProfilePublicGroup.modifyGroup(groupId, creator, groupModifyInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<QueryResultList<JoinGroupInfo>> queryJoinGroupByUser(
			String ucAccount, QueryMode queryMode) {
		
		UCSDKResponse<QueryResultList<JoinGroupInfo>> result = new UCSDKResponse<QueryResultList<JoinGroupInfo>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<JoinGroupInfo>> joinGroupInfo = new Holder<List<JoinGroupInfo>>();
		Holder<PageInfo> pageInfo = new Holder<PageInfo>();
		
		QueryResultList<JoinGroupInfo> resultList = new QueryResultList<JoinGroupInfo>();
		try {
			ucProfessionalUserProfilePublicGroup.queryJoinGroupByUser(ucAccount, queryMode,resultCode,pageInfo, joinGroupInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		
		result.setResultCode(resultCode.value);
		
		resultList.setPageInfo(pageInfo.value);
		resultList.setResultInfos(joinGroupInfo.value);
		
		result.setResult(resultCode.value == 0 ? resultList : null);
		
		return result;
	}

	@Override
	public Integer modifyTeamSN(String ucAccount, PersonalTeam personalTeam) {
		try {
			return ucProfessionalUserProfilePersonList.modifyTeamSN(ucAccount, personalTeam);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer addNewFriend(String ucAccount, String friendAccount,
			CustomLinkmanInfo customLinkmanInfo, String groupId) {
		try {
			return ucProfessionalUserProfileFriend.addNewFriend(ucAccount, friendAccount, customLinkmanInfo, groupId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer modifyGroupOwner(String groupId, String creator,
			String groupName, String memberUri, String ownerFlag) {
		try {
			return ucProfessionalUserProfilePublicGroup.modifyGroupOwner(groupId, creator, groupName, memberUri, ownerFlag);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<List<BatchResultInfo>> addGroupMemberBatch(
			String groupId, String creator, String groupName,
			List<GroupMember> groupMember) {
		UCSDKResponse<List<BatchResultInfo>> result = new UCSDKResponse<List<BatchResultInfo>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<BatchResultInfo>> groupRetInfo = new Holder<List<BatchResultInfo>>();
		
		try {
			ucProfessionalUserProfilePublicGroup.addGroupMemberBatch(groupId, creator, groupName, groupMember, resultCode, groupRetInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result , e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? groupRetInfo.value : null);
		
		return result;
	}

	@Override
	public UCSDKResponse<List<BatchResultInfo>> delGroupMemberBatch(
			String groupId, String creator, String groupName,
			List<GroupMember> groupMember) {
		UCSDKResponse<List<BatchResultInfo>> result = new UCSDKResponse<List<BatchResultInfo>>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<List<BatchResultInfo>> groupRetInfo = new Holder<List<BatchResultInfo>>();
		
		try {
			ucProfessionalUserProfilePublicGroup.delGroupMemberBatch(groupId, creator, groupName, groupMember, resultCode, groupRetInfo);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result , e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? groupRetInfo.value : null);
		
		return result;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public Integer addNumber(NumberInfo numberInfo) {
		try {
			return ucProfessionalBMPNumber.addNumber(numberInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer delNumber(String corpInterNumber) {
		try {
			return ucProfessionalBMPNumber.delNumber(corpInterNumber);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer numberBind(BindInfo bindInfo) {
		try {
			return ucProfessionalBMPNumber.numberBind(bindInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}
	
	@Override
	public Integer updateDept(DeptKeyInfo deptKeyInfo) {
		try {
			return ucProfessionalBMPAccountMaintenance.updateDept(deptKeyInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer addDept(DeptKeyInfo deptKeyInfo) {
		try {
			return ucProfessionalBMPAccountMaintenance.addDept(deptKeyInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer modifyDept(DeptKeyInfo deptKeyInfo) {
		try {
			return ucProfessionalBMPAccountMaintenance.modifyDept(deptKeyInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer delDept(String deptId) {
		try {
			return ucProfessionalBMPAccountMaintenance.delDept(deptId);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer updateAccount(AccountInfo accountInfo) {
		try {
			return ucProfessionalBMPAccountMaintenance.updateAccount(accountInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer addAccount(AccountInfo accountInfo) {
		try {
			return ucProfessionalBMPAccountMaintenance.addAccount(accountInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer modifyAccount(AccountInfo accountInfo) {
		try {
			return ucProfessionalBMPAccountMaintenance.modifyAccount(accountInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public Integer delAccount(String ucAccount) {
		try {
			return ucProfessionalBMPAccountMaintenance.delAccount(ucAccount);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	@Override
	public UCSDKResponse<NumberInfo> queryNumber(NumberInfo numberInfo) {
		UCSDKResponse<NumberInfo> result = new UCSDKResponse<NumberInfo>();
		Holder<Integer> resultCode = new Holder<Integer>();
		Holder<NumberInfo> info = new Holder<NumberInfo>(numberInfo);
		try {
			ucProfessionalBMPNumber.queryNumber(info, resultCode);
		} catch (Exception e) {
			ExceptionUtils.processSoapException(result,e);
			return result;
		}
		result.setResultCode(resultCode.value);
		result.setResult(resultCode.value == 0 ? info.value : null);
		
		return result;
	}

	@Override
	public Integer modifyNumber(NumberInfo numberInfo) {
		try {
			return ucProfessionalBMPNumber.modifyNumber(numberInfo);
		} catch (Exception e) {
			return ExceptionUtils.processSoapException(e);
		}
	}

	
}
