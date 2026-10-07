package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties   {

    private ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.
     *
     * @param cqDamDetectAssetMimeFromContent cqDamDetectAssetMimeFromContent
     */
    public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties(
        ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent
    ) {
        this.cqDamDetectAssetMimeFromContent = cqDamDetectAssetMimeFromContent;
    }



    /**
     * Get cqDamDetectAssetMimeFromContent
     * @return cqDamDetectAssetMimeFromContent
     */
    public ConfigNodePropertyBoolean getCqDamDetectAssetMimeFromContent() {
        return cqDamDetectAssetMimeFromContent;
    }

    public void setCqDamDetectAssetMimeFromContent(ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent) {
        this.cqDamDetectAssetMimeFromContent = cqDamDetectAssetMimeFromContent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties {\n");
        
        sb.append("    cqDamDetectAssetMimeFromContent: ").append(toIndentedString(cqDamDetectAssetMimeFromContent)).append("\n");
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

