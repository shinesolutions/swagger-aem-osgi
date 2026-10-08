package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMcmCampaignImplIntegrationConfigImplProperties   {
  @JsonProperty("aem.mcm.campaign.formConstraints")
  private ConfigNodePropertyArray aemMcmCampaignFormConstraints;

  @JsonProperty("aem.mcm.campaign.publicUrl")
  private ConfigNodePropertyString aemMcmCampaignPublicUrl;

  @JsonProperty("aem.mcm.campaign.relaxedSSL")
  private ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL;

  /**
   **/
  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties aemMcmCampaignFormConstraints(ConfigNodePropertyArray aemMcmCampaignFormConstraints) {
    this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aem.mcm.campaign.formConstraints")
  public ConfigNodePropertyArray getAemMcmCampaignFormConstraints() {
    return aemMcmCampaignFormConstraints;
  }
  public void setAemMcmCampaignFormConstraints(ConfigNodePropertyArray aemMcmCampaignFormConstraints) {
    this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
  }

  /**
   **/
  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties aemMcmCampaignPublicUrl(ConfigNodePropertyString aemMcmCampaignPublicUrl) {
    this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aem.mcm.campaign.publicUrl")
  public ConfigNodePropertyString getAemMcmCampaignPublicUrl() {
    return aemMcmCampaignPublicUrl;
  }
  public void setAemMcmCampaignPublicUrl(ConfigNodePropertyString aemMcmCampaignPublicUrl) {
    this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
  }

  /**
   **/
  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties aemMcmCampaignRelaxedSSL(ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL) {
    this.aemMcmCampaignRelaxedSSL = aemMcmCampaignRelaxedSSL;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

