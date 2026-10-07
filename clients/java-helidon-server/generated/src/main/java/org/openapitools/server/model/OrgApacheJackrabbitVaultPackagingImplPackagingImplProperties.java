package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties   {

    private ConfigNodePropertyArray packageRoots;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.
     *
     * @param packageRoots packageRoots
     */
    public OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties(
        ConfigNodePropertyArray packageRoots
    ) {
        this.packageRoots = packageRoots;
    }



    /**
     * Get packageRoots
     * @return packageRoots
     */
    public ConfigNodePropertyArray getPackageRoots() {
        return packageRoots;
    }

    public void setPackageRoots(ConfigNodePropertyArray packageRoots) {
        this.packageRoots = packageRoots;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties {\n");
        
        sb.append("    packageRoots: ").append(toIndentedString(packageRoots)).append("\n");
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

