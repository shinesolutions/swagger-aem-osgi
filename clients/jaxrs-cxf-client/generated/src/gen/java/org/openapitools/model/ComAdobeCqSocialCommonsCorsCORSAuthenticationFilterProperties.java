package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean corsEnabling = null;
 /**
   * Get corsEnabling
   * @return corsEnabling
  **/
  @JsonProperty("cors.enabling")
  public ConfigNodePropertyBoolean getCorsEnabling() {
    return corsEnabling;
  }

  public void setCorsEnabling(ConfigNodePropertyBoolean corsEnabling) {
    this.corsEnabling = corsEnabling;
  }

  public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties corsEnabling(ConfigNodePropertyBoolean corsEnabling) {
    this.corsEnabling = corsEnabling;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties {\n");
    
    sb.append("    corsEnabling: ").append(toIndentedString(corsEnabling)).append("\n");
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

