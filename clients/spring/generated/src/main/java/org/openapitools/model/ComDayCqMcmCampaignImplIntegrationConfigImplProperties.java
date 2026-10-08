package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqMcmCampaignImplIntegrationConfigImplProperties
 */

@JsonTypeName("comDayCqMcmCampaignImplIntegrationConfigImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMcmCampaignImplIntegrationConfigImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray aemMcmCampaignFormConstraints;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString aemMcmCampaignPublicUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL;

  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties aemMcmCampaignFormConstraints(@Nullable ConfigNodePropertyArray aemMcmCampaignFormConstraints) {
    this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
    return this;
  }

  /**
   * Get aemMcmCampaignFormConstraints
   * @return aemMcmCampaignFormConstraints
   */
  @Valid 
  @Schema(name = "aem.mcm.campaign.formConstraints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem.mcm.campaign.formConstraints")
  public @Nullable ConfigNodePropertyArray getAemMcmCampaignFormConstraints() {
    return aemMcmCampaignFormConstraints;
  }

  @JsonProperty("aem.mcm.campaign.formConstraints")
  public void setAemMcmCampaignFormConstraints(@Nullable ConfigNodePropertyArray aemMcmCampaignFormConstraints) {
    this.aemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
  }

  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties aemMcmCampaignPublicUrl(@Nullable ConfigNodePropertyString aemMcmCampaignPublicUrl) {
    this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
    return this;
  }

  /**
   * Get aemMcmCampaignPublicUrl
   * @return aemMcmCampaignPublicUrl
   */
  @Valid 
  @Schema(name = "aem.mcm.campaign.publicUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem.mcm.campaign.publicUrl")
  public @Nullable ConfigNodePropertyString getAemMcmCampaignPublicUrl() {
    return aemMcmCampaignPublicUrl;
  }

  @JsonProperty("aem.mcm.campaign.publicUrl")
  public void setAemMcmCampaignPublicUrl(@Nullable ConfigNodePropertyString aemMcmCampaignPublicUrl) {
    this.aemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
  }

  public ComDayCqMcmCampaignImplIntegrationConfigImplProperties aemMcmCampaignRelaxedSSL(@Nullable ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL) {
    this.aemMcmCampaignRelaxedSSL = aemMcmCampaignRelaxedSSL;
    return this;
  }

  /**
   * Get aemMcmCampaignRelaxedSSL
   * @return aemMcmCampaignRelaxedSSL
   */
  @Valid 
  @Schema(name = "aem.mcm.campaign.relaxedSSL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aem.mcm.campaign.relaxedSSL")
  public @Nullable ConfigNodePropertyBoolean getAemMcmCampaignRelaxedSSL() {
    return aemMcmCampaignRelaxedSSL;
  }

  @JsonProperty("aem.mcm.campaign.relaxedSSL")
  public void setAemMcmCampaignRelaxedSSL(@Nullable ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL) {
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
    return Objects.equals(this.aemMcmCampaignFormConstraints, comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignFormConstraints) &&
        Objects.equals(this.aemMcmCampaignPublicUrl, comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignPublicUrl) &&
        Objects.equals(this.aemMcmCampaignRelaxedSSL, comDayCqMcmCampaignImplIntegrationConfigImplProperties.aemMcmCampaignRelaxedSSL);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

