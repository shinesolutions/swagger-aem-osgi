package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties   {
  
  private ConfigNodePropertyBoolean enabled = null;
  private ConfigNodePropertyArray disabledForGroups = null;

  public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties () {

  }

  public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties (ConfigNodePropertyBoolean enabled, ConfigNodePropertyArray disabledForGroups) {
    this.enabled = enabled;
    this.disabledForGroups = disabledForGroups;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

    
  @JsonProperty("disabledForGroups")
  public ConfigNodePropertyArray getDisabledForGroups() {
    return disabledForGroups;
  }
  public void setDisabledForGroups(ConfigNodePropertyArray disabledForGroups) {
    this.disabledForGroups = disabledForGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties comAdobeCqExperiencelogImplExperienceLogConfigServletProperties = (ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties) o;
    return Objects.equals(enabled, comAdobeCqExperiencelogImplExperienceLogConfigServletProperties.enabled) &&
        Objects.equals(disabledForGroups, comAdobeCqExperiencelogImplExperienceLogConfigServletProperties.disabledForGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, disabledForGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    disabledForGroups: ").append(toIndentedString(disabledForGroups)).append("\n");
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
