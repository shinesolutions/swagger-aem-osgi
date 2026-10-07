package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties   {

    private ConfigNodePropertyString requestLogServiceFormat;
    private ConfigNodePropertyString requestLogServiceOutput;
    private ConfigNodePropertyDropDown requestLogServiceOutputtype;
    private ConfigNodePropertyBoolean requestLogServiceOnentry;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.
     *
     * @param requestLogServiceFormat requestLogServiceFormat
     * @param requestLogServiceOutput requestLogServiceOutput
     * @param requestLogServiceOutputtype requestLogServiceOutputtype
     * @param requestLogServiceOnentry requestLogServiceOnentry
     */
    public OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(
        ConfigNodePropertyString requestLogServiceFormat, 
        ConfigNodePropertyString requestLogServiceOutput, 
        ConfigNodePropertyDropDown requestLogServiceOutputtype, 
        ConfigNodePropertyBoolean requestLogServiceOnentry
    ) {
        this.requestLogServiceFormat = requestLogServiceFormat;
        this.requestLogServiceOutput = requestLogServiceOutput;
        this.requestLogServiceOutputtype = requestLogServiceOutputtype;
        this.requestLogServiceOnentry = requestLogServiceOnentry;
    }



    /**
     * Get requestLogServiceFormat
     * @return requestLogServiceFormat
     */
    public ConfigNodePropertyString getRequestLogServiceFormat() {
        return requestLogServiceFormat;
    }

    public void setRequestLogServiceFormat(ConfigNodePropertyString requestLogServiceFormat) {
        this.requestLogServiceFormat = requestLogServiceFormat;
    }

    /**
     * Get requestLogServiceOutput
     * @return requestLogServiceOutput
     */
    public ConfigNodePropertyString getRequestLogServiceOutput() {
        return requestLogServiceOutput;
    }

    public void setRequestLogServiceOutput(ConfigNodePropertyString requestLogServiceOutput) {
        this.requestLogServiceOutput = requestLogServiceOutput;
    }

    /**
     * Get requestLogServiceOutputtype
     * @return requestLogServiceOutputtype
     */
    public ConfigNodePropertyDropDown getRequestLogServiceOutputtype() {
        return requestLogServiceOutputtype;
    }

    public void setRequestLogServiceOutputtype(ConfigNodePropertyDropDown requestLogServiceOutputtype) {
        this.requestLogServiceOutputtype = requestLogServiceOutputtype;
    }

    /**
     * Get requestLogServiceOnentry
     * @return requestLogServiceOnentry
     */
    public ConfigNodePropertyBoolean getRequestLogServiceOnentry() {
        return requestLogServiceOnentry;
    }

    public void setRequestLogServiceOnentry(ConfigNodePropertyBoolean requestLogServiceOnentry) {
        this.requestLogServiceOnentry = requestLogServiceOnentry;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {\n");
        
        sb.append("    requestLogServiceFormat: ").append(toIndentedString(requestLogServiceFormat)).append("\n");
        sb.append("    requestLogServiceOutput: ").append(toIndentedString(requestLogServiceOutput)).append("\n");
        sb.append("    requestLogServiceOutputtype: ").append(toIndentedString(requestLogServiceOutputtype)).append("\n");
        sb.append("    requestLogServiceOnentry: ").append(toIndentedString(requestLogServiceOnentry)).append("\n");
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

