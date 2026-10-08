package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties   {

    private ConfigNodePropertyArray graniteData;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.
     *
     * @param graniteData graniteData
     */
    public ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties(
        ConfigNodePropertyArray graniteData
    ) {
        this.graniteData = graniteData;
    }



    /**
     * Get graniteData
     * @return graniteData
     */
    public ConfigNodePropertyArray getGraniteData() {
        return graniteData;
    }

    public void setGraniteData(ConfigNodePropertyArray graniteData) {
        this.graniteData = graniteData;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {\n");
        
        sb.append("    graniteData: ").append(toIndentedString(graniteData)).append("\n");
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

