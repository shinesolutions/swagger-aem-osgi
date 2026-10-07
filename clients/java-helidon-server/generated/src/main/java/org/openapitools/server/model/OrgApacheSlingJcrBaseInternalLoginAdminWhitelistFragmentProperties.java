package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties   {

    private ConfigNodePropertyString whitelistName;
    private ConfigNodePropertyArray whitelistBundles;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.
     *
     * @param whitelistName whitelistName
     * @param whitelistBundles whitelistBundles
     */
    public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(
        ConfigNodePropertyString whitelistName, 
        ConfigNodePropertyArray whitelistBundles
    ) {
        this.whitelistName = whitelistName;
        this.whitelistBundles = whitelistBundles;
    }



    /**
     * Get whitelistName
     * @return whitelistName
     */
    public ConfigNodePropertyString getWhitelistName() {
        return whitelistName;
    }

    public void setWhitelistName(ConfigNodePropertyString whitelistName) {
        this.whitelistName = whitelistName;
    }

    /**
     * Get whitelistBundles
     * @return whitelistBundles
     */
    public ConfigNodePropertyArray getWhitelistBundles() {
        return whitelistBundles;
    }

    public void setWhitelistBundles(ConfigNodePropertyArray whitelistBundles) {
        this.whitelistBundles = whitelistBundles;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties {\n");
        
        sb.append("    whitelistName: ").append(toIndentedString(whitelistName)).append("\n");
        sb.append("    whitelistBundles: ").append(toIndentedString(whitelistBundles)).append("\n");
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

