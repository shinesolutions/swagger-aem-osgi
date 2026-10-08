package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplWCMDebugFilterProperties   {

    private ConfigNodePropertyBoolean wcmdbgfilterEnabled;
    private ConfigNodePropertyBoolean wcmdbgfilterJspDebug;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplWCMDebugFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplWCMDebugFilterProperties.
     *
     * @param wcmdbgfilterEnabled wcmdbgfilterEnabled
     * @param wcmdbgfilterJspDebug wcmdbgfilterJspDebug
     */
    public ComDayCqWcmCoreImplWCMDebugFilterProperties(
        ConfigNodePropertyBoolean wcmdbgfilterEnabled, 
        ConfigNodePropertyBoolean wcmdbgfilterJspDebug
    ) {
        this.wcmdbgfilterEnabled = wcmdbgfilterEnabled;
        this.wcmdbgfilterJspDebug = wcmdbgfilterJspDebug;
    }



    /**
     * Get wcmdbgfilterEnabled
     * @return wcmdbgfilterEnabled
     */
    public ConfigNodePropertyBoolean getWcmdbgfilterEnabled() {
        return wcmdbgfilterEnabled;
    }

    public void setWcmdbgfilterEnabled(ConfigNodePropertyBoolean wcmdbgfilterEnabled) {
        this.wcmdbgfilterEnabled = wcmdbgfilterEnabled;
    }

    /**
     * Get wcmdbgfilterJspDebug
     * @return wcmdbgfilterJspDebug
     */
    public ConfigNodePropertyBoolean getWcmdbgfilterJspDebug() {
        return wcmdbgfilterJspDebug;
    }

    public void setWcmdbgfilterJspDebug(ConfigNodePropertyBoolean wcmdbgfilterJspDebug) {
        this.wcmdbgfilterJspDebug = wcmdbgfilterJspDebug;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplWCMDebugFilterProperties {\n");
        
        sb.append("    wcmdbgfilterEnabled: ").append(toIndentedString(wcmdbgfilterEnabled)).append("\n");
        sb.append("    wcmdbgfilterJspDebug: ").append(toIndentedString(wcmdbgfilterJspDebug)).append("\n");
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

