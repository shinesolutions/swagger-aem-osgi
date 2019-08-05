package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties   {
  
  private ConfigNodePropertyString configured = null;


  /**
   **/
  public ComDayCqWcmCoreImplEventPageEventAuditListenerProperties configured(ConfigNodePropertyString configured) {
    this.configured = configured;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("configured")
  public ConfigNodePropertyString getConfigured() {
    return configured;
  }
  public void setConfigured(ConfigNodePropertyString configured) {
    this.configured = configured;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplEventPageEventAuditListenerProperties comDayCqWcmCoreImplEventPageEventAuditListenerProperties = (ComDayCqWcmCoreImplEventPageEventAuditListenerProperties) o;
    return Objects.equals(configured, comDayCqWcmCoreImplEventPageEventAuditListenerProperties.configured);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configured);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties {\n");
    
    sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
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

