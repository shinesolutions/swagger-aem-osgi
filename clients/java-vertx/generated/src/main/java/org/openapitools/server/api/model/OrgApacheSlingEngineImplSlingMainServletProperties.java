package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingEngineImplSlingMainServletProperties   {
  
  private ConfigNodePropertyInteger slingMaxCalls = null;
  private ConfigNodePropertyInteger slingMaxInclusions = null;
  private ConfigNodePropertyBoolean slingTraceAllow = null;
  private ConfigNodePropertyInteger slingMaxRecordRequests = null;
  private ConfigNodePropertyArray slingStorePatternRequests = null;
  private ConfigNodePropertyString slingServerinfo = null;
  private ConfigNodePropertyArray slingAdditionalResponseHeaders = null;

  public OrgApacheSlingEngineImplSlingMainServletProperties () {

  }

  public OrgApacheSlingEngineImplSlingMainServletProperties (ConfigNodePropertyInteger slingMaxCalls, ConfigNodePropertyInteger slingMaxInclusions, ConfigNodePropertyBoolean slingTraceAllow, ConfigNodePropertyInteger slingMaxRecordRequests, ConfigNodePropertyArray slingStorePatternRequests, ConfigNodePropertyString slingServerinfo, ConfigNodePropertyArray slingAdditionalResponseHeaders) {
    this.slingMaxCalls = slingMaxCalls;
    this.slingMaxInclusions = slingMaxInclusions;
    this.slingTraceAllow = slingTraceAllow;
    this.slingMaxRecordRequests = slingMaxRecordRequests;
    this.slingStorePatternRequests = slingStorePatternRequests;
    this.slingServerinfo = slingServerinfo;
    this.slingAdditionalResponseHeaders = slingAdditionalResponseHeaders;
  }

    
  @JsonProperty("sling.max.calls")
  public ConfigNodePropertyInteger getSlingMaxCalls() {
    return slingMaxCalls;
  }
  public void setSlingMaxCalls(ConfigNodePropertyInteger slingMaxCalls) {
    this.slingMaxCalls = slingMaxCalls;
  }

    
  @JsonProperty("sling.max.inclusions")
  public ConfigNodePropertyInteger getSlingMaxInclusions() {
    return slingMaxInclusions;
  }
  public void setSlingMaxInclusions(ConfigNodePropertyInteger slingMaxInclusions) {
    this.slingMaxInclusions = slingMaxInclusions;
  }

    
  @JsonProperty("sling.trace.allow")
  public ConfigNodePropertyBoolean getSlingTraceAllow() {
    return slingTraceAllow;
  }
  public void setSlingTraceAllow(ConfigNodePropertyBoolean slingTraceAllow) {
    this.slingTraceAllow = slingTraceAllow;
  }

    
  @JsonProperty("sling.max.record.requests")
  public ConfigNodePropertyInteger getSlingMaxRecordRequests() {
    return slingMaxRecordRequests;
  }
  public void setSlingMaxRecordRequests(ConfigNodePropertyInteger slingMaxRecordRequests) {
    this.slingMaxRecordRequests = slingMaxRecordRequests;
  }

    
  @JsonProperty("sling.store.pattern.requests")
  public ConfigNodePropertyArray getSlingStorePatternRequests() {
    return slingStorePatternRequests;
  }
  public void setSlingStorePatternRequests(ConfigNodePropertyArray slingStorePatternRequests) {
    this.slingStorePatternRequests = slingStorePatternRequests;
  }

    
  @JsonProperty("sling.serverinfo")
  public ConfigNodePropertyString getSlingServerinfo() {
    return slingServerinfo;
  }
  public void setSlingServerinfo(ConfigNodePropertyString slingServerinfo) {
    this.slingServerinfo = slingServerinfo;
  }

    
  @JsonProperty("sling.additional.response.headers")
  public ConfigNodePropertyArray getSlingAdditionalResponseHeaders() {
    return slingAdditionalResponseHeaders;
  }
  public void setSlingAdditionalResponseHeaders(ConfigNodePropertyArray slingAdditionalResponseHeaders) {
    this.slingAdditionalResponseHeaders = slingAdditionalResponseHeaders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEngineImplSlingMainServletProperties orgApacheSlingEngineImplSlingMainServletProperties = (OrgApacheSlingEngineImplSlingMainServletProperties) o;
    return Objects.equals(slingMaxCalls, orgApacheSlingEngineImplSlingMainServletProperties.slingMaxCalls) &&
        Objects.equals(slingMaxInclusions, orgApacheSlingEngineImplSlingMainServletProperties.slingMaxInclusions) &&
        Objects.equals(slingTraceAllow, orgApacheSlingEngineImplSlingMainServletProperties.slingTraceAllow) &&
        Objects.equals(slingMaxRecordRequests, orgApacheSlingEngineImplSlingMainServletProperties.slingMaxRecordRequests) &&
        Objects.equals(slingStorePatternRequests, orgApacheSlingEngineImplSlingMainServletProperties.slingStorePatternRequests) &&
        Objects.equals(slingServerinfo, orgApacheSlingEngineImplSlingMainServletProperties.slingServerinfo) &&
        Objects.equals(slingAdditionalResponseHeaders, orgApacheSlingEngineImplSlingMainServletProperties.slingAdditionalResponseHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingMaxCalls, slingMaxInclusions, slingTraceAllow, slingMaxRecordRequests, slingStorePatternRequests, slingServerinfo, slingAdditionalResponseHeaders);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
