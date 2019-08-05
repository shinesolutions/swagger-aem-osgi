package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties   {
  
  private ConfigNodePropertyBoolean offloadingAgentmanagerEnabled = null;

  public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties () {

  }

  public ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties (ConfigNodePropertyBoolean offloadingAgentmanagerEnabled) {
    this.offloadingAgentmanagerEnabled = offloadingAgentmanagerEnabled;
  }

    
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
