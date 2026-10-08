package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties   {

    private ConfigNodePropertyArray fontList;

    /**
     * Default constructor.
     */
    public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.
     *
     * @param fontList fontList
     */
    public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties(
        ConfigNodePropertyArray fontList
    ) {
        this.fontList = fontList;
    }



    /**
     * Get fontList
     * @return fontList
     */
    public ConfigNodePropertyArray getFontList() {
        return fontList;
    }

    public void setFontList(ConfigNodePropertyArray fontList) {
        this.fontList = fontList;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties {\n");
        
        sb.append("    fontList: ").append(toIndentedString(fontList)).append("\n");
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

