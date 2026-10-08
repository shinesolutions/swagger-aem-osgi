package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplLanguageManagerImplProperties   {

    private ConfigNodePropertyString langmgrListPath;
    private ConfigNodePropertyArray langmgrCountryDefault;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplLanguageManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplLanguageManagerImplProperties.
     *
     * @param langmgrListPath langmgrListPath
     * @param langmgrCountryDefault langmgrCountryDefault
     */
    public ComDayCqWcmCoreImplLanguageManagerImplProperties(
        ConfigNodePropertyString langmgrListPath, 
        ConfigNodePropertyArray langmgrCountryDefault
    ) {
        this.langmgrListPath = langmgrListPath;
        this.langmgrCountryDefault = langmgrCountryDefault;
    }



    /**
     * Get langmgrListPath
     * @return langmgrListPath
     */
    public ConfigNodePropertyString getLangmgrListPath() {
        return langmgrListPath;
    }

    public void setLangmgrListPath(ConfigNodePropertyString langmgrListPath) {
        this.langmgrListPath = langmgrListPath;
    }

    /**
     * Get langmgrCountryDefault
     * @return langmgrCountryDefault
     */
    public ConfigNodePropertyArray getLangmgrCountryDefault() {
        return langmgrCountryDefault;
    }

    public void setLangmgrCountryDefault(ConfigNodePropertyArray langmgrCountryDefault) {
        this.langmgrCountryDefault = langmgrCountryDefault;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplLanguageManagerImplProperties {\n");
        
        sb.append("    langmgrListPath: ").append(toIndentedString(langmgrListPath)).append("\n");
        sb.append("    langmgrCountryDefault: ").append(toIndentedString(langmgrCountryDefault)).append("\n");
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

