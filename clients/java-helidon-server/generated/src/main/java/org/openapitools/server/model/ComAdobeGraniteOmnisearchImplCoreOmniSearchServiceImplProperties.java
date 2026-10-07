package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties   {

    private ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin;
    private ConfigNodePropertyBoolean omnisearchSuggestionSpellcheckRequire;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.
     *
     * @param omnisearchSuggestionRequiretextMin omnisearchSuggestionRequiretextMin
     * @param omnisearchSuggestionSpellcheckRequire omnisearchSuggestionSpellcheckRequire
     */
    public ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(
        ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin, 
        ConfigNodePropertyBoolean omnisearchSuggestionSpellcheckRequire
    ) {
        this.omnisearchSuggestionRequiretextMin = omnisearchSuggestionRequiretextMin;
        this.omnisearchSuggestionSpellcheckRequire = omnisearchSuggestionSpellcheckRequire;
    }



    /**
     * Get omnisearchSuggestionRequiretextMin
     * @return omnisearchSuggestionRequiretextMin
     */
    public ConfigNodePropertyInteger getOmnisearchSuggestionRequiretextMin() {
        return omnisearchSuggestionRequiretextMin;
    }

    public void setOmnisearchSuggestionRequiretextMin(ConfigNodePropertyInteger omnisearchSuggestionRequiretextMin) {
        this.omnisearchSuggestionRequiretextMin = omnisearchSuggestionRequiretextMin;
    }

    /**
     * Get omnisearchSuggestionSpellcheckRequire
     * @return omnisearchSuggestionSpellcheckRequire
     */
    public ConfigNodePropertyBoolean getOmnisearchSuggestionSpellcheckRequire() {
        return omnisearchSuggestionSpellcheckRequire;
    }

    public void setOmnisearchSuggestionSpellcheckRequire(ConfigNodePropertyBoolean omnisearchSuggestionSpellcheckRequire) {
        this.omnisearchSuggestionSpellcheckRequire = omnisearchSuggestionSpellcheckRequire;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties {\n");
        
        sb.append("    omnisearchSuggestionRequiretextMin: ").append(toIndentedString(omnisearchSuggestionRequiretextMin)).append("\n");
        sb.append("    omnisearchSuggestionSpellcheckRequire: ").append(toIndentedString(omnisearchSuggestionSpellcheckRequire)).append("\n");
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

