package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties   {
  

  private ConfigNodePropertyBoolean enabled = null;

  private ConfigNodePropertyArray disabledForGroups = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
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

