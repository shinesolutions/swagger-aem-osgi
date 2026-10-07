package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteInfocollectorInfoCollectorProperties   {

    private ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps;
    private ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteInfocollectorInfoCollectorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteInfocollectorInfoCollectorProperties.
     *
     * @param graniteInfocollectorIncludeThreadDumps graniteInfocollectorIncludeThreadDumps
     * @param graniteInfocollectorIncludeHeapDump graniteInfocollectorIncludeHeapDump
     */
    public ComAdobeGraniteInfocollectorInfoCollectorProperties(
        ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps, 
        ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump
    ) {
        this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
        this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
    }



    /**
     * Get graniteInfocollectorIncludeThreadDumps
     * @return graniteInfocollectorIncludeThreadDumps
     */
    public ConfigNodePropertyBoolean getGraniteInfocollectorIncludeThreadDumps() {
        return graniteInfocollectorIncludeThreadDumps;
    }

    public void setGraniteInfocollectorIncludeThreadDumps(ConfigNodePropertyBoolean graniteInfocollectorIncludeThreadDumps) {
        this.graniteInfocollectorIncludeThreadDumps = graniteInfocollectorIncludeThreadDumps;
    }

    /**
     * Get graniteInfocollectorIncludeHeapDump
     * @return graniteInfocollectorIncludeHeapDump
     */
    public ConfigNodePropertyBoolean getGraniteInfocollectorIncludeHeapDump() {
        return graniteInfocollectorIncludeHeapDump;
    }

    public void setGraniteInfocollectorIncludeHeapDump(ConfigNodePropertyBoolean graniteInfocollectorIncludeHeapDump) {
        this.graniteInfocollectorIncludeHeapDump = graniteInfocollectorIncludeHeapDump;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteInfocollectorInfoCollectorProperties {\n");
        
        sb.append("    graniteInfocollectorIncludeThreadDumps: ").append(toIndentedString(graniteInfocollectorIncludeThreadDumps)).append("\n");
        sb.append("    graniteInfocollectorIncludeHeapDump: ").append(toIndentedString(graniteInfocollectorIncludeHeapDump)).append("\n");
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

