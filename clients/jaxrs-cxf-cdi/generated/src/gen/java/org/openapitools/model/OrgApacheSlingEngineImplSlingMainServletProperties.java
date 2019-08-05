package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingEngineImplSlingMainServletProperties   {
  
  private ConfigNodePropertyInteger slingMaxCalls = null;

  private ConfigNodePropertyInteger slingMaxInclusions = null;

  private ConfigNodePropertyBoolean slingTraceAllow = null;

  private ConfigNodePropertyInteger slingMaxRecordRequests = null;

  private ConfigNodePropertyArray slingStorePatternRequests = null;

  private ConfigNodePropertyString slingServerinfo = null;

  private ConfigNodePropertyArray slingAdditionalResponseHeaders = null;


  /**
   **/
  public OrgApacheSlingEngineImplSlingMainServletProperties slingMaxCalls(ConfigNodePropertyInteger slingMaxCalls) {
    this.slingMaxCalls = slingMaxCalls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.max.calls")
  public ConfigNodePropertyInteger getSlingMaxCalls() {
    return slingMaxCalls;
  }
  public void setSlingMaxCalls(ConfigNodePropertyInteger slingMaxCalls) {
    this.slingMaxCalls = slingMaxCalls;
  }


  /**
   **/
  public OrgApacheSlingEngineImplSlingMainServletProperties slingMaxInclusions(ConfigNodePropertyInteger slingMaxInclusions) {
    this.slingMaxInclusions = slingMaxInclusions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.max.inclusions")
  public ConfigNodePropertyInteger getSlingMaxInclusions() {
    return slingMaxInclusions;
  }
  public void setSlingMaxInclusions(ConfigNodePropertyInteger slingMaxInclusions) {
    this.slingMaxInclusions = slingMaxInclusions;
  }


  /**
   **/
  public OrgApacheSlingEngineImplSlingMainServletProperties slingTraceAllow(ConfigNodePropertyBoolean slingTraceAllow) {
    this.slingTraceAllow = slingTraceAllow;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.trace.allow")
  public ConfigNodePropertyBoolean getSlingTraceAllow() {
    return slingTraceAllow;
  }
  public void setSlingTraceAllow(ConfigNodePropertyBoolean slingTraceAllow) {
    this.slingTraceAllow = slingTraceAllow;
  }


  /**
   **/
  public OrgApacheSlingEngineImplSlingMainServletProperties slingMaxRecordRequests(ConfigNodePropertyInteger slingMaxRecordRequests) {
    this.slingMaxRecordRequests = slingMaxRecordRequests;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.max.record.requests")
  public ConfigNodePropertyInteger getSlingMaxRecordRequests() {
    return slingMaxRecordRequests;
  }
  public void setSlingMaxRecordRequests(ConfigNodePropertyInteger slingMaxRecordRequests) {
    this.slingMaxRecordRequests = slingMaxRecordRequests;
  }


  /**
   **/
  public OrgApacheSlingEngineImplSlingMainServletProperties slingStorePatternRequests(ConfigNodePropertyArray slingStorePatternRequests) {
    this.slingStorePatternRequests = slingStorePatternRequests;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.store.pattern.requests")
  public ConfigNodePropertyArray getSlingStorePatternRequests() {
    return slingStorePatternRequests;
  }
  public void setSlingStorePatternRequests(ConfigNodePropertyArray slingStorePatternRequests) {
    this.slingStorePatternRequests = slingStorePatternRequests;
  }


  /**
   **/
  public OrgApacheSlingEngineImplSlingMainServletProperties slingServerinfo(ConfigNodePropertyString slingServerinfo) {
    this.slingServerinfo = slingServerinfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.serverinfo")
  public ConfigNodePropertyString getSlingServerinfo() {
    return slingServerinfo;
  }
  public void setSlingServerinfo(ConfigNodePropertyString slingServerinfo) {
    this.slingServerinfo = slingServerinfo;
  }


  /**
   **/
  public OrgApacheSlingEngineImplSlingMainServletProperties slingAdditionalResponseHeaders(ConfigNodePropertyArray slingAdditionalResponseHeaders) {
    this.slingAdditionalResponseHeaders = slingAdditionalResponseHeaders;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.additional.response.headers")
  public ConfigNodePropertyArray getSlingAdditionalResponseHeaders() {
    return slingAdditionalResponseHeaders;
  }
  public void setSlingAdditionalResponseHeaders(ConfigNodePropertyArray slingAdditionalResponseHeaders) {
    this.slingAdditionalResponseHeaders = slingAdditionalResponseHeaders;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

