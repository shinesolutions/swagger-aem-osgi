package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteContexthubImplContextHubImplProperties   {

    private ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode;
    private ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteContexthubImplContextHubImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteContexthubImplContextHubImplProperties.
     *
     * @param comAdobeGraniteContexthubSilentMode comAdobeGraniteContexthubSilentMode
     * @param comAdobeGraniteContexthubShowUi comAdobeGraniteContexthubShowUi
     */
    public ComAdobeGraniteContexthubImplContextHubImplProperties(
        ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode, 
        ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi
    ) {
        this.comAdobeGraniteContexthubSilentMode = comAdobeGraniteContexthubSilentMode;
        this.comAdobeGraniteContexthubShowUi = comAdobeGraniteContexthubShowUi;
    }



    /**
     * Get comAdobeGraniteContexthubSilentMode
     * @return comAdobeGraniteContexthubSilentMode
     */
    public ConfigNodePropertyBoolean getComAdobeGraniteContexthubSilentMode() {
        return comAdobeGraniteContexthubSilentMode;
    }

    public void setComAdobeGraniteContexthubSilentMode(ConfigNodePropertyBoolean comAdobeGraniteContexthubSilentMode) {
        this.comAdobeGraniteContexthubSilentMode = comAdobeGraniteContexthubSilentMode;
    }

    /**
     * Get comAdobeGraniteContexthubShowUi
     * @return comAdobeGraniteContexthubShowUi
     */
    public ConfigNodePropertyBoolean getComAdobeGraniteContexthubShowUi() {
        return comAdobeGraniteContexthubShowUi;
    }

    public void setComAdobeGraniteContexthubShowUi(ConfigNodePropertyBoolean comAdobeGraniteContexthubShowUi) {
        this.comAdobeGraniteContexthubShowUi = comAdobeGraniteContexthubShowUi;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteContexthubImplContextHubImplProperties {\n");
        
        sb.append("    comAdobeGraniteContexthubSilentMode: ").append(toIndentedString(comAdobeGraniteContexthubSilentMode)).append("\n");
        sb.append("    comAdobeGraniteContexthubShowUi: ").append(toIndentedString(comAdobeGraniteContexthubShowUi)).append("\n");
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

