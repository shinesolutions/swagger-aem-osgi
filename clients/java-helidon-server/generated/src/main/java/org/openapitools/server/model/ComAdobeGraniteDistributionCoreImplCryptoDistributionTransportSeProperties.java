package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString username;
    private ConfigNodePropertyString encryptedPassword;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.
     *
     * @param name name
     * @param username username
     * @param encryptedPassword encryptedPassword
     */
    public ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString username, 
        ConfigNodePropertyString encryptedPassword
    ) {
        this.name = name;
        this.username = username;
        this.encryptedPassword = encryptedPassword;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get username
     * @return username
     */
    public ConfigNodePropertyString getUsername() {
        return username;
    }

    public void setUsername(ConfigNodePropertyString username) {
        this.username = username;
    }

    /**
     * Get encryptedPassword
     * @return encryptedPassword
     */
    public ConfigNodePropertyString getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(ConfigNodePropertyString encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    encryptedPassword: ").append(toIndentedString(encryptedPassword)).append("\n");
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

