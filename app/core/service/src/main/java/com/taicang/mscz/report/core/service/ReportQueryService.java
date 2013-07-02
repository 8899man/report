/**
 * Taicang mscz Inc.
 * Copyright (c) 2010-2013 All Rights Reserved.
 */
package com.taicang.mscz.report.core.service;

import java.util.List;

import com.taicang.mscz.report.core.model.ReportQueryCondition;

/**
 * �����ѯ����
 * 
 * @author narutoying09@gmail.com
 * @version $Id: ReportQueryService.java, v 0.1 2013-7-2 ����4:55:12
 *          narutoying09@gmail.com Exp $
 */
public interface ReportQueryService {
	/**
	 * ��ѯָ������Ĳ�ѯά�ȡ�����
	 * 
	 * @param reportId ����id
	 * @return
	 */
	List<ReportQueryCondition> queryReportQueryConditions(int reportId);
	
	
}
