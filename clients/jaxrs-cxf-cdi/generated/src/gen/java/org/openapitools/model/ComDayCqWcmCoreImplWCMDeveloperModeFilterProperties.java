package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties   {
  
  private ConfigNodePropertyBoolean wcmdevmodefilterEnabled;

  /**
   **/
  public ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties wcmdevmodefilterEnabled(ConfigNodePropertyBoolean wcmdevmodefilterEnabled) {
    this.wcmdevmodefilterEnabled = wcmdevmodefilterEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("wcmdevmodefilter.enabled")
  public ConfigNodePropertyBoolean getWcmdevmodefilterEnabled() {
    return wcmdevmodefilterEnabled;
  }
  public void setWcmdevmodefilterEnabled(ConfigNodePropertyBoolean wcmdevmodefilterEnabled) {
    this.wcmdevmodefilterEnabled = wcmdevmodefilterEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties comDayCqWcmCoreImplWCMDeveloperModeFilterProperties = (ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties) o;
    return Objects.equals(this.wcmdevmodefilterEnabled, comDayCqWcmCoreImplWCMDeveloperModeFilterProperties.wcmdevmodefilterEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wcmdevmodefilterEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties {\n");
    
    sb.append("    wcmdevmodefilterEnabled: ").append(toIndentedString(wcmdevmodefilterEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

