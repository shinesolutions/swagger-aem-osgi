package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletCollectionServletProperties   {

    private ConfigNodePropertyArray cqDamBatchCollectionProperties;
    private ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletCollectionServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletCollectionServletProperties.
     *
     * @param cqDamBatchCollectionProperties cqDamBatchCollectionProperties
     * @param cqDamBatchCollectionMaxcollections cqDamBatchCollectionMaxcollections
     */
    public ComDayCqDamCoreImplServletCollectionServletProperties(
        ConfigNodePropertyArray cqDamBatchCollectionProperties, 
        ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections
    ) {
        this.cqDamBatchCollectionProperties = cqDamBatchCollectionProperties;
        this.cqDamBatchCollectionMaxcollections = cqDamBatchCollectionMaxcollections;
    }



    /**
     * Get cqDamBatchCollectionProperties
     * @return cqDamBatchCollectionProperties
     */
    public ConfigNodePropertyArray getCqDamBatchCollectionProperties() {
        return cqDamBatchCollectionProperties;
    }

    public void setCqDamBatchCollectionProperties(ConfigNodePropertyArray cqDamBatchCollectionProperties) {
        this.cqDamBatchCollectionProperties = cqDamBatchCollectionProperties;
    }

    /**
     * Get cqDamBatchCollectionMaxcollections
     * @return cqDamBatchCollectionMaxcollections
     */
    public ConfigNodePropertyInteger getCqDamBatchCollectionMaxcollections() {
        return cqDamBatchCollectionMaxcollections;
    }

    public void setCqDamBatchCollectionMaxcollections(ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections) {
        this.cqDamBatchCollectionMaxcollections = cqDamBatchCollectionMaxcollections;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletCollectionServletProperties {\n");
        
        sb.append("    cqDamBatchCollectionProperties: ").append(toIndentedString(cqDamBatchCollectionProperties)).append("\n");
        sb.append("    cqDamBatchCollectionMaxcollections: ").append(toIndentedString(cqDamBatchCollectionMaxcollections)).append("\n");
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

