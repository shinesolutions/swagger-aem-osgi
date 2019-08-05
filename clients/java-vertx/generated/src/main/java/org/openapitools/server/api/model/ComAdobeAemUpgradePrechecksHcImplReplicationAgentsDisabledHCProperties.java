package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties   {
  
  private ConfigNodePropertyString hcName = null;
  private ConfigNodePropertyArray hcTags = null;
  private ConfigNodePropertyString hcMbeanName = null;

  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties () {

  }

  public ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties (ConfigNodePropertyString hcName, ConfigNodePropertyArray hcTags, ConfigNodePropertyString hcMbeanName) {
    this.hcName = hcName;
    this.hcTags = hcTags;
    this.hcMbeanName = hcMbeanName;
  }

    
  @JsonProperty("hc.name")
  public ConfigNodePropertyString getHcName() {
    return hcName;
  }
  public void setHcName(ConfigNodePropertyString hcName) {
    this.hcName = hcName;
  }

    
  @JsonProperty("hc.tags")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }
  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

    
  @JsonProperty("hc.mbean.name")
  public ConfigNodePropertyString getHcMbeanName() {
    return hcMbeanName;
  }
  public void setHcMbeanName(ConfigNodePropertyString hcMbeanName) {
    this.hcMbeanName = hcMbeanName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties = (ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties) o;
    return Objects.equals(hcName, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.hcName) &&
        Objects.equals(hcTags, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.hcTags) &&
        Objects.equals(hcMbeanName, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.hcMbeanName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcName, hcTags, hcMbeanName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties {\n");
    
    sb.append("    hcName: ").append(toIndentedString(hcName)).append("\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    hcMbeanName: ").append(toIndentedString(hcMbeanName)).append("\n");
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
