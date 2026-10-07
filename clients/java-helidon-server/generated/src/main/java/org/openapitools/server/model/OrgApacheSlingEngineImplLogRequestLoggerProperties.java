package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEngineImplLogRequestLoggerProperties   {

    private ConfigNodePropertyString requestLogOutput;
    private ConfigNodePropertyDropDown requestLogOutputtype;
    private ConfigNodePropertyBoolean requestLogEnabled;
    private ConfigNodePropertyString accessLogOutput;
    private ConfigNodePropertyDropDown accessLogOutputtype;
    private ConfigNodePropertyBoolean accessLogEnabled;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEngineImplLogRequestLoggerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEngineImplLogRequestLoggerProperties.
     *
     * @param requestLogOutput requestLogOutput
     * @param requestLogOutputtype requestLogOutputtype
     * @param requestLogEnabled requestLogEnabled
     * @param accessLogOutput accessLogOutput
     * @param accessLogOutputtype accessLogOutputtype
     * @param accessLogEnabled accessLogEnabled
     */
    public OrgApacheSlingEngineImplLogRequestLoggerProperties(
        ConfigNodePropertyString requestLogOutput, 
        ConfigNodePropertyDropDown requestLogOutputtype, 
        ConfigNodePropertyBoolean requestLogEnabled, 
        ConfigNodePropertyString accessLogOutput, 
        ConfigNodePropertyDropDown accessLogOutputtype, 
        ConfigNodePropertyBoolean accessLogEnabled
    ) {
        this.requestLogOutput = requestLogOutput;
        this.requestLogOutputtype = requestLogOutputtype;
        this.requestLogEnabled = requestLogEnabled;
        this.accessLogOutput = accessLogOutput;
        this.accessLogOutputtype = accessLogOutputtype;
        this.accessLogEnabled = accessLogEnabled;
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
     * Get requestLogOutputtype
     * @return requestLogOutputtype
     */
    public ConfigNodePropertyDropDown getRequestLogOutputtype() {
        return requestLogOutputtype;
    }

    public void setRequestLogOutputtype(ConfigNodePropertyDropDown requestLogOutputtype) {
        this.requestLogOutputtype = requestLogOutputtype;
    }

    /**
     * Get requestLogEnabled
     * @return requestLogEnabled
     */
    public ConfigNodePropertyBoolean getRequestLogEnabled() {
        return requestLogEnabled;
    }

    public void setRequestLogEnabled(ConfigNodePropertyBoolean requestLogEnabled) {
        this.requestLogEnabled = requestLogEnabled;
    }

    /**
     * Get accessLogOutput
     * @return accessLogOutput
     */
    public ConfigNodePropertyString getAccessLogOutput() {
        return accessLogOutput;
    }

    public void setAccessLogOutput(ConfigNodePropertyString accessLogOutput) {
        this.accessLogOutput = accessLogOutput;
    }

    /**
     * Get accessLogOutputtype
     * @return accessLogOutputtype
     */
    public ConfigNodePropertyDropDown getAccessLogOutputtype() {
        return accessLogOutputtype;
    }

    public void setAccessLogOutputtype(ConfigNodePropertyDropDown accessLogOutputtype) {
        this.accessLogOutputtype = accessLogOutputtype;
    }

    /**
     * Get accessLogEnabled
     * @return accessLogEnabled
     */
    public ConfigNodePropertyBoolean getAccessLogEnabled() {
        return accessLogEnabled;
    }

    public void setAccessLogEnabled(ConfigNodePropertyBoolean accessLogEnabled) {
        this.accessLogEnabled = accessLogEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEngineImplLogRequestLoggerProperties {\n");
        
        sb.append("    requestLogOutput: ").append(toIndentedString(requestLogOutput)).append("\n");
        sb.append("    requestLogOutputtype: ").append(toIndentedString(requestLogOutputtype)).append("\n");
        sb.append("    requestLogEnabled: ").append(toIndentedString(requestLogEnabled)).append("\n");
        sb.append("    accessLogOutput: ").append(toIndentedString(accessLogOutput)).append("\n");
        sb.append("    accessLogOutputtype: ").append(toIndentedString(accessLogOutputtype)).append("\n");
        sb.append("    accessLogEnabled: ").append(toIndentedString(accessLogEnabled)).append("\n");
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

