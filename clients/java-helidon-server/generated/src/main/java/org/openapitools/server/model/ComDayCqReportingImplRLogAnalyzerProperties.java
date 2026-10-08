package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReportingImplRLogAnalyzerProperties   {

    private ConfigNodePropertyString requestLogOutput;

    /**
     * Default constructor.
     */
    public ComDayCqReportingImplRLogAnalyzerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReportingImplRLogAnalyzerProperties.
     *
     * @param requestLogOutput requestLogOutput
     */
    public ComDayCqReportingImplRLogAnalyzerProperties(
        ConfigNodePropertyString requestLogOutput
    ) {
        this.requestLogOutput = requestLogOutput;
    }



    /**
     * Get requestLogOutput
     * @return requestLogOutput
     */
    public ConfigNodePropertyString getRequestLogOutput() {
        return requestLogOutput;
    }

    public void setRequestLogOutput(ConfigNodePropertyString requestLogOutput) {
        this.requestLogOutput = requestLogOutput;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReportingImplRLogAnalyzerProperties {\n");
        
        sb.append("    requestLogOutput: ").append(toIndentedString(requestLogOutput)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

