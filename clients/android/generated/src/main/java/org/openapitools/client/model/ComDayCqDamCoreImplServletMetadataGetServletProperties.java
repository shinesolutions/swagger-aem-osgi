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

import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComDayCqDamCoreImplServletMetadataGetServletProperties {
  
  @SerializedName("sling.servlet.resourceTypes")
  private ConfigNodePropertyString slingServletResourceTypes = null;
  @SerializedName("sling.servlet.methods")
  private ConfigNodePropertyString slingServletMethods = null;
  @SerializedName("sling.servlet.extensions")
  private ConfigNodePropertyString slingServletExtensions = null;
  @SerializedName("sling.servlet.selectors")
  private ConfigNodePropertyString slingServletSelectors = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingServletResourceTypes() {
    return slingServletResourceTypes;
  }
  public void setSlingServletResourceTypes(ConfigNodePropertyString slingServletResourceTypes) {
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
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }
  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletMetadataGetServletProperties comDayCqDamCoreImplServletMetadataGetServletProperties = (ComDayCqDamCoreImplServletMetadataGetServletProperties) o;
    return (this.slingServletResourceTypes == null ? comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletResourceTypes == null : this.slingServletResourceTypes.equals(comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletResourceTypes)) &&
        (this.slingServletMethods == null ? comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletMethods == null : this.slingServletMethods.equals(comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletMethods)) &&
        (this.slingServletExtensions == null ? comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletExtensions == null : this.slingServletExtensions.equals(comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletExtensions)) &&
        (this.slingServletSelectors == null ? comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletSelectors == null : this.slingServletSelectors.equals(comDayCqDamCoreImplServletMetadataGetServletProperties.slingServletSelectors));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.slingServletResourceTypes == null ? 0: this.slingServletResourceTypes.hashCode());
    result = 31 * result + (this.slingServletMethods == null ? 0: this.slingServletMethods.hashCode());
    result = 31 * result + (this.slingServletExtensions == null ? 0: this.slingServletExtensions.hashCode());
    result = 31 * result + (this.slingServletSelectors == null ? 0: this.slingServletSelectors.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletMetadataGetServletProperties {\n");
    
    sb.append("  slingServletResourceTypes: ").append(slingServletResourceTypes).append("\n");
    sb.append("  slingServletMethods: ").append(slingServletMethods).append("\n");
    sb.append("  slingServletExtensions: ").append(slingServletExtensions).append("\n");
    sb.append("  slingServletSelectors: ").append(slingServletSelectors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}