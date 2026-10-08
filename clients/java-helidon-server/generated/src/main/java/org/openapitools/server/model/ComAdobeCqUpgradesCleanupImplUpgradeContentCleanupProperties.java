package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties   {

    private ConfigNodePropertyArray deletePathRegexps;
    private ConfigNodePropertyString deleteSql2Query;

    /**
     * Default constructor.
     */
    public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.
     *
     * @param deletePathRegexps deletePathRegexps
     * @param deleteSql2Query deleteSql2Query
     */
    public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(
        ConfigNodePropertyArray deletePathRegexps, 
        ConfigNodePropertyString deleteSql2Query
    ) {
        this.deletePathRegexps = deletePathRegexps;
        this.deleteSql2Query = deleteSql2Query;
    }



    /**
     * Get deletePathRegexps
     * @return deletePathRegexps
     */
    public ConfigNodePropertyArray getDeletePathRegexps() {
        return deletePathRegexps;
    }

    public void setDeletePathRegexps(ConfigNodePropertyArray deletePathRegexps) {
        this.deletePathRegexps = deletePathRegexps;
    }

    /**
     * Get deleteSql2Query
     * @return deleteSql2Query
     */
    public ConfigNodePropertyString getDeleteSql2Query() {
        return deleteSql2Query;
    }

    public void setDeleteSql2Query(ConfigNodePropertyString deleteSql2Query) {
        this.deleteSql2Query = deleteSql2Query;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {\n");
        
        sb.append("    deletePathRegexps: ").append(toIndentedString(deletePathRegexps)).append("\n");
        sb.append("    deleteSql2Query: ").append(toIndentedString(deleteSql2Query)).append("\n");
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

