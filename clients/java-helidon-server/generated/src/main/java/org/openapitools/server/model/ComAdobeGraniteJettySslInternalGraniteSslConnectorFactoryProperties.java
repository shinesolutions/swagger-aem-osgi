package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties   {

    private ConfigNodePropertyInteger comAdobeGraniteJettySslPort;
    private ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser;
    private ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword;
    private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded;
    private ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded;
    private ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
     *
     * @param comAdobeGraniteJettySslPort comAdobeGraniteJettySslPort
     * @param comAdobeGraniteJettySslKeystoreUser comAdobeGraniteJettySslKeystoreUser
     * @param comAdobeGraniteJettySslKeystorePassword comAdobeGraniteJettySslKeystorePassword
     * @param comAdobeGraniteJettySslCiphersuitesExcluded comAdobeGraniteJettySslCiphersuitesExcluded
     * @param comAdobeGraniteJettySslCiphersuitesIncluded comAdobeGraniteJettySslCiphersuitesIncluded
     * @param comAdobeGraniteJettySslClientCertificate comAdobeGraniteJettySslClientCertificate
     */
    public ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(
        ConfigNodePropertyInteger comAdobeGraniteJettySslPort, 
        ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser, 
        ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword, 
        ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded, 
        ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded, 
        ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate
    ) {
        this.comAdobeGraniteJettySslPort = comAdobeGraniteJettySslPort;
        this.comAdobeGraniteJettySslKeystoreUser = comAdobeGraniteJettySslKeystoreUser;
        this.comAdobeGraniteJettySslKeystorePassword = comAdobeGraniteJettySslKeystorePassword;
        this.comAdobeGraniteJettySslCiphersuitesExcluded = comAdobeGraniteJettySslCiphersuitesExcluded;
        this.comAdobeGraniteJettySslCiphersuitesIncluded = comAdobeGraniteJettySslCiphersuitesIncluded;
        this.comAdobeGraniteJettySslClientCertificate = comAdobeGraniteJettySslClientCertificate;
    }



    /**
     * Get comAdobeGraniteJettySslPort
     * @return comAdobeGraniteJettySslPort
     */
    public ConfigNodePropertyInteger getComAdobeGraniteJettySslPort() {
        return comAdobeGraniteJettySslPort;
    }

    public void setComAdobeGraniteJettySslPort(ConfigNodePropertyInteger comAdobeGraniteJettySslPort) {
        this.comAdobeGraniteJettySslPort = comAdobeGraniteJettySslPort;
    }

    /**
     * Get comAdobeGraniteJettySslKeystoreUser
     * @return comAdobeGraniteJettySslKeystoreUser
     */
    public ConfigNodePropertyString getComAdobeGraniteJettySslKeystoreUser() {
        return comAdobeGraniteJettySslKeystoreUser;
    }

    public void setComAdobeGraniteJettySslKeystoreUser(ConfigNodePropertyString comAdobeGraniteJettySslKeystoreUser) {
        this.comAdobeGraniteJettySslKeystoreUser = comAdobeGraniteJettySslKeystoreUser;
    }

    /**
     * Get comAdobeGraniteJettySslKeystorePassword
     * @return comAdobeGraniteJettySslKeystorePassword
     */
    public ConfigNodePropertyString getComAdobeGraniteJettySslKeystorePassword() {
        return comAdobeGraniteJettySslKeystorePassword;
    }

    public void setComAdobeGraniteJettySslKeystorePassword(ConfigNodePropertyString comAdobeGraniteJettySslKeystorePassword) {
        this.comAdobeGraniteJettySslKeystorePassword = comAdobeGraniteJettySslKeystorePassword;
    }

    /**
     * Get comAdobeGraniteJettySslCiphersuitesExcluded
     * @return comAdobeGraniteJettySslCiphersuitesExcluded
     */
    public ConfigNodePropertyArray getComAdobeGraniteJettySslCiphersuitesExcluded() {
        return comAdobeGraniteJettySslCiphersuitesExcluded;
    }

    public void setComAdobeGraniteJettySslCiphersuitesExcluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesExcluded) {
        this.comAdobeGraniteJettySslCiphersuitesExcluded = comAdobeGraniteJettySslCiphersuitesExcluded;
    }

    /**
     * Get comAdobeGraniteJettySslCiphersuitesIncluded
     * @return comAdobeGraniteJettySslCiphersuitesIncluded
     */
    public ConfigNodePropertyArray getComAdobeGraniteJettySslCiphersuitesIncluded() {
        return comAdobeGraniteJettySslCiphersuitesIncluded;
    }

    public void setComAdobeGraniteJettySslCiphersuitesIncluded(ConfigNodePropertyArray comAdobeGraniteJettySslCiphersuitesIncluded) {
        this.comAdobeGraniteJettySslCiphersuitesIncluded = comAdobeGraniteJettySslCiphersuitesIncluded;
    }

    /**
     * Get comAdobeGraniteJettySslClientCertificate
     * @return comAdobeGraniteJettySslClientCertificate
     */
    public ConfigNodePropertyDropDown getComAdobeGraniteJettySslClientCertificate() {
        return comAdobeGraniteJettySslClientCertificate;
    }

    public void setComAdobeGraniteJettySslClientCertificate(ConfigNodePropertyDropDown comAdobeGraniteJettySslClientCertificate) {
        this.comAdobeGraniteJettySslClientCertificate = comAdobeGraniteJettySslClientCertificate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties {\n");
        
        sb.append("    comAdobeGraniteJettySslPort: ").append(toIndentedString(comAdobeGraniteJettySslPort)).append("\n");
        sb.append("    comAdobeGraniteJettySslKeystoreUser: ").append(toIndentedString(comAdobeGraniteJettySslKeystoreUser)).append("\n");
        sb.append("    comAdobeGraniteJettySslKeystorePassword: ").append(toIndentedString(comAdobeGraniteJettySslKeystorePassword)).append("\n");
        sb.append("    comAdobeGraniteJettySslCiphersuitesExcluded: ").append(toIndentedString(comAdobeGraniteJettySslCiphersuitesExcluded)).append("\n");
        sb.append("    comAdobeGraniteJettySslCiphersuitesIncluded: ").append(toIndentedString(comAdobeGraniteJettySslCiphersuitesIncluded)).append("\n");
        sb.append("    comAdobeGraniteJettySslClientCertificate: ").append(toIndentedString(comAdobeGraniteJettySslClientCertificate)).append("\n");
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

