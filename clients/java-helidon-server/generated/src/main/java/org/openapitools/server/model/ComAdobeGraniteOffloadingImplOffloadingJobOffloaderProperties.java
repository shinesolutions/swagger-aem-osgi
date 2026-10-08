package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties   {

    private ConfigNodePropertyBoolean offloadingOffloaderEnabled;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.
     *
     * @param offloadingOffloaderEnabled offloadingOffloaderEnabled
     */
    public ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties(
        ConfigNodePropertyBoolean offloadingOffloaderEnabled
    ) {
        this.offloadingOffloaderEnabled = offloadingOffloaderEnabled;
    }



    /**
     * Get offloadingOffloaderEnabled
     * @return offloadingOffloaderEnabled
     */
    public ConfigNodePropertyBoolean getOffloadingOffloaderEnabled() {
        return offloadingOffloaderEnabled;
    }

    public void setOffloadingOffloaderEnabled(ConfigNodePropertyBoolean offloadingOffloaderEnabled) {
        this.offloadingOffloaderEnabled = offloadingOffloaderEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties {\n");
        
        sb.append("    offloadingOffloaderEnabled: ").append(toIndentedString(offloadingOffloaderEnabled)).append("\n");
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

