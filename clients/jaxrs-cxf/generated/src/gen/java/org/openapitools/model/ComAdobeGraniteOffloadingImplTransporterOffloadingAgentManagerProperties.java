package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean offloadingAgentmanagerEnabled = null;
 /**
   * Get offloadingAgentmanagerEnabled
   * @return offloadingAgentmanagerEnabled
  **/
  @JsonProperty("offloading.agentmanager.enabled")
  public ConfigNodePropertyBoolean getOffloadingAgentmanagerEnabled() {
    return offloadingAgentmanagerEnabled;
  }

  public void setOffloadingAgentmanagerEnabled(ConfigNodePropertyBoolean offloadingAgentmanagerEnabled) {
    this.offloadingAgentmanagerEnabled = offloadingAgentmanagerEnabled;
  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties offloadingAgentmanagerEnabled(ConfigNodePropertyBoolean offloadingAgentmanagerEnabled) {
    this.offloadingAgentmanagerEnabled = offloadingAgentmanagerEnabled;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

