package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties   {
  
  private @Valid ConfigNodePropertyBoolean enabled = null;
  private @Valid ConfigNodePropertyArray disabledForGroups = null;

  /**
   **/
  public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  public ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties disabledForGroups(ConfigNodePropertyArray disabledForGroups) {
    this.disabledForGroups = disabledForGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("disabledForGroups")
  public ConfigNodePropertyArray getDisabledForGroups() {
    return disabledForGroups;
  }
  public void setDisabledForGroups(ConfigNodePropertyArray disabledForGroups) {
    this.disabledForGroups = disabledForGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

