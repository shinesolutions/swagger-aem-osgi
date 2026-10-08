package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties   {

    private ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled;
    private ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths;

    /**
     * Default constructor.
     */
    public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.
     *
     * @param cqDamScene7DamchangeeventlistenerEnabled cqDamScene7DamchangeeventlistenerEnabled
     * @param cqDamScene7DamchangeeventlistenerObservedPaths cqDamScene7DamchangeeventlistenerObservedPaths
     */
    public ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(
        ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled, 
        ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths
    ) {
        this.cqDamScene7DamchangeeventlistenerEnabled = cqDamScene7DamchangeeventlistenerEnabled;
        this.cqDamScene7DamchangeeventlistenerObservedPaths = cqDamScene7DamchangeeventlistenerObservedPaths;
    }



    /**
     * Get cqDamScene7DamchangeeventlistenerEnabled
     * @return cqDamScene7DamchangeeventlistenerEnabled
     */
    public ConfigNodePropertyBoolean getCqDamScene7DamchangeeventlistenerEnabled() {
        return cqDamScene7DamchangeeventlistenerEnabled;
    }

    public void setCqDamScene7DamchangeeventlistenerEnabled(ConfigNodePropertyBoolean cqDamScene7DamchangeeventlistenerEnabled) {
        this.cqDamScene7DamchangeeventlistenerEnabled = cqDamScene7DamchangeeventlistenerEnabled;
    }

    /**
     * Get cqDamScene7DamchangeeventlistenerObservedPaths
     * @return cqDamScene7DamchangeeventlistenerObservedPaths
     */
    public ConfigNodePropertyArray getCqDamScene7DamchangeeventlistenerObservedPaths() {
        return cqDamScene7DamchangeeventlistenerObservedPaths;
    }

    public void setCqDamScene7DamchangeeventlistenerObservedPaths(ConfigNodePropertyArray cqDamScene7DamchangeeventlistenerObservedPaths) {
        this.cqDamScene7DamchangeeventlistenerObservedPaths = cqDamScene7DamchangeeventlistenerObservedPaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {\n");
        
        sb.append("    cqDamScene7DamchangeeventlistenerEnabled: ").append(toIndentedString(cqDamScene7DamchangeeventlistenerEnabled)).append("\n");
        sb.append("    cqDamScene7DamchangeeventlistenerObservedPaths: ").append(toIndentedString(cqDamScene7DamchangeeventlistenerObservedPaths)).append("\n");
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

