package org.apache.camel.example.cxf.mock;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.example.reportincident.OutputReportIncident;

public class CXFWebserviceProcessor implements Processor {

	public void process(Exchange ex) throws Exception {
		OutputReportIncident out = new OutputReportIncident();
		out.setCode("OK;456");
		ex.getOut().setBody(out);
		
	}

}
