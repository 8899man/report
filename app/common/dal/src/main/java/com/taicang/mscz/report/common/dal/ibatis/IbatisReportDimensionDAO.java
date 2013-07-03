/*
 * Tceon.com Inc.
 * Copyright (c) 2009 All Rights Reserved.
 */
package com.taicang.mscz.report.common.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.taicang.mscz.report.common.dal.daointerface.ReportDimensionDAO;

// auto generated imports
import com.taicang.mscz.report.common.dal.dataobject.ReportDimensionDO;
import java.util.List;
import org.springframework.dao.DataAccessException;
import com.taicang.mscz.report.common.dal.dataobject.ReportDimensionDO;

/**
 * An ibatis based implementation of dao interface <tt>com.taicang.mscz.report.common.dal.daointerface.ReportDimensionDAO</tt>.
 *
 * This file is generated by <tt>paygw-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/report_dimension.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>paygw-dalgen</tt> 
 * to generate this file.
 *
 * @author Cheng Li
 */
public class IbatisReportDimensionDAO extends SqlMapClientDaoSupport implements ReportDimensionDAO {
	/**
	 *  Query DB table <tt>report_dimension</tt> for records.
	 *
   	 *  <p>
   	 *  Description for this operation is<br>
   	 *  <tt></tt>
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from report_dimension where (report_id = ?)</tt>
	 *
	 *	@param reportId
	 *	@return List<ReportDimensionDO>
	 *	@throws DataAccessException
	 */	 
    public List<ReportDimensionDO> getByReportId(int reportId) throws DataAccessException {
        Integer param = new Integer(reportId);
        return getSqlMapClientTemplate().queryForList("MS-REPORT-DIMENSION-GET-BY-REPORT-ID", param);

    }

	/**
	 *  Insert one <tt>ReportDimensionDO</tt> object to DB table <tt>report_dimension</tt>, return primary key
	 *
   	 *  <p>
   	 *  Description for this operation is<br>
   	 *  <tt></tt>
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into report_dimension(report_id,name) values (?, ?)</tt>
	 *
	 *	@param reportDimension
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int insert(ReportDimensionDO reportDimension) throws DataAccessException {
    	if (reportDimension == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-REPORT-DIMENSION-INSERT", reportDimension);

        return reportDimension.getId();
    }

}