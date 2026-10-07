package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties   {

    private ConfigNodePropertyString testandtargetEndpointUrl;

    /**
     * Default constructor.
     */
    public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.
     *
     * @param testandtargetEndpointUrl testandtargetEndpointUrl
     */
    public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties(
        ConfigNodePropertyString testandtargetEndpointUrl
    ) {
        this.testandtargetEndpointUrl = testandtargetEndpointUrl;
    }



    /**
     * Get testandtargetEndpointUrl
     * @return testandtargetEndpointUrl
     */
    public ConfigNodePropertyString getTestandtargetEndpointUrl() {
        return testandtargetEndpointUrl;
    }

    public void setTestandtargetEndpointUrl(ConfigNodePropertyString testandtargetEndpointUrl) {
        this.testandtargetEndpointUrl = testandtargetEndpointUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {\n");
        
        sb.append("    testandtargetEndpointUrl: ").append(toIndentedString(testandtargetEndpointUrl)).append("\n");
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

