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

public class ComDayCqDamCoreImplServletResourceCollectionServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingServletResourceTypes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletMethods = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletSelectors = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString downloadConfig = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString viewSelector = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean sendEmail = null;
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

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
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

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
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

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

 /**
   * Get downloadConfig
   * @return downloadConfig
  **/
  @JsonProperty("download.config")
  public ConfigNodePropertyString getDownloadConfig() {
    return downloadConfig;
  }

  public void setDownloadConfig(ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties downloadConfig(ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
    return this;
  }

 /**
   * Get viewSelector
   * @return viewSelector
  **/
  @JsonProperty("view.selector")
  public ConfigNodePropertyString getViewSelector() {
    return viewSelector;
  }

  public void setViewSelector(ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties viewSelector(ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
    return this;
  }

 /**
   * Get sendEmail
   * @return sendEmail
  **/
  @JsonProperty("send_email")
  public ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }

  public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  public ComDayCqDamCoreImplServletResourceCollectionServletProperties sendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletResourceCollectionServletProperties {\n");
    
    sb.append("    slingServletResourceTypes: ").append(toIndentedString(slingServletResourceTypes)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    downloadConfig: ").append(toIndentedString(downloadConfig)).append("\n");
    sb.append("    viewSelector: ").append(toIndentedString(viewSelector)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
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

