package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties   {

    private ConfigNodePropertyArray codeupgradetasks;
    private ConfigNodePropertyArray codeupgradetaskfilters;

    /**
     * Default constructor.
     */
    public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.
     *
     * @param codeupgradetasks codeupgradetasks
     * @param codeupgradetaskfilters codeupgradetaskfilters
     */
    public ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties(
        ConfigNodePropertyArray codeupgradetasks, 
        ConfigNodePropertyArray codeupgradetaskfilters
    ) {
        this.codeupgradetasks = codeupgradetasks;
        this.codeupgradetaskfilters = codeupgradetaskfilters;
    }



    /**
     * Get codeupgradetasks
     * @return codeupgradetasks
     */
    public ConfigNodePropertyArray getCodeupgradetasks() {
        return codeupgradetasks;
    }

    public void setCodeupgradetasks(ConfigNodePropertyArray codeupgradetasks) {
        this.codeupgradetasks = codeupgradetasks;
    }

    /**
     * Get codeupgradetaskfilters
     * @return codeupgradetaskfilters
     */
    public ConfigNodePropertyArray getCodeupgradetaskfilters() {
        return codeupgradetaskfilters;
    }

    public void setCodeupgradetaskfilters(ConfigNodePropertyArray codeupgradetaskfilters) {
        this.codeupgradetaskfilters = codeupgradetaskfilters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties {\n");
        
        sb.append("    codeupgradetasks: ").append(toIndentedString(codeupgradetasks)).append("\n");
        sb.append("    codeupgradetaskfilters: ").append(toIndentedString(codeupgradetaskfilters)).append("\n");
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

