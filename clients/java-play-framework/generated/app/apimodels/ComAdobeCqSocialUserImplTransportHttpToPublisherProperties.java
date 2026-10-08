package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialUserImplTransportHttpToPublisherProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties   {
  @JsonProperty("enable")
  @Valid

  private ConfigNodePropertyBoolean enable;

  @JsonProperty("agent.configuration")
  @Valid

  private ConfigNodePropertyArray agentConfiguration;

  @JsonProperty("context.path")
  @Valid

  private ConfigNodePropertyString contextPath;

  @JsonProperty("disabled.cipher.suites")
  @Valid

  private ConfigNodePropertyArray disabledCipherSuites;

  @JsonProperty("enabled.cipher.suites")
  @Valid

  private ConfigNodePropertyArray enabledCipherSuites;

  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties agentConfiguration(ConfigNodePropertyArray agentConfiguration) {
    this.agentConfiguration = agentConfiguration;
    return this;
  }

   /**
   * Get agentConfiguration
   * @return agentConfiguration
  **/
  public ConfigNodePropertyArray getAgentConfiguration() {
    return agentConfiguration;
  }

  public void setAgentConfiguration(ConfigNodePropertyArray agentConfiguration) {
    this.agentConfiguration = agentConfiguration;
  }

  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties contextPath(ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
    return this;
  }

   /**
   * Get contextPath
   * @return contextPath
  **/
  public ConfigNodePropertyString getContextPath() {
    return contextPath;
  }

  public void setContextPath(ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
  }

  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties disabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
    return this;
  }

   /**
   * Get disabledCipherSuites
   * @return disabledCipherSuites
  **/
  public ConfigNodePropertyArray getDisabledCipherSuites() {
    return disabledCipherSuites;
  }

  public void setDisabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
  }

  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties enabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
    return this;
  }

   /**
   * Get enabledCipherSuites
   * @return enabledCipherSuites
  **/
  public ConfigNodePropertyArray getEnabledCipherSuites() {
    return enabledCipherSuites;
  }

  public void setEnabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
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
    return Objects.equals(enable, comAdobeCqSocialUserImplTransportHttpToPublisherProperties.enable) &&
        Objects.equals(agentConfiguration, comAdobeCqSocialUserImplTransportHttpToPublisherProperties.agentConfiguration) &&
        Objects.equals(contextPath, comAdobeCqSocialUserImplTransportHttpToPublisherProperties.contextPath) &&
        Objects.equals(disabledCipherSuites, comAdobeCqSocialUserImplTransportHttpToPublisherProperties.disabledCipherSuites) &&
        Objects.equals(enabledCipherSuites, comAdobeCqSocialUserImplTransportHttpToPublisherProperties.enabledCipherSuites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, agentConfiguration, contextPath, disabledCipherSuites, enabledCipherSuites);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

