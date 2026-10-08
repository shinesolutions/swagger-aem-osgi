package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties   {

    private ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties.
     *
     * @param cqAnalyticsTestandtargetSegmentimporterEnabled cqAnalyticsTestandtargetSegmentimporterEnabled
     */
    public ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties(
        ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled
    ) {
        this.cqAnalyticsTestandtargetSegmentimporterEnabled = cqAnalyticsTestandtargetSegmentimporterEnabled;
    }



    /**
     * Get cqAnalyticsTestandtargetSegmentimporterEnabled
     * @return cqAnalyticsTestandtargetSegmentimporterEnabled
     */
    public ConfigNodePropertyBoolean getCqAnalyticsTestandtargetSegmentimporterEnabled() {
        return cqAnalyticsTestandtargetSegmentimporterEnabled;
    }

    public void setCqAnalyticsTestandtargetSegmentimporterEnabled(ConfigNodePropertyBoolean cqAnalyticsTestandtargetSegmentimporterEnabled) {
        this.cqAnalyticsTestandtargetSegmentimporterEnabled = cqAnalyticsTestandtargetSegmentimporterEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties {\n");
        
        sb.append("    cqAnalyticsTestandtargetSegmentimporterEnabled: ").append(toIndentedString(cqAnalyticsTestandtargetSegmentimporterEnabled)).append("\n");
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

