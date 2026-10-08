package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqCommonsServletsRootMappingServletProperties   {

    private ConfigNodePropertyString rootmappingTarget;

    /**
     * Default constructor.
     */
    public ComDayCqCommonsServletsRootMappingServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqCommonsServletsRootMappingServletProperties.
     *
     * @param rootmappingTarget rootmappingTarget
     */
    public ComDayCqCommonsServletsRootMappingServletProperties(
        ConfigNodePropertyString rootmappingTarget
    ) {
        this.rootmappingTarget = rootmappingTarget;
    }



    /**
     * Get rootmappingTarget
     * @return rootmappingTarget
     */
    public ConfigNodePropertyString getRootmappingTarget() {
        return rootmappingTarget;
    }

    public void setRootmappingTarget(ConfigNodePropertyString rootmappingTarget) {
        this.rootmappingTarget = rootmappingTarget;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqCommonsServletsRootMappingServletProperties {\n");
        
        sb.append("    rootmappingTarget: ").append(toIndentedString(rootmappingTarget)).append("\n");
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

