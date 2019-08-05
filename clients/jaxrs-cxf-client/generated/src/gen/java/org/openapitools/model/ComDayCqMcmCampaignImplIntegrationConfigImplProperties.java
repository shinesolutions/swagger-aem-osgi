package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComDayCqMcmCampaignImplIntegrationConfigImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray aemMcmCampaignFormConstraints = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString aemMcmCampaignPublicUrl = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL = null;
 /**
   * Get aemMcmCampaignFormConstraints
   * @return aemMcmCampaignFormConstraints
  **/
  @JsonProperty("aem.mcm.campaign.formConstraints")
  public ConfigNodePropertyArray getAemMcmCampaignFormConstraints() {
    return aemMcmCampaignFormConstraints;
  }

  public void setAemMcmCampaignFormConstraints(ConfigNodePropertyArray aemMcmCampaignFormConstraints) {
    this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
  }

  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties aemMcmCampaignFormConstraints(ConfigNodePropertyArray aemMcmCampaignFormConstraints) {
    this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
    return this;
  }

 /**
   * Get aemMcmCampaignPublicUrl
   * @return aemMcmCampaignPublicUrl
  **/
  @JsonProperty("aem.mcm.campaign.publicUrl")
  public ConfigNodePropertyString getAemMcmCampaignPublicUrl() {
    return aemMcmCampaignPublicUrl;
  }

  public void setAemMcmCampaignPublicUrl(ConfigNodePropertyString aemMcmCampaignPublicUrl) {
    this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
  }

  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties aemMcmCampaignPublicUrl(ConfigNodePropertyString aemMcmCampaignPublicUrl) {
    this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
    return this;
  }

 /**
   * Get aemMcmCampaignRelaxedSSL
   * @return aemMcmCampaignRelaxedSSL
  **/
  @JsonProperty("aem.mcm.campaign.relaxedSSL")
  public ConfigNodePropertyBoolean getAemMcmCampaignRelaxedSSL() {
    return aemMcmCampaignRelaxedSSL;
  }

  public void setAemMcmCampaignRelaxedSSL(ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL) {
    this.aemMcmCampaignRelaxedSSL = aemMcmCampaignRelaxedSSL;
  }

  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties aemMcmCampaignRelaxedSSL(ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL) {
    this.aemMcmCampaignRelaxedSSL = aemMcmCampaignRelaxedSSL;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmCampaignImplIntegrationConfigImplProperties {\n");
    
    sb.append("    aemMcmCampaignFormConstraints: ").append(toIndentedString(aemMcmCampaignFormConstraints)).append("\n");
    sb.append("    aemMcmCampaignPublicUrl: ").append(toIndentedString(aemMcmCampaignPublicUrl)).append("\n");
    sb.append("    aemMcmCampaignRelaxedSSL: ").append(toIndentedString(aemMcmCampaignRelaxedSSL)).append("\n");
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

