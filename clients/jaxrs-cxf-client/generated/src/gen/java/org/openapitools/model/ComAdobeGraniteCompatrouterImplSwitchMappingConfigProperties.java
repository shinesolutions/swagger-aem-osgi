package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString group;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray ids;
 /**
   * Get group
   * @return group
  **/
  @JsonProperty("group")
  public ConfigNodePropertyString getGroup() {
    return group;
  }

  public void setGroup(ConfigNodePropertyString group) {
    this.group = group;
  }

  public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties group(ConfigNodePropertyString group) {
    this.group = group;
    return this;
  }

 /**
   * Get ids
   * @return ids
  **/
  @JsonProperty("ids")
  public ConfigNodePropertyArray getIds() {
    return ids;
  }

  public void setIds(ConfigNodePropertyArray ids) {
    this.ids = ids;
  }

  public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties ids(ConfigNodePropertyArray ids) {
    this.ids = ids;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties = (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties) o;
    return Objects.equals(this.group, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.group) &&
        Objects.equals(this.ids, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.ids);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

