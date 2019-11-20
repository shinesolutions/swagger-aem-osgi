/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyArray;
import org.openapitools.client.model.ConfigNodePropertyBoolean;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComDayCqDamCoreImplServletResourceCollectionServletProperties {
  
  @SerializedName("sling.servlet.resourceTypes")
  private ConfigNodePropertyArray slingServletResourceTypes = null;
  @SerializedName("sling.servlet.methods")
  private ConfigNodePropertyString slingServletMethods = null;
  @SerializedName("sling.servlet.selectors")
  private ConfigNodePropertyString slingServletSelectors = null;
  @SerializedName("download.config")
  private ConfigNodePropertyString downloadConfig = null;
  @SerializedName("view.selector")
  private ConfigNodePropertyString viewSelector = null;
  @SerializedName("send_email")
  private ConfigNodePropertyBoolean sendEmail = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }
  public void setSlingServletResourceTypes(ConfigNodePropertyArray slingServletResourceTypes) {
    this.slingServletResourceTypes = slingServletResourceTypes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }
  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }
  public void setSlingServletSelectors(ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDownloadConfig() {
    return downloadConfig;
  }
  public void setDownloadConfig(ConfigNodePropertyString downloadConfig) {
    this.downloadConfig = downloadConfig;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getViewSelector() {
    return viewSelector;
  }
  public void setViewSelector(ConfigNodePropertyString viewSelector) {
    this.viewSelector = viewSelector;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }
  public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
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
    return (this.slingServletResourceTypes == null ? comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletResourceTypes == null : this.slingServletResourceTypes.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletResourceTypes)) &&
        (this.slingServletMethods == null ? comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletMethods == null : this.slingServletMethods.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletMethods)) &&
        (this.slingServletSelectors == null ? comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletSelectors == null : this.slingServletSelectors.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties.slingServletSelectors)) &&
        (this.downloadConfig == null ? comDayCqDamCoreImplServletResourceCollectionServletProperties.downloadConfig == null : this.downloadConfig.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties.downloadConfig)) &&
        (this.viewSelector == null ? comDayCqDamCoreImplServletResourceCollectionServletProperties.viewSelector == null : this.viewSelector.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties.viewSelector)) &&
        (this.sendEmail == null ? comDayCqDamCoreImplServletResourceCollectionServletProperties.sendEmail == null : this.sendEmail.equals(comDayCqDamCoreImplServletResourceCollectionServletProperties.sendEmail));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.slingServletResourceTypes == null ? 0: this.slingServletResourceTypes.hashCode());
    result = 31 * result + (this.slingServletMethods == null ? 0: this.slingServletMethods.hashCode());
    result = 31 * result + (this.slingServletSelectors == null ? 0: this.slingServletSelectors.hashCode());
    result = 31 * result + (this.downloadConfig == null ? 0: this.downloadConfig.hashCode());
    result = 31 * result + (this.viewSelector == null ? 0: this.viewSelector.hashCode());
    result = 31 * result + (this.sendEmail == null ? 0: this.sendEmail.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletResourceCollectionServletProperties {\n");
    
    sb.append("  slingServletResourceTypes: ").append(slingServletResourceTypes).append("\n");
    sb.append("  slingServletMethods: ").append(slingServletMethods).append("\n");
    sb.append("  slingServletSelectors: ").append(slingServletSelectors).append("\n");
    sb.append("  downloadConfig: ").append(downloadConfig).append("\n");
    sb.append("  viewSelector: ").append(viewSelector).append("\n");
    sb.append("  sendEmail: ").append(sendEmail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}