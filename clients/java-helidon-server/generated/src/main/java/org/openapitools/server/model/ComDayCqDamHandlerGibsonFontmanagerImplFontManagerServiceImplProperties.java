package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties   {

    private ConfigNodePropertyString eventFilter;
    private ConfigNodePropertyArray fontmgrSystemFontDir;
    private ConfigNodePropertyString fontmgrAdobeFontDir;
    private ConfigNodePropertyString fontmgrCustomerFontDir;

    /**
     * Default constructor.
     */
    public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.
     *
     * @param eventFilter eventFilter
     * @param fontmgrSystemFontDir fontmgrSystemFontDir
     * @param fontmgrAdobeFontDir fontmgrAdobeFontDir
     * @param fontmgrCustomerFontDir fontmgrCustomerFontDir
     */
    public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties(
        ConfigNodePropertyString eventFilter, 
        ConfigNodePropertyArray fontmgrSystemFontDir, 
        ConfigNodePropertyString fontmgrAdobeFontDir, 
        ConfigNodePropertyString fontmgrCustomerFontDir
    ) {
        this.eventFilter = eventFilter;
        this.fontmgrSystemFontDir = fontmgrSystemFontDir;
        this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
        this.fontmgrCustomerFontDir = fontmgrCustomerFontDir;
    }



    /**
     * Get eventFilter
     * @return eventFilter
     */
    public ConfigNodePropertyString getEventFilter() {
        return eventFilter;
    }

    public void setEventFilter(ConfigNodePropertyString eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * Get fontmgrSystemFontDir
     * @return fontmgrSystemFontDir
     */
    public ConfigNodePropertyArray getFontmgrSystemFontDir() {
        return fontmgrSystemFontDir;
    }

    public void setFontmgrSystemFontDir(ConfigNodePropertyArray fontmgrSystemFontDir) {
        this.fontmgrSystemFontDir = fontmgrSystemFontDir;
    }

    /**
     * Get fontmgrAdobeFontDir
     * @return fontmgrAdobeFontDir
     */
    public ConfigNodePropertyString getFontmgrAdobeFontDir() {
        return fontmgrAdobeFontDir;
    }

    public void setFontmgrAdobeFontDir(ConfigNodePropertyString fontmgrAdobeFontDir) {
        this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
    }

    /**
     * Get fontmgrCustomerFontDir
     * @return fontmgrCustomerFontDir
     */
    public ConfigNodePropertyString getFontmgrCustomerFontDir() {
        return fontmgrCustomerFontDir;
    }

    public void setFontmgrCustomerFontDir(ConfigNodePropertyString fontmgrCustomerFontDir) {
        this.fontmgrCustomerFontDir = fontmgrCustomerFontDir;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {\n");
        
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
        sb.append("    fontmgrSystemFontDir: ").append(toIndentedString(fontmgrSystemFontDir)).append("\n");
        sb.append("    fontmgrAdobeFontDir: ").append(toIndentedString(fontmgrAdobeFontDir)).append("\n");
        sb.append("    fontmgrCustomerFontDir: ").append(toIndentedString(fontmgrCustomerFontDir)).append("\n");
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

