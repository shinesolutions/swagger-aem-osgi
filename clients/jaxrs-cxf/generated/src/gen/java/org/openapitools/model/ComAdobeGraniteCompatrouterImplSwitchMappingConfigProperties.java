package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
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

public class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString group = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray ids = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

