package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties   {

    private ConfigNodePropertyArray mimeTypes;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.
     *
     * @param mimeTypes mimeTypes
     */
    public OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties(
        ConfigNodePropertyArray mimeTypes
    ) {
        this.mimeTypes = mimeTypes;
    }



    /**
     * Get mimeTypes
     * @return mimeTypes
     */
    public ConfigNodePropertyArray getMimeTypes() {
        return mimeTypes;
    }

    public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
        this.mimeTypes = mimeTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties {\n");
        
        sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
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

