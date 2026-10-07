package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties   {

    private ConfigNodePropertyBoolean enable;
    private ConfigNodePropertyArray agentConfiguration;
    private ConfigNodePropertyString contextPath;
    private ConfigNodePropertyArray disabledCipherSuites;
    private ConfigNodePropertyArray enabledCipherSuites;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.
     *
     * @param enable enable
     * @param agentConfiguration agentConfiguration
     * @param contextPath contextPath
     * @param disabledCipherSuites disabledCipherSuites
     * @param enabledCipherSuites enabledCipherSuites
     */
    public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(
        ConfigNodePropertyBoolean enable, 
        ConfigNodePropertyArray agentConfiguration, 
        ConfigNodePropertyString contextPath, 
        ConfigNodePropertyArray disabledCipherSuites, 
        ConfigNodePropertyArray enabledCipherSuites
    ) {
        this.enable = enable;
        this.agentConfiguration = agentConfiguration;
        this.contextPath = contextPath;
        this.disabledCipherSuites = disabledCipherSuites;
        this.enabledCipherSuites = enabledCipherSuites;
    }



    /**
     * Get enable
     * @return enable
     */
    public ConfigNodePropertyBoolean getEnable() {
        return enable;
    }

    public void setEnable(ConfigNodePropertyBoolean enable) {
        this.enable = enable;
    }

    /**
     * Get agentConfiguration
     * @return agentConfiguration
     */
    public ConfigNodePropertyArray getAgentConfiguration() {
        return agentConfiguration;
    }

    public void setAgentConfiguration(ConfigNodePropertyArray agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
    }

    /**
     * Get contextPath
     * @return contextPath
     */
    public ConfigNodePropertyString getContextPath() {
        return contextPath;
    }

    public void setContextPath(ConfigNodePropertyString contextPath) {
        this.contextPath = contextPath;
    }

    /**
     * Get disabledCipherSuites
     * @return disabledCipherSuites
     */
    public ConfigNodePropertyArray getDisabledCipherSuites() {
        return disabledCipherSuites;
    }

    public void setDisabledCipherSuites(ConfigNodePropertyArray disabledCipherSuites) {
        this.disabledCipherSuites = disabledCipherSuites;
    }

    /**
     * Get enabledCipherSuites
     * @return enabledCipherSuites
     */
    public ConfigNodePropertyArray getEnabledCipherSuites() {
        return enabledCipherSuites;
    }

    public void setEnabledCipherSuites(ConfigNodePropertyArray enabledCipherSuites) {
        this.enabledCipherSuites = enabledCipherSuites;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

