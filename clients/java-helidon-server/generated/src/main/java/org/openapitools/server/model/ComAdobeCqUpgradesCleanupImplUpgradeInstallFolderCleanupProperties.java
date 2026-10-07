package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties   {

    private ConfigNodePropertyArray deleteNameRegexps;

    /**
     * Default constructor.
     */
    public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.
     *
     * @param deleteNameRegexps deleteNameRegexps
     */
    public ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties(
        ConfigNodePropertyArray deleteNameRegexps
    ) {
        this.deleteNameRegexps = deleteNameRegexps;
    }



    /**
     * Get deleteNameRegexps
     * @return deleteNameRegexps
     */
    public ConfigNodePropertyArray getDeleteNameRegexps() {
        return deleteNameRegexps;
    }

    public void setDeleteNameRegexps(ConfigNodePropertyArray deleteNameRegexps) {
        this.deleteNameRegexps = deleteNameRegexps;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties {\n");
        
        sb.append("    deleteNameRegexps: ").append(toIndentedString(deleteNameRegexps)).append("\n");
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

