package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingHapiImplHApiUtilImplProperties   {

    private ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype;
    private ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype;
    private ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths;
    private ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl;
    private ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled;

    /**
     * Default constructor.
     */
    public OrgApacheSlingHapiImplHApiUtilImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingHapiImplHApiUtilImplProperties.
     *
     * @param orgApacheSlingHapiToolsResourcetype orgApacheSlingHapiToolsResourcetype
     * @param orgApacheSlingHapiToolsCollectionresourcetype orgApacheSlingHapiToolsCollectionresourcetype
     * @param orgApacheSlingHapiToolsSearchpaths orgApacheSlingHapiToolsSearchpaths
     * @param orgApacheSlingHapiToolsExternalurl orgApacheSlingHapiToolsExternalurl
     * @param orgApacheSlingHapiToolsEnabled orgApacheSlingHapiToolsEnabled
     */
    public OrgApacheSlingHapiImplHApiUtilImplProperties(
        ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype, 
        ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype, 
        ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths, 
        ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl, 
        ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled
    ) {
        this.orgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype;
        this.orgApacheSlingHapiToolsCollectionresourcetype = orgApacheSlingHapiToolsCollectionresourcetype;
        this.orgApacheSlingHapiToolsSearchpaths = orgApacheSlingHapiToolsSearchpaths;
        this.orgApacheSlingHapiToolsExternalurl = orgApacheSlingHapiToolsExternalurl;
        this.orgApacheSlingHapiToolsEnabled = orgApacheSlingHapiToolsEnabled;
    }



    /**
     * Get orgApacheSlingHapiToolsResourcetype
     * @return orgApacheSlingHapiToolsResourcetype
     */
    public ConfigNodePropertyString getOrgApacheSlingHapiToolsResourcetype() {
        return orgApacheSlingHapiToolsResourcetype;
    }

    public void setOrgApacheSlingHapiToolsResourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype) {
        this.orgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype;
    }

    /**
     * Get orgApacheSlingHapiToolsCollectionresourcetype
     * @return orgApacheSlingHapiToolsCollectionresourcetype
     */
    public ConfigNodePropertyString getOrgApacheSlingHapiToolsCollectionresourcetype() {
        return orgApacheSlingHapiToolsCollectionresourcetype;
    }

    public void setOrgApacheSlingHapiToolsCollectionresourcetype(ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype) {
        this.orgApacheSlingHapiToolsCollectionresourcetype = orgApacheSlingHapiToolsCollectionresourcetype;
    }

    /**
     * Get orgApacheSlingHapiToolsSearchpaths
     * @return orgApacheSlingHapiToolsSearchpaths
     */
    public ConfigNodePropertyArray getOrgApacheSlingHapiToolsSearchpaths() {
        return orgApacheSlingHapiToolsSearchpaths;
    }

    public void setOrgApacheSlingHapiToolsSearchpaths(ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths) {
        this.orgApacheSlingHapiToolsSearchpaths = orgApacheSlingHapiToolsSearchpaths;
    }

    /**
     * Get orgApacheSlingHapiToolsExternalurl
     * @return orgApacheSlingHapiToolsExternalurl
     */
    public ConfigNodePropertyString getOrgApacheSlingHapiToolsExternalurl() {
        return orgApacheSlingHapiToolsExternalurl;
    }

    public void setOrgApacheSlingHapiToolsExternalurl(ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl) {
        this.orgApacheSlingHapiToolsExternalurl = orgApacheSlingHapiToolsExternalurl;
    }

    /**
     * Get orgApacheSlingHapiToolsEnabled
     * @return orgApacheSlingHapiToolsEnabled
     */
    public ConfigNodePropertyBoolean getOrgApacheSlingHapiToolsEnabled() {
        return orgApacheSlingHapiToolsEnabled;
    }

    public void setOrgApacheSlingHapiToolsEnabled(ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled) {
        this.orgApacheSlingHapiToolsEnabled = orgApacheSlingHapiToolsEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingHapiImplHApiUtilImplProperties {\n");
        
        sb.append("    orgApacheSlingHapiToolsResourcetype: ").append(toIndentedString(orgApacheSlingHapiToolsResourcetype)).append("\n");
        sb.append("    orgApacheSlingHapiToolsCollectionresourcetype: ").append(toIndentedString(orgApacheSlingHapiToolsCollectionresourcetype)).append("\n");
        sb.append("    orgApacheSlingHapiToolsSearchpaths: ").append(toIndentedString(orgApacheSlingHapiToolsSearchpaths)).append("\n");
        sb.append("    orgApacheSlingHapiToolsExternalurl: ").append(toIndentedString(orgApacheSlingHapiToolsExternalurl)).append("\n");
        sb.append("    orgApacheSlingHapiToolsEnabled: ").append(toIndentedString(orgApacheSlingHapiToolsEnabled)).append("\n");
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

