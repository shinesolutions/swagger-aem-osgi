package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties   {

    private ConfigNodePropertyString homePath;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties.
     *
     * @param homePath homePath
     */
    public OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties(
        ConfigNodePropertyString homePath
    ) {
        this.homePath = homePath;
    }



    /**
     * Get homePath
     * @return homePath
     */
    public ConfigNodePropertyString getHomePath() {
        return homePath;
    }

    public void setHomePath(ConfigNodePropertyString homePath) {
        this.homePath = homePath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties {\n");
        
        sb.append("    homePath: ").append(toIndentedString(homePath)).append("\n");
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

