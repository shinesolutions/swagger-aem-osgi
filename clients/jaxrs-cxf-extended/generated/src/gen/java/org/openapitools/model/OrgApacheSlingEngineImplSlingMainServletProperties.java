package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingEngineImplSlingMainServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger slingMaxCalls;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger slingMaxInclusions;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean slingTraceAllow;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger slingMaxRecordRequests;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingStorePatternRequests;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServerinfo;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingAdditionalResponseHeaders;
 /**
  * Get slingMaxCalls
  * @return slingMaxCalls
  */
  @JsonProperty("sling.max.calls")
  public ConfigNodePropertyInteger getSlingMaxCalls() {
    return slingMaxCalls;
  }

  /**
   * Sets the <code>slingMaxCalls</code> property.
   */
 public void setSlingMaxCalls(ConfigNodePropertyInteger slingMaxCalls) {
    this.slingMaxCalls = slingMaxCalls;
  }

  /**
   * Sets the <code>slingMaxCalls</code> property.
   */
  public OrgApacheSlingEngineImplSlingMainServletProperties slingMaxCalls(ConfigNodePropertyInteger slingMaxCalls) {
    this.slingMaxCalls = slingMaxCalls;
    return this;
  }

 /**
  * Get slingMaxInclusions
  * @return slingMaxInclusions
  */
  @JsonProperty("sling.max.inclusions")
  public ConfigNodePropertyInteger getSlingMaxInclusions() {
    return slingMaxInclusions;
  }

  /**
   * Sets the <code>slingMaxInclusions</code> property.
   */
 public void setSlingMaxInclusions(ConfigNodePropertyInteger slingMaxInclusions) {
    this.slingMaxInclusions = slingMaxInclusions;
  }

  /**
   * Sets the <code>slingMaxInclusions</code> property.
   */
  public OrgApacheSlingEngineImplSlingMainServletProperties slingMaxInclusions(ConfigNodePropertyInteger slingMaxInclusions) {
    this.slingMaxInclusions = slingMaxInclusions;
    return this;
  }

 /**
  * Get slingTraceAllow
  * @return slingTraceAllow
  */
  @JsonProperty("sling.trace.allow")
  public ConfigNodePropertyBoolean getSlingTraceAllow() {
    return slingTraceAllow;
  }

  /**
   * Sets the <code>slingTraceAllow</code> property.
   */
 public void setSlingTraceAllow(ConfigNodePropertyBoolean slingTraceAllow) {
    this.slingTraceAllow = slingTraceAllow;
  }

  /**
   * Sets the <code>slingTraceAllow</code> property.
   */
  public OrgApacheSlingEngineImplSlingMainServletProperties slingTraceAllow(ConfigNodePropertyBoolean slingTraceAllow) {
    this.slingTraceAllow = slingTraceAllow;
    return this;
  }

 /**
  * Get slingMaxRecordRequests
  * @return slingMaxRecordRequests
  */
  @JsonProperty("sling.max.record.requests")
  public ConfigNodePropertyInteger getSlingMaxRecordRequests() {
    return slingMaxRecordRequests;
  }

  /**
   * Sets the <code>slingMaxRecordRequests</code> property.
   */
 public void setSlingMaxRecordRequests(ConfigNodePropertyInteger slingMaxRecordRequests) {
    this.slingMaxRecordRequests = slingMaxRecordRequests;
  }

  /**
   * Sets the <code>slingMaxRecordRequests</code> property.
   */
  public OrgApacheSlingEngineImplSlingMainServletProperties slingMaxRecordRequests(ConfigNodePropertyInteger slingMaxRecordRequests) {
    this.slingMaxRecordRequests = slingMaxRecordRequests;
    return this;
  }

 /**
  * Get slingStorePatternRequests
  * @return slingStorePatternRequests
  */
  @JsonProperty("sling.store.pattern.requests")
  public ConfigNodePropertyArray getSlingStorePatternRequests() {
    return slingStorePatternRequests;
  }

  /**
   * Sets the <code>slingStorePatternRequests</code> property.
   */
 public void setSlingStorePatternRequests(ConfigNodePropertyArray slingStorePatternRequests) {
    this.slingStorePatternRequests = slingStorePatternRequests;
  }

  /**
   * Sets the <code>slingStorePatternRequests</code> property.
   */
  public OrgApacheSlingEngineImplSlingMainServletProperties slingStorePatternRequests(ConfigNodePropertyArray slingStorePatternRequests) {
    this.slingStorePatternRequests = slingStorePatternRequests;
    return this;
  }

 /**
  * Get slingServerinfo
  * @return slingServerinfo
  */
  @JsonProperty("sling.serverinfo")
  public ConfigNodePropertyString getSlingServerinfo() {
    return slingServerinfo;
  }

  /**
   * Sets the <code>slingServerinfo</code> property.
   */
 public void setSlingServerinfo(ConfigNodePropertyString slingServerinfo) {
    this.slingServerinfo = slingServerinfo;
  }

  /**
   * Sets the <code>slingServerinfo</code> property.
   */
  public OrgApacheSlingEngineImplSlingMainServletProperties slingServerinfo(ConfigNodePropertyString slingServerinfo) {
    this.slingServerinfo = slingServerinfo;
    return this;
  }

 /**
  * Get slingAdditionalResponseHeaders
  * @return slingAdditionalResponseHeaders
  */
  @JsonProperty("sling.additional.response.headers")
  public ConfigNodePropertyArray getSlingAdditionalResponseHeaders() {
    return slingAdditionalResponseHeaders;
  }

  /**
   * Sets the <code>slingAdditionalResponseHeaders</code> property.
   */
 public void setSlingAdditionalResponseHeaders(ConfigNodePropertyArray slingAdditionalResponseHeaders) {
    this.slingAdditionalResponseHeaders = slingAdditionalResponseHeaders;
  }

  /**
   * Sets the <code>slingAdditionalResponseHeaders</code> property.
   */
  public OrgApacheSlingEngineImplSlingMainServletProperties slingAdditionalResponseHeaders(ConfigNodePropertyArray slingAdditionalResponseHeaders) {
    this.slingAdditionalResponseHeaders = slingAdditionalResponseHeaders;
    return this;
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
    return Objects.equals(this.slingMaxCalls, orgApacheSlingEngineImplSlingMainServletProperties.slingMaxCalls) &&
        Objects.equals(this.slingMaxInclusions, orgApacheSlingEngineImplSlingMainServletProperties.slingMaxInclusions) &&
        Objects.equals(this.slingTraceAllow, orgApacheSlingEngineImplSlingMainServletProperties.slingTraceAllow) &&
        Objects.equals(this.slingMaxRecordRequests, orgApacheSlingEngineImplSlingMainServletProperties.slingMaxRecordRequests) &&
        Objects.equals(this.slingStorePatternRequests, orgApacheSlingEngineImplSlingMainServletProperties.slingStorePatternRequests) &&
        Objects.equals(this.slingServerinfo, orgApacheSlingEngineImplSlingMainServletProperties.slingServerinfo) &&
        Objects.equals(this.slingAdditionalResponseHeaders, orgApacheSlingEngineImplSlingMainServletProperties.slingAdditionalResponseHeaders);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

