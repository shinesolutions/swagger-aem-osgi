package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties   {

    private ConfigNodePropertyBoolean protectExternalId;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties.
     *
     * @param protectExternalId protectExternalId
     */
    public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties(
        ConfigNodePropertyBoolean protectExternalId
    ) {
        this.protectExternalId = protectExternalId;
    }



    /**
     * Get protectExternalId
     * @return protectExternalId
     */
    public ConfigNodePropertyBoolean getProtectExternalId() {
        return protectExternalId;
    }

    public void setProtectExternalId(ConfigNodePropertyBoolean protectExternalId) {
        this.protectExternalId = protectExternalId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties {\n");
        
        sb.append("    protectExternalId: ").append(toIndentedString(protectExternalId)).append("\n");
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

