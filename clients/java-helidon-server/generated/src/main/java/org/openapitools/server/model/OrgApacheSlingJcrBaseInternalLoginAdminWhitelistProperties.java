package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties   {

    private ConfigNodePropertyBoolean whitelistBypass;
    private ConfigNodePropertyString whitelistBundlesRegexp;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.
     *
     * @param whitelistBypass whitelistBypass
     * @param whitelistBundlesRegexp whitelistBundlesRegexp
     */
    public OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties(
        ConfigNodePropertyBoolean whitelistBypass, 
        ConfigNodePropertyString whitelistBundlesRegexp
    ) {
        this.whitelistBypass = whitelistBypass;
        this.whitelistBundlesRegexp = whitelistBundlesRegexp;
    }



    /**
     * Get whitelistBypass
     * @return whitelistBypass
     */
    public ConfigNodePropertyBoolean getWhitelistBypass() {
        return whitelistBypass;
    }

    public void setWhitelistBypass(ConfigNodePropertyBoolean whitelistBypass) {
        this.whitelistBypass = whitelistBypass;
    }

    /**
     * Get whitelistBundlesRegexp
     * @return whitelistBundlesRegexp
     */
    public ConfigNodePropertyString getWhitelistBundlesRegexp() {
        return whitelistBundlesRegexp;
    }

    public void setWhitelistBundlesRegexp(ConfigNodePropertyString whitelistBundlesRegexp) {
        this.whitelistBundlesRegexp = whitelistBundlesRegexp;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties {\n");
        
        sb.append("    whitelistBypass: ").append(toIndentedString(whitelistBypass)).append("\n");
        sb.append("    whitelistBundlesRegexp: ").append(toIndentedString(whitelistBundlesRegexp)).append("\n");
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

