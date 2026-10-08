package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties   {

    private ConfigNodePropertyString effectiveBundleListPath;

    /**
     * Default constructor.
     */
    public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.
     *
     * @param effectiveBundleListPath effectiveBundleListPath
     */
    public ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties(
        ConfigNodePropertyString effectiveBundleListPath
    ) {
        this.effectiveBundleListPath = effectiveBundleListPath;
    }



    /**
     * Get effectiveBundleListPath
     * @return effectiveBundleListPath
     */
    public ConfigNodePropertyString getEffectiveBundleListPath() {
        return effectiveBundleListPath;
    }

    public void setEffectiveBundleListPath(ConfigNodePropertyString effectiveBundleListPath) {
        this.effectiveBundleListPath = effectiveBundleListPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties {\n");
        
        sb.append("    effectiveBundleListPath: ").append(toIndentedString(effectiveBundleListPath)).append("\n");
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

