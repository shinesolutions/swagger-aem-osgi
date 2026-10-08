package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties   {

    private ConfigNodePropertyArray importerName;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.
     *
     * @param importerName importerName
     */
    public ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties(
        ConfigNodePropertyArray importerName
    ) {
        this.importerName = importerName;
    }



    /**
     * Get importerName
     * @return importerName
     */
    public ConfigNodePropertyArray getImporterName() {
        return importerName;
    }

    public void setImporterName(ConfigNodePropertyArray importerName) {
        this.importerName = importerName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties {\n");
        
        sb.append("    importerName: ").append(toIndentedString(importerName)).append("\n");
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

