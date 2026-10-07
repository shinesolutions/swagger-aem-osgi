package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties   {

    private ConfigNodePropertyBoolean validationEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqTaggingImplJcrTagManagerFactoryImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.
     *
     * @param validationEnabled validationEnabled
     */
    public ComDayCqTaggingImplJcrTagManagerFactoryImplProperties(
        ConfigNodePropertyBoolean validationEnabled
    ) {
        this.validationEnabled = validationEnabled;
    }



    /**
     * Get validationEnabled
     * @return validationEnabled
     */
    public ConfigNodePropertyBoolean getValidationEnabled() {
        return validationEnabled;
    }

    public void setValidationEnabled(ConfigNodePropertyBoolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties {\n");
        
        sb.append("    validationEnabled: ").append(toIndentedString(validationEnabled)).append("\n");
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

