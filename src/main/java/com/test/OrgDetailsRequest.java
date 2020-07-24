package com.test;


import java.util.List;
import java.util.Set;

public class OrgDetailsRequest {

	private List<String> departmentIds;
	private Set<String> employeeIds;
	
	/**
	 * @return the departmentIds
	 */
	public List<String> getDepartmentIds() {
		return departmentIds;
	}

	/**
	 * @param departmentIds the departmentIds to set
	 */
	public void setDepartmentIds(List<String> departmentIds) {
		this.departmentIds = departmentIds;
	}

	/**
	 * @return the employeeIds
	 */
	public Set<String> getEmployeeIds() {
		return employeeIds;
	}

	/**
	 * @param employeeIds the employeeIds to set
	 */
	public void setEmployeeIds(Set<String> employeeIds) {
		this.employeeIds = employeeIds;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrganizationDetailsRequest [departmentIds=" + departmentIds + ", employeeIds=" + employeeIds + "]";
	}

}