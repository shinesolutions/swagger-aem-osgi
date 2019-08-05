package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqMcmCampaignImplIntegrationConfigImplProperties   {
  
  private ConfigNodePropertyArray aemMcmCampaignFormConstraints = null;
  private ConfigNodePropertyString aemMcmCampaignPublicUrl = null;
  private ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL = null;

  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties () {

  }

  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties (ConfigNodePropertyArray aemMcmCampaignFormConstraints, ConfigNodePropertyString aemMcmCampaignPublicUrl, ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL) {
    this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
    this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
    this.aemMcmCampaignRelaxedSSL = aemMcmCampaignRelaxedSSL;
  }

    
  @JsonProperty("aem.mcm.campaign.formConstraints")
  public ConfigNodePropertyArray getAemMcmCampaignFormConstraints() {
    return aemMcmCampaignFormConstraints;
  }
  public void setAemMcmCampaignFormConstraints(ConfigNodePropertyArray aemMcmCampaignFormConstraints) {
    this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
  }

    
  @JsonProperty("aem.mcm.campaign.publicUrl")
  public ConfigNodePropertyString getAemMcmCampaignPublicUrl() {
    return aemMcmCampaignPublicUrl;
  }
  public void setAemMcmCampaignPublicUrl(ConfigNodePropertyString aemMcmCampaignPublicUrl) {
    this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
  }

    
  @JsonProperty("aem.mcm.campaign.relaxedSSL")
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
    return Objects.equals(aemMcmCampaignFormConstraints, comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignFormConstraints) &&
        Objects.equals(aemMcmCampaignPublicUrl, comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignPublicUrl) &&
        Objects.equals(aemMcmCampaignRelaxedSSL, comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignRelaxedSSL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aemMcmCampaignFormConstraints, aemMcmCampaignPublicUrl, aemMcmCampaignRelaxedSSL);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
