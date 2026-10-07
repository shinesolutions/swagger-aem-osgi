package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties   {

    private ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize;
    private ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions;

    /**
     * Default constructor.
     */
    public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingScriptingCoreImplScriptCacheImplProperties.
     *
     * @param orgApacheSlingScriptingCacheSize orgApacheSlingScriptingCacheSize
     * @param orgApacheSlingScriptingCacheAdditionalExtensions orgApacheSlingScriptingCacheAdditionalExtensions
     */
    public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(
        ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize, 
        ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions
    ) {
        this.orgApacheSlingScriptingCacheSize = orgApacheSlingScriptingCacheSize;
        this.orgApacheSlingScriptingCacheAdditionalExtensions = orgApacheSlingScriptingCacheAdditionalExtensions;
    }



    /**
     * Get orgApacheSlingScriptingCacheSize
     * @return orgApacheSlingScriptingCacheSize
     */
    public ConfigNodePropertyInteger getOrgApacheSlingScriptingCacheSize() {
        return orgApacheSlingScriptingCacheSize;
    }

    public void setOrgApacheSlingScriptingCacheSize(ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize) {
        this.orgApacheSlingScriptingCacheSize = orgApacheSlingScriptingCacheSize;
    }

    /**
     * Get orgApacheSlingScriptingCacheAdditionalExtensions
     * @return orgApacheSlingScriptingCacheAdditionalExtensions
     */
    public ConfigNodePropertyArray getOrgApacheSlingScriptingCacheAdditionalExtensions() {
        return orgApacheSlingScriptingCacheAdditionalExtensions;
    }

    public void setOrgApacheSlingScriptingCacheAdditionalExtensions(ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions) {
        this.orgApacheSlingScriptingCacheAdditionalExtensions = orgApacheSlingScriptingCacheAdditionalExtensions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {\n");
        
        sb.append("    orgApacheSlingScriptingCacheSize: ").append(toIndentedString(orgApacheSlingScriptingCacheSize)).append("\n");
        sb.append("    orgApacheSlingScriptingCacheAdditionalExtensions: ").append(toIndentedString(orgApacheSlingScriptingCacheAdditionalExtensions)).append("\n");
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

