package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties   {

    private ConfigNodePropertyArray includePaths;
    private ConfigNodePropertyString exporterUser;

    /**
     * Default constructor.
     */
    public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.
     *
     * @param includePaths includePaths
     * @param exporterUser exporterUser
     */
    public ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(
        ConfigNodePropertyArray includePaths, 
        ConfigNodePropertyString exporterUser
    ) {
        this.includePaths = includePaths;
        this.exporterUser = exporterUser;
    }



    /**
     * Get includePaths
     * @return includePaths
     */
    public ConfigNodePropertyArray getIncludePaths() {
        return includePaths;
    }

    public void setIncludePaths(ConfigNodePropertyArray includePaths) {
        this.includePaths = includePaths;
    }

    /**
     * Get exporterUser
     * @return exporterUser
     */
    public ConfigNodePropertyString getExporterUser() {
        return exporterUser;
    }

    public void setExporterUser(ConfigNodePropertyString exporterUser) {
        this.exporterUser = exporterUser;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties {\n");
        
        sb.append("    includePaths: ").append(toIndentedString(includePaths)).append("\n");
        sb.append("    exporterUser: ").append(toIndentedString(exporterUser)).append("\n");
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

