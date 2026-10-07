package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplServletResourceCollectionServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray slingServletResourceTypes;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletMethods;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingServletSelectors;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString downloadConfig;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString viewSelector;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean sendEmail;
 /**
  * Get slingServletResourceTypes
  * @return slingServletResourceTypes
  */
  @JsonProperty("sling.servlet.resourceTypes")
  public ConfigNodePropertyArray getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }

  /**
   * Sets the <code>slingServletResourceTypes</code> property.
   */
 public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  /**
   * Sets the <code>slingServletResourceTypes</code> property.
   */
  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
    return this;
  }

 /**
  * Get slingServletMethods
  * @return slingServletMethods
  */
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  /**
   * Sets the <code>slingServletMethods</code> property.
   */
 public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  /**
   * Sets the <code>slingServletMethods</code> property.
   */
  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }

 /**
  * Get slingServletSelectors
  * @return slingServletSelectors
  */
  @JsonProperty("sling.servlet.selectors")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  /**
   * Sets the <code>slingServletSelectors</code> property.
   */
 public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  /**
   * Sets the <code>slingServletSelectors</code> property.
   */
  public ComDayCqDamCoreImplServletResourceCollectionServletProperties slingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

 /**
  * Get downloadConfig
  * @return downloadConfig
  */
  @JsonProperty("download.config")
  public ConfigNodePropertyString getDownloadConfig() {
    return downloadConfig;
  }

  /**
   * Sets the <code>downloadConfig</code> property.
   */
 public void setDownloadConfig(ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
  }

  /**
   * Sets the <code>downloadConfig</code> property.
   */
  public ComDayCqDamCoreImplServletResourceCollectionServletProperties downloadConfig(ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
    return this;
  }

 /**
  * Get viewSelector
  * @return viewSelector
  */
  @JsonProperty("view.selector")
  public ConfigNodePropertyString getViewSelector() {
    return viewSelector;
  }

  /**
   * Sets the <code>viewSelector</code> property.
   */
 public void setViewSelector(ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
  }

  /**
   * Sets the <code>viewSelector</code> property.
   */
  public ComDayCqDamCoreImplServletResourceCollectionServletProperties viewSelector(ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
    return this;
  }

 /**
  * Get sendEmail
  * @return sendEmail
  */
  @JsonProperty("send_email")
  public ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }

  /**
   * Sets the <code>sendEmail</code> property.
   */
 public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  /**
   * Sets the <code>sendEmail</code> property.
   */
  public ComDayCqDamCoreImplServletResourceCollectionServletProperties sendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
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
    ComDayCqDamCoreImplServletResourceCollectionServletProperties comDayCqDamCoreImplServletResourceCollectionServletProperties = (ComDayCqDamCoreImplServletResourceCollectionServletProperties) o;
    return Objects.equals(this.slingServletResourceTypes, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletResourceTypes) &&
        Objects.equals(this.slingServletMethods, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletMethods) &&
        Objects.equals(this.slingServletSelectors, comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletSelectors) &&
        Objects.equals(this.downloadConfig, comDayCqDamCoreImplServletResourceCollectionServletProperties.downloadConfig) &&
        Objects.equals(this.viewSelector, comDayCqDamCoreImplServletResourceCollectionServletProperties.viewSelector) &&
        Objects.equals(this.sendEmail, comDayCqDamCoreImplServletResourceCollectionServletProperties.sendEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletResourceTypes, slingServletMethods, slingServletSelectors, downloadConfig, viewSelector, sendEmail);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

