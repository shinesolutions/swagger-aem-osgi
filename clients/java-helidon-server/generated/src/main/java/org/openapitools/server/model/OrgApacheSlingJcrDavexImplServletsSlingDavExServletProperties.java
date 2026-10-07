package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties   {

    private ConfigNodePropertyString alias;
    private ConfigNodePropertyBoolean davCreateAbsoluteUri;
    private ConfigNodePropertyString davProtectedhandlers;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.
     *
     * @param alias alias
     * @param davCreateAbsoluteUri davCreateAbsoluteUri
     * @param davProtectedhandlers davProtectedhandlers
     */
    public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties(
        ConfigNodePropertyString alias, 
        ConfigNodePropertyBoolean davCreateAbsoluteUri, 
        ConfigNodePropertyString davProtectedhandlers
    ) {
        this.alias = alias;
        this.davCreateAbsoluteUri = davCreateAbsoluteUri;
        this.davProtectedhandlers = davProtectedhandlers;
    }



    /**
     * Get alias
     * @return alias
     */
    public ConfigNodePropertyString getAlias() {
        return alias;
    }

    public void setAlias(ConfigNodePropertyString alias) {
        this.alias = alias;
    }

    /**
     * Get davCreateAbsoluteUri
     * @return davCreateAbsoluteUri
     */
    public ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
        return davCreateAbsoluteUri;
    }

    public void setDavCreateAbsoluteUri(ConfigNodePropertyBoolean davCreateAbsoluteUri) {
        this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    }

    /**
     * Get davProtectedhandlers
     * @return davProtectedhandlers
     */
    public ConfigNodePropertyString getDavProtectedhandlers() {
        return davProtectedhandlers;
    }

    public void setDavProtectedhandlers(ConfigNodePropertyString davProtectedhandlers) {
        this.davProtectedhandlers = davProtectedhandlers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {\n");
        
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    davCreateAbsoluteUri: ").append(toIndentedString(davCreateAbsoluteUri)).append("\n");
        sb.append("    davProtectedhandlers: ").append(toIndentedString(davProtectedhandlers)).append("\n");
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

