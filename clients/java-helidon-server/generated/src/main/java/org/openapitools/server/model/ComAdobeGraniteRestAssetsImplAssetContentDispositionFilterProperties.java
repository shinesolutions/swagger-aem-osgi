package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties   {

    private ConfigNodePropertyBoolean mimeAllowEmpty;
    private ConfigNodePropertyArray mimeAllowed;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.
     *
     * @param mimeAllowEmpty mimeAllowEmpty
     * @param mimeAllowed mimeAllowed
     */
    public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties(
        ConfigNodePropertyBoolean mimeAllowEmpty, 
        ConfigNodePropertyArray mimeAllowed
    ) {
        this.mimeAllowEmpty = mimeAllowEmpty;
        this.mimeAllowed = mimeAllowed;
    }



    /**
     * Get mimeAllowEmpty
     * @return mimeAllowEmpty
     */
    public ConfigNodePropertyBoolean getMimeAllowEmpty() {
        return mimeAllowEmpty;
    }

    public void setMimeAllowEmpty(ConfigNodePropertyBoolean mimeAllowEmpty) {
        this.mimeAllowEmpty = mimeAllowEmpty;
    }

    /**
     * Get mimeAllowed
     * @return mimeAllowed
     */
    public ConfigNodePropertyArray getMimeAllowed() {
        return mimeAllowed;
    }

    public void setMimeAllowed(ConfigNodePropertyArray mimeAllowed) {
        this.mimeAllowed = mimeAllowed;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {\n");
        
        sb.append("    mimeAllowEmpty: ").append(toIndentedString(mimeAllowEmpty)).append("\n");
        sb.append("    mimeAllowed: ").append(toIndentedString(mimeAllowed)).append("\n");
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

