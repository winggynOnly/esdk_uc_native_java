package com.huawei.esdk.uc.professional.local.bean;

import java.util.List;

public class QueryResultList<T> {
	
	private PageInfo pageInfo;
	
	private List<T> resultInfos;
	
	public PageInfo getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
	public List<T> getResultInfos() {
		return resultInfos;
	}
	public void setResultInfos(List<T> resultInfos) {
		this.resultInfos = resultInfos;
	}
	
}
