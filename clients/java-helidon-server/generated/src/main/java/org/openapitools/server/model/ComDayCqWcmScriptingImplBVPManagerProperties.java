package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmScriptingImplBVPManagerProperties   {

    private ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines;

    /**
     * Default constructor.
     */
    public ComDayCqWcmScriptingImplBVPManagerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmScriptingImplBVPManagerProperties.
     *
     * @param comDayCqWcmScriptingBvpScriptEngines comDayCqWcmScriptingBvpScriptEngines
     */
    public ComDayCqWcmScriptingImplBVPManagerProperties(
        ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines
    ) {
        this.comDayCqWcmScriptingBvpScriptEngines = comDayCqWcmScriptingBvpScriptEngines;
    }



    /**
     * Get comDayCqWcmScriptingBvpScriptEngines
     * @return comDayCqWcmScriptingBvpScriptEngines
     */
    public ConfigNodePropertyArray getComDayCqWcmScriptingBvpScriptEngines() {
        return comDayCqWcmScriptingBvpScriptEngines;
    }

    public void setComDayCqWcmScriptingBvpScriptEngines(ConfigNodePropertyArray comDayCqWcmScriptingBvpScriptEngines) {
        this.comDayCqWcmScriptingBvpScriptEngines = comDayCqWcmScriptingBvpScriptEngines;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmScriptingImplBVPManagerProperties {\n");
        
        sb.append("    comDayCqWcmScriptingBvpScriptEngines: ").append(toIndentedString(comDayCqWcmScriptingBvpScriptEngines)).append("\n");
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

