package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComDayCqDamCoreImplServletBinaryProviderServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingServletResourceTypes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingServletMethods = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqDamDrmEnable = null;
 /**
   * Get slingServletResourceTypes
   * @return slingServletResourceTypes
  **/
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyArray getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  public ComDayCqDamCoreImplServletBinaryProviderServletProperties slingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
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

  public ComDayCqDamCoreImplServletBinaryProviderServletProperties slingServletMethods(ConfigNodePropertyArray slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

 /**
   * Get cqDamDrmEnable
   * @return cqDamDrmEnable
  **/
  @JsonProperty("cq.dam.drm.enable")
  public ConfigNodePropertyBoolean getCqDamDrmEnable() {
    return cqDamDrmEnable;
  }

  public void setCqDamDrmEnable(ConfigNodePropertyBoolean cqDamDrmEnable) {
    this.cqDamDrmEnable = cqDamDrmEnable;
  }

  public ComDayCqDamCoreImplServletBinaryProviderServletProperties cqDamDrmEnable(ConfigNodePropertyBoolean cqDamDrmEnable) {
    this.cqDamDrmEnable = cqDamDrmEnable;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletBinaryProviderServletProperties {\n");
    
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    cqDamDrmEnable: ").append(toIndentedString(cqDamDrmEnable)).append("\n");
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

