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
 * ComAdobeCqSocialUserImplTransportHttpToPublisherProperties
 */

@JsonTypeName("comAdobeCqSocialUserImplTransportHttpToPublisherProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray agentConfiguration;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString contextPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray disabledCipherSuites;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray enabledCipherSuites;

  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties enable(@Nullable ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Get enable
   * @return enable
   */
  @Valid 
  @Schema(name = "enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enable")
  public @Nullable ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  @JsonProperty("enable")
  public void setEnable(@Nullable ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties agentConfiguration(@Nullable ConfigNodePropertyArray agentConfiguration) {
    this.agentConfiguration = agentConfiguration;
    return this;
  }

  /**
   * Get agentConfiguration
   * @return agentConfiguration
   */
  @Valid 
  @Schema(name = "agent.configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agent.configuration")
  public @Nullable ConfigNodePropertyArray getAgentConfiguration() {
    return agentConfiguration;
  }

  @JsonProperty("agent.configuration")
  public void setAgentConfiguration(@Nullable ConfigNodePropertyArray agentConfiguration) {
    this.agentConfiguration = agentConfiguration;
  }

  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties contextPath(@Nullable ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
    return this;
  }

  /**
   * Get contextPath
   * @return contextPath
   */
  @Valid 
  @Schema(name = "context.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context.path")
  public @Nullable ConfigNodePropertyString getContextPath() {
    return contextPath;
  }

  @JsonProperty("context.path")
  public void setContextPath(@Nullable ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
  }

  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties disabledCipherSuites(@Nullable ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
    return this;
  }

  /**
   * Get disabledCipherSuites
   * @return disabledCipherSuites
   */
  @Valid 
  @Schema(name = "disabled.cipher.suites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabled.cipher.suites")
  public @Nullable ConfigNodePropertyArray getDisabledCipherSuites() {
    return disabledCipherSuites;
  }

  @JsonProperty("disabled.cipher.suites")
  public void setDisabledCipherSuites(@Nullable ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
  }

  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties enabledCipherSuites(@Nullable ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
    return this;
  }

  /**
   * Get enabledCipherSuites
   * @return enabledCipherSuites
   */
  @Valid 
  @Schema(name = "enabled.cipher.suites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled.cipher.suites")
  public @Nullable ConfigNodePropertyArray getEnabledCipherSuites() {
    return enabledCipherSuites;
  }

  @JsonProperty("enabled.cipher.suites")
  public void setEnabledCipherSuites(@Nullable ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUserImplTransportHttpToPublisherProperties comAdobeCqSocialUserImplTransportHttpToPublisherProperties = (ComAdobeCqSocialUserImplTransportHttpToPublisherProperties) o;
    return Objects.equals(this.enable, comAdobeCqSocialUserImplTransportHttpToPublisherProperties.enable) &&
        Objects.equals(this.agentConfiguration, comAdobeCqSocialUserImplTransportHttpToPublisherProperties.agentConfiguration) &&
        Objects.equals(this.contextPath, comAdobeCqSocialUserImplTransportHttpToPublisherProperties.contextPath) &&
        Objects.equals(this.disabledCipherSuites, comAdobeCqSocialUserImplTransportHttpToPublisherProperties.disabledCipherSuites) &&
        Objects.equals(this.enabledCipherSuites, comAdobeCqSocialUserImplTransportHttpToPublisherProperties.enabledCipherSuites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, agentConfiguration, contextPath, disabledCipherSuites, enabledCipherSuites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    agentConfiguration: ").append(toIndentedString(agentConfiguration)).append("\n");
    sb.append("    contextPath: ").append(toIndentedString(contextPath)).append("\n");
    sb.append("    disabledCipherSuites: ").append(toIndentedString(disabledCipherSuites)).append("\n");
    sb.append("    enabledCipherSuites: ").append(toIndentedString(enabledCipherSuites)).append("\n");
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

