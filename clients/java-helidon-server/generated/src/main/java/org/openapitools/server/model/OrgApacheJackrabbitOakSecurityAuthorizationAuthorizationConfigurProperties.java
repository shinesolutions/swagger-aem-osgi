package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties   {

    private ConfigNodePropertyDropDown permissionsJr2;
    private ConfigNodePropertyDropDown importBehavior;
    private ConfigNodePropertyArray readPaths;
    private ConfigNodePropertyArray administrativePrincipals;
    private ConfigNodePropertyInteger configurationRanking;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.
     *
     * @param permissionsJr2 permissionsJr2
     * @param importBehavior importBehavior
     * @param readPaths readPaths
     * @param administrativePrincipals administrativePrincipals
     * @param configurationRanking configurationRanking
     */
    public OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(
        ConfigNodePropertyDropDown permissionsJr2, 
        ConfigNodePropertyDropDown importBehavior, 
        ConfigNodePropertyArray readPaths, 
        ConfigNodePropertyArray administrativePrincipals, 
        ConfigNodePropertyInteger configurationRanking
    ) {
        this.permissionsJr2 = permissionsJr2;
        this.importBehavior = importBehavior;
        this.readPaths = readPaths;
        this.administrativePrincipals = administrativePrincipals;
        this.configurationRanking = configurationRanking;
    }



    /**
     * Get permissionsJr2
     * @return permissionsJr2
     */
    public ConfigNodePropertyDropDown getPermissionsJr2() {
        return permissionsJr2;
    }

    public void setPermissionsJr2(ConfigNodePropertyDropDown permissionsJr2) {
        this.permissionsJr2 = permissionsJr2;
    }

    /**
     * Get importBehavior
     * @return importBehavior
     */
    public ConfigNodePropertyDropDown getImportBehavior() {
        return importBehavior;
    }

    public void setImportBehavior(ConfigNodePropertyDropDown importBehavior) {
        this.importBehavior = importBehavior;
    }

    /**
     * Get readPaths
     * @return readPaths
     */
    public ConfigNodePropertyArray getReadPaths() {
        return readPaths;
    }

    public void setReadPaths(ConfigNodePropertyArray readPaths) {
        this.readPaths = readPaths;
    }

    /**
     * Get administrativePrincipals
     * @return administrativePrincipals
     */
    public ConfigNodePropertyArray getAdministrativePrincipals() {
        return administrativePrincipals;
    }

    public void setAdministrativePrincipals(ConfigNodePropertyArray administrativePrincipals) {
        this.administrativePrincipals = administrativePrincipals;
    }

    /**
     * Get configurationRanking
     * @return configurationRanking
     */
    public ConfigNodePropertyInteger getConfigurationRanking() {
        return configurationRanking;
    }

    public void setConfigurationRanking(ConfigNodePropertyInteger configurationRanking) {
        this.configurationRanking = configurationRanking;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {\n");
        
        sb.append("    permissionsJr2: ").append(toIndentedString(permissionsJr2)).append("\n");
        sb.append("    importBehavior: ").append(toIndentedString(importBehavior)).append("\n");
        sb.append("    readPaths: ").append(toIndentedString(readPaths)).append("\n");
        sb.append("    administrativePrincipals: ").append(toIndentedString(administrativePrincipals)).append("\n");
        sb.append("    configurationRanking: ").append(toIndentedString(configurationRanking)).append("\n");
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

