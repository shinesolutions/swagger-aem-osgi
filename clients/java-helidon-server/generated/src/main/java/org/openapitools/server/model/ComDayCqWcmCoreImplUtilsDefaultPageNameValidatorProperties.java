package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties   {

    private ConfigNodePropertyString nonValidChars;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.
     *
     * @param nonValidChars nonValidChars
     */
    public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties(
        ConfigNodePropertyString nonValidChars
    ) {
        this.nonValidChars = nonValidChars;
    }



    /**
     * Get nonValidChars
     * @return nonValidChars
     */
    public ConfigNodePropertyString getNonValidChars() {
        return nonValidChars;
    }

    public void setNonValidChars(ConfigNodePropertyString nonValidChars) {
        this.nonValidChars = nonValidChars;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties {\n");
        
        sb.append("    nonValidChars: ").append(toIndentedString(nonValidChars)).append("\n");
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

