package com.cognizant.demandService.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class FulfilledPosition {
	
	private String principle_name;
	
	private String tm_name;
	
	private String cts_sales_contact;
	
	private String portfolio;
	
	private String billable;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date request_received_date;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date start_date;
	
	private int demand_lead_time;
	
	private String demand_number;
	
	private String sub_status;
	
	private String skill;
	
	private String description;
	
	private String capability;
	
	private String status;
	 
	private String location;
	
	private String resource_level;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date cts_joining_date;
	
	private String SOW;
	
	private String resource_grade;
	
	private String profile_Sent;
	
	private String no_of_interviews;
	
	private String rejections;
	
	private String final_comments;
	
	private int demand_id;
	
	private int demand_fulfillment_id;
	
	private String requirement_type;

	public String getPrinciple_name() {
		return principle_name;
	}

	public void setPrinciple_name(String principle_name) {
		this.principle_name = principle_name;
	}

	public String getTm_name() {
		return tm_name;
	}

	public void setTm_name(String tm_name) {
		this.tm_name = tm_name;
	}

	public String getCts_sales_contact() {
		return cts_sales_contact;
	}

	public void setCts_sales_contact(String cts_sales_contact) {
		this.cts_sales_contact = cts_sales_contact;
	}

	public String getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	public String getBillable() {
		return billable;
	}

	public void setBillable(String billable) {
		this.billable = billable;
	}

	public Date getRequest_received_date() {
		return request_received_date;
	}

	public void setRequest_received_date(Date request_received_date2) {
		this.request_received_date = request_received_date2;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date2) {
		this.start_date = start_date2;
	}

	public int getdemand_lead_time() {
		return demand_lead_time;
	}

	public void setdemand_lead_time(int demand_lead_time) {
		this.demand_lead_time = demand_lead_time;
	}

	public String getDemand_number() {
		return demand_number;
	}

	public void setDemand_number(String demand_number) {
		this.demand_number = demand_number;
	}

	public String getSub_status() {
		return sub_status;
	}

	public void setSub_status(String sub_status) {
		this.sub_status = sub_status;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCapability() {
		return capability;
	}

	public void setCapability(String capability) {
		this.capability = capability;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getResource_level() {
		return resource_level;
	}

	public void setResource_level(String resource_level) {
		this.resource_level = resource_level;
	}

	public Date getCts_joining_date() {
		return cts_joining_date;
	}

	public void setCts_joining_date(Date cts_joining_date) {
		this.cts_joining_date = cts_joining_date;
	}

	public String getSOW() {
		return SOW;
	}

	public void setSOW(String sOW) {
		SOW = sOW;
	}

	public String getResource_grade() {
		return resource_grade;
	}

	public void setResource_grade(String resource_grade) {
		this.resource_grade = resource_grade;
	}

	public String getProfile_Sent() {
		return profile_Sent;
	}

	public void setProfile_Sent(String profile_Sent) {
		this.profile_Sent = profile_Sent;
	}

	public String getNo_of_interviews() {
		return no_of_interviews;
	}

	public void setNo_of_interviews(String no_of_interviews) {
		this.no_of_interviews = no_of_interviews;
	}

	public String getRejections() {
		return rejections;
	}

	public void setRejections(String rejections) {
		this.rejections = rejections;
	}

	public String getFinal_comments() {
		return final_comments;
	}

	public void setFinal_comments(String final_comments) {
		this.final_comments = final_comments;
	}

	public int getDemand_id() {
		return demand_id;
	}

	public void setDemand_id(int demand_id) {
		this.demand_id = demand_id;
	}

	public int getDemand_fulfillment_id() {
		return demand_fulfillment_id;
	}

	public void setDemand_fulfillment_id(int demand_fulfillment_id) {
		this.demand_fulfillment_id = demand_fulfillment_id;
	}

	public String getRequirement_type() {
		return requirement_type;
	}

	public void setRequirement_type(String requirement_type) {
		this.requirement_type = requirement_type;
	}
	
	

	
	
}
