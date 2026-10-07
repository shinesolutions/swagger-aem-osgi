package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletBatchMetadataServletProperties   {

    private ConfigNodePropertyArray cqDamBatchMetadataAssetDefault;
    private ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault;
    private ConfigNodePropertyInteger cqDamBatchMetadataMaxresources;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletBatchMetadataServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletBatchMetadataServletProperties.
     *
     * @param cqDamBatchMetadataAssetDefault cqDamBatchMetadataAssetDefault
     * @param cqDamBatchMetadataCollectionDefault cqDamBatchMetadataCollectionDefault
     * @param cqDamBatchMetadataMaxresources cqDamBatchMetadataMaxresources
     */
    public ComDayCqDamCoreImplServletBatchMetadataServletProperties(
        ConfigNodePropertyArray cqDamBatchMetadataAssetDefault, 
        ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault, 
        ConfigNodePropertyInteger cqDamBatchMetadataMaxresources
    ) {
        this.cqDamBatchMetadataAssetDefault = cqDamBatchMetadataAssetDefault;
        this.cqDamBatchMetadataCollectionDefault = cqDamBatchMetadataCollectionDefault;
        this.cqDamBatchMetadataMaxresources = cqDamBatchMetadataMaxresources;
    }



    /**
     * Get cqDamBatchMetadataAssetDefault
     * @return cqDamBatchMetadataAssetDefault
     */
    public ConfigNodePropertyArray getCqDamBatchMetadataAssetDefault() {
        return cqDamBatchMetadataAssetDefault;
    }

    public void setCqDamBatchMetadataAssetDefault(ConfigNodePropertyArray cqDamBatchMetadataAssetDefault) {
        this.cqDamBatchMetadataAssetDefault = cqDamBatchMetadataAssetDefault;
    }

    /**
     * Get cqDamBatchMetadataCollectionDefault
     * @return cqDamBatchMetadataCollectionDefault
     */
    public ConfigNodePropertyArray getCqDamBatchMetadataCollectionDefault() {
        return cqDamBatchMetadataCollectionDefault;
    }

    public void setCqDamBatchMetadataCollectionDefault(ConfigNodePropertyArray cqDamBatchMetadataCollectionDefault) {
        this.cqDamBatchMetadataCollectionDefault = cqDamBatchMetadataCollectionDefault;
    }

    /**
     * Get cqDamBatchMetadataMaxresources
     * @return cqDamBatchMetadataMaxresources
     */
    public ConfigNodePropertyInteger getCqDamBatchMetadataMaxresources() {
        return cqDamBatchMetadataMaxresources;
    }

    public void setCqDamBatchMetadataMaxresources(ConfigNodePropertyInteger cqDamBatchMetadataMaxresources) {
        this.cqDamBatchMetadataMaxresources = cqDamBatchMetadataMaxresources;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletBatchMetadataServletProperties {\n");
        
        sb.append("    cqDamBatchMetadataAssetDefault: ").append(toIndentedString(cqDamBatchMetadataAssetDefault)).append("\n");
        sb.append("    cqDamBatchMetadataCollectionDefault: ").append(toIndentedString(cqDamBatchMetadataCollectionDefault)).append("\n");
        sb.append("    cqDamBatchMetadataMaxresources: ").append(toIndentedString(cqDamBatchMetadataMaxresources)).append("\n");
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

