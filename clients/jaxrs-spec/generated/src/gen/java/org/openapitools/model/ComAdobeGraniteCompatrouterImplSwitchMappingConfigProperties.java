package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties   {
  
  private @Valid ConfigNodePropertyString group = null;
  private @Valid ConfigNodePropertyArray ids = null;

  /**
   **/
  public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties group(ConfigNodePropertyString group) {
    this.group = group;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group")
  public ConfigNodePropertyString getGroup() {
    return group;
  }
  public void setGroup(ConfigNodePropertyString group) {
    this.group = group;
  }

  /**
   **/
  public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties ids(ConfigNodePropertyArray ids) {
    this.ids = ids;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ids")
  public ConfigNodePropertyArray getIds() {
    return ids;
  }
  public void setIds(ConfigNodePropertyArray ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties = (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties) o;
    return Objects.equals(group, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.group) &&
        Objects.equals(ids, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

