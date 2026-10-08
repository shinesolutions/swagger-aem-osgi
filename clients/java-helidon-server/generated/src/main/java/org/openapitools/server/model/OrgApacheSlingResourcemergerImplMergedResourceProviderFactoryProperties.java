package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties   {

    private ConfigNodePropertyString mergeRoot;
    private ConfigNodePropertyBoolean mergeReadOnly;

    /**
     * Default constructor.
     */
    public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.
     *
     * @param mergeRoot mergeRoot
     * @param mergeReadOnly mergeReadOnly
     */
    public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties(
        ConfigNodePropertyString mergeRoot, 
        ConfigNodePropertyBoolean mergeReadOnly
    ) {
        this.mergeRoot = mergeRoot;
        this.mergeReadOnly = mergeReadOnly;
    }



    /**
     * Get mergeRoot
     * @return mergeRoot
     */
    public ConfigNodePropertyString getMergeRoot() {
        return mergeRoot;
    }

    public void setMergeRoot(ConfigNodePropertyString mergeRoot) {
        this.mergeRoot = mergeRoot;
    }

    /**
     * Get mergeReadOnly
     * @return mergeReadOnly
     */
    public ConfigNodePropertyBoolean getMergeReadOnly() {
        return mergeReadOnly;
    }

    public void setMergeReadOnly(ConfigNodePropertyBoolean mergeReadOnly) {
        this.mergeReadOnly = mergeReadOnly;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties {\n");
        
        sb.append("    mergeRoot: ").append(toIndentedString(mergeRoot)).append("\n");
        sb.append("    mergeReadOnly: ").append(toIndentedString(mergeReadOnly)).append("\n");
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

