package com.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;

public class JacksonConverter {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		OrgDetailsRequest orgDetailsRequest = createOrgDetailsReq();


		try {
			// Java objects to JSON file

//			mapper = new ObjectMapper(new YAMLFactory().disable(Feature.WRITE_DOC_START_MARKER));
//			mapper.writeValue(new File("C:\\Users\\smhirema\\Desktop\\source\\OrgDetailsOutput.yaml"), orgDetailsRequest);

			// Java objects to JSON string - pretty-print
			String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(orgDetailsRequest);

			System.out.println(jsonInString2);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static OrgDetailsRequest createOrgDetailsReq() {
		OrgDetailsRequest orgDetailsRequest = new OrgDetailsRequest();
		Set<String> empIds = new HashSet<String>();
		empIds.add("0121009716");
		empIds.add("0120324887");
		empIds.add("0120324892");
		empIds.add("0118350122");
		empIds.add("0122379420");
		orgDetailsRequest.setEmployeeIds(empIds);

		List<String> deptIds = new ArrayList<String>();
		deptIds.add("Marketing & Sales");
		deptIds.add("Finance");
		deptIds.add("IT Infrastructes");
		deptIds.add("Operations");
		orgDetailsRequest.setDepartmentIds(deptIds);

		return orgDetailsRequest;
	}

}
