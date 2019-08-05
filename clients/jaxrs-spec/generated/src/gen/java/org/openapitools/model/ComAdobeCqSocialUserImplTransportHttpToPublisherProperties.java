package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties   {
  
  private @Valid ConfigNodePropertyBoolean enable = null;
  private @Valid ConfigNodePropertyArray agentConfiguration = null;
  private @Valid ConfigNodePropertyString contextPath = null;
  private @Valid ConfigNodePropertyArray disabledCipherSuites = null;
  private @Valid ConfigNodePropertyArray enabledCipherSuites = null;

  /**
   **/
  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enable")
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }
  public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  /**
   **/
  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties agentConfiguration(ConfigNodePropertyArray agentConfiguration) {
    this.agentConfiguration = agentConfiguration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("agent.configuration")
  public ConfigNodePropertyArray getAgentConfiguration() {
    return agentConfiguration;
  }
  public void setAgentConfiguration(ConfigNodePropertyArray agentConfiguration) {
    this.agentConfiguration = agentConfiguration;
  }

  /**
   **/
  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties contextPath(ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("context.path")
  public ConfigNodePropertyString getContextPath() {
    return contextPath;
  }
  public void setContextPath(ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
  }

  /**
   **/
  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties disabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("disabled.cipher.suites")
  public ConfigNodePropertyArray getDisabledCipherSuites() {
    return disabledCipherSuites;
  }
  public void setDisabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
  }

  /**
   **/
  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties enabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled.cipher.suites")
  public ConfigNodePropertyArray getEnabledCipherSuites() {
    return enabledCipherSuites;
  }
  public void setEnabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

