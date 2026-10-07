package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEngineImplSlingMainServletProperties   {

    private ConfigNodePropertyInteger slingMaxCalls;
    private ConfigNodePropertyInteger slingMaxInclusions;
    private ConfigNodePropertyBoolean slingTraceAllow;
    private ConfigNodePropertyInteger slingMaxRecordRequests;
    private ConfigNodePropertyArray slingStorePatternRequests;
    private ConfigNodePropertyString slingServerinfo;
    private ConfigNodePropertyArray slingAdditionalResponseHeaders;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEngineImplSlingMainServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEngineImplSlingMainServletProperties.
     *
     * @param slingMaxCalls slingMaxCalls
     * @param slingMaxInclusions slingMaxInclusions
     * @param slingTraceAllow slingTraceAllow
     * @param slingMaxRecordRequests slingMaxRecordRequests
     * @param slingStorePatternRequests slingStorePatternRequests
     * @param slingServerinfo slingServerinfo
     * @param slingAdditionalResponseHeaders slingAdditionalResponseHeaders
     */
    public OrgApacheSlingEngineImplSlingMainServletProperties(
        ConfigNodePropertyInteger slingMaxCalls, 
        ConfigNodePropertyInteger slingMaxInclusions, 
        ConfigNodePropertyBoolean slingTraceAllow, 
        ConfigNodePropertyInteger slingMaxRecordRequests, 
        ConfigNodePropertyArray slingStorePatternRequests, 
        ConfigNodePropertyString slingServerinfo, 
        ConfigNodePropertyArray slingAdditionalResponseHeaders
    ) {
        this.slingMaxCalls = slingMaxCalls;
        this.slingMaxInclusions = slingMaxInclusions;
        this.slingTraceAllow = slingTraceAllow;
        this.slingMaxRecordRequests = slingMaxRecordRequests;
        this.slingStorePatternRequests = slingStorePatternRequests;
        this.slingServerinfo = slingServerinfo;
        this.slingAdditionalResponseHeaders = slingAdditionalResponseHeaders;
    }



    /**
     * Get slingMaxCalls
     * @return slingMaxCalls
     */
    public ConfigNodePropertyInteger getSlingMaxCalls() {
        return slingMaxCalls;
    }

    public void setSlingMaxCalls(ConfigNodePropertyInteger slingMaxCalls) {
        this.slingMaxCalls = slingMaxCalls;
    }

    /**
     * Get slingMaxInclusions
     * @return slingMaxInclusions
     */
    public ConfigNodePropertyInteger getSlingMaxInclusions() {
        return slingMaxInclusions;
    }

    public void setSlingMaxInclusions(ConfigNodePropertyInteger slingMaxInclusions) {
        this.slingMaxInclusions = slingMaxInclusions;
    }

    /**
     * Get slingTraceAllow
     * @return slingTraceAllow
     */
    public ConfigNodePropertyBoolean getSlingTraceAllow() {
        return slingTraceAllow;
    }

    public void setSlingTraceAllow(ConfigNodePropertyBoolean slingTraceAllow) {
        this.slingTraceAllow = slingTraceAllow;
    }

    /**
     * Get slingMaxRecordRequests
     * @return slingMaxRecordRequests
     */
    public ConfigNodePropertyInteger getSlingMaxRecordRequests() {
        return slingMaxRecordRequests;
    }

    public void setSlingMaxRecordRequests(ConfigNodePropertyInteger slingMaxRecordRequests) {
        this.slingMaxRecordRequests = slingMaxRecordRequests;
    }

    /**
     * Get slingStorePatternRequests
     * @return slingStorePatternRequests
     */
    public ConfigNodePropertyArray getSlingStorePatternRequests() {
        return slingStorePatternRequests;
    }

    public void setSlingStorePatternRequests(ConfigNodePropertyArray slingStorePatternRequests) {
        this.slingStorePatternRequests = slingStorePatternRequests;
    }

    /**
     * Get slingServerinfo
     * @return slingServerinfo
     */
    public ConfigNodePropertyString getSlingServerinfo() {
        return slingServerinfo;
    }

    public void setSlingServerinfo(ConfigNodePropertyString slingServerinfo) {
        this.slingServerinfo = slingServerinfo;
    }

    /**
     * Get slingAdditionalResponseHeaders
     * @return slingAdditionalResponseHeaders
     */
    public ConfigNodePropertyArray getSlingAdditionalResponseHeaders() {
        return slingAdditionalResponseHeaders;
    }

    public void setSlingAdditionalResponseHeaders(ConfigNodePropertyArray slingAdditionalResponseHeaders) {
        this.slingAdditionalResponseHeaders = slingAdditionalResponseHeaders;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEngineImplSlingMainServletProperties {\n");
        
        sb.append("    slingMaxCalls: ").append(toIndentedString(slingMaxCalls)).append("\n");
        sb.append("    slingMaxInclusions: ").append(toIndentedString(slingMaxInclusions)).append("\n");
        sb.append("    slingTraceAllow: ").append(toIndentedString(slingTraceAllow)).append("\n");
        sb.append("    slingMaxRecordRequests: ").append(toIndentedString(slingMaxRecordRequests)).append("\n");
        sb.append("    slingStorePatternRequests: ").append(toIndentedString(slingStorePatternRequests)).append("\n");
        sb.append("    slingServerinfo: ").append(toIndentedString(slingServerinfo)).append("\n");
        sb.append("    slingAdditionalResponseHeaders: ").append(toIndentedString(slingAdditionalResponseHeaders)).append("\n");
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

