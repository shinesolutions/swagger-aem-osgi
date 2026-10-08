package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties   {

    private ConfigNodePropertyString rootPath;
    private ConfigNodePropertyBoolean fixInconsistencies;

    /**
     * Default constructor.
     */
    public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.
     *
     * @param rootPath rootPath
     * @param fixInconsistencies fixInconsistencies
     */
    public ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(
        ConfigNodePropertyString rootPath, 
        ConfigNodePropertyBoolean fixInconsistencies
    ) {
        this.rootPath = rootPath;
        this.fixInconsistencies = fixInconsistencies;
    }



    /**
     * Get rootPath
     * @return rootPath
     */
    public ConfigNodePropertyString getRootPath() {
        return rootPath;
    }

    public void setRootPath(ConfigNodePropertyString rootPath) {
        this.rootPath = rootPath;
    }

    /**
     * Get fixInconsistencies
     * @return fixInconsistencies
     */
    public ConfigNodePropertyBoolean getFixInconsistencies() {
        return fixInconsistencies;
    }

    public void setFixInconsistencies(ConfigNodePropertyBoolean fixInconsistencies) {
        this.fixInconsistencies = fixInconsistencies;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties {\n");
        
        sb.append("    rootPath: ").append(toIndentedString(rootPath)).append("\n");
        sb.append("    fixInconsistencies: ").append(toIndentedString(fixInconsistencies)).append("\n");
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

