package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComDayCqDamCoreImplLightboxLightboxServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletPaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingServletMethods = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqDamEnableAnonymous = null;
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

  public ComDayCqDamCoreImplLightboxLightboxServletProperties slingServletPaths(ConfigNodePropertyString slingServletPaths) {
    this.slingServletPaths = slingServletPaths;
    return this;
  }

 /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyArray getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqDamCoreImplLightboxLightboxServletProperties slingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

 /**
   * Get cqDamEnableAnonymous
   * @return cqDamEnableAnonymous
  **/
  @JsonProperty("cq.dam.enable.anonymous")
  public ConfigNodePropertyBoolean getCqDamEnableAnonymous() {
    return cqDamEnableAnonymous;
  }

  public void setCqDamEnableAnonymous(ConfigNodePropertyBoolean cqDamEnableAnonymous) {
    this.cqDamEnableAnonymous = cqDamEnableAnonymous;
  }

  public ComDayCqDamCoreImplLightboxLightboxServletProperties cqDamEnableAnonymous(ConfigNodePropertyBoolean cqDamEnableAnonymous) {
    this.cqDamEnableAnonymous = cqDamEnableAnonymous;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplLightboxLightboxServletProperties {\n");
    
    sb.append("    slingServletPaths: ").append(toIndentedString(slingServletPaths)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    cqDamEnableAnonymous: ").append(toIndentedString(cqDamEnableAnonymous)).append("\n");
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

