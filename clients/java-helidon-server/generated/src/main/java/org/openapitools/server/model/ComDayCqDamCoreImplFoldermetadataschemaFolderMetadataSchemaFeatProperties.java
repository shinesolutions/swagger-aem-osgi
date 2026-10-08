package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties   {

    private ConfigNodePropertyBoolean isEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.
     *
     * @param isEnabled isEnabled
     */
    public ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties(
        ConfigNodePropertyBoolean isEnabled
    ) {
        this.isEnabled = isEnabled;
    }



    /**
     * Get isEnabled
     * @return isEnabled
     */
    public ConfigNodePropertyBoolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(ConfigNodePropertyBoolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties {\n");
        
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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

