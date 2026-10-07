package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingModelsImplModelAdapterFactoryProperties   {

    private ConfigNodePropertyString osgiHttpWhiteboardListener;
    private ConfigNodePropertyString osgiHttpWhiteboardContextSelect;
    private ConfigNodePropertyInteger maxRecursionDepth;
    private ConfigNodePropertyInteger cleanupJobPeriod;

    /**
     * Default constructor.
     */
    public OrgApacheSlingModelsImplModelAdapterFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingModelsImplModelAdapterFactoryProperties.
     *
     * @param osgiHttpWhiteboardListener osgiHttpWhiteboardListener
     * @param osgiHttpWhiteboardContextSelect osgiHttpWhiteboardContextSelect
     * @param maxRecursionDepth maxRecursionDepth
     * @param cleanupJobPeriod cleanupJobPeriod
     */
    public OrgApacheSlingModelsImplModelAdapterFactoryProperties(
        ConfigNodePropertyString osgiHttpWhiteboardListener, 
        ConfigNodePropertyString osgiHttpWhiteboardContextSelect, 
        ConfigNodePropertyInteger maxRecursionDepth, 
        ConfigNodePropertyInteger cleanupJobPeriod
    ) {
        this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
        this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
        this.maxRecursionDepth = maxRecursionDepth;
        this.cleanupJobPeriod = cleanupJobPeriod;
    }



    /**
     * Get osgiHttpWhiteboardListener
     * @return osgiHttpWhiteboardListener
     */
    public ConfigNodePropertyString getOsgiHttpWhiteboardListener() {
        return osgiHttpWhiteboardListener;
    }

    public void setOsgiHttpWhiteboardListener(ConfigNodePropertyString osgiHttpWhiteboardListener) {
        this.osgiHttpWhiteboardListener = osgiHttpWhiteboardListener;
    }

    /**
     * Get osgiHttpWhiteboardContextSelect
     * @return osgiHttpWhiteboardContextSelect
     */
    public ConfigNodePropertyString getOsgiHttpWhiteboardContextSelect() {
        return osgiHttpWhiteboardContextSelect;
    }

    public void setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString osgiHttpWhiteboardContextSelect) {
        this.osgiHttpWhiteboardContextSelect = osgiHttpWhiteboardContextSelect;
    }

    /**
     * Get maxRecursionDepth
     * @return maxRecursionDepth
     */
    public ConfigNodePropertyInteger getMaxRecursionDepth() {
        return maxRecursionDepth;
    }

    public void setMaxRecursionDepth(ConfigNodePropertyInteger maxRecursionDepth) {
        this.maxRecursionDepth = maxRecursionDepth;
    }

    /**
     * Get cleanupJobPeriod
     * @return cleanupJobPeriod
     */
    public ConfigNodePropertyInteger getCleanupJobPeriod() {
        return cleanupJobPeriod;
    }

    public void setCleanupJobPeriod(ConfigNodePropertyInteger cleanupJobPeriod) {
        this.cleanupJobPeriod = cleanupJobPeriod;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingModelsImplModelAdapterFactoryProperties {\n");
        
        sb.append("    osgiHttpWhiteboardListener: ").append(toIndentedString(osgiHttpWhiteboardListener)).append("\n");
        sb.append("    osgiHttpWhiteboardContextSelect: ").append(toIndentedString(osgiHttpWhiteboardContextSelect)).append("\n");
        sb.append("    maxRecursionDepth: ").append(toIndentedString(maxRecursionDepth)).append("\n");
        sb.append("    cleanupJobPeriod: ").append(toIndentedString(cleanupJobPeriod)).append("\n");
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

