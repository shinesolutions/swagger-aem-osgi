package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingServletPaths = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingServletMethods = null;
 /**
   * Get slingServletPaths
   * @return slingServletPaths
  **/
  @JsonProperty("sling.servlet.paths")
  public ConfigNodePropertyString getSlingServletPaths() {
    return slingServletPaths;
  }

  public void setSlingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
  }

  public ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

 /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties {\n");
    
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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

