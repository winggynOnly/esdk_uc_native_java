package com.huawei.esdk.uc.professional.local.userprofile;

import java.util.Date;
import java.util.List;

import com.huawei.esdk.uc.professional.local.bean.AccountInfo;
import com.huawei.esdk.uc.professional.local.bean.BatchResultInfo;
import com.huawei.esdk.uc.professional.local.bean.BindInfo;
import com.huawei.esdk.uc.professional.local.bean.CorpInfo;
import com.huawei.esdk.uc.professional.local.bean.CustomLinkmanInfo;
import com.huawei.esdk.uc.professional.local.bean.DeptInfo;
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

public interface UserProfileServiceEx {

	/**
	 * 企业详细信息查询
	 * @return
	 */
	UCSDKResponse<CorpInfo> queryCorpInfo();
	
	/**
	 * 企业部门搜索
	 * @param queryMode
	 * @param corpId
	 * @param deptId
	 * @param deptName
	 * @param parentDeptId
	 * @return
	 */
	UCSDKResponse<QueryResultList<DeptInfoBase>> queryDeptListInfo(QueryMode queryMode, String corpId, String deptId, String deptName, String parentDeptId);
	
	/**
	 * 企业部门详细信息查询
	 * @param deptId
	 * @return
	 */
	UCSDKResponse<DeptInfo> queryDeptInfo(String deptId);
	
	/**
	 * 企业通讯录搜索
	 * @param ucAccount
	 * @param queryMode
	 * @param pageCond
	 * @param offsetCond
	 * @return
	 */
	UCSDKResponse<QueryResultList<StaffInfoBase>> queryStaffList(String ucAccount, QueryMode queryMode, PageQueryStaffCond pageCond, OffsetQueryStaffCond offsetCond);
	
	/**
	 * 企业成员详情查询
	 * @param ucAccount
	 * @return
	 */
	UCSDKResponse<StaffInfo> queryStaffInfo(String ucAccount);
	
	/**
	 * 获取UC用户全量通讯录
	 * @param ucAccount
	 * @return
	 */
	UCSDKResponse<PersonalInfo> getPersonAllAddressBook(String ucAccount);
	
	/**
	 * 个人通讯录增量同步
	 * @param ucAccount
	 * @return
	 */
	UCSDKResponse<PersonalChangeInfo> getPersonIncAddressBook(String ucAccount,Date timeStamp);
	
	/**
	 * 添加联系人
	 * @param ucAccount
	 * @param linkmanInfo
	 * @param teamId
	 * @return
	 */
	Integer addLinkman(String ucAccount, LinkmanInfo linkmanInfo, String teamId);
	
	/**
	 * 联系人信息查询
	 * @param ucAccount
	 * @param linkmanId
	 * @param queryType
	 * @return
	 */
	UCSDKResponse<LinkmanInfo> getLinkmanInfo(String ucAccount, String linkmanId, Integer queryType); 
	
	/**
	 * 增加联系人分组
	 * @param ucAccount
	 * @param name
	 * @return
	 */
	UCSDKResponse<String> addLinkmanTeam(String ucAccount, String name);
	
	/**
	 * 删除联系人分组
	 * @param ucAccount
	 * @param teamId
	 * @return
	 */
	Integer delLinkmanTeam(String ucAccount, String teamId);
	
	/**
	 * 修改联系人分组
	 * @param ucAccount
	 * @param teamId
	 * @param name
	 * @return
	 */
	Integer modifyLinkmanTeam(String ucAccount, String teamId, String name);
	
	/**
	 * 添加分组成员
	 * @param ucAccount
	 * @param teamId
	 * @param linkmanId
	 * @return
	 */
	Integer addMemberToTeam(String ucAccount, String teamId, String linkmanId) ;
	
	/**
	 * 删除分组成员
	 * @param ucAccount
	 * @param teamId
	 * @param linkmanId
	 * @return
	 */
	Integer delMemberFromTeam(String ucAccount, String teamId, String linkmanId);
	
	/**
	 * 删除联系人
	 * @param ucAccount
	 * @param teamId
	 * @param linkmanId
	 * @return
	 */
	Integer delLinkman(String ucAccount, String teamId, String linkmanId);
	
	/**获取个人分组信息
	 * 
	 * @param ucAccount
	 * @return
	 */
	UCSDKResponse<List<PersonalTeam>> getPersonTeamInfo(String ucAccount);
	
	/**
	 * 获取好友列表
	 * @param ucAccount
	 * @return
	 */
	UCSDKResponse<List<FriendInfo>> getFriendList(String ucAccount);
	
	/**
	 * 查询信息增量同步
	 * @param ucAccount
	 * @param timeStamp
	 * @return
	 */
	UCSDKResponse<List<FriendChangeInfo>> getPersonIncFriendList(String ucAccount, Date timeStamp);
	
	/**
	 * 好友信息查询
	 * @param ucAccount
	 * @param type
	 * @param friendAccount
	 * @return
	 */
	UCSDKResponse <FriendInfo> getFriendInfo(String ucAccount, Integer type, String friendAccount);
	
	/**
	 * 添加好友
	 * @param ucAccount
	 * @param friendAccount
	 * @return
	 */
	Integer addFriend(String ucAccount, String friendAccount);
	
	/**
	 * 删除好友
	 * @param ucAccount
	 * @param friendAccount
	 * @return
	 */
	Integer delFriend(String ucAccount, String friendAccount);
	
	/**
	 * 查询UC用户状态
	 * @param presences
	 * @return
	 */
	UCSDKResponse<List<PresInfoResult>> queryUCPresence(List<String> presences);
	
//	/**
//	 * 查询物理位置
//	 * @param routeNumber
//	 * @return
//	 */
//	UCSDKResponse<LBSInfo> queryLBSLocation(String routeNumber);
	
	/**
	 * 群组列表查询
	 * @param queryMode
	 * @param groupNumber
	 * @param groupName
	 * @return
	 */
	UCSDKResponse<QueryResultList<GroupInfoBase>> queryGroupList(QueryMode queryMode, String groupNumber, String groupName);
	
	/**
	 * 群组信息查询
	 * @param groupId
	 * @param creator
	 * @return
	 */
	UCSDKResponse <List<GroupInfo>> queryGroupInfo(String groupId, String creator);
	
	/**
	 * 群组成员查询
	 * @param queryMode
	 * @param groupId
	 * @param creator
	 * @return
	 */
	UCSDKResponse<QueryResultList<GroupMember>> queryGroupMember(String groupId, String creator,QueryMode queryMode);
	
	/**
	 * 创建群组
	 * @param groupInfo
	 * @return
	 */
	UCSDKResponse<String> addGroup(GroupInfo groupInfo);
	
	/**
	 * 解散群组
	 * @param groupId
	 * @param creator
	 * @return
	 */
	Integer delGroup(String groupId, String creator);
	
	/**
	 * 修改群组
	 * @param groupId
	 * @param creator
	 * @param groupModifyInfo
	 * @return
	 */
	Integer modifyGroup(String groupId, String creator, GroupModifyInfo groupModifyInfo);
	
	/**
	 * 邀请成员加入
	 * @param groupId
	 * @param creator
	 * @param ucAccount
	 * @param groupName
	 * @return
	 */
	Integer addGroupMember(String groupId, String creator, String ucAccount, String groupName);
	
	/**
	 * 删除群组成员
	 * @param groupId
	 * @param creator
	 * @param ucAccount
	 * @param groupName
	 * @return
	 */
	Integer delGroupMember(String groupId, String creator, String ucAccount, String groupName);
	
	/**
	 * 查询某个用户的群组列表
	 * @param queryMode
	 * @param ucAccount
	 * @return
	 */
	UCSDKResponse<QueryResultList<JoinGroupInfo>> queryJoinGroupByUser(String ucAccount,QueryMode queryMode);
	
	/**
	 * 添加修改分组序号
	 * @param ucAccount
	 * @param personalTeam
	 * @return
	 */
	Integer modifyTeamSN(String ucAccount,PersonalTeam personalTeam);
	
	/**
	 * 添加联系人好友
	 * @param ucAccount
	 * @param friendAccount
	 * @param customLinkmanInfo
	 * @param groupId
	 * @return
	 */
	Integer addNewFriend(String ucAccount,String friendAccount,CustomLinkmanInfo customLinkmanInfo,String groupId);
	
	/**
	 * 修改群组管理员
	 * @param groupId
	 * @param creator
	 * @param groupName
	 * @param memberUri
	 * @param ownerFlag
	 * @return
	 */
	Integer modifyGroupOwner(String groupId,String creator,String groupName,String memberUri,String ownerFlag);
	/**
	 * 批量邀请成员加入
	 * @param groupId
	 * @param creator
	 * @param groupName
	 * @param groupMember
	 * @return
	 */
	UCSDKResponse<List<BatchResultInfo>> addGroupMemberBatch(String groupId,String creator,String groupName,List<GroupMember> groupMember);
	/**
	 * 批量删除群组成员
	 * @param groupId
	 * @param creator
	 * @param groupName
	 * @param groupMember
	 * @return
	 */
	UCSDKResponse<List<BatchResultInfo>> delGroupMemberBatch(String groupId,String creator,String groupName,List<GroupMember> groupMember);
	
	
    Integer updateDept(DeptKeyInfo deptKeyInfo);
	
    Integer addDept(DeptKeyInfo deptKeyInfo);
	
    Integer modifyDept(DeptKeyInfo deptKeyInfo);
	
    Integer delDept(String deptId);
	
    Integer updateAccount(AccountInfo accountInfo);
	
    Integer addAccount(AccountInfo accountInfo);
	
    Integer modifyAccount(AccountInfo accountInfo);
	
    Integer delAccount(String ucAccount);
	
	UCSDKResponse<NumberInfo> queryNumber(NumberInfo numberInfo);
	
	Integer addNumber(NumberInfo numberInfo);
	
	Integer modifyNumber(NumberInfo numberInfo);
	
	Integer delNumber(String corpInterNumber);
	
	Integer numberBind(BindInfo bindInfo);
}
