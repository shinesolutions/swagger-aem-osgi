package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamCoreImplServletGuidLookupFilterProperties   {
  
  private ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled = null;


  /**
   **/
  public ComDayCqDamCoreImplServletGuidLookupFilterProperties cqDamCoreGuidlookupfilterEnabled(ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled) {
    this.cqDamCoreGuidlookupfilterEnabled = cqDamCoreGuidlookupfilterEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.core.guidlookupfilter.enabled")
  public ConfigNodePropertyBoolean getCqDamCoreGuidlookupfilterEnabled() {
    return cqDamCoreGuidlookupfilterEnabled;
  }
  public void setCqDamCoreGuidlookupfilterEnabled(ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled) {
    this.cqDamCoreGuidlookupfilterEnabled = cqDamCoreGuidlookupfilterEnabled;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletGuidLookupFilterProperties comDayCqDamCoreImplServletGuidLookupFilterProperties = (ComDayCqDamCoreImplServletGuidLookupFilterProperties) o;
    return Objects.equals(cqDamCoreGuidlookupfilterEnabled, comDayCqDamCoreImplServletGuidLookupFilterProperties.cqDamCoreGuidlookupfilterEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamCoreGuidlookupfilterEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletGuidLookupFilterProperties {\n");
    
    sb.append("    cqDamCoreGuidlookupfilterEnabled: ").append(toIndentedString(cqDamCoreGuidlookupfilterEnabled)).append("\n");
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

