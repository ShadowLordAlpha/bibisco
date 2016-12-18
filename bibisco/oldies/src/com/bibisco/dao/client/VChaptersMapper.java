package com.bibisco.dao.client;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bibisco.dao.model.VChapters;
import com.bibisco.dao.model.VChaptersExample;
import com.bibisco.dao.model.VChaptersWithBLOBs;

public interface VChaptersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHAPTERS
	 * @mbggenerated  Sun May 25 01:18:25 CEST 2014
	 */
	int countByExample(VChaptersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHAPTERS
	 * @mbggenerated  Sun May 25 01:18:25 CEST 2014
	 */
	int deleteByExample(VChaptersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHAPTERS
	 * @mbggenerated  Sun May 25 01:18:25 CEST 2014
	 */
	int insert(VChaptersWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHAPTERS
	 * @mbggenerated  Sun May 25 01:18:25 CEST 2014
	 */
	int insertSelective(VChaptersWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHAPTERS
	 * @mbggenerated  Sun May 25 01:18:25 CEST 2014
	 */
	List<VChaptersWithBLOBs> selectByExampleWithBLOBs(VChaptersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHAPTERS
	 * @mbggenerated  Sun May 25 01:18:25 CEST 2014
	 */
	List<VChapters> selectByExample(VChaptersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHAPTERS
	 * @mbggenerated  Sun May 25 01:18:25 CEST 2014
	 */
	int updateByExampleSelective(@Param("record") VChaptersWithBLOBs record, @Param("example") VChaptersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHAPTERS
	 * @mbggenerated  Sun May 25 01:18:25 CEST 2014
	 */
	int updateByExampleWithBLOBs(@Param("record") VChaptersWithBLOBs record, @Param("example") VChaptersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.V_CHAPTERS
	 * @mbggenerated  Sun May 25 01:18:25 CEST 2014
	 */
	int updateByExample(@Param("record") VChapters record, @Param("example") VChaptersExample example);
}