package com.huawei.esdk.uc.professional.local.constant;

public interface NativeConstant {
	/**
	 * 系统错误
	 */
	int SYSTEM_ERRORCODE = 2130000010;
	/**
	 * 鉴权错误
	 */
	int AUTHORIZE_ERRORCODE = 2130000014;
	/**
	 * 参数不合法
	 */
	int SDK_DATA_INCORRECT_ERRORCODE = 0x00000005;
	/**
	 * 必填参数不能为空
	 */
	int SDK_PARAM_NOT_COMPLETE_ERRORCODE =2130000022;
	/**
	 * native网络异常
	 */
	int ERROR_CODE_NETWORK_ERROR = 2130000023;
	/**
	 * SSL握手失败
	 */
	int SSL_HANDSHAKE_FAILURE=2130000019;
	/**
	 * native处理异常
	 */
	int NATIVE_EXCEPTION = 2130000020;
	/**
	 * URL格式错误
	 */
	int NATIVE_URL_FORMAT_ERRORCODE = 2130000021;
	/**
	 * 注册回调失败
	 */
	int REDEGIT_CALLBAK_ERRORCODE = 2130000025;
	/**
	 * 取消注册回调失败
	 */
	int UNREDEGIT_CALLBAK_ERRORCODE = 2130000026;
	/**
	 * 密码输入错误次数超过限定值，账户被锁定
	 */
	int ACCOUNT_LOCKED = 2130000027;
}
