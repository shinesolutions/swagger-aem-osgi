package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enable;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray agentConfiguration;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString contextPath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray disabledCipherSuites;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray enabledCipherSuites;
 /**
  * Get enable
  * @return enable
  */
  @JsonProperty("enable")
  public ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  /**
   * Sets the <code>enable</code> property.
   */
 public void setEnable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  /**
   * Sets the <code>enable</code> property.
   */
  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties enable(ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

 /**
  * Get agentConfiguration
  * @return agentConfiguration
  */
  @JsonProperty("agent.configuration")
  public ConfigNodePropertyArray getAgentConfiguration() {
    return agentConfiguration;
  }

  /**
   * Sets the <code>agentConfiguration</code> property.
   */
 public void setAgentConfiguration(ConfigNodePropertyArray agentConfiguration) {
    this.agentConfiguration = agentConfiguration;
  }

  /**
   * Sets the <code>agentConfiguration</code> property.
   */
  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties agentConfiguration(ConfigNodePropertyArray agentConfiguration) {
    this.agentConfiguration = agentConfiguration;
    return this;
  }

 /**
  * Get contextPath
  * @return contextPath
  */
  @JsonProperty("context.path")
  public ConfigNodePropertyString getContextPath() {
    return contextPath;
  }

  /**
   * Sets the <code>contextPath</code> property.
   */
 public void setContextPath(ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
  }

  /**
   * Sets the <code>contextPath</code> property.
   */
  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties contextPath(ConfigNodePropertyString contextPath) {
    this.contextPath = contextPath;
    return this;
  }

 /**
  * Get disabledCipherSuites
  * @return disabledCipherSuites
  */
  @JsonProperty("disabled.cipher.suites")
  public ConfigNodePropertyArray getDisabledCipherSuites() {
    return disabledCipherSuites;
  }

  /**
   * Sets the <code>disabledCipherSuites</code> property.
   */
 public void setDisabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
  }

  /**
   * Sets the <code>disabledCipherSuites</code> property.
   */
  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties disabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
    this.disabledCipherSuites = disabledCipherSuites;
    return this;
  }

 /**
  * Get enabledCipherSuites
  * @return enabledCipherSuites
  */
  @JsonProperty("enabled.cipher.suites")
  public ConfigNodePropertyArray getEnabledCipherSuites() {
    return enabledCipherSuites;
  }

  /**
   * Sets the <code>enabledCipherSuites</code> property.
   */
 public void setEnabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
  }

  /**
   * Sets the <code>enabledCipherSuites</code> property.
   */
  public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties enabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
    this.enabledCipherSuites = enabledCipherSuites;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

