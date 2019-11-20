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
public class ComDayCqMcmCampaignImplIntegrationConfigImplProperties {
  
  @SerializedName("aem.mcm.campaign.formConstraints")
  private ConfigNodePropertyArray aemMcmCampaignFormConstraints = null;
  @SerializedName("aem.mcm.campaign.publicUrl")
  private ConfigNodePropertyString aemMcmCampaignPublicUrl = null;
  @SerializedName("aem.mcm.campaign.relaxedSSL")
  private ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAemMcmCampaignFormConstraints() {
    return aemMcmCampaignFormConstraints;
  }
  public void setAemMcmCampaignFormConstraints(ConfigNodePropertyArray aemMcmCampaignFormConstraints) {
    this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAemMcmCampaignPublicUrl() {
    return aemMcmCampaignPublicUrl;
  }
  public void setAemMcmCampaignPublicUrl(ConfigNodePropertyString aemMcmCampaignPublicUrl) {
    this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getAemMcmCampaignRelaxedSSL() {
    return aemMcmCampaignRelaxedSSL;
  }
  public void setAemMcmCampaignRelaxedSSL(ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL) {
    this.aemMcmCampaignRelaxedSSL = aemMcmCampaignRelaxedSSL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmCampaignImplIntegrationConfigImplProperties comDayCqMcmCampaignImplIntegrationConfigImplProperties = (ComDayCqMcmCampaignImplIntegrationConfigImplProperties) o;
    return (this.aemMcmCampaignFormConstraints == null ? comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignFormConstraints == null : this.aemMcmCampaignFormConstraints.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignFormConstraints)) &&
        (this.aemMcmCampaignPublicUrl == null ? comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignPublicUrl == null : this.aemMcmCampaignPublicUrl.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignPublicUrl)) &&
        (this.aemMcmCampaignRelaxedSSL == null ? comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignRelaxedSSL == null : this.aemMcmCampaignRelaxedSSL.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignRelaxedSSL));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aemMcmCampaignFormConstraints == null ? 0: this.aemMcmCampaignFormConstraints.hashCode());
    result = 31 * result + (this.aemMcmCampaignPublicUrl == null ? 0: this.aemMcmCampaignPublicUrl.hashCode());
    result = 31 * result + (this.aemMcmCampaignRelaxedSSL == null ? 0: this.aemMcmCampaignRelaxedSSL.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmCampaignImplIntegrationConfigImplProperties {\n");
    
    sb.append("  aemMcmCampaignFormConstraints: ").append(aemMcmCampaignFormConstraints).append("\n");
    sb.append("  aemMcmCampaignPublicUrl: ").append(aemMcmCampaignPublicUrl).append("\n");
    sb.append("  aemMcmCampaignRelaxedSSL: ").append(aemMcmCampaignRelaxedSSL).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}