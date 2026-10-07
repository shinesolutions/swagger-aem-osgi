package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqExtwidgetServletsImageSpriteServletProperties   {

    private ConfigNodePropertyInteger maxWidth;
    private ConfigNodePropertyInteger maxHeight;

    /**
     * Default constructor.
     */
    public ComDayCqExtwidgetServletsImageSpriteServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqExtwidgetServletsImageSpriteServletProperties.
     *
     * @param maxWidth maxWidth
     * @param maxHeight maxHeight
     */
    public ComDayCqExtwidgetServletsImageSpriteServletProperties(
        ConfigNodePropertyInteger maxWidth, 
        ConfigNodePropertyInteger maxHeight
    ) {
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
    }



    /**
     * Get maxWidth
     * @return maxWidth
     */
    public ConfigNodePropertyInteger getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(ConfigNodePropertyInteger maxWidth) {
        this.maxWidth = maxWidth;
    }

    /**
     * Get maxHeight
     * @return maxHeight
     */
    public ConfigNodePropertyInteger getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(ConfigNodePropertyInteger maxHeight) {
        this.maxHeight = maxHeight;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqExtwidgetServletsImageSpriteServletProperties {\n");
        
        sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
        sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
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

