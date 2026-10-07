package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamHandlerFfmpegLocatorImplProperties   {

    private ConfigNodePropertyArray executableSearchpath;

    /**
     * Default constructor.
     */
    public ComDayCqDamHandlerFfmpegLocatorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamHandlerFfmpegLocatorImplProperties.
     *
     * @param executableSearchpath executableSearchpath
     */
    public ComDayCqDamHandlerFfmpegLocatorImplProperties(
        ConfigNodePropertyArray executableSearchpath
    ) {
        this.executableSearchpath = executableSearchpath;
    }



    /**
     * Get executableSearchpath
     * @return executableSearchpath
     */
    public ConfigNodePropertyArray getExecutableSearchpath() {
        return executableSearchpath;
    }

    public void setExecutableSearchpath(ConfigNodePropertyArray executableSearchpath) {
        this.executableSearchpath = executableSearchpath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamHandlerFfmpegLocatorImplProperties {\n");
        
        sb.append("    executableSearchpath: ").append(toIndentedString(executableSearchpath)).append("\n");
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

