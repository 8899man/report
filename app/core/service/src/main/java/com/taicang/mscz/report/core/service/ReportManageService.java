/**
 * Taicang mscz Inc.
 * Copyright (c) 2010-2013 All Rights Reserved.
 */
package com.taicang.mscz.report.core.service;

import java.util.List;

import com.taicang.mscz.report.core.model.Report;
import com.taicang.mscz.report.core.model.ReportFieldMapping;
import com.taicang.mscz.report.core.model.ReportQueryCondition;
import com.taicang.mscz.report.core.model.Unit;

/**
 * ����������
 * 
 * @author narutoying09@gmail.com
 * @version $Id: ReportService.java, v 0.1 2013-7-2 ����4:54:09
 *          narutoying09@gmail.com Exp $
 */
public interface ReportManageService {

	/**
	 * ���ղ���ʼ�������������
	 * 1. ��鱨���Ƿ��ܹ�������
	 * 	1.1 ����������
	 * 	1.2 �����Ƿ��Ѵ��ڣ���������Ψһ��
	 * 2. ���ͨ���󣬽������²�����
	 * 	2.1 ��ʼ������ 
	 *  2.2 ��ʼ����ѯά�ȣ���ֵ��
	 *  2.3 ��ʼ���ֶ�ӳ���ϵ
	 *  2.4 ��ʼ���������ݵ�Ԫ
	 * 
	 * @param report
	 * @param conditionsWithValues
	 * @param fieldMapping
	 * @param units
	 */
	void receiveReport(Report report,
			List<ReportQueryCondition> conditionsWithValues,
			ReportFieldMapping fieldMapping, List<Unit> units);

}
