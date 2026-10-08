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



public class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties   {
  
  private ConfigNodePropertyBoolean offloadingAgentmanagerEnabled;

  /**
   **/
  public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties offloadingAgentmanagerEnabled(ConfigNodePropertyBoolean offloadingAgentmanagerEnabled) {
    this.offloadingAgentmanagerEnabled = offloadingAgentmanagerEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("offloading.agentmanager.enabled")
  public ConfigNodePropertyBoolean getOffloadingAgentmanagerEnabled() {
    return offloadingAgentmanagerEnabled;
  }
  public void setOffloadingAgentmanagerEnabled(ConfigNodePropertyBoolean offloadingAgentmanagerEnabled) {
    this.offloadingAgentmanagerEnabled = offloadingAgentmanagerEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties = (ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties) o;
    return Objects.equals(this.offloadingAgentmanagerEnabled, comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.offloadingAgentmanagerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offloadingAgentmanagerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties {\n");
    
    sb.append("    offloadingAgentmanagerEnabled: ").append(toIndentedString(offloadingAgentmanagerEnabled)).append("\n");
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

