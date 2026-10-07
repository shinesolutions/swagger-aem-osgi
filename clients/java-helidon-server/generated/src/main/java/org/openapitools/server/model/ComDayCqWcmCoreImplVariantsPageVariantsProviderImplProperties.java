package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties   {

    private ConfigNodePropertyString defaultExternalizerDomain;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.
     *
     * @param defaultExternalizerDomain defaultExternalizerDomain
     */
    public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties(
        ConfigNodePropertyString defaultExternalizerDomain
    ) {
        this.defaultExternalizerDomain = defaultExternalizerDomain;
    }



    /**
     * Get defaultExternalizerDomain
     * @return defaultExternalizerDomain
     */
    public ConfigNodePropertyString getDefaultExternalizerDomain() {
        return defaultExternalizerDomain;
    }

    public void setDefaultExternalizerDomain(ConfigNodePropertyString defaultExternalizerDomain) {
        this.defaultExternalizerDomain = defaultExternalizerDomain;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties {\n");
        
        sb.append("    defaultExternalizerDomain: ").append(toIndentedString(defaultExternalizerDomain)).append("\n");
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

