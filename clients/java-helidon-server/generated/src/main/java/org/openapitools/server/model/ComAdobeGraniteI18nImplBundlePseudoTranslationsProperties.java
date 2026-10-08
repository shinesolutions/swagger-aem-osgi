package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties   {

    private ConfigNodePropertyArray pseudoPatterns;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.
     *
     * @param pseudoPatterns pseudoPatterns
     */
    public ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties(
        ConfigNodePropertyArray pseudoPatterns
    ) {
        this.pseudoPatterns = pseudoPatterns;
    }



    /**
     * Get pseudoPatterns
     * @return pseudoPatterns
     */
    public ConfigNodePropertyArray getPseudoPatterns() {
        return pseudoPatterns;
    }

    public void setPseudoPatterns(ConfigNodePropertyArray pseudoPatterns) {
        this.pseudoPatterns = pseudoPatterns;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties {\n");
        
        sb.append("    pseudoPatterns: ").append(toIndentedString(pseudoPatterns)).append("\n");
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

