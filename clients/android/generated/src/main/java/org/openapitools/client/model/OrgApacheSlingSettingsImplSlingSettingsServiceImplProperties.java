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
public class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {
  
  @SerializedName("sling.name")
  private ConfigNodePropertyString slingName = null;
  @SerializedName("sling.description")
  private ConfigNodePropertyString slingDescription = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingName() {
    return slingName;
  }
  public void setSlingName(ConfigNodePropertyString slingName) {
    this.slingName = slingName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingDescription() {
    return slingDescription;
  }
  public void setSlingDescription(ConfigNodePropertyString slingDescription) {
    this.slingDescription = slingDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties orgApacheSlingSettingsImplSlingSettingsServiceImplProperties = (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties) o;
    return (this.slingName == null ? orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingName == null : this.slingName.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingName)) &&
        (this.slingDescription == null ? orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingDescription == null : this.slingDescription.equals(orgApacheSlingSettingsImplSlingSettingsServiceImplProperties.slingDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.slingName == null ? 0: this.slingName.hashCode());
    result = 31 * result + (this.slingDescription == null ? 0: this.slingDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {\n");
    
    sb.append("  slingName: ").append(slingName).append("\n");
    sb.append("  slingDescription: ").append(slingDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}