package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties   {

    private ConfigNodePropertyString brightedgeUrl;

    /**
     * Default constructor.
     */
    public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.
     *
     * @param brightedgeUrl brightedgeUrl
     */
    public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties(
        ConfigNodePropertyString brightedgeUrl
    ) {
        this.brightedgeUrl = brightedgeUrl;
    }



    /**
     * Get brightedgeUrl
     * @return brightedgeUrl
     */
    public ConfigNodePropertyString getBrightedgeUrl() {
        return brightedgeUrl;
    }

    public void setBrightedgeUrl(ConfigNodePropertyString brightedgeUrl) {
        this.brightedgeUrl = brightedgeUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties {\n");
        
        sb.append("    brightedgeUrl: ").append(toIndentedString(brightedgeUrl)).append("\n");
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

