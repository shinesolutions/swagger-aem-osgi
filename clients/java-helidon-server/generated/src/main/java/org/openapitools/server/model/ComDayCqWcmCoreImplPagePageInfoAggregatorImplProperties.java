package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties   {

    private ConfigNodePropertyString pageInfoProviderPropertyRegexDefault;
    private ConfigNodePropertyString pageInfoProviderPropertyName;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.
     *
     * @param pageInfoProviderPropertyRegexDefault pageInfoProviderPropertyRegexDefault
     * @param pageInfoProviderPropertyName pageInfoProviderPropertyName
     */
    public ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties(
        ConfigNodePropertyString pageInfoProviderPropertyRegexDefault, 
        ConfigNodePropertyString pageInfoProviderPropertyName
    ) {
        this.pageInfoProviderPropertyRegexDefault = pageInfoProviderPropertyRegexDefault;
        this.pageInfoProviderPropertyName = pageInfoProviderPropertyName;
    }



    /**
     * Get pageInfoProviderPropertyRegexDefault
     * @return pageInfoProviderPropertyRegexDefault
     */
    public ConfigNodePropertyString getPageInfoProviderPropertyRegexDefault() {
        return pageInfoProviderPropertyRegexDefault;
    }

    public void setPageInfoProviderPropertyRegexDefault(ConfigNodePropertyString pageInfoProviderPropertyRegexDefault) {
        this.pageInfoProviderPropertyRegexDefault = pageInfoProviderPropertyRegexDefault;
    }

    /**
     * Get pageInfoProviderPropertyName
     * @return pageInfoProviderPropertyName
     */
    public ConfigNodePropertyString getPageInfoProviderPropertyName() {
        return pageInfoProviderPropertyName;
    }

    public void setPageInfoProviderPropertyName(ConfigNodePropertyString pageInfoProviderPropertyName) {
        this.pageInfoProviderPropertyName = pageInfoProviderPropertyName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {\n");
        
        sb.append("    pageInfoProviderPropertyRegexDefault: ").append(toIndentedString(pageInfoProviderPropertyRegexDefault)).append("\n");
        sb.append("    pageInfoProviderPropertyName: ").append(toIndentedString(pageInfoProviderPropertyName)).append("\n");
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

