package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties   {
  

  private ConfigNodePropertyBoolean offloadingAgentmanagerEnabled = null;

  /**
   **/
  
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
    return Objects.equals(offloadingAgentmanagerEnabled, comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.offloadingAgentmanagerEnabled);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

