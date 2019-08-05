package org.openapitools.model;

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

public class ComDayCqDamCoreImplServletMetadataGetServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletResourceTypes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletMethods = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletExtensions = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletSelectors = null;
 /**
   * Get slingServletResourceTypes
   * @return slingServletResourceTypes
  **/
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  public ComDayCqDamCoreImplServletMetadataGetServletProperties slingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
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

  public ComDayCqDamCoreImplServletMetadataGetServletProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

 /**
   * Get slingServletExtensions
   * @return slingServletExtensions
  **/
  @JsonProperty("sling.servlet.extensions")
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }

  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }

  public ComDayCqDamCoreImplServletMetadataGetServletProperties slingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
    return this;
  }

 /**
   * Get slingServletSelectors
   * @return slingServletSelectors
  **/
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComDayCqDamCoreImplServletMetadataGetServletProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletMetadataGetServletProperties {\n");
    
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
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

