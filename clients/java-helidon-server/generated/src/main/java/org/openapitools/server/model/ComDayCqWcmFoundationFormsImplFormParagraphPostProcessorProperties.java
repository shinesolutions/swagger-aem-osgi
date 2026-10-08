package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties   {

    private ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled;
    private ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes;

    /**
     * Default constructor.
     */
    public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.
     *
     * @param formsFormparagraphpostprocessorEnabled formsFormparagraphpostprocessorEnabled
     * @param formsFormparagraphpostprocessorFormresourcetypes formsFormparagraphpostprocessorFormresourcetypes
     */
    public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(
        ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled, 
        ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes
    ) {
        this.formsFormparagraphpostprocessorEnabled = formsFormparagraphpostprocessorEnabled;
        this.formsFormparagraphpostprocessorFormresourcetypes = formsFormparagraphpostprocessorFormresourcetypes;
    }



    /**
     * Get formsFormparagraphpostprocessorEnabled
     * @return formsFormparagraphpostprocessorEnabled
     */
    public ConfigNodePropertyBoolean getFormsFormparagraphpostprocessorEnabled() {
        return formsFormparagraphpostprocessorEnabled;
    }

    public void setFormsFormparagraphpostprocessorEnabled(ConfigNodePropertyBoolean formsFormparagraphpostprocessorEnabled) {
        this.formsFormparagraphpostprocessorEnabled = formsFormparagraphpostprocessorEnabled;
    }

    /**
     * Get formsFormparagraphpostprocessorFormresourcetypes
     * @return formsFormparagraphpostprocessorFormresourcetypes
     */
    public ConfigNodePropertyArray getFormsFormparagraphpostprocessorFormresourcetypes() {
        return formsFormparagraphpostprocessorFormresourcetypes;
    }

    public void setFormsFormparagraphpostprocessorFormresourcetypes(ConfigNodePropertyArray formsFormparagraphpostprocessorFormresourcetypes) {
        this.formsFormparagraphpostprocessorFormresourcetypes = formsFormparagraphpostprocessorFormresourcetypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties {\n");
        
        sb.append("    formsFormparagraphpostprocessorEnabled: ").append(toIndentedString(formsFormparagraphpostprocessorEnabled)).append("\n");
        sb.append("    formsFormparagraphpostprocessorFormresourcetypes: ").append(toIndentedString(formsFormparagraphpostprocessorFormresourcetypes)).append("\n");
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

