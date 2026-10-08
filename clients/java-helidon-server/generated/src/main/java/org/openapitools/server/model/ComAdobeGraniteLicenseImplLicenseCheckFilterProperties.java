package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties   {

    private ConfigNodePropertyInteger checkInternval;
    private ConfigNodePropertyArray excludeIds;
    private ConfigNodePropertyBoolean encryptPing;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.
     *
     * @param checkInternval checkInternval
     * @param excludeIds excludeIds
     * @param encryptPing encryptPing
     */
    public ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(
        ConfigNodePropertyInteger checkInternval, 
        ConfigNodePropertyArray excludeIds, 
        ConfigNodePropertyBoolean encryptPing
    ) {
        this.checkInternval = checkInternval;
        this.excludeIds = excludeIds;
        this.encryptPing = encryptPing;
    }



    /**
     * Get checkInternval
     * @return checkInternval
     */
    public ConfigNodePropertyInteger getCheckInternval() {
        return checkInternval;
    }

    public void setCheckInternval(ConfigNodePropertyInteger checkInternval) {
        this.checkInternval = checkInternval;
    }

    /**
     * Get excludeIds
     * @return excludeIds
     */
    public ConfigNodePropertyArray getExcludeIds() {
        return excludeIds;
    }

    public void setExcludeIds(ConfigNodePropertyArray excludeIds) {
        this.excludeIds = excludeIds;
    }

    /**
     * Get encryptPing
     * @return encryptPing
     */
    public ConfigNodePropertyBoolean getEncryptPing() {
        return encryptPing;
    }

    public void setEncryptPing(ConfigNodePropertyBoolean encryptPing) {
        this.encryptPing = encryptPing;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {\n");
        
        sb.append("    checkInternval: ").append(toIndentedString(checkInternval)).append("\n");
        sb.append("    excludeIds: ").append(toIndentedString(excludeIds)).append("\n");
        sb.append("    encryptPing: ").append(toIndentedString(encryptPing)).append("\n");
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

