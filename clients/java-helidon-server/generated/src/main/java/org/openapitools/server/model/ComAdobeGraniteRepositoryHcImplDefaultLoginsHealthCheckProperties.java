package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties   {

    private ConfigNodePropertyArray hcTags;
    private ConfigNodePropertyArray accountLogins;
    private ConfigNodePropertyArray consoleLogins;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.
     *
     * @param hcTags hcTags
     * @param accountLogins accountLogins
     * @param consoleLogins consoleLogins
     */
    public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(
        ConfigNodePropertyArray hcTags, 
        ConfigNodePropertyArray accountLogins, 
        ConfigNodePropertyArray consoleLogins
    ) {
        this.hcTags = hcTags;
        this.accountLogins = accountLogins;
        this.consoleLogins = consoleLogins;
    }



    /**
     * Get hcTags
     * @return hcTags
     */
    public ConfigNodePropertyArray getHcTags() {
        return hcTags;
    }

    public void setHcTags(ConfigNodePropertyArray hcTags) {
        this.hcTags = hcTags;
    }

    /**
     * Get accountLogins
     * @return accountLogins
     */
    public ConfigNodePropertyArray getAccountLogins() {
        return accountLogins;
    }

    public void setAccountLogins(ConfigNodePropertyArray accountLogins) {
        this.accountLogins = accountLogins;
    }

    /**
     * Get consoleLogins
     * @return consoleLogins
     */
    public ConfigNodePropertyArray getConsoleLogins() {
        return consoleLogins;
    }

    public void setConsoleLogins(ConfigNodePropertyArray consoleLogins) {
        this.consoleLogins = consoleLogins;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties {\n");
        
        sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
        sb.append("    accountLogins: ").append(toIndentedString(accountLogins)).append("\n");
        sb.append("    consoleLogins: ").append(toIndentedString(consoleLogins)).append("\n");
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

